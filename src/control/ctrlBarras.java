package control;

import java.util.ArrayList;
import model.Barras;
import conexao.BarraDAO;
import java.sql.SQLException;

public class ctrlBarras {
    
    private BarraDAO bd1;  

    
    private ArrayList<Barras> arrayBarras;

    public ctrlBarras() {
        this.bd1 = new BarraDAO();
         arrayBarras = new ArrayList<>();
    }
    
    public void sincronizar() throws SQLException {
        for(Barras barra : arrayBarras) {
            bd1.inserirCodigo(barra);
        }
        arrayBarras.clear();
    }
    
    public boolean pesquisaCodigoBanco (String CodBarras) throws SQLException {
        Barras barras = new Barras(CodBarras);
        return bd1.buscarCodigo(barras).size() > 0;
    }
    
    public boolean pesquisaCodigoBuffer (String CodBarras) throws SQLException {
        Barras barras = new Barras(CodBarras);
        for(Barras barra : arrayBarras) {
            if(barra.getCodBarras().equalsIgnoreCase(CodBarras)) {
                return true;
            }
        }
        return false;
    }
    
    public void apagaCodigo (String CodBarras) throws SQLException {
        Barras barras = new Barras(CodBarras);
        bd1.excluir(barras);
    }

    public ArrayList<Barras> getArrayBarras() {
        return arrayBarras;
    }
    
    public boolean possuiIgual(String cod) {
        for(Barras barra : arrayBarras) 
        {
            if(barra.getCodBarras().equals(cod)) {
                return true;
            }
        }
        return false;
    }
    
    
    
}
