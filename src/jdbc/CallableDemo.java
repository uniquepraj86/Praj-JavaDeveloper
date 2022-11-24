package jdbc;

import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java25aug",
                "root", "Prajkta86@"); //connection established

        CallableStatement callableStatement = connection.prepareCall(" call getData()");

        ResultSet resultSet =  callableStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+
                    resultSet.getString(3));
        }

    }
}
