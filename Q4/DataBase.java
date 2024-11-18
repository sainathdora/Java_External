import java.util.*;
import java.sql.*;
import java.sql.SQLException;
public class DataBase {
    private final static String conn = "jdbc:mysql://localhost:3306/student";
    private final static String user = "root"; // Replace with your MySQL username
    private final static String password = "abc";
    public static void main(String[] args){
        try(Connection connection = DriverManager.getConnection(conn, user, password)){
            System.out.println("Connection SuccessFul");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM StudentInfo";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int studentId = resultSet.getInt("StudentId");
                String name = resultSet.getString("Name");
                int rollNo = resultSet.getInt("RollNo");
                System.out.println("StudentId: " + studentId + ", Name: " + name + ", RollNo: " + rollNo);
            }
        }catch (SQLException e){
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}
