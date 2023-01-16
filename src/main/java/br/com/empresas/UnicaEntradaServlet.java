package br.com.empresas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.acao.AlteraEmpresas;
import br.com.acao.ListaEmpresas;
import br.com.acao.MostraEmpresas;
import br.com.acao.NovaEmpresa;
import br.com.acao.RemoveEmpresas;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		
		String nome = null;
		if (paramAcao.equals("ListaEmpresas")) {
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(request, response);
			
		}

		else if (paramAcao.equals("RemoveEmpresas")) {
			RemoveEmpresas acao = new RemoveEmpresas();
			nome = acao.executa(request, response);

		} else if (paramAcao.equals("MostraEmpresas")) {
			MostraEmpresas acao = new MostraEmpresas();
			acao.executa(request, response);
		} else if (paramAcao.equals("AlteraEmpresas")) {
			AlteraEmpresas acao = new AlteraEmpresas();
			acao.executa(request, response);
		} else if (paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			acao.executa(request, response);
		}
		
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")) {
		RequestDispatcher rd = request.getRequestDispatcher(tipoEEndereco[1]);
		rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEEndereco[1]);
		}

	}

}
