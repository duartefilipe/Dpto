package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Professor;
import modelo.dao.ProfessorDAO;

public class CadastrarProfessor implements Logica {

	public String executa(HttpServletRequest rq, HttpServletResponse rp) {
		System.out.println(".......... dentro de cadastrar professor...............");
		String nome = rq.getParameter("nome");
		int siape = Integer.parseInt(rq.getParameter("siape"));
		int ramal = Integer.parseInt(rq.getParameter("ramal"));
		int celular = Integer.parseInt(rq.getParameter("celular"));
		String sala = rq.getParameter("sala");
		int cpf = Integer.parseInt(rq.getParameter("cpf"));
		int identidade = Integer.parseInt(rq.getParameter("identidade"));
		String email = rq.getParameter("email");

		System.out.println("cadastrar Produto");
		System.out.println("nome: " +nome);
		System.out.println("siape: " +siape);
		System.out.println("ramal: " +ramal);
		System.out.println("celular: " +celular);
		System.out.println("sala: " +sala);
		System.out.println("cpf: " +cpf);
		System.out.println("identidade: " +identidade);
		System.out.println("email: " +email);

		Professor p = new Professor();
		p.setNome(nome);
		p.setSiape(siape);
		p.setRamal(ramal);
		p.setCelular(celular);
		p.setSala(sala);
		p.setCpf(cpf);
		p.setIdentidade(identidade);
		p.setEmail(email);

		ProfessorDAO pD = new ProfessorDAO();

		String pagina = "/index.jsp";

		try {

			System.out.println("Cadastrado!");
			pagina = "/WEB-INF/jsp/principal.jsp";
			rq.setAttribute("professores", pD.getProfessores());
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pagina;

	}
}
