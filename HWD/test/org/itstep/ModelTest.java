package org.itstep;

import static org.junit.Assert.*;

import org.itstep.Model;
import org.junit.Test;

public class ModelTest {
	@Test
	public void testInputWordByScaner1f1() {
		
		Model model = new Model();
		String word = "Jack";
		String result = model.inputWordByScaner1(word);
		assertNull(result);
		
	}
	
	@Test
	public void testInputWordByScaner2f1() {
		
		Model model = new Model();
		long number = 3;
		long result = model.inputWordByScaner2(number);
		assertEquals(0 , result, 0);
		
	}
	
	@Test
	public void testInputWordByScaner2f2() {
		
		Model model = new Model();
		long number = 5;
		long result = model.inputWordByScaner2(number);
		assertEquals(0 , result, 0);
		
	}

	@Test
	public void testInputWordByScaner1() {
		
		Model model = new Model();
		String word = "Andrey";
		String result = model.inputWordByScaner1(word);
		assertEquals("Andrey", result);
		
	}
	
	@Test
	public void testInputWordByScaner2() {
		
		Model model = new Model();
		long number = 4;
		long result = model.inputWordByScaner2(number);
		assertEquals(4 , result, 0);
		
	}
	
	@Test
	public void testWriteSentence() {
		
		Model model = new Model();
		String word = "Andrey";
		long number = 4;
		String result = model.writeSentence(word, number);
		assertEquals("Andrey " + 4, result);
		
	}
}


