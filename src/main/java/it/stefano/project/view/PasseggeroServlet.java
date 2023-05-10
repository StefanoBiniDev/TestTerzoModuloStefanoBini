package it.stefano.project.view;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

import it.stefano.project.controller.PasseggeroServiceBeanLocal;
import it.stefano.project.model.Passeggero;

@WebServlet("/passeggeroManager")
public class PasseggeroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	PasseggeroServiceBeanLocal passeggeroService;
       
    public PasseggeroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			List<Passeggero> listP = new ArrayList<>();
			listP = passeggeroService.getAllPasseggeri();
			
			request.setAttribute("passeggeri", listP);
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
			request.getRequestDispatcher("adminVisualizzaPasseggeri.jsp").include(request, response);
			
			PrintWriter out = response.getWriter();
			
			for (Passeggero pass : listP) {
	            System.out.println(pass);
	            out.println(pass);
	        }
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
