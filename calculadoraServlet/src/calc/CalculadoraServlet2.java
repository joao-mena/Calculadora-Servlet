package calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraServlet.
 */
@WebServlet("/calcularSeno.do")
public class CalculadoraServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet2() {
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    	System.out.println("Servlet iniciado");
    }
    
    @Override
    public void destroy() {
    
    	super.destroy();
    	System.out.println("Servlet destruido");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double angulo = Integer.parseInt(request.getParameter("angulo"));
		
		double resultado = Math.asin(angulo);
		
		response.setContentType("text/plain");
		PrintWriter saida = response.getWriter();
		saida.write("Resultado: " + resultado);
		saida.close();
	}
}
		
