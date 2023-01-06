package br.com.empresas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresaServlet")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		Empresa empresa = new Empresa(request.getParameter("nome"));
		banco.adicionaEmpresa(empresa);
		
		
		
		request.setAttribute("empresa", empresa.getNome());
		
		//sendRedirect - redireciona para última URL,
		//pra não ficar dando f5 e cadastrando a mesma coisa várias vezes
		response.sendRedirect("listaEmpresasServlet");
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasServlet");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
		
	}

}
