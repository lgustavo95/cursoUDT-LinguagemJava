package aula06_gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Aula08_connectionFactory {
	
	//padrão de projeto, q permite criar fabrica de conexoes com getConnection()
	//conexao entre BD e aplicação
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_agenda?Timezone=true&serverTimezone=UTC","Gustavo","Nbcfox#2028");
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}