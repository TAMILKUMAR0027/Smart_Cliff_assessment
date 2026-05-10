package Test4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Dao {
    public void getAllBooks() {

        try (Connection conn = DbConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM book")) {

            System.out.println("\n--- BOOKS ---");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("bookid")); // match SQL
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Author: " + rs.getString("author"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFine() {

        try (Connection conn = DbConnection.getConnection()) {

            String updateQuery = "UPDATE members SET fine = 500 " +
                    "WHERE membership_type = 'Basic' AND status = 'Overdue'";

            PreparedStatement ps = conn.prepareStatement(updateQuery);
            int rows = ps.executeUpdate();

            System.out.println("\nRows Updated: " + rows);
s
            String selectQuery = "SELECT firstname, lastname, membership_type, status, fine " +
                    "FROM members WHERE membership_type = 'Basic' AND status = 'Overdue'";

            ps = conn.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Updated Members ---");

            while (rs.next()) {
                System.out.println(
                        rs.getString("firstname") + " " +
                                rs.getString("lastname") + " | " +
                                rs.getString("membership_type") + " | " +
                                rs.getString("status") + " | Fine: " +
                                rs.getInt("fine")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
