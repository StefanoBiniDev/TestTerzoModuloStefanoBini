package it.stefano.project.view;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import it.stefano.project.controller.PasseggeroServiceBeanLocal;
import it.stefano.project.model.Passeggero;

@WebServlet("/rimuoviPrenotazione")

public class RimuoviPrenotazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@EJB
	PasseggeroServiceBeanLocal passeggeroService;
	
    public RimuoviPrenotazione() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id_prenotazione"));
	 	Passeggero pass = passeggeroService.getPasseggeroById(id);
	;
		passeggeroService.cancella(pass);
		request.getRequestDispatcher("index.jsp").include(request, response);
		request.getRequestDispatcher("gestionePrenotazioni.jsp").include(request, response);
		PrintWriter out = response.getWriter();
		out.println("<h1> Cancellazione avvenuta con successo</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
