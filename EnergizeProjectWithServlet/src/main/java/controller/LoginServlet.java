package main.java.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Stella on 22.01.2017.
 */
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isValid = true;
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(email.isEmpty()){
            request.setAttribute("emailErr","input your email");
            isValid=false;
        }
        if (password.isEmpty()){
            request.setAttribute("passEmail","input your password");
            isValid=false;
        }

        if(isValid){
            response.sendRedirect("home.jsp");
        }
        request.getRequestDispatcher("login.jsp").include(request,response);

    }


}
