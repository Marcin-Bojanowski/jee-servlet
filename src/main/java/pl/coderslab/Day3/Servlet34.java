package pl.coderslab.Day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/visits")
public class Servlet34 extends HttpServlet {
    private static final String COOKIE_NAME = "VISITS";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        boolean cookieFound = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(COOKIE_NAME)) {
                    cookieFound = true;
                    cookie.setValue(String.valueOf(Integer.parseInt(cookie.getValue()) + 1));
                    response.addCookie(cookie);
                    response.getWriter().println("Witaj, odwiedziłeś nas już: " + cookie.getValue()+" razy");
                }
            }
            if (!cookieFound) {
                response.getWriter().println("Witaj pierwszy raz na stronie");
                Cookie cookie = new Cookie(COOKIE_NAME, "1");
                cookie.setMaxAge(60*60*24*365);
                response.addCookie(cookie);
            }
        }
    }
}
