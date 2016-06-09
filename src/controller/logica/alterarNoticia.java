package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Noticia;
import modelo.dao.NoticiaDAO;

public class alterarNoticia implements Logica{

	@Override
	public String executa(HttpServletRequest rq, HttpServletResponse rp) {


		String id = rq.getParameter("id");
		int idInt = Integer.parseInt(id);
		System.out.println("Alterar noticia logica | id: "+id);
		
		
		NoticiaDAO nd = new NoticiaDAO();
		Noticia n = new Noticia();
		n = nd.getnoticia(idInt);
		String pagina="index.jsp";
		
		if(n.getTitulo() != null)
		{
			pagina="/WEB-INF/jsp/alterarNoticia.jsp";
			rq.setAttribute("noticia", n);
		}
		
		
		return pagina;
	}

}
