package br.com.empresas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveEmpresaServlet
 */
@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String paramId = request.getParameter("id");
//		Integer id = Integer.valueOf(paramId);
		
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		
		banco.removeEmpresa(id);
		
		//sendRedirect não pode ter barra "/" igual o request.getRequestDisptacher
		response.sendRedirect("listaEmpresasServlet");
			
		
	}

}
