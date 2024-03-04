package practice.creationalDesignPatterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
add the following to your pom.xml
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.2.224</version>
        </dependency>
*/

public class Singleton {
    // achieves both thread-safety and lazy-loading for singleton class
    private Connection conn = null;
    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }
     private Singleton () {
        try {
            String jbdcURL = "jdbc:h2:mem:test";
            conn = DriverManager.getConnection(jbdcURL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }

    public static Singleton getInstance () {
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection() {
        return conn;
    }


}