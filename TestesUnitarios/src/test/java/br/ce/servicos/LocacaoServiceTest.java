package br.ce.servicos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;



import br.ce.entidades.Filme;
import br.ce.entidades.Locacao;
import br.ce.entidades.Usuario;
import br.ce.servicos.LocacaoService;
import br.ce.utils.DataUtils;

public class LocacaoServiceTest {

	@Test
	public void teste() {
		//cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		
		//acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verificacao
		Assert.assertEquals(locacao.getClass(),5.0);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
	}
}
