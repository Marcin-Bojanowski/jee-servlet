package pl.coderslab.Day3;

import pl.coderslab.Day3.classes.CartItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet351")
public class Servlet351 extends HttpServlet {
    public static final String CART_ITEMS = "basket";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        if ("add".equals(request.getParameter("submit"))) {
            CartItem cartItem = new CartItem(
                    request.getParameter("name"),
                    Integer.parseInt(request.getParameter("quantity")),
                    Double.parseDouble(request.getParameter("price")));

            if (session.getAttribute(CART_ITEMS) == null) {
                session.setAttribute(CART_ITEMS, new ArrayList<CartItem>());
            }
            List<CartItem> cartItems = (List<CartItem>) session.getAttribute(CART_ITEMS);
            cartItems.add(cartItem);
            session.setAttribute(CART_ITEMS, cartItems);
            response.sendRedirect("/servlet351");
        } else if ("show".equals(request.getParameter("submit"))) {
            response.sendRedirect("/servlet352");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        if (!session.isNew()) {
            response.getWriter().println("Dodano produkt do koszyka");
        }
        response.getWriter().println("<form action=\"/servlet351\" method=\"POST\">\n" +
                "<label>\n" +
                "    Nazwa:\n" +
                "    <input type=\"text\" name=\"name\">\n" +
                "</label>\n" +
                "<label>\n" +
                "    Ilość:\n" +
                "    <input type=\"number\" name=\"quantity\">\n" +
                "</label>\n" +
                "<label>\n" +
                "    Cena:\n" +
                "    <input type=\"number\" name=\"price\" step=\"0.01\">\n" +
                "</label>\n" +
                "<input type=\"submit\" name=\"submit\" value=\"add\"><br>\n" +
                "<input type=\"submit\" name=\"submit\" value=\"show\">\n" +
                "</form>");
    }
}
