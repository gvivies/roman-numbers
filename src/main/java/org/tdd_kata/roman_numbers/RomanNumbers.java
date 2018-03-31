package org.tdd_kata.roman_numbers;

import java.util.HashMap;

public class RomanNumbers {

	private static HashMap<Integer, String> CONVERSION_TABLE = new HashMap<Integer, String>();

	private String result = "";
	private int restToConvert = 0;

	public RomanNumbers() {
		CONVERSION_TABLE.put(1, "I");
		CONVERSION_TABLE.put(5, "V");
		CONVERSION_TABLE.put(10, "X");
		CONVERSION_TABLE.put(50, "L");
		CONVERSION_TABLE.put(100, "C");
		CONVERSION_TABLE.put(500, "D");
		CONVERSION_TABLE.put(1000, "M");
	}

	public String convert(int number) {

		if (numberExistsInConversionMap(number)) {
			return CONVERSION_TABLE.get(number);
		}

		initWorkingVariables(number);

		applyThousandConversion();
		applyHundredConversion();
		applyDecadeConversion();
		applyUnitsConversion();

		return result;
	}

	private void applyThousandConversion() {
		applyMultipleConversion(1000);
	}

	private void applyHundredConversion() {
		applyMultipleConversion(100);
	}

	private void applyDecadeConversion() {
		applyMultipleConversion(10);
	}

	private void applyMultipleConversion(int base) {
		if (restToConvert > base) {
			int rounded = (int) Math.floor(restToConvert / base);
			result = result.concat(convertBaseN(rounded, base));
			restToConvert -= rounded * base;
		}
	}

	private void applyUnitsConversion() {
		if (restToConvert % 10 != 0) {
			result = result.concat(convertBaseN(restToConvert, 1));
		}
	}

	private String convertBaseN(int number, int multiple) {
		String tenthSymbol = CONVERSION_TABLE.get(1 * multiple);
		String initialSymbol = tenthSymbol;
		String pivotSymbol = (multiple == 1000) ? "MMM" : CONVERSION_TABLE.get(5 * multiple);
		String upperSymbol = CONVERSION_TABLE.get(10 * multiple);
		String convertedBaseN = "";
		if (number == 9) {
			convertedBaseN = tenthSymbol + upperSymbol;
		} else if (number >= 5) {
			convertedBaseN = convertUnits(number - 5, pivotSymbol, tenthSymbol);
		} else if (number == 4) {
			convertedBaseN = initialSymbol + pivotSymbol;
		} else {
			convertedBaseN = convertUnits(number, "", tenthSymbol);
		}
		return convertedBaseN;
	}

	private String convertUnits(int number, String fromSymbol, String unit) {
		for (int i = 0; i < number; i++) {
			fromSymbol += unit;
		}
		return fromSymbol;
	}

	private void initWorkingVariables(int number) {
		result = "";
		restToConvert = number;
	}

	private boolean numberExistsInConversionMap(int number) {
		return CONVERSION_TABLE.containsKey(number);
	}
}
