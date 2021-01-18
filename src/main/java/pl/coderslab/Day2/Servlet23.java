package pl.coderslab.Day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet("/Servlet23")
public class Servlet23 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Path path = Paths.get("E:/jee-servlet/oop.txt");
        for (String line : Files.readAllLines(path)) {
            response.getWriter().append(line).append("\n");
        }
    }
}
