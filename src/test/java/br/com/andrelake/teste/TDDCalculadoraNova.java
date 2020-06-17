package br.com.andrelake.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TDDCalculadoraNova {

	int a, b, c;
	
	@Before
	public void setUp() {
		
		a = 1;
		b = 4;
		c = 2;
	}
	
	@Test
	public void devePassarQuandoSomarDoisValores() {
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(a, b);
		
		assertEquals(5, soma);
	}
	
	@Test
	public void devePassarQuandoSomarTresValores() {
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(a, b, c);
		
		assertEquals(7, soma);
	}
}
