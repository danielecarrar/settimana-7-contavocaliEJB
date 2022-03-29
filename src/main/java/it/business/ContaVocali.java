package it.business;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContaVocali extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ContaVocali() {
        super();}

	@EJB
	ContaVocaliEJB cv;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String par = request.getParameter("parola");
		
		int numeroVocali = cv.ContaVocali(par);
		response.setContentType("text/html");
		out.println("<h1 text-align=center>Il numero di vocali è: " + numeroVocali + "</h1>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}