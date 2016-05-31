package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ProfessorDAO;

public class RedirecionaSobre implements Logica{

	@Override
	public String executa(HttpServletRequest rq, HttpServletResponse rp) {
		 System.out.println("dentro do redirecinamento ....");
		
		 String pagina = "/Sobre.jsp";
		
		return "/WEB-INF/jsp/Sobre.jsp";
	}

	
	
}
