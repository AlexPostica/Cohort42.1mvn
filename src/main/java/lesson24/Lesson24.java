package lesson24;

import java.sql.*;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #24
 * @author Alexandru Postica
 * @version 8.Mar
 */
public class Lesson24 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/temp/sqlite_db");
        Statement stmt = connection.createStatement();

        //add("Pavel", "cohort41", stmt);
        //read(stmt);

        // CRUD - create, read, update, delete

        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + ", " +
                    rs.getString("name") + ", " + rs.getString("group_name"));
        }
        stmt.close();
        connection.close();
    }
        static void add(String name, String groupName, Statement stmt) throws SQLException {
        stmt.executeUpdate("INSERT INTO students (name, group_name) VALUES ('" + name + "', '" + groupName + "')");
        }

        static void read(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + ", " +
                            rs.getString("name") + ", " + rs.getString("group_name"));
        }
    }

    static void update(String name, String groupName, Statement stmt) {

    }

    static void delete(String name, String groupName, Statement stmt) {
        
    }
}