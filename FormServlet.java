package br.com.polotech925.hellowordservlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "FormServlet", value = "/cadastrar")
public class FormServlet extends HttpServlet {
    private String nome;
    private int cpf;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Integer cpf = Integer.valueOf(request.getParameter("cpf"));

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1> Cliente nome: {" + nome + "}, cpf: {" + cpf + "} foi cadastrado com sucesso." + "</h1>");
        writer.println("</body></html>");
    }

    public void destroy() {
    }
}