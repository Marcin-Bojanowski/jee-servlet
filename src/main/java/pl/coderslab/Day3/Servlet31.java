package pl.coderslab.Day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/kursy")
public class Servlet31 extends HttpServlet {
    private static final Map<String, Double> EXCHANGE = new HashMap<String, Double>() {{
        put("eur_usd", 1.11);
        put("usd_eur", 0.90);
        put("eur_pln", 4.45);
        put("pln_eur", 0.22);
        put("usd_pln", 4.01);
        put("pln_usd", 0.25);
    }};


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int amount = Integer.parseInt(request.getParameter("amount"));
        String option = request.getParameter("option");
        for (Map.Entry<String, Double> entry : EXCHANGE.entrySet()) {
            if (option.equals(entry.getKey())) {
                response.getWriter().println("Po przeliczeniu: " + amount * entry.getValue());
            }
        }
    }


}
