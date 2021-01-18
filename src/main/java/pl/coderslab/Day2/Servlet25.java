package pl.coderslab.Day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/Servlet25")
public class Servlet25 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Random random=new Random();
        int [] array=new int[10];
        int [] sortedArray=new int[10];
        for (int i=0; i<array.length;i++){
            array[i]=random.nextInt(100);
        }
        response.getWriter().println(Arrays.toString(array));
        Arrays.sort(array);
        response.getWriter().println(Arrays.toString(array));
        }
}
