package org.tdd_kata.roman_numbers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

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
	public void valuesLessThan4ShouldBeConvertedWith_n_I() throws Exception {
		assertThat(romanNumbers.convert(2)).isEqualTo("II");
		assertThat(romanNumbers.convert(3)).isEqualTo("III");
	}
	
	@Test
	public void value4ShouldBeConvertedWith_IV() throws Exception {
		assertThat(romanNumbers.convert(4)).isEqualTo("IV");
	}
	
	@Test
	public void valuesBetween6And8ShouldBeConvertedWith_V_and_n_I() throws Exception {
		assertThat(romanNumbers.convert(6)).isEqualTo("VI");
		assertThat(romanNumbers.convert(7)).isEqualTo("VII");
		assertThat(romanNumbers.convert(8)).isEqualTo("VIII");
	}

	@Test
	public void value9ShouldBeConvertedWith_IX() throws Exception {
		assertThat(romanNumbers.convert(9)).isEqualTo("IX");
	}
	
	@Test
	public void valuesBetween11And19ShouldBeConvertedWith_X_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(11)).isEqualTo("XI");
		assertThat(romanNumbers.convert(12)).isEqualTo("XII");
		assertThat(romanNumbers.convert(14)).isEqualTo("XIV");
		assertThat(romanNumbers.convert(15)).isEqualTo("XV");
		assertThat(romanNumbers.convert(17)).isEqualTo("XVII");
		assertThat(romanNumbers.convert(19)).isEqualTo("XIX");
	}
	
	@Test
	public void value20ShouldBeConvertedWith_XX() throws Exception {
		assertThat(romanNumbers.convert(20)).isEqualTo("XX");
	}

	@Test
	public void valuesBetWeen21And29ShouldBeConvertedWith_XX_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(21)).isEqualTo("XXI");
		assertThat(romanNumbers.convert(23)).isEqualTo("XXIII");
		assertThat(romanNumbers.convert(24)).isEqualTo("XXIV");
		assertThat(romanNumbers.convert(25)).isEqualTo("XXV");
		assertThat(romanNumbers.convert(27)).isEqualTo("XXVII");
		assertThat(romanNumbers.convert(29)).isEqualTo("XXIX");
	}
	
	@Test
	public void valuesBetWeen31And39ShouldBeConvertedWith_XX_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(31)).isEqualTo("XXXI");
		assertThat(romanNumbers.convert(33)).isEqualTo("XXXIII");
		assertThat(romanNumbers.convert(34)).isEqualTo("XXXIV");
		assertThat(romanNumbers.convert(35)).isEqualTo("XXXV");
		assertThat(romanNumbers.convert(37)).isEqualTo("XXXVII");
		assertThat(romanNumbers.convert(39)).isEqualTo("XXXIX");
	}
	
	@Test
	public void value40ShouldBeConvertedWith_XL() throws Exception {
		assertThat(romanNumbers.convert(40)).isEqualTo("XL");
	}
	
	@Test
	public void valuesBetWeen41And49ShouldBeConvertedWith_XL_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(41)).isEqualTo("XLI");
		assertThat(romanNumbers.convert(43)).isEqualTo("XLIII");
		assertThat(romanNumbers.convert(44)).isEqualTo("XLIV");
		assertThat(romanNumbers.convert(45)).isEqualTo("XLV");
		assertThat(romanNumbers.convert(47)).isEqualTo("XLVII");
		assertThat(romanNumbers.convert(49)).isEqualTo("XLIX");
	}
	
	@Test
	public void value51ShouldBeConvertedWith_LI() throws Exception {
		assertThat(romanNumbers.convert(51)).isEqualTo("LI");
	}
	
	@Test
	public void valuesBetWeen51And59ShouldBeConvertedWith_L_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(51)).isEqualTo("LI");
		assertThat(romanNumbers.convert(53)).isEqualTo("LIII");
		assertThat(romanNumbers.convert(54)).isEqualTo("LIV");
		assertThat(romanNumbers.convert(55)).isEqualTo("LV");
		assertThat(romanNumbers.convert(56)).isEqualTo("LVI");
		assertThat(romanNumbers.convert(59)).isEqualTo("LIX");
	}
	
	@Test
	public void value60ShouldBeConvertedWith_LX() throws Exception {
		assertThat(romanNumbers.convert(60)).isEqualTo("LX");
	}
	
	@Test
	public void valuesBetWeen61And69ShouldBeConvertedWith_LX_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(61)).isEqualTo("LXI");
		assertThat(romanNumbers.convert(63)).isEqualTo("LXIII");
		assertThat(romanNumbers.convert(64)).isEqualTo("LXIV");
		assertThat(romanNumbers.convert(65)).isEqualTo("LXV");
		assertThat(romanNumbers.convert(66)).isEqualTo("LXVI");
		assertThat(romanNumbers.convert(69)).isEqualTo("LXIX");
	}
	
	@Test
	public void value70ShouldBeConvertedWith_LXX() throws Exception {
		assertThat(romanNumbers.convert(70)).isEqualTo("LXX");
	}
	
	@Test
	public void valuesBetWeen71And79ShouldBeConvertedWith_LXX_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(71)).isEqualTo("LXXI");
		assertThat(romanNumbers.convert(73)).isEqualTo("LXXIII");
		assertThat(romanNumbers.convert(74)).isEqualTo("LXXIV");
		assertThat(romanNumbers.convert(75)).isEqualTo("LXXV");
		assertThat(romanNumbers.convert(76)).isEqualTo("LXXVI");
		assertThat(romanNumbers.convert(79)).isEqualTo("LXXIX");
	}

	@Test
	public void value80ShouldBeConvertedWith_LXXX() throws Exception {
		assertThat(romanNumbers.convert(80)).isEqualTo("LXXX");
	}
	
	@Test
	public void valuesBetWeen81And89ShouldBeConvertedWith_LXXX_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(81)).isEqualTo("LXXXI");
		assertThat(romanNumbers.convert(83)).isEqualTo("LXXXIII");
		assertThat(romanNumbers.convert(84)).isEqualTo("LXXXIV");
		assertThat(romanNumbers.convert(85)).isEqualTo("LXXXV");
		assertThat(romanNumbers.convert(87)).isEqualTo("LXXXVII");
		assertThat(romanNumbers.convert(89)).isEqualTo("LXXXIX");
	}
	
	@Test
	public void value90ShouldBeConvertedWith_XC() throws Exception {
		assertThat(romanNumbers.convert(90)).isEqualTo("XC");
	}
	
	@Test
	public void valuesBetWeen91And99ShouldBeConvertedWith_XC_and_units_converted_symbols() throws Exception {
		assertThat(romanNumbers.convert(91)).isEqualTo("XCI");
		assertThat(romanNumbers.convert(93)).isEqualTo("XCIII");
		assertThat(romanNumbers.convert(94)).isEqualTo("XCIV");
		assertThat(romanNumbers.convert(95)).isEqualTo("XCV");
		assertThat(romanNumbers.convert(97)).isEqualTo("XCVII");
		assertThat(romanNumbers.convert(99)).isEqualTo("XCIX");
	}

	@Test
	public void value100ShouldBeConvertedWith_C() throws Exception {
		assertThat(romanNumbers.convert(100)).isEqualTo("C");
	}
	
	@Test
	public void valuesFrom101To201ShouldBeConvertedWith_C_and_same_as_previously() throws Exception {
		assertThat(romanNumbers.convert(101)).isEqualTo("CI");
		assertThat(romanNumbers.convert(109)).isEqualTo("CIX");
		assertThat(romanNumbers.convert(114)).isEqualTo("CXIV");
		assertThat(romanNumbers.convert(123)).isEqualTo("CXXIII");
		assertThat(romanNumbers.convert(133)).isEqualTo("CXXXIII");
		assertThat(romanNumbers.convert(140)).isEqualTo("CXL");
		assertThat(romanNumbers.convert(149)).isEqualTo("CXLIX");
		assertThat(romanNumbers.convert(155)).isEqualTo("CLV");
		assertThat(romanNumbers.convert(163)).isEqualTo("CLXIII");
		assertThat(romanNumbers.convert(174)).isEqualTo("CLXXIV");
		assertThat(romanNumbers.convert(188)).isEqualTo("CLXXXVIII");
		
		assertThat(romanNumbers.convert(191)).isEqualTo("CXCI");
		assertThat(romanNumbers.convert(193)).isEqualTo("CXCIII");
		assertThat(romanNumbers.convert(194)).isEqualTo("CXCIV");
		assertThat(romanNumbers.convert(195)).isEqualTo("CXCV");
		assertThat(romanNumbers.convert(197)).isEqualTo("CXCVII");
		assertThat(romanNumbers.convert(199)).isEqualTo("CXCIX");
	}
	
	@Test
	public void value200ShouldBeConvertedWith_CC() throws Exception {
		assertThat(romanNumbers.convert(200)).isEqualTo("CC");
		assertThat(romanNumbers.convert(201)).isEqualTo("CCI");
		assertThat(romanNumbers.convert(209)).isEqualTo("CCIX");
		assertThat(romanNumbers.convert(214)).isEqualTo("CCXIV");
		assertThat(romanNumbers.convert(223)).isEqualTo("CCXXIII");
		assertThat(romanNumbers.convert(233)).isEqualTo("CCXXXIII");
		assertThat(romanNumbers.convert(240)).isEqualTo("CCXL");
		assertThat(romanNumbers.convert(249)).isEqualTo("CCXLIX");
		assertThat(romanNumbers.convert(255)).isEqualTo("CCLV");
		assertThat(romanNumbers.convert(263)).isEqualTo("CCLXIII");
		assertThat(romanNumbers.convert(274)).isEqualTo("CCLXXIV");
		assertThat(romanNumbers.convert(288)).isEqualTo("CCLXXXVIII");
		assertThat(romanNumbers.convert(290)).isEqualTo("CCXC");
		assertThat(romanNumbers.convert(294)).isEqualTo("CCXCIV");
		assertThat(romanNumbers.convert(295)).isEqualTo("CCXCV");
		assertThat(romanNumbers.convert(297)).isEqualTo("CCXCVII");
	}

	@Test
	public void value300SHouldBeConvertedToCCC() throws Exception {
		assertThat(romanNumbers.convert(300)).isEqualTo("CCC");
		assertThat(romanNumbers.convert(301)).isEqualTo("CCCI");
		assertThat(romanNumbers.convert(309)).isEqualTo("CCCIX");
		assertThat(romanNumbers.convert(314)).isEqualTo("CCCXIV");
		assertThat(romanNumbers.convert(323)).isEqualTo("CCCXXIII");
		assertThat(romanNumbers.convert(333)).isEqualTo("CCCXXXIII");
		assertThat(romanNumbers.convert(340)).isEqualTo("CCCXL");
		assertThat(romanNumbers.convert(349)).isEqualTo("CCCXLIX");
		assertThat(romanNumbers.convert(355)).isEqualTo("CCCLV");
		assertThat(romanNumbers.convert(363)).isEqualTo("CCCLXIII");
		assertThat(romanNumbers.convert(374)).isEqualTo("CCCLXXIV");
		assertThat(romanNumbers.convert(388)).isEqualTo("CCCLXXXVIII");
		assertThat(romanNumbers.convert(390)).isEqualTo("CCCXC");
		assertThat(romanNumbers.convert(394)).isEqualTo("CCCXCIV");
		assertThat(romanNumbers.convert(395)).isEqualTo("CCCXCV");
		assertThat(romanNumbers.convert(397)).isEqualTo("CCCXCVII");
	}
	
	@Test
	public void value400ShouldBeConvertedToCD() throws Exception {		
		assertThat(romanNumbers.convert(400)).isEqualTo("CD");
		assertThat(romanNumbers.convert(401)).isEqualTo("CDI");
		assertThat(romanNumbers.convert(409)).isEqualTo("CDIX");
		assertThat(romanNumbers.convert(414)).isEqualTo("CDXIV");
		assertThat(romanNumbers.convert(423)).isEqualTo("CDXXIII");
		assertThat(romanNumbers.convert(433)).isEqualTo("CDXXXIII");
		assertThat(romanNumbers.convert(440)).isEqualTo("CDXL");
		assertThat(romanNumbers.convert(449)).isEqualTo("CDXLIX");
		assertThat(romanNumbers.convert(455)).isEqualTo("CDLV");
		assertThat(romanNumbers.convert(463)).isEqualTo("CDLXIII");
		assertThat(romanNumbers.convert(474)).isEqualTo("CDLXXIV");
		assertThat(romanNumbers.convert(488)).isEqualTo("CDLXXXVIII");
		assertThat(romanNumbers.convert(490)).isEqualTo("CDXC");
		assertThat(romanNumbers.convert(494)).isEqualTo("CDXCIV");
		assertThat(romanNumbers.convert(495)).isEqualTo("CDXCV");
		assertThat(romanNumbers.convert(497)).isEqualTo("CDXCVII");
	}
	
	@Test
	public void values500ShouldBeConvertedToD() throws Exception {		
		assertThat(romanNumbers.convert(500)).isEqualTo("D");
		assertThat(romanNumbers.convert(501)).isEqualTo("DI");
		assertThat(romanNumbers.convert(509)).isEqualTo("DIX");
		assertThat(romanNumbers.convert(514)).isEqualTo("DXIV");
		assertThat(romanNumbers.convert(523)).isEqualTo("DXXIII");
		assertThat(romanNumbers.convert(533)).isEqualTo("DXXXIII");
		assertThat(romanNumbers.convert(540)).isEqualTo("DXL");
		assertThat(romanNumbers.convert(549)).isEqualTo("DXLIX");
		assertThat(romanNumbers.convert(555)).isEqualTo("DLV");
		assertThat(romanNumbers.convert(563)).isEqualTo("DLXIII");
		assertThat(romanNumbers.convert(574)).isEqualTo("DLXXIV");
		assertThat(romanNumbers.convert(588)).isEqualTo("DLXXXVIII");
		assertThat(romanNumbers.convert(590)).isEqualTo("DXC");
		assertThat(romanNumbers.convert(594)).isEqualTo("DXCIV");
		assertThat(romanNumbers.convert(595)).isEqualTo("DXCV");
		assertThat(romanNumbers.convert(597)).isEqualTo("DXCVII");
	}
	
	@Test
	public void values800ShouldBeConvertedToDCCC() throws Exception {		
		assertThat(romanNumbers.convert(800)).isEqualTo("DCCC");
		assertThat(romanNumbers.convert(801)).isEqualTo("DCCCI");
		assertThat(romanNumbers.convert(809)).isEqualTo("DCCCIX");
		assertThat(romanNumbers.convert(814)).isEqualTo("DCCCXIV");
		assertThat(romanNumbers.convert(823)).isEqualTo("DCCCXXIII");
		assertThat(romanNumbers.convert(833)).isEqualTo("DCCCXXXIII");
		assertThat(romanNumbers.convert(840)).isEqualTo("DCCCXL");
		assertThat(romanNumbers.convert(849)).isEqualTo("DCCCXLIX");
		assertThat(romanNumbers.convert(855)).isEqualTo("DCCCLV");
		assertThat(romanNumbers.convert(863)).isEqualTo("DCCCLXIII");
		assertThat(romanNumbers.convert(874)).isEqualTo("DCCCLXXIV");
		assertThat(romanNumbers.convert(888)).isEqualTo("DCCCLXXXVIII");
		assertThat(romanNumbers.convert(890)).isEqualTo("DCCCXC");
		assertThat(romanNumbers.convert(894)).isEqualTo("DCCCXCIV");
		assertThat(romanNumbers.convert(895)).isEqualTo("DCCCXCV");
		assertThat(romanNumbers.convert(897)).isEqualTo("DCCCXCVII");
	}
	
	@Test
	public void values900ShouldBeConvertedToCM() throws Exception {
		assertThat(romanNumbers.convert(900)).isEqualTo("CM");
		assertThat(romanNumbers.convert(990)).isEqualTo("CMXC");
		assertThat(romanNumbers.convert(999)).isEqualTo("CMXCIX");
	}
	
	@Test
	public void value1000ShouldBeConvertedToM() throws Exception {
		assertThat(romanNumbers.convert(1000)).isEqualTo("M");
		assertThat(romanNumbers.convert(1678)).isEqualTo("MDCLXXVIII");
		assertThat(romanNumbers.convert(3769)).isEqualTo("MMMDCCLXIX");
		assertThat(romanNumbers.convert(4900)).isEqualTo("MMMMCM");
		assertThat(romanNumbers.convert(4999)).isEqualTo("MMMMCMXCIX");
		
	}
	
}
