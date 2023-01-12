package br.com.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Empresa;

public class ListaEmpresas {
	public void executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("listando empresas");
		Banco banco = new Banco();
		List<Empresa>lista = banco.getListaEmpresas();
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
	}
}
