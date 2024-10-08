/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.Distribuidor;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Produto;
import classes.Usuario;
import classes.database.ProductsDB;
import classes.database.UsersDB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Notebook
 */
public class telaDeCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form telaDeCatalogo
     */
    private Usuario user;
    private ProductsDB prodDB;
    private UsersDB usersDb = new UsersDB();
    private ArrayList<Produto> produtos= new ArrayList<Produto>();
    private ArrayList<Produto> filteredProdutos= new ArrayList<Produto>();
    private HashSet<String> filtros = new HashSet();
    private ArrayList<String> ordenar;
    private String filter = "Todos";
    private String orderBy = "Padrão";
  
    public telaDeCatalogo(Usuario u){

        prodDB = new ProductsDB();
        try {
            produtos =  prodDB.findAll();
            filteredProdutos = prodDB.findAll();
        } catch (IOException ex) {
            
        }
        initComponents();
        user = u;
        
        this.initFilters();
        this.carregarTabelaProdutos();
        AddCarrinho.setEnabled(false);
    }
    
    public ArrayList<Produto> handleProdutos(){ 
        ArrayList<Produto> ret = new ArrayList<Produto>();
        
        for(Produto p: this.produtos) {
            if(this.filter.equals("Todos") || this.filter.equals(p.getNome())){
                
                try {
                    if(this.user instanceof Distribuidor && !((Distribuidor)(this.usersDb.findOne(p.getDistId()))).isAceitaPessoaFisica())
                        continue;
                } catch (IOException ex) {
                    Logger.getLogger(telaDeCatalogo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                ret.add(p);
            }
        }
        
        
        Collections.sort(ret, new Comparator<Produto>() {
            @Override
            public int compare(Produto a, Produto b) {
                if(orderBy.equals("Mais Caro")) return a.getPrecoDeCusto() > b.getPrecoDeCusto() ? -1 : 1;
                if(orderBy.equals("Mais Barato"))  return a.getPrecoDeCusto() < b.getPrecoDeCusto() ? -1 : 1;
                return a.getId() - b.getId();
            }
        });
        
        return ret;
    }
    
    public void initFilters(){
        for(Produto produto: this.produtos) {
            this.filtros.add(produto.getNome());
        }
        
        ArrayList<String> filters = new ArrayList<String>();
        filters.add("Todos");
        for(String p: this.filtros) {
            filters.add(p);
        }
        cmbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(filters.toArray(String[]::new)));

    }

    public void carregarTabelaProdutos()
    {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"id", "Produto", "Preço", "Distribuidor", "Exige Receita"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        
        ArrayList<Produto> filteredProdutos = this.handleProdutos();
        for(int i = 0; i < filteredProdutos.size(); i++)
        {
            UsersDB usersDB = new UsersDB();
            Usuario dist = null;
            try {
                dist = usersDB.findOne(filteredProdutos.get(i).getDistId());
            } catch (IOException ex) {
            }
            if(user instanceof PessoaFisica)
            {
                Object linha[];
                linha = new Object[]{filteredProdutos.get(i).getId(),
                    filteredProdutos.get(i).getNome(),
                    filteredProdutos.get(i).getPrecoDeCusto(),
                    dist.getNome(),
                    filteredProdutos.get(i).isExigeReceita()};
                
                modelo.addRow(linha);
            }
            if(user instanceof PessoaJuridica)
            {
                Object linha[];
                linha = new Object[]{filteredProdutos.get(i).getId(),
                    filteredProdutos.get(i).getNome(),
                    filteredProdutos.get(i).getPrecoDeCusto(),
                    dist.getNome(),
                    filteredProdutos.get(i).isExigeReceita()};
                
                modelo.addRow(linha);
            }
        }
        
        tblCatalogo.setModel(modelo);
        tblCatalogo.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblCatalogo.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblCatalogo.getColumnModel().getColumn(2).setPreferredWidth(20);
        tblCatalogo.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblCatalogo.getColumnModel().getColumn(4).setPreferredWidth(20);
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
        cmbFilter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbOrderBy = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalogo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        AddCarrinho = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catálogo de produtos");
        setBackground(new java.awt.Color(149, 236, 236));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));

        cmbFilter.setBackground(new java.awt.Color(51, 255, 255));
        cmbFilter.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        cmbFilter.setForeground(new java.awt.Color(0, 102, 102));
        cmbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Anti Alérgico", "Tosse", "..." }));
        cmbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFilterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Filtros:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ordenar por:");

        cmbOrderBy.setBackground(new java.awt.Color(51, 255, 255));
        cmbOrderBy.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        cmbOrderBy.setForeground(new java.awt.Color(0, 102, 102));
        cmbOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Mais Barato", "Mais Caro" }));
        cmbOrderBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrderByActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(51, 255, 255));

        tblCatalogo.setBackground(new java.awt.Color(0, 255, 255));
        tblCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Produto", "Preço", "Distribuidor", "Exige receita"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatalogoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCatalogo);
        if (tblCatalogo.getColumnModel().getColumnCount() > 0) {
            tblCatalogo.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/catalog_icon_215654.png"))); // NOI18N
        jLabel3.setText("Catálogo:");

        AddCarrinho.setBackground(new java.awt.Color(149, 236, 236));
        AddCarrinho.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AddCarrinho.setForeground(new java.awt.Color(0, 102, 102));
        AddCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_circle_create_expand_new_plus_icon_123218.png"))); // NOI18N
        AddCarrinho.setText("Adicionar ao Carrinho");
        AddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCarrinhoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/large_left_arrow_icon_263657 (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCarrinho)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addComponent(AddCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFilterActionPerformed
        
        this.filter = cmbFilter.getSelectedItem().toString();
        this.carregarTabelaProdutos();
    }//GEN-LAST:event_cmbFilterActionPerformed

    private void cmbOrderByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrderByActionPerformed
        this.orderBy = cmbOrderBy.getSelectedItem().toString();
        this.carregarTabelaProdutos();
    }//GEN-LAST:event_cmbOrderByActionPerformed
    
    private void AddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCarrinhoActionPerformed
        int index = tblCatalogo.getSelectedRow();
        if(index<0) return; 
        Produto prod = filteredProdutos.get(index);
        
        if(user instanceof PessoaFisica)
        {
            this.setVisible(false);
            new telaAdicionarCarrinho(((PessoaFisica)user), prod).setVisible(true);
        }
        else if(user instanceof PessoaJuridica)
        {
            this.setVisible(false);
            new telaAdicionarCarrinho(((PessoaJuridica)user), prod).setVisible(true);
        }
    }//GEN-LAST:event_AddCarrinhoActionPerformed

    private void tblCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatalogoMouseClicked
        
        int i = tblCatalogo.getSelectedRow();
        if(i >= 0 && i < produtos.size())
        {
            AddCarrinho.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_tblCatalogoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new TelaPrincipal(this.user).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(telaDeCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeCatalogo(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCarrinho;
    private javax.swing.JComboBox<String> cmbFilter;
    private javax.swing.JComboBox<String> cmbOrderBy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCatalogo;
    // End of variables declaration//GEN-END:variables
}
