package Test4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "root123";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database");

            stmt = conn.createStatement();

            String selectBooks = "SELECT * FROM book";
            rs = stmt.executeQuery(selectBooks);

            System.out.println("\n--- BOOKS ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("bookid") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("author")
                );

            }
            String updateQuery =
                    "UPDATE members SET fine = 500 " +
                            "WHERE membership_type = 'Basic' AND status = 'Overdue'";

            int rowsUpdated = stmt.executeUpdate(updateQuery);
            System.out.println("\nRows Updated: " + rowsUpdated);

            String displayQuery = "SELECT firstname, lastname, membership_type, status, fine " +"FROM members " +
                            "WHERE membership_type = 'Basic' AND status = 'Overdue'";

            rs = stmt.executeQuery(displayQuery);

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
