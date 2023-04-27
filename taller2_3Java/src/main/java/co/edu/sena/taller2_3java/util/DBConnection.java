package co.edu.sena.taller2_3java.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/javaproject_2_3?serverTimezone=America/Bogota";
    private static final String USER = "Dan";
    private static final  String PASS = "Thonan123";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInicialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }

        return pool;

    }//GetConnectionToDatabase
    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }
}