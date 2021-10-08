import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTest {
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/bdd_test_user?" + "useSSL=false&serverTimezone=UTC";
		String user = "testUser";
		String password = "12345";
		try {
			System.out.println("Connecting to database " + jdbcUrl);
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection successfull!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
