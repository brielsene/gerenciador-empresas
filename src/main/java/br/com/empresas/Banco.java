package br.com.empresas;

import java.util.ArrayList;
import java.util.List;



public class Banco {
	private static List<Empresa>listaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa("Alura");
		Empresa empresa2 = new Empresa("Caelum");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}
	
	public void adicionaEmpresa (Empresa empresa) {
		listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}
	

}
