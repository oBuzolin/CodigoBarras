package conexao;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public Connection getConnection() {    
       String url = "jdbc:mysql://localhost:3306/projeto";
       String usuario = "root";
       String senha = "********";
        try {  
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão "+ ex.toString());
            exit (1);
            return null;
        }
    } 
}
