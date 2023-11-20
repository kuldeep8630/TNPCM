package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.User.StudentDetail;

public class StudentEntry {
    private Connection conn;

    public StudentEntry(Connection conn) {
        super();
        this.conn = conn;
    }

    public boolean addCandidate(StudentDetail student) {
        boolean isSuccess = false;
        String sql = "INSERT INTO student (Id, Name, Email, Gender, Course, Specialization, Mobile) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getGender());
            preparedStatement.setString(5, student.getCourse());
            preparedStatement.setString(6, student.getSpecialization());
            preparedStatement.setInt(7, student.getMobile());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 1) {
                isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }
}
