package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.NoticiaDAO;

public class DeletarNoticia implements Logica {

	@Override
	public String executa(HttpServletRequest rq, HttpServletResponse rp) {
		
		System.out.println("Deletar Noticia");

		String id =rq.getParameter("id");
		int idint = Integer.parseInt(id);
		new NoticiaDAO().removernoticia(idint);
		
		
		System.out.println("deletado!");
		String pagina = "/WEB-INF/jsp/CadastrarNoticia.jsp";
		rq.setAttribute("noticias", new NoticiaDAO().getNoticias());
		
		return pagina;
	}

}
