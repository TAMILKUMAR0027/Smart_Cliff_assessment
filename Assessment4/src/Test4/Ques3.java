package Test4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ques3 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/library_db";
        String user = "root";
        String password = "root123";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to LIBRARY Database");

            stmt = conn.createStatement();

            String booksQuery = "SELECT * FROM BOOKS";
            rs = stmt.executeQuery(booksQuery);

            System.out.println("\n--- BOOKS TABLE ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getDouble("price")
                );
            }

            String updateQuery =
                    "UPDATE FINES f " +
                    "JOIN BORROWS b ON f.borrow_id = b.borrow_id " +
                    "JOIN MEMBERS m ON f.member_id = m.member_id " +
                    "SET f.fine_amount = 500 " +
                    "WHERE m.membership_type = 'basic' " +
                    "AND b.status = 'Overdue'";

            int rows = stmt.executeUpdate(updateQuery);
            System.out.println("\nRows Updated: " + rows);

            String displayQuery =
                    "SELECT m.first_name, m.last_name, m.membership_type, " +
                    "b.status, f.fine_amount " +
                    "FROM FINES f " +
                    "JOIN BORROWS b ON f.borrow_id = b.borrow_id " +
                    "JOIN MEMBERS m ON f.member_id = m.member_id " +
                    "WHERE m.membership_type = 'basic' " +
                    "AND b.status = 'Overdue'";

            rs = stmt.executeQuery(displayQuery);

            System.out.println("\n--- UPDATED MEMBERS ---");
            while (rs.next()) {
                System.out.println(
                        rs.getString("first_name") + " " +
                        rs.getString("last_name") + " | " +
                        rs.getString("membership_type") + " | " +
                        rs.getString("status") + " | Fine: " +
                        rs.getDouble("fine_amount")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();

                System.out.println("\nResources Closed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
