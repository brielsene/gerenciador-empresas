package br.com.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Banco {
	private static List<Empresa>listaEmpresas = new ArrayList<>();
	private static List<Usuario>listaUsuarios = new ArrayList<>();
	
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa("Alura");
		empresa.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa("Caelum");
		empresa2.setId(chaveSequencial++);
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("gabriel");
		u1.setSenha("1234");
		
		Usuario u2 = new Usuario();
		u2.setLogin("nino");
		u2.setSenha("1234");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
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

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
			
		}
		return null;
	}
		
		
	}
	


