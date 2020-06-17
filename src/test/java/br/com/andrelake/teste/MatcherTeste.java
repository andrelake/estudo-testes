package br.com.andrelake.teste;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Before;
import org.junit.Test;

public class MatcherTeste {

	private Pessoa pessoa;
	
	@Before
	public void set(){
		
		pessoa = new Pessoa("Joao", "Silva");
	}
	
	@Test
	public void devePassarAoTestarStringDoNomeDaPessoa() {
		
		String str = pessoa.toString();
		
		assertThat(pessoa, HasToString.hasToString(str));
	}
	
	@Test
	public void devePassarAoCheckarPropriedadeExistente() {
		
		assertThat(pessoa, HasProperty.hasProperty("nome"));
	}
	
	@Test
	public void devePassarSeAListaForVazia() {
		
		List<String> lista = new ArrayList<String>();
		
		assertThat(lista, Matchers.empty());
	}
	
	@Test
	public void devePassarSeForMaiorQueZero() {
		
		assertThat(1, Matchers.greaterThan(0));
	}
	
	@Test
	public void devePassarSeForNull() {
		
		String str = null;
		assertThat(str, isEmptyOrNullString());
	}
}
