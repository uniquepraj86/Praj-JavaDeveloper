package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchStatementDemo {
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        Connection connection = DriverManager.getConnection
//                ("jdbc:mysql://localhost:3306/java25aug", "root", "Prajkta86@");
//
//        String insert = "insert into employee(id,name,address) values(?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(insert);
//
//        for (int i = 0; i <= 10; i++) {
//              preparedStatement.setString(2,"name");
//              preparedStatement.setString(3,"address");
//              preparedStatement.setInt(1,i);
//              preparedStatement.addBatch();
//        }
//        int[] count = preparedStatement.executeBatch();
//        System.out.println(count.length);
//    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        String insert = "insert into employee(id,name,address) values(?,?,?)";
//        PreparedStatement preparedStatement = ConnectionConfig.getConn().prepareStatement(insert);
//
//        for (int i = 0; i <= 10; i++) {
//            preparedStatement.setString(2,"name");
//            preparedStatement.setString(3,"address");
//            preparedStatement.setInt(1,i);
//            preparedStatement.addBatch();
//        }
//        int[] count = preparedStatement.executeBatch();
//        System.out.println(count.length);


        String insert ="insert into employee(id,name,address) values(?,?,?)";
//        String delete = "delete from employee";
        PreparedStatement preparedStatement = ConnectionConfig.getConn().prepareStatement(insert);

        for (int i=0;i<=10;i++){
            preparedStatement.setString(2,"praj"+i);
            preparedStatement.setString(3,"address"+i);
            preparedStatement.setInt(1,i);
            preparedStatement.addBatch();
        }
        int[] count = preparedStatement.executeBatch();
        System.out.println(count.length);

    }

}
