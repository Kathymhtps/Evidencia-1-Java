/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 *
 * @author kathymhtps
 */

@WebServlet("/calcularIAC")
public class CalcularIACServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        double altura = Double.parseDouble(request.getParameter("altura"));
        double cadera = Double.parseDouble(request.getParameter("cadera"));

      
        Persona persona = new Persona(altura, cadera);
        
       
        persona.calcularIAC();

       
        request.setAttribute("altura", altura);
        request.setAttribute("cadera", cadera);
        request.setAttribute("iac", persona.getIAC());

   
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
