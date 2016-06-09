package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.FuncionarioDAO;
import modelo.dao.ProfessorDAO;

public class RedirecionaCadastraFuncionario implements Logica{

	@Override
	public String executa(HttpServletRequest rq, HttpServletResponse rp) {
		 System.out.println("dentro do redirecinamento ....");
		
		 rq.setAttribute("funcionarios", new FuncionarioDAO().getFuncionarios());
		
		return "/WEB-INF/jsp/CadastrarFuncionario.jsp";
	}

	
	
}
