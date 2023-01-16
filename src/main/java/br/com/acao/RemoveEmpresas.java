package br.com.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;

public class RemoveEmpresas implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("removendo empresas");
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
		
		
		
		Banco banco = new Banco();
		
		banco.removeEmpresa(id);
		
		//sendRedirect não pode ter barra "/" igual o request.getRequestDisptacher
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
