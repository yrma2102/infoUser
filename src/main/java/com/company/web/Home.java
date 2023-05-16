package com.company.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los valores para los parámetros de consulta
        String firstName =(request.getParameter("firstName") != null) ? request.getParameter("firstName"):"Unknown";
        String lastName = request.getParameter("lastName") != null ? request.getParameter("lastName") :"Unknown";
        String favoriteLanguage = request.getParameter("favoriteLanguage") != null ?request.getParameter("favoriteLanguage") : "Unknown" ;
        String homeTown = request.getParameter("homeTown")!= null ? request.getParameter("homeTown"): "Unknown" ;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + firstName + " " +lastName+"</h1>");
        out.write("<p>Your favorite language is:  " + favoriteLanguage + "</p>");
        out.write("<p>Your hometown is:  " + homeTown + "</p>");
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
