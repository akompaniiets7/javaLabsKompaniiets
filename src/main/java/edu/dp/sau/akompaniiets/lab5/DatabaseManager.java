package edu.dp.sau.akompaniiets.lab5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DatabaseManager {
    private static final String URL = "jdbc:h2:~/test";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public List<StudentBase> getStudentsByBirthMonth(int month) {
        List<StudentBase> students = new ArrayList<>();
        String query = "SELECT * FROM UNIVERSITY.STUDENTS WHERE MONTH(BIRTH_DATE) = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setInt(1, month);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                String firstName = rs.getString("FIRST_NAME");
                String lastName = rs.getString("LAST_NAME");
                String birthDate = rs.getString("BIRTH_DATE");
                String studentBook = rs.getString("RECORD_BOOK_NUMBER");

                students.add(new StudentBase(id, firstName, lastName, birthDate, studentBook));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
