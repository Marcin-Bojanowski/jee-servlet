package pl.coderslab.Day3;

import org.apache.http.protocol.HTTP;
import pl.coderslab.Day3.classes.CartItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet352")
public class Servlet352 extends HttpServlet {
    public static final String CART_ITEMS = "basket";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        List<CartItem> cartItems = (List<CartItem>) session.getAttribute(CART_ITEMS);
        double totalSum = 0;
        for (CartItem item : cartItems) {
            response.getWriter().println(
                    item.getName() + " - " + item.getQuantity() + " x " + item.getPrice() + "zł = " + item.getPrice() * item.getQuantity() + "zł<br>");
            totalSum += item.getPrice() * item.getQuantity();
        }
        response.getWriter().println("SUMA: " + totalSum + "zł");
    }
}

