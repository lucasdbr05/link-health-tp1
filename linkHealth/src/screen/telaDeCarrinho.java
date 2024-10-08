/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.Carrinho;
import classes.Compra;
import classes.Distribuidor;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Produto;
import classes.Status;
import classes.Usuario;
import classes.database.ComprasDB;
import classes.database.ProductsDB;
import classes.database.UsersDB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Notebook
 */
public class telaDeCarrinho extends javax.swing.JFrame {

    
    private ArrayList<Produto> produtos ;
    private ArrayList<Double> precos;
    private ArrayList<Integer> quantidades;
    
    private Usuario user;
    private Carrinho car;
    private ProductsDB prodDB = new ProductsDB();
    private ComprasDB comprasDB = new ComprasDB();
    public telaDeCarrinho(Usuario u) {
        initComponents();
        user = u;
        this.produtos = new ArrayList<Produto>();
        this.precos = new ArrayList<Double>();
        this.quantidades = new ArrayList<Integer>();
        
        if(user instanceof PessoaFisica) car = ((PessoaFisica)user).getCarrinho();
        else if(user instanceof PessoaJuridica) car = ((PessoaJuridica)user).getCarrinho();
        lblTotal.setText("R$" + car.getTotal());
       for (Map.Entry<Integer, Double> set :
             car.getMapaPreco().entrySet()) {
 
            try {
                produtos.add(prodDB.findOne(set.getKey()));
            } catch (IOException ex) {
                Logger.getLogger(telaDeCarrinho.class.getName()).log(Level.SEVERE, null, ex);
            }
            precos.add(set.getValue());
        }
        for (Map.Entry<Integer, Integer> set :
             car.getQuantidade().entrySet()) {
 
            quantidades.add(set.getValue());
        }
        btnRemover.setEnabled(false);
        
        this.carregarTabelaProdutos();
    }
    
    public void carregarTabelaProdutos()
    {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Produto", "Distribuidor", "Preço Unitário", "Quantidade",  "Preço Total"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        for(int i = 0; i < produtos.size(); i++)
        {
            if(user instanceof PessoaFisica)
            {
                UsersDB usersDB = new UsersDB();
                Usuario dist = null;
                try {
                    dist = usersDB.findOne(produtos.get(i).getDistId());
                } catch (IOException ex) {
                }
                double valor = precos.get(i) * quantidades.get(i);
                Object linha[];
                int prodId =  produtos.get(i).getId();
                linha = new Object[]{
                    produtos.get(i).getNome(),
                    dist.getNome(),
                    car.getPrecoProduto(prodId),
                    car.getQttProduto(prodId),
                    valor};
                
                modelo.addRow(linha);
            }
            if(user instanceof PessoaJuridica)
            {
                UsersDB usersDB = new UsersDB();
                Usuario dist = null;
                try {
                    dist = usersDB.findOne(produtos.get(i).getDistId());
                } catch (IOException ex) {
                }
                double valor = precos.get(i) * quantidades.get(i);
                Object linha[];
                int prodId =  produtos.get(i).getId();
                linha = new Object[]{
                    produtos.get(i).getNome(),
                    dist.getNome(),
                    car.getPrecoProduto(prodId),
                    car.getQttProduto(prodId),
                    valor};
                
                modelo.addRow(linha);
            }
        }
        
        tblCarrinho.setModel(modelo);
        tblCarrinho.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblCarrinho.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblCarrinho.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblCarrinho.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblCarrinho.getColumnModel().getColumn(4).setPreferredWidth(20);
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
        tblCarrinho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seu carrinho");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));

        jScrollPane1.setBackground(new java.awt.Color(0, 255, 255));

        tblCarrinho.setBackground(new java.awt.Color(0, 255, 255));
        tblCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Produto", "Distribuidor", "Preço Unitário", "Quantidade", "Preço Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarrinhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarrinho);
        if (tblCarrinho.getColumnModel().getColumnCount() > 0) {
            tblCarrinho.getColumnModel().getColumn(0).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(1).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(2).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(3).setResizable(false);
            tblCarrinho.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supermarketcart_89153.png"))); // NOI18N
        jLabel1.setText("Carrinho:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Preço Total:");

        lblTotal.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 102, 102));
        lblTotal.setText("R$ 0,00");

        btnComprar.setBackground(new java.awt.Color(78, 171, 176));
        btnComprar.setForeground(new java.awt.Color(0, 102, 102));
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(78, 171, 176));
        btnRemover.setForeground(new java.awt.Color(0, 102, 102));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(lblTotal)
                .addGap(38, 38, 38)
                .addComponent(btnComprar)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal)
                    .addComponent(btnComprar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            for(Map.Entry<Integer, Integer> item: this.car.getQuantidade().entrySet()){
                Produto p= this.prodDB.findOne(item.getKey());
                p.setQuantidade(p.getQuantidade() - item.getValue());
                this.prodDB.update(p);
            }
            
            int id = this.comprasDB.getNextId(ComprasDB.getPath(), 0);
            Compra compra = new Compra(Status.PENDENTE, false, car, id, user.getId());
            this.comprasDB.create(compra);
            
            if(user instanceof PessoaFisica){
                ((PessoaFisica)user).setCarrinho(new Carrinho());
            } else if (user instanceof PessoaJuridica){
                ((PessoaJuridica)user).setCarrinho(new Carrinho());
            }
            
            JOptionPane.showMessageDialog(this, "Compra feita com sucesso!", "Compra Realizada", JOptionPane.INFORMATION_MESSAGE );
            this.setVisible(false);
            
            new TelaPrincipal(user).setVisible(true);
            
        
        } catch (IOException ex) {
        }
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        int i  = tblCarrinho.getSelectedRow();
        double valor = precos.get(i) * quantidades.get(i);
        
        
        double total = car.getTotal();
        total  = total - valor;
        UsersDB usersDB = new UsersDB();
        Usuario dist = null;
        try {
            dist = usersDB.findOne(produtos.get(i).getDistId());
        } catch (IOException ex) {
        }
        car.carrinhoRemove(produtos.get(i),(Distribuidor) dist );
        
        produtos.remove(i);
        precos.remove(i);
        quantidades.remove(i);
        lblTotal.setText("R$" + total);
        this.carregarTabelaProdutos();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tblCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarrinhoMouseClicked
        
        int i = tblCarrinho.getSelectedRow();
        if(i >= 0 && i < produtos.size())
        {
            btnRemover.setEnabled(true);
            
        }
    }//GEN-LAST:event_tblCarrinhoMouseClicked

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
            java.util.logging.Logger.getLogger(telaDeCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeCarrinho(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCarrinho;
    // End of variables declaration//GEN-END:variables
}
