package br.com.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Empresa;

public class AlteraEmpresas {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome");
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		System.out.println(id);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPeloId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setId(id);
		
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}

}
