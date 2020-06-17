package br.com.andrelake.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTeste {

	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	
	@Test
	public void deveCriarArquivoNaPastaTemporaria() throws IOException {
		
		File arquivo = tempFolder.newFile("file.txt");
		
		assertTrue(arquivo.isFile());
		assertEquals(tempFolder.getRoot(), arquivo.getParentFile());
	}
}
