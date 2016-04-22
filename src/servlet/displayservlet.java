package servlet;

import entity.ChildManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class displayservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ChildManager childManager = new ChildManager();
//        DetailsDao dd = new DetailsDao(); dao for DB access etc
        //DB emulation
        childManager.setFirstName("Vlad");
        //DB emulation
        request.setAttribute("firstname", childManager.getFirstName());
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}
