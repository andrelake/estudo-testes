package br.com.andrelake.teste;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class AssertJTeste {

	private Pessoa pessoa;
	
	@Before
	public void set(){
		
		pessoa = new Pessoa("Joao", "Silva");
	}
	
	@Test
	public void devePassarSeForemIguais() {
		
		Pessoa outraPessoa = pessoa;
		
		assertThat(pessoa).isEqualTo(outraPessoa);
	}
	
	@Test
	public void devePassarSeStringEstiverPresente() {
		
		assertThat(pessoa).hasToString("Joao Silva");
	}
	
	@Test
	public void devePassarSeConterAPropriedade() {
		
		assertThat(pessoa).hasFieldOrProperty("nome");
	}
}
