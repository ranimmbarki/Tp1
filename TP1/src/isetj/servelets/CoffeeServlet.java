package isetj.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

/**
 * Servlet implementation class CoffeeServlet
 */
@WebServlet("/CoffeeServlet")
public class CoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CoffeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opt=request.getParameter("remarque");
		String com=request.getParameter("commentaires");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Servlet de Bienvenue</title></head>");
		out.println("<body><img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZdhwLo7Z1Qi9hhvNtMpb3ZlvX5X5Ntwsiww&usqp=CAU'><br>");
		out.println("Merci de nous avoir fait parvenir la remarque suivante concernant la qualit� du service<br>Bonne");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
