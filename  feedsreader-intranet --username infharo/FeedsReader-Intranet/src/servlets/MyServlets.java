package servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lector.feed.News;
import lector.feed.Watch;
import lector.userProfile.Users;

/**
 * Servlet implementation class for Servlet: MyServlets
 *
 */
 public class MyServlets extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public MyServlets() {
		super();
	}   	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Watch buscar;
		List<News> listaDeNoticias;
		Users usuario;
		Iterator<News> it;
		int i = 0;
		
		buscar = new Watch();
		
		//Preparamos usuario
		List<String> listaCanales = new LinkedList<String>();
		listaCanales.add("canal1");
		listaCanales.add("canal2");
		usuario = new Users("Pepe","Garcia","C/Sol", 12345678, listaCanales);
		
		//Obtengo las noticias correspondientes al usuario que se introduce como parametro de entrada
		listaDeNoticias = buscar.WatchPersonalChannels(usuario);
		it = listaDeNoticias.iterator();
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Password Checker");
		out.println("</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"#6699CC\">");
		
		while(it.hasNext())
		{
			i++;
			out.println("<p>" + "NOTICIA" + i + ": " + it.next().toString() + "</p>");
		}
		
		out.println("<body\">");
		out.close();
	}   	
		  	    
}