package br.ufcg.ppgcc.compor.ir.teste;

import org.junit.Before;
import org.junit.Test;

import br.ufcg.ppgcc.compor.ir.fachada.FachadaExperimento;
import br.ufcg.ppgcc.compor.ir.fachada.Titular;


public class TitularTest {

	private FachadaExperimento fachada;

	@Before
	public void iniciar() {
		//Coloque sua Fachada aqui.
		fachada = null;
	}

	@Test
	public void T_01_01_novoTitular() {
		Titular titular = TitularHelper.criarTitularMinimo();
		TitularHelper.verificaCriacaoTitulares(fachada, titular);
	}
	
	@Test
	public void T_01_02_titularCompleto() {
		Titular titular = TitularHelper.criarTitularPadrao();
		TitularHelper.verificaCriacaoTitulares(fachada, titular);
	}

	@Test
	public void T_01_03_doisTitulares() {
		Titular titular1 = TitularHelper.criarTitularPadrao();
		Titular titular2 = TitularHelper.criarTitularMinimo();
		TitularHelper.verificaCriacaoTitulares(fachada, titular1, titular2);
	}

}