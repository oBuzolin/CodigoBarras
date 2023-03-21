package conexao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Barras;


public class BarraDAO {
    
    Connection con;
    
    public void inserirCodigo(Barras bl) throws SQLException
    { 
            con = new Conexao().getConnection();
            String sql = "Insert into codigobarras (BarCodes) values (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, bl.getCodBarras());
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
   public void excluir(Barras b1) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM codigobarras WHERE BarCodes = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, b1.getCodBarras());
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }
   
    public ArrayList<Barras> buscarCodigo(Barras b1) throws SQLException  {
        ResultSet rs;
        ArrayList<Barras> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM codigobarras WHERE BarCodes=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, b1.getCodBarras());
        rs = stmt.executeQuery();
        while (rs.next())
        {
            String CodBarras = rs.getString("BarCodes");
            Barras bl = new Barras(CodBarras);
            lista.add(bl);
        }
        stmt.close();
        con.close();   
        return lista;
    }
    
}