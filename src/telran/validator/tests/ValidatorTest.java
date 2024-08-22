package telran.validator.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.validator.tools.Validator;

class ValidatorTest {

	@Test 
	void testCheckCreditCard() {//TODO create *
		assertTrue(Validator.checkCreditCard("1234567812345678"));
		assertTrue(Validator.checkCreditCard("12345678"));
		assertTrue(Validator.checkCreditCard("123124436665"));
		assertFalse(Validator.checkCreditCard("123124"));
		assertFalse(Validator.checkCreditCard("1234567812345678a"));
		assertFalse(Validator.checkCreditCard("12345a78123456781"));
	}
	@Test 
	void testCheckDateFormatEU() {
		assertTrue(Validator.checkDateFormatEU("01.12.1999"));
		assertFalse(Validator.checkDateFormatEU("1999.12.01"));
		assertFalse(Validator.checkDateFormatEU("1999a.12a.01a"));
		
	}	
	
	@Test 
	void testCheckDateFormatUS() {
		assertTrue(Validator.checkDateFormatUS("1999-12-01"));
		assertFalse(Validator.checkDateFormatUS("01-12-1999"));
		assertFalse(Validator.checkDateFormatUS("01a-12a-1999a"));
		
	}
	
	@Test 
	void testCheckPhoneNumber() {
		assertTrue(Validator.checkFormatPhoneNumber("+99(99)9999-9999"));
		assertFalse(Validator.checkFormatPhoneNumber("+972(59)9999-9999"));
		assertFalse(Validator.checkFormatPhoneNumber("+99(529)9999-9999"));
		assertFalse(Validator.checkFormatPhoneNumber("+99(99)9999a-9999"));
		assertFalse(Validator.checkFormatPhoneNumber("+99(99)9999-9999a"));
		assertFalse(Validator.checkFormatPhoneNumber("+99(99)999-9999"));
		assertFalse(Validator.checkFormatPhoneNumber("+99(99)9999-999"));
	}
	
	@Test 
	void testCheckFormatCVV() {
		assertTrue(Validator.checkFormatCVV("777"));
		assertFalse(Validator.checkFormatCVV("5R4"));
		assertFalse(Validator.checkFormatCVV("1000"));
		assertFalse(Validator.checkFormatCVV("-1"));
		
	}
	
	@Test
	void testCheckLessEquals255() { // 0-255
		assertTrue(Validator.checkFormat255("254"));
		assertFalse(Validator.checkFormat255("-1"));
		assertFalse(Validator.checkFormat255("256"));
		assertFalse(Validator.checkFormat255("aaa"));
		assertFalse(Validator.checkFormat255("21a"));
	}

}
