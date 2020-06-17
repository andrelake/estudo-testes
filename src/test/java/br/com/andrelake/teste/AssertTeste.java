package br.com.andrelake.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTeste {

	@Test
	public void testAssertArrayEquals() {
		
		byte[] esperado = "aaa".getBytes();
		byte[] atual = "aaa".getBytes();
		
		assertArrayEquals(esperado, atual);
	}
	
	@Test
	public void testAssertEquals() {
		
		assertEquals("xxx", "xxx");
	}
	
	@Test
	public void testAssertFalse() {
		
		assertFalse(false);
	}
	
	@Test
	public void testAssertNull() {
		
		assertNull(null);
	}
	
	@Test
	public void testAssertNotNull() {
		
		assertNotNull(new Object());
	}
	
	@Test
	public void testAssertSame() {
		int number = 3;
		assertSame(number, number);
	}
	
	@Test
	public void testAssertNotSame() {
		
		assertNotSame(new Object(), new Object());
	}

}
