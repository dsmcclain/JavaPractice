package practice.creationalDesignPatterns;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo {
    public static void main(String[] args) throws SQLException {
        Singleton instance = Singleton.getInstance();

        System.out.println(instance);

        Connection conn = instance.getConnection();

        Statement statement = conn.createStatement();

        statement.execute("Create table students (ID int primary key, name varchar(65))");

        System.out.println("Created table 'Students'");

        int rows = statement.executeUpdate("Insert into students (ID, name) values (1, 'Bennifer')");

        if (rows > 0) {
            System.out.println("Inserted a new row.");
        }

        conn.close();
    }
}
