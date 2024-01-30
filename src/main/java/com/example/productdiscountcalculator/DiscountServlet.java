package com.example.productdiscountcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/discount")
public class DiscountServlet extends HelloServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String information = req.getParameter("information");
        float originPrice = Float.parseFloat(req.getParameter("originPrice"));
        float discount = Float.parseFloat(req.getParameter("discount"));

        float discountAmount = (float) (originPrice * discount * 0.01);

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<h1> information " + information + "</h1>");
        writer.println("<h1> originPrice " + originPrice + "</h1>");
        writer.println("<h1> discount " + discount + "</h1>");
        writer.println("<h1> discountAmount " + discountAmount + "</h1>");

    }
}
