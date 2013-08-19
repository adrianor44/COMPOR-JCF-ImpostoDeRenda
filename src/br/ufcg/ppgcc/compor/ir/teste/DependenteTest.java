package br.ufcg.ppgcc.compor.ir.teste;

import org.junit.Before;
import org.junit.Test;

import br.ufcg.ppgcc.compor.ir.fachada.Dependente;
import br.ufcg.ppgcc.compor.ir.fachada.FachadaExperimento;
import br.ufcg.ppgcc.compor.ir.fachada.Titular;

public class DependenteTest {

	private FachadaExperimento fachada;

	@Before
	public void iniciar() {
		// Coloque sua Fachada aqui.
		fachada = null;
	}

	@Test
	public void T_03_01_novoDependente() {
		Titular titular = TitularHelper.criarTitularPadrao();
		fachada.criarNovoTitular(titular);

		Dependente dependente = DependenteHelper.criarDependentePadrao1();
		DependenteHelper.verificaCriacaoDependentes(fachada, titular, dependente);
	}

	@Test
	public void T_03_02_doisDependentesEmUmTitular() {
		Titular titular = TitularHelper.criarTitularPadrao();
		fachada.criarNovoTitular(titular);
		Dependente dependente1 = DependenteHelper.criarDependentePadrao1();
		Dependente dependente2 = DependenteHelper.criarDependentePadrao2();
		DependenteHelper.verificaCriacaoDependentes(fachada, titular, dependente1, dependente2);
	}

	@Test
	public void T_03_03_doisDependentesUmEmCadaTitular() {
		Titular titular1 = TitularHelper.criarTitularPadrao();
		fachada.criarNovoTitular(titular1);
		Dependente dependente1 = DependenteHelper.criarDependentePadrao1();

		Titular titular2 = TitularHelper.criarTitularMinimo();
		fachada.criarNovoTitular(titular2);
		Dependente dependente2 = DependenteHelper.criarDependentePadrao2();

		DependenteHelper.verificaCriacaoDependentes(fachada, titular1, dependente1);
		DependenteHelper.verificaCriacaoDependentes(fachada, titular2, dependente2);
	}

}
