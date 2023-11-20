package com.Servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.Dbconnect;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("Id");
        String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String gender = request.getParameter("Gender");
        String course = request.getParameter("Course");
        String specialization = request.getParameter("Specialization");
        String mobile = request.getParameter("Mobile");

        Connection connection = Dbconnect.getConn();

        try {
            String sql = "INSERT INTO student (Id, Name, Email, Gender, Course, Specialization, Mobile) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, gender);
            preparedStatement.setString(5, course);
            preparedStatement.setString(6, specialization);
            preparedStatement.setString(7, mobile);
            preparedStatement.executeUpdate();
            
            preparedStatement.close();
          
            // Redirect to a success page or display a success message
   
            response.sendRedirect("CandidateRegister.jsp");
            
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions, e.g., display an error message
        }
    }
}

