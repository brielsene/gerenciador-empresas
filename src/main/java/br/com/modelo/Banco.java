package br.com.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Banco {
	private static List<Empresa>listaEmpresas = new ArrayList<>();
	
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa("Alura");
		empresa.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa("Caelum");
		empresa2.setId(chaveSequencial++);
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}
	
	public void adicionaEmpresa (Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getListaEmpresas() {
		return Banco.listaEmpresas;
	}

//	public void removeEmpresa(Integer id) {
//		for (Empresa empresa : listaEmpresas) {
//			if(empresa.getId()==id) {
//				listaEmpresas.remove(empresa);
//			}
//			
//		}
//		}
	
	public void removeEmpresa(Integer id) {
		
		//Iterator sabe iterar sobre a mesma lista e apagar, e o foreach não
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		
		
			
		}
	
	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
		
		
	}
	


