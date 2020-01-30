package app.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.modelo.Contacto;
import app.persistencia.CRUD;


/**
 * Servlet implementation class Control
 */
@WebServlet("/control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion = request.getParameter("op");
		switch (opcion) {
		case "1":
			buscarTodos(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String opcion = request.getParameter("op");
		switch (opcion) {
		case "2":
			buscarContacto(request, response);
			break;
		case "3":
			modificarContacto(request, response);
			break;		
		case "4":
			altaContacto(request,response);
			break;
		case "5":
			eliminaContacto(request,response);
			break;
			}		
	}
	private void buscarTodos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CRUD cr1= new CRUD();
		
		try {
			request.setAttribute("c1", cr1.obtenerTodos());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rq=request.getRequestDispatcher("/mostrartodos.jsp");
		rq.forward(request, response);
	}
	private void buscarContacto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contacto c1= (Contacto) request.getAttribute("c1");
		CRUD cr1= new CRUD();
		
		try {
			c1=cr1.obtenerUnContacto(c1.getId());
			request.setAttribute("c1", c1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rq=request.getRequestDispatcher("/mostraruno.jsp");
		rq.forward(request, response);
	}
	private void modificarContacto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contacto c1= (Contacto) request.getAttribute("c1");
		CRUD cr1= new CRUD();
		
		try {
			if (cr1.modificarContacto(c1)) {
				request.setAttribute("mensaje", "Modificación realizada.");
			} else {
				request.setAttribute("mensaje", "No se ha podido realizar la modificación.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rq=request.getRequestDispatcher("/mostrar.jsp");
		rq.forward(request, response);
	}
	private void altaContacto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contacto c1= (Contacto) request.getAttribute("c1");
		CRUD cr1= new CRUD();
		
		try {
			if (cr1.insertarContacto(c1)) {
				request.setAttribute("mensaje", "Contacto añadido a la agenda.");
			} else {
				request.setAttribute("mensaje", "No se ha podido añadir el contacto.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rq=request.getRequestDispatcher("/mostrar.jsp");
		rq.forward(request, response);
	}
	private void eliminaContacto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contacto c1= (Contacto) request.getAttribute("c1");
		CRUD cr1= new CRUD();
		
		try {
			if (cr1.borrarContacto(c1.getId())) {
				request.setAttribute("mensaje", "Contacto eliminado.");
			} else {
				request.setAttribute("mensaje", "No se ha podido eliminar el contacto.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rq=request.getRequestDispatcher("/mostrar.jsp");
		rq.forward(request, response);
	}

}
