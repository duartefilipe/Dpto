package controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Noticia;
import modelo.dao.NoticiaDAO;


public class CadastrarNoticia implements Logica {

	public String executa(HttpServletRequest rq, HttpServletResponse rp) {

		System.out.println("Cadastrar noticia");
		
		System.out.println(".......... dentro de cadastrar noticia...............");
		String titulo = rq.getParameter("titulo");
		String texto = rq.getParameter("texto");
		

		
		Noticia n = new Noticia();
		n.setTitulo(titulo);
		n.setTexto(titulo);
		
		NoticiaDAO nD = new NoticiaDAO();

		boolean cadastro;
		
		String pagina = "/WEB-INF/jsp/CadastrarNoticia.jsp";
				
		cadastro = nD.cadastrar(n);
		
		try{
			if(cadastro != false){
				System.out.println("Cadastrado!");
				pagina = "/WEB-INF/jsp/CadastrarNoticia.jsp";
				rq.setAttribute("noticias", nD.getNoticias());
				
			}else{
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return pagina;
	}
	
	
}
