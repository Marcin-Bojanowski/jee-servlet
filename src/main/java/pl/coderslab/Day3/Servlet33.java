package pl.coderslab.Day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {
    String[] list;
    private static final String LIST = "list";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");

        list = new String[]{
                request.getParameter("name1"),
                request.getParameter("name2"),
                request.getParameter("name3"),
                request.getParameter("name4"),
                request.getParameter("name5"),
        };
        HttpSession session = request.getSession();
        session.setAttribute(LIST, list);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        if (session.getAttribute(LIST) != null) {
        String[] list = (String[]) session.getAttribute(LIST);
        response.getWriter().append(
                "<form action=\"/servlet33\" method=\"POST\">\n" +
                        "        <label>\n" +
                        "            Wpisz coś:<br>\n" +
                        "            <input type=\"text\" name=\"name1\" value=\"" + list[0] + "\"><br>\n" +
                        "            <input type=\"text\" name=\"name2\" value=\"" + list[1] + "\"><br>\n" +
                        "            <input type=\"text\" name=\"name3\" value=\"" + list[2] + "\"><br>\n" +
                        "            <input type=\"text\" name=\"name4\" value=\"" + list[3] + "\"><br>\n" +
                        "            <input type=\"text\" name=\"name5\" value=\"" + list[4] + "\"><br>\n" +
                        "        </label>\n" +
                        "        <input type=\"submit\" name=\"Wyślij\">");
session.removeAttribute(LIST);
            } else {
            response.getWriter().append(
                    "<form action=\"/servlet33\" method=\"POST\">\n" +
                            "        <label>\n" +
                            "            Wpisz coś:<br>\n" +
                            "            <input type=\"text\" name=\"name1\" value=\"\"><br>\n" +
                            "            <input type=\"text\" name=\"name2\" value=\"\"><br>\n" +
                            "            <input type=\"text\" name=\"name3\" value=\"\"><br>\n" +
                            "            <input type=\"text\" name=\"name4\" value=\"\"><br>\n" +
                            "            <input type=\"text\" name=\"name5\" value=\"\"><br>\n" +
                            "        </label>\n" +
                            "        <input type=\"submit\" name=\"Wyślij\">");
        }
    }
}
