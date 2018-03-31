package org.tdd_kata.roman_numbers;

import java.util.HashMap;

public class RomanNumbers {

	private static HashMap<Integer, String> CONVERSION_TABLE = new HashMap<Integer, String>();
	private String result = "";
	private int rest = 0;

	public RomanNumbers() {
		CONVERSION_TABLE.put(1, "I");
		CONVERSION_TABLE.put(5, "V");
		CONVERSION_TABLE.put(10, "X");
		CONVERSION_TABLE.put(50, "L");
		CONVERSION_TABLE.put(100, "C");
		CONVERSION_TABLE.put(500, "D");
		CONVERSION_TABLE.put(1000, "M");
	}

	public String convert(int number) throws IllegalArgumentException {

		if (numberIsInvalid(number)) {
			throw new IllegalArgumentException("Number is invalid");
		}
		if (numberIsInConversionMap(number)) {
			return CONVERSION_TABLE.get(number);
		}

		init(number) //
				.then() //
				.convertThousands() //
				.then() //
				.convertHundreds() //
				.then() //
				.convertDecades() //
				.then() //
				.convertUnits();

		return result;
	}

	private boolean numberIsInvalid(int number) {
		return number < 1 || number > 4999;
	}

	private boolean numberIsInConversionMap(int number) {
		return CONVERSION_TABLE.containsKey(number);
	}

	private RomanNumbers init(int number) {
		result = "";
		rest = number;
		return this;
	}

	private RomanNumbers convertBaseN(int unit) {
		if (rest >= unit) {
			int base = (int) Math.floor(rest / unit);
			if (base == 9) {
				result += CONVERSION_TABLE.get(unit) + CONVERSION_TABLE.get(10 * unit);
			} else if (base == 4) {
				result += CONVERSION_TABLE.get(unit) + CONVERSION_TABLE.get(5 * unit);
			} else if (base == 5) {
				result += CONVERSION_TABLE.get(5 * unit);
			} else if (base > 5) {
				result += CONVERSION_TABLE.get(5 * unit);
				convertLessThan10(unit, base - 5);
			} else {
				convertLessThan10(unit, base);
			}
			rest -= base * unit;
		}
		return this;
	}

	private void convertLessThan10(int unit, int base) {
		for (int i = 0; i < base; i++) {
			result += CONVERSION_TABLE.get(unit);
		}
	}

	private RomanNumbers convertThousands() {
		if (rest >= 1000) {
			int thousands = (int) Math.floor(rest / 1000);
			for (int i = 0; i < thousands; i++) {
				result += CONVERSION_TABLE.get(1000);
			}
			rest -= thousands * 1000;
		}
		return this;
	}

	private RomanNumbers convertHundreds() {
		return convertBaseN(100);
	}

	private RomanNumbers convertDecades() {
		return convertBaseN(10);
	}

	private RomanNumbers convertUnits() {
		return convertBaseN(1);
	}

	private RomanNumbers then() {
		return this;
	}
}
