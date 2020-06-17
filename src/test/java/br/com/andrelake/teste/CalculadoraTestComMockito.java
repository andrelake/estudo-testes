package br.com.andrelake.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTestComMockito {

	@Test
	public void testSomar() {
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar("1+1+5");
		
		assertEquals(7, soma);
	}
	
	@Test
	public void testeSomarMock() {
		
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2")).thenReturn(10);  //sempre retorna 10
		
		int resultado = calculadora.somar("1+2");
		
		assertEquals(10, resultado);
	}

}
