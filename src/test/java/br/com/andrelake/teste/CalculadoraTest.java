package br.com.andrelake.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar("1+1+5");
		
		assertEquals(7, soma);
	}

}
