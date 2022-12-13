package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug","root","Prajkta86@");

        Statement statement=connection.createStatement();

//        String insert = "insert into employee(id,name,address) values(4,'pallavi','nashik')";

//        String update = "update employee set name = 'kavya' where id=4";

        String delete = "delete from employee  where id=4";

        int count = statement.executeUpdate(delete);

        System.out.println(count + "row delete");



    }
}

/**
 *  ddl-data definition language - create update drop
 * dml
 */