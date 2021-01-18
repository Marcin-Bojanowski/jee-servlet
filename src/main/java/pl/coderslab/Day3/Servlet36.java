package pl.coderslab.Day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet36")
public class Servlet36 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] numbers = request.getParameterValues("num");
        int[] intNumber = new int[numbers.length];
        response.getWriter().println("Liczby");
        int sum=0;
        int iloczyn=1;
        for (int i = 0; i < numbers.length; i++) {
            intNumber[i] = Integer.parseInt(numbers[i]);
            sum+=intNumber[i];
            iloczyn=iloczyn*intNumber[i];
            response.getWriter().println(intNumber[i]);
        }
        response.getWriter().println("Srednia: \n"+sum*1.0/intNumber.length*1.0 );
        response.getWriter().println("Suma: \n"+sum);
        response.getWriter().println("Iloczyn: \n"+iloczyn);
    }
}
