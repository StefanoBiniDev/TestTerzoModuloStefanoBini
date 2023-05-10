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

/**
 * Servlet implementation class AggiungiPrenotazione
 */
@WebServlet("/aggiungiPrenotazione")
public class AggiungiPrenotazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	PasseggeroServiceBeanLocal passeggeroService;

    public AggiungiPrenotazione() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String data = "05/05/05";
	 	Passeggero pass = new Passeggero();
		pass.setNome(nome);
		pass.setCognome(cognome);
		pass.setData(data);
		passeggeroService.inserisci(pass);
		request.getRequestDispatcher("index.jsp").include(request, response);
		request.getRequestDispatcher("gestionePrenotazioni.jsp").include(request, response);
		PrintWriter out = response.getWriter();
		out.println("<h1> Prenotazione avvenuta con successo</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
