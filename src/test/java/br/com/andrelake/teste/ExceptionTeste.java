package br.com.andrelake.teste;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTeste {

	@Test(expected = IndexOutOfBoundsException.class)
	public void devePassarNoTeste() {
		
		new ArrayList<Object>().get(0);
	}
//	
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void deveDarErro() {
//		
//		List<String> lista = new ArrayList<String>();
//		lista.add("AAAAAAA");
//		
//		lista.get(0);
//	}
	
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void deveTestarExceptionMessage() throws IndexOutOfBoundsException{
		
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index 0 out of bounds for length 0");
		
		list.get(0);
	}
	
	@Test
	public void testExceptionMessage() {
		
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que lance IndexOutOfBoundsException");
		}
		catch (IndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("Index 0 out of bounds for length 0"));
		}
	}
}
