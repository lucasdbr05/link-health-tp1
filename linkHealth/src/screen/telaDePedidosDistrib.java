/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;


import classes.Carrinho;
import classes.Compra;
import classes.Produto;

import classes.Usuario;
import classes.database.ComprasDB;
import classes.database.ProductsDB;
import classes.database.UsersDB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emers
 */
public class telaDePedidosDistrib extends javax.swing.JFrame {

    /**
     * Creates new form telaDePedidosDistrib
     */
    private Usuario dist;
    private ComprasDB comprDB  = new ComprasDB();
    private ProductsDB prodDB = new ProductsDB();
    private UsersDB usersDB = new UsersDB();
    private String nomeCliente = "";
    ArrayList<Compra> compras = new ArrayList<Compra>();
    ArrayList<Compra>minhasCompras = new ArrayList<Compra>();
    ArrayList<Produto> meusProdutos = new ArrayList<Produto>();
    public telaDePedidosDistrib(Usuario user) {
        
        initComponents();
        this.dist = user;
        getContentPane().setBackground(new java.awt.Color(149, 236, 236));
        setLocationRelativeTo(null);
        
        this.comprDB = new ComprasDB();
        
        try{
            
           this.compras = this.comprDB.findAll();
        }catch(Exception e){
        }
        
        for(int i = 0 ; i < compras.size(); i++)
        {

            Carrinho c = (compras.get(i)).getCarrinhoIni();
           
            for (Map.Entry<Integer, Double> set :
             c.getMapaPreco().entrySet())
            {
                Produto prod = null;
                try {
                    prod = prodDB.findOne(set.getKey());

                    if(prod != null && prod.getDistId() == dist.getId())
                    {
                        minhasCompras.add(compras.get(i));
                        meusProdutos.add(prod);
                    }
                } catch (IOException ex) {
            
                }
    
            }
            
        }
        this.carregarTabela();
    }
    
    public void carregarTabela(){
        
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome do Cliente", "Produto", "Entrega ou Retirada", "Quantidade", "Valor Total"}, 0){
            
            @Override
            public boolean isCellEditable
            (int row, int column

                ) {
           //all cells false
           return false;
            }
        };
        
        
        
        // se o atributo da compra - entregaOuRetirado for true -> entrga
        // false -> retirada
        
        for(int i = 0; i < meusProdutos.size(); i++)
        {
            Object linha[];
            String nome = null;
            try {
                    nome = (usersDB.findOne((minhasCompras.get(i)).getCompradorId())).getNome();
                } catch (IOException ex) {
            
                }
            String EoR = minhasCompras.get(i).isEntregaOuRetirada() ? "Entrega" : "Retirada";;
            int q = minhasCompras.get(i).getCarrinhoIni().getQttProduto(meusProdutos.get(i).getId());
            double p = minhasCompras.get(i).getCarrinhoIni().getPrecoProduto(meusProdutos.get(i).getId());
            double valor = p*q;
            linha =  new Object[] {
                nome,
                meusProdutos.get(i).getNome(),
                EoR,
                q,
                valor
            };
            if(nome.compareTo(this.nomeCliente) != 0 && !this.nomeCliente.isBlank())
            {
                continue;
            }
            modelo.addRow(linha);
        }
        
        tblPedidos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seus pedidos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 171, 176));

        jScrollPane1.setBackground(new java.awt.Color(78, 171, 176));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        tblPedidos.setBackground(new java.awt.Color(78, 171, 176));
        tblPedidos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tblPedidos.setForeground(new java.awt.Color(0, 102, 102));
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Cliente", "Produto", "Status", "Entrega ou Retirada", "Quantidade ", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.setGridColor(new java.awt.Color(78, 171, 176));
        tblPedidos.setSelectionBackground(new java.awt.Color(149, 236, 236));
        tblPedidos.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(tblPedidos);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setResizable(false);
            tblPedidos.getColumnModel().getColumn(1).setResizable(false);
            tblPedidos.getColumnModel().getColumn(2).setResizable(false);
            tblPedidos.getColumnModel().getColumn(3).setResizable(false);
            tblPedidos.getColumnModel().getColumn(4).setResizable(false);
            tblPedidos.getColumnModel().getColumn(5).setResizable(false);
        }

        btnPesquisar.setBackground(new java.awt.Color(149, 236, 236));
        btnPesquisar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 102, 102));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_icon_125165.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.setBackground(new java.awt.Color(149, 236, 236));
        txtPesquisar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(0, 102, 102));
        txtPesquisar.setToolTipText("Pesquise pelo Nome do Cliente");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Pesquise pelo Nome do Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        this.nomeCliente = txtPesquisar.getText();
        this.carregarTabela();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaDePedidosDistrib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDePedidosDistrib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDePedidosDistrib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDePedidosDistrib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDePedidosDistrib(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
