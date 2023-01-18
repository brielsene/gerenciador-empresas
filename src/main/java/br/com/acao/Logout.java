package br.com.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
//		sessao.removeAttribute("usuarioLogado");
		//o método abaixo, destrói o cookie antigo quando damos logout
		//e cria um novo
		sessao.invalidate();
		
		return "redirect:entrada?acao=LoginForm";
	}

}
