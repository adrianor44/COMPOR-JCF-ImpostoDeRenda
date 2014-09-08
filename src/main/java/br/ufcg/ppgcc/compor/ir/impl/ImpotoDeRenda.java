package br.ufcg.ppgcc.compor.ir.impl;
import java.awt.List;
import java.util.ArrayList;

import br.ufcg.ppgcc.compor.ir.*;

public class ImpotoDeRenda implements FachadaExperimento {

	List titulares = new List();
	private List titular;
	public void criarNovoTitular(Titular titular){
		titular.add(titular);
	}
	public void criarTitularPadrao(String titular){
		titulares.add(titular);
	}
	public List listaTitularPadrao(){
		return this.titulares;
	}
	public java.util.List<Titular> listarTitulares() {
		
		return (java.util.List<Titular>) titulares;
	}

	
}
