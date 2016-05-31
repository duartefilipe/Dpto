package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ProfessorDAO;

public class RedirecionaCadastraProfessor implements Logica{

	@Override
	public String executa(HttpServletRequest rq, HttpServletResponse rp) {
		 System.out.println("dentro do redirecinamento ....");
		
		 rq.setAttribute("professores", new ProfessorDAO().getProfessores());
		
		return "/WEB-INF/jsp/CadastrarProfessor.jsp";
	}

	
	
}
