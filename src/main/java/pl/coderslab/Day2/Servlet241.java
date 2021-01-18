package pl.coderslab.Day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet241")
public class Servlet241 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        for (int i = 1; i <= 7; i++) {

           // response.getWriter().append("<a href=\"http://localhost:8080/Servlet242?id=").append(Integer.toString(i)).append("\">Get4 link</a>").append("\n");
            response.getWriter().println("<a href=\"http://localhost:8080/Servlet242?id=" + i + "\">Produkt nr "+i+"</a><br/>");


        }
    }
}
