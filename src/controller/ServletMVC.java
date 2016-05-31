package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.logica.Logica;

@WebServlet(name = "MVC", urlPatterns = { "/MVC" })
public class ServletMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletMVC() {
        super();
     }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Entrou no Servlet MVC");
			String log = request.getParameter("logica");
			String classe = "controller.logica."+log;
		
			try{
				
				Class classeCarregada = Class.forName(classe);
				Logica logLogica =
						(Logica) classeCarregada.newInstance();
				
				String fluxo = logLogica.executa(request, response);
				request.getRequestDispatcher(fluxo).forward(request, response);
				
			}catch(Exception e){
				e.printStackTrace();
			}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
