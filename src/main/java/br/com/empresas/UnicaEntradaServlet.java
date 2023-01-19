package br.com.empresas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.acao.Acao;
import br.com.acao.AlteraEmpresas;
import br.com.acao.ListaEmpresas;
import br.com.acao.MostraEmpresas;
import br.com.acao.NovaEmpresa;
import br.com.acao.NovaEmpresaForm;
import br.com.acao.RemoveEmpresas;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
//		
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoEstaLogado = sessao.getAttribute("usuarioLogado")==null;
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
//		
//		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
//			response.sendRedirect("entrada?acao=LoginForm");
//			//esse return serve apenas para sair da execução,
//			//para que não continue executando o código abaixo, já que 
//			//temos uma condição, e o código de baixo, é apenas para
//			//se usuario já estiver logado, que a condição contraria deste if
//			return;
//		}
		
		
		
		String nomeDaClasse = "br.com.acao." + paramAcao;

		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);// carrega a classe com o nome da String
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		// paramAcao.executa(req, resp);

		String[] tipoEEndereco = nome.split(":");
		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

//		String nome = null;
//		if (paramAcao.equals("ListaEmpresas")) {
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request, response);
//			
//		}
//
//		else if (paramAcao.equals("RemoveEmpresas")) {
//			RemoveEmpresas acao = new RemoveEmpresas();
//			nome = acao.executa(request, response);
//
//		} else if (paramAcao.equals("MostraEmpresas")) {
//			MostraEmpresas acao = new MostraEmpresas();
//			nome = acao.executa(request, response);
//		} else if (paramAcao.equals("AlteraEmpresas")) {
//			AlteraEmpresas acao = new AlteraEmpresas();
//			nome = acao.executa(request, response);
//		} else if (paramAcao.equals("NovaEmpresa")) {
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("NovaEmpresaForm")) {
//			NovaEmpresaForm novaEmpresaForm = new NovaEmpresaForm();
//			nome = novaEmpresaForm.executa(request, response);
//		}

	}

}
