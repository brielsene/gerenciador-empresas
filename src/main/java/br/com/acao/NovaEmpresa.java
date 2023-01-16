package br.com.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Empresa;

public class NovaEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		Empresa empresa = new Empresa(request.getParameter("nome"));
		banco.adicionaEmpresa(empresa);
		
		
		
		request.setAttribute("empresa", empresa.getNome());
		
		//sendRedirect - redireciona para última URL,
		//pra não ficar dando f5 e cadastrando a mesma coisa várias vezes
		return"redirect:entrada?acao=ListaEmpresas";
	}

}
