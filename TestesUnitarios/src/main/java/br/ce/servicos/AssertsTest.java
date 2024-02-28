package br.ce.servicos;

import org.junit.Test;

import br.ce.entidades.Usuario;

import org.junit.Assert;

public class AssertsTest {


	@Test 
	public void test() {
		Assert.assertTrue(true);
		
		Assert.assertEquals(2.0, 2.0,0);
		
		Assert.assertEquals("bola", "bola");
		
		Usuario u1 = new Usuario("Usuário 1 ");
		Usuario u2 = new Usuario("Usuário 2 ");
		
		Assert.assertEquals(u1, u1);
		
		Assert.assertSame(u1, u1);
		
	}
}
