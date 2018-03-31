package org.tdd_kata.roman_numbers;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.*;

public class RomanNumbersTest {

	private RomanNumbers romanNumbers = new RomanNumbers();

	@Test
	public void conversionTableShouldBeComplete() throws Exception {
		assertThat(romanNumbers.convert(1)).isEqualTo("I");
		assertThat(romanNumbers.convert(5)).isEqualTo("V");
		assertThat(romanNumbers.convert(10)).isEqualTo("X");
		assertThat(romanNumbers.convert(50)).isEqualTo("L");
		assertThat(romanNumbers.convert(100)).isEqualTo("C");
		assertThat(romanNumbers.convert(500)).isEqualTo("D");
		assertThat(romanNumbers.convert(1000)).isEqualTo("M");
	}

	@Test
	public void thousandsShouldBeConvertedWith_M_Symbols() throws Exception {
		assertThat(romanNumbers.convert(1000)).isEqualTo("M");
		assertThat(romanNumbers.convert(2000)).isEqualTo("MM");
		assertThat(romanNumbers.convert(3000)).isEqualTo("MMM");
		assertThat(romanNumbers.convert(4000)).isEqualTo("MMMM");
	}
	
	@Test
	public void hundredsShouldBeConvertedWith_I_V_X_L_C_D_And_M_Symbols() throws Exception {
		assertThat(romanNumbers.convert(1100)).isEqualTo("MC");
		assertThat(romanNumbers.convert(2200)).isEqualTo("MMCC");
		assertThat(romanNumbers.convert(3300)).isEqualTo("MMMCCC");
		assertThat(romanNumbers.convert(3400)).isEqualTo("MMMCD");
		assertThat(romanNumbers.convert(3500)).isEqualTo("MMMD");
		assertThat(romanNumbers.convert(3600)).isEqualTo("MMMDC");
		assertThat(romanNumbers.convert(4800)).isEqualTo("MMMMDCCC");
		assertThat(romanNumbers.convert(4900)).isEqualTo("MMMMCM");
	}

	@Test
	public void decadesShouldBeConvertedWith_I_V_X_L_And_C_Symbols() throws Exception {
		assertThat(romanNumbers.convert(1110)).isEqualTo("MCX");
		assertThat(romanNumbers.convert(2220)).isEqualTo("MMCCXX");
		assertThat(romanNumbers.convert(3330)).isEqualTo("MMMCCCXXX");
		assertThat(romanNumbers.convert(3440)).isEqualTo("MMMCDXL");
		assertThat(romanNumbers.convert(3550)).isEqualTo("MMMDL");
		assertThat(romanNumbers.convert(3560)).isEqualTo("MMMDLX");
		assertThat(romanNumbers.convert(4990)).isEqualTo("MMMMCMXC");
	}
	
	@Test
	public void unitsShouldBeConvertedWith_I_V_And_X_Symbols() throws Exception {
		assertThat(romanNumbers.convert(1)).isEqualTo("I");
		assertThat(romanNumbers.convert(3)).isEqualTo("III");
		assertThat(romanNumbers.convert(4)).isEqualTo("IV");
		assertThat(romanNumbers.convert(5)).isEqualTo("V");
		assertThat(romanNumbers.convert(6)).isEqualTo("VI");
		assertThat(romanNumbers.convert(8)).isEqualTo("VIII");
		assertThat(romanNumbers.convert(9)).isEqualTo("IX");

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void valueUpTo5000ShouldBeInvalid() {
		romanNumbers.convert(5000);
	}

}
