package br.ufpb.dce.poo.controleestoque.tests;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.poo.controleestoque.exception.FacadeException;
import br.ufpb.dce.poo.controleestoque.facade.ControleEstoqueFacade;
import br.ufpb.dce.poo.controleestoque.model.Produto;

public class ControleEstoqueTest {
	private Produto p1, p2, p3;
	private ControleEstoqueFacade facade;
	
	@Before
	public void setUp() throws FacadeException {
		p1 = new Produto(1, "Notebook Ultrafino CCE com Intel Dual Core 2GB 500GB LED 14\" Preto Windows 8", 10, 899.00f);
		p2 = new Produto(2, "Geladeira / Refrigerador Brastemp Frost Free Ative Inverse BRE50 Inox 422 Litros", 5, 2699.00f);
		p3 = new Produto(3, "Smart TV 3D LED 47\" LG 47LA6200 FULL HD 3 HDMI 3 USB Wi-fi 120Hz + 4 Óculos 3D", 1, 2969.10f);
		
		facade = ControleEstoqueFacade.getInstance();
		facade.cadastrarProduto(p1);
		facade.cadastrarProduto(p2);
		facade.cadastrarProduto(p3);
	}
	
	@Test
	public void testCadastrarProduto() {
		
	}
	
	@Test
	public void testBuscarProduto() {
		
	}
	
	@Test
	public void testListarProdutos() {
		
	}
	
	@Test
	public void testGetQuantidadeProduto() {
		
	}
	
	@Test
	public void testReporProduto() {
		
	}
	
	@Test
	public void testRetirarProduto() {
		
	}
	
	@Test
	public void testValorTotalEmEstoque() {
		
	}
	
	@Test
	public void testValorTotalProduto() {
		
	}
}