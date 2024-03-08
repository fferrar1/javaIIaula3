package application;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//Unsupported class file major version = erro pode ser causado quando uma das importações é executada numa versão anterior à que está sendo utilizada

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    public void doGet(  //no servlet, vamos escontrar os verbos do http (get, post, put, delete) acompanhados de 'do' (faça)
        HttpServletRequest request, 
        HttpServletResponse response
    ) throws ServletException, IOException {
        String n = request.getParameter("nome");
        //response.getWriter().print("Hello " + n);
        request.setAttribute("nome", n);
        request.getRequestDispatcher(
            "/response.jsp").forward(request, response);
    }
    
}