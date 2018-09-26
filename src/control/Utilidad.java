package control;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Utilidad
 */
//@WebServlet("/servlets/suma")
public class Utilidad extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Utilidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String op1 = peticion.getParameter("a");
		String op2 = peticion.getParameter("b");
		int suma = 0;
		try {
			suma = Integer.parseInt(op1) + Integer.parseInt(op2);
			respuesta.getWriter().append(" la suma es " + suma);
		} catch (NumberFormatException e) {
			respuesta.getWriter().append("error de formato en operando");
		}
		String paramConfig = this.getServletConfig().getInitParameter("nombre");
        System.out.println(paramConfig);
        String contextoParam = this.getServletContext().getInitParameter("Pais");
        System.out.println(contextoParam);
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("1 Inicializando servlet...!");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("2 Inicializando servlet...!");
		System.out.println(config.getInitParameter("nombre"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
