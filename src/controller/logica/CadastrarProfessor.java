package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Noticia;
import modelo.dao.NoticiaDAO;



public class CadastrarProfessor implements Logica {

	public String executa(HttpServletRequest rq, HttpServletResponse rp) {

		System.out.println("Cadastrar professor");
		
		System.out.println(".......... dentro de cadastrar professor...............");
		String titulo = rq.getParameter("titulo");
		String texto = rq.getParameter("texto");
		
		Noticia n = new Noticia();
		n.setTitulo(titulo);
		n.setTexto(texto);
		
		NoticiaDAO nD = new NoticiaDAO();

		boolean cadastro;
		
		String pagina = "/WEB-INF/jsp/Principal.jsp";
				
		cadastro = nD.cadastrar(n);
		
		try{
			if(cadastro != false){
				System.out.println("Cadastrado!");
				pagina = "/WEB-INF/jsp/Principal.jsp";
				rq.setAttribute("noticias", nD.getNoticias());
				
			}else{
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return pagina;
	}
	
	
}
