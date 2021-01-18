package pl.coderslab.Day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/binary")
public class Servlet23 extends HttpServlet {
    private static final String BIN="[01]+";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String binary = request.getParameter("binary");
        Pattern pattern=Pattern.compile(BIN);
        Matcher matcher=pattern.matcher(binary);
        if (!matcher.matches()){
            response.getWriter().println("To nie jest liczba w systemie binarnym");
        } else {

            char [] array=binary.toCharArray();
            int [] binaryArray=new int[array.length];
            for (int i=0; i<array.length; i++){
                binaryArray[i]=Character.getNumericValue(array[i]);
            }
            int decimal=0;
            for (int i=binaryArray.length-1, j=0; i>=0; i--,j++){
                decimal+=Math.pow(2,j)*binaryArray[i];
            }
response.getWriter().println(decimal);
        }
    }


}
