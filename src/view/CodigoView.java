/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Exception.CampoVazioException;
import control.ctrlBarras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import model.Barras;

/**
 *
 * @author Bubu
 */
public class CodigoView extends javax.swing.JFrame {

   private ctrlBarras cb1;
   private DefaultTableModel model;
   private int qntdBip;
   
   
     
   
    public CodigoView() {
        cb1 = new ctrlBarras();
        initComponents();
    }  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnVerifica = new javax.swing.JButton();
        lblRead = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCodigo = new javax.swing.JTable();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtQntd = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        btnVerifica.setText("Mandar para Tabela");
        btnVerifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificaActionPerformed(evt);
            }
        });
        btnVerifica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVerificaKeyPressed(evt);
            }
        });

        lblRead.setText("Leia o Código");

        tblCodigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCodigo);

        btnPesquisa.setText("Pesquisar Código");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(txtCodigo);

        txtQntd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQntdKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtQntd);

        jLabel1.setText("Digite a Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRead)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerifica, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblRead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnVerifica)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisa)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificaActionPerformed
        try{
        String CodBarras = this.txtCodigo.getText();
        if (CodBarras.equals(""))
        {
            throw new CampoVazioException();
        }       
        if(cb1.possuiIgual(CodBarras)) {
            cb1.getArrayBarras().clear();
            txtQntd.setEditable(true);
            txtQntd.setText("");
            atualizaTabela();
            JOptionPane.showMessageDialog(rootPane, "Codigo já existente");
            return;
        }
        cb1.getArrayBarras().add(new Barras(CodBarras));
        atualizaTabela();
        this.txtCodigo.setText("");
        }catch (CampoVazioException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            this.txtCodigo.setText("");
            this.txtCodigo.requestFocus();
        }
        
        --qntdBip;
        txtQntd.setText(qntdBip + "");
         contCod();
    }//GEN-LAST:event_btnVerificaActionPerformed

    public void atualizaTabela(){
        model = new DefaultTableModel();
        model.setRowCount(0);
        model.addColumn("Codigo");
        
        DefaultTableModel dm = (DefaultTableModel) tblCodigo.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
        
        for(Barras barra : cb1.getArrayBarras()) {
            model.addRow(new Object[]{barra.getCodBarras()});
        }
        
        tblCodigo.setModel(model);
    }
    
    public void contCod(){
        String Contas = this.txtQntd.getText();
        qntdBip = Integer.parseInt(Contas);
                
        if(qntdBip == 0){
            try{
                cb1.sincronizar();
                txtQntd.setText("");
                txtQntd.setEditable(true);
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
            atualizaTabela();
        }
    }
         
    
    
    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        String CodBarras = this.txtCodigo.getText();
        if (CodBarras.equals(""))
        {
            throw new CampoVazioException();
        } else {
            try {
                if(cb1.pesquisaCodigoBanco(CodBarras)) {
                    JOptionPane.showMessageDialog(null, "Código existe no banco");
                } else if (cb1.pesquisaCodigoBuffer(CodBarras)){
                    JOptionPane.showMessageDialog(null, "Código existe no buffer");
                } else {
                    JOptionPane.showMessageDialog(null, "Código inexistente");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                this.txtCodigo.setText("");
                this.txtCodigo.requestFocus(); 
                atualizaTabela();
            }
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnVerificaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerificaKeyPressed
       if(evt.getKeyCode() == VK_ENTER){
        try{
        String CodBarras = this.txtCodigo.getText();
        if (CodBarras.equals(""))
        {
            throw new CampoVazioException();
        }       
        if(cb1.possuiIgual(CodBarras)) {
            cb1.getArrayBarras().clear();
            atualizaTabela();
            JOptionPane.showMessageDialog(rootPane, "Codigo já existente");
            return;
        }
        cb1.getArrayBarras().add(new Barras(CodBarras));
        atualizaTabela();
        this.txtCodigo.setText("");
        }catch (CampoVazioException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            this.txtCodigo.setText("");
            this.txtCodigo.requestFocus();
        }
        
       }
    }//GEN-LAST:event_btnVerificaKeyPressed


    private void txtQntdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQntdKeyPressed
        if(evt.getKeyCode() == VK_ENTER){
            String CodQtnd = this.txtQntd.getText();
            qntdBip = Integer.parseInt(CodQtnd);
            txtQntd.setEditable(false);
        }
    }//GEN-LAST:event_txtQntdKeyPressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CodigoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnVerifica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblRead;
    private javax.swing.JTable tblCodigo;
    private javax.swing.JTextPane txtCodigo;
    private javax.swing.JTextPane txtQntd;
    // End of variables declaration//GEN-END:variables
}
