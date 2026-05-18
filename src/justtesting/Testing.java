package justtesting;
import java.sql.*;

//import com.mysql.cj.jdbc.Driver;
public class Testing {

	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "Swarna05@")) {
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
		    
		    while (rs.next()) {
		        System.out.print(rs.getInt("id"));
		        System.out.println(rs.getString("name"));
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		}

sub();
	}

	}

