package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.NoticiaDAO;

public class RedirecionaCadastrarNoticia implements Logica{

	@Override
	public String executa(HttpServletRequest rq, HttpServletResponse rp) {
		 System.out.println("dentro do redirecinamento ....");
		
		 rq.setAttribute("noticias", new NoticiaDAO().getNoticias());
		
		return "/WEB-INF/jsp/CadastrarNoticia.jsp";
	}

	
	
}
