package br.com.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Empresa;

public class ListaEmpresas implements Acao {
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa>lista = banco.getListaEmpresas();
		
		
		
		request.setAttribute("lista", lista);
		
		return "forward:listaEmpresas.jsp";
		
	}
}
