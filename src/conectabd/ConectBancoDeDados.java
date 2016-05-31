package conectabd;

import java.sql.DriverManager;
import java.sql.Connection;


public class ConectBancoDeDados {

	public static Connection  getConexao(){
		java.sql.Connection c = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			String url ="jdbc:postgresql://localhost:5432/dpto";
			String user = "postgres";
			String password = "1234";
			c = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
}
