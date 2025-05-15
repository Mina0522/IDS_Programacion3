package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Modelo {

	public static ArrayList<User> getUsers() {
	    ArrayList<User> users = new ArrayList<>();
	
	    String query = "SELECT * FROM users";
	    Connection conn = null;
	    Statement stmt = null;
	
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/programacion_test", "root", "");
	        stmt = conn.createStatement();
	
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            int id = rs.getInt(1);
	            String nombre = rs.getString(2);
	            String correo = rs.getString(3);
	            String rol = rs.getString(4);
	            String tel = rs.getString(5);
	
	            users.add(new User(id, nombre, correo, rol, tel));
	        }
	        rs.close();
	
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (stmt != null) stmt.close();
	            if (conn != null) conn.close();
	        } catch (Exception e) {}
	    }
	    return users;
	}
}
