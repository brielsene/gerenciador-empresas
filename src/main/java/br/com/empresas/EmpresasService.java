package br.com.empresas;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.modelo.Banco;
import br.com.modelo.Empresa;

/**
 * Servlet implementation class EmpresasService
 */
@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Empresa>empresas = new Banco().getListaEmpresas();
		 Gson gson = new Gson();
		 String json = gson.toJson(empresas);
		 
		 response.setContentType("application/json");
		 response.getWriter().print(json);
	}

}
