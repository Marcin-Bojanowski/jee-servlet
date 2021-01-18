package pl.coderslab.Day4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet311")
public class Servlet311 extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        Map<String, String> lang = new  HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");
        String cookieName = "lang";
        Cookie[] cookies = request.getCookies();
        String language="";
        if (cookies != null) {
            boolean cookieFound = false;
            for (Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    language =lang.get(cookie.getValue());
                    cookieFound = true;
                }
            }
            if (!cookieFound) {
                language = "Cześć";
            }
        }
        request.setAttribute("lang", language);
        getServletContext()
                .getRequestDispatcher("/WEB-INF/servlet311.jsp")
                .forward(request, response);
    }
}
