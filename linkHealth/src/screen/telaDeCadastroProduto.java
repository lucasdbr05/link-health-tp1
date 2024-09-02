/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.Distribuidor;
import classes.Produto;
import classes.Usuario;
import classes.database.ProductsDB;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author psisn
 */
public class telaDeCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form telaDeCadastroProduto
     */
    private Distribuidor user;
    private ProductsDB productDB;
    private Produto produto;
    private boolean isCreation = true;
    public telaDeCadastroProduto(Distribuidor u, Produto produto) {
        initComponents();
        user = u;
        this.produto = produto;
        productDB = new ProductsDB(); 
        
        
        this.isCreation = this.produto == null;
        
        txtId.setEnabled(false);
        txtNome.setEnabled(this.isCreation);
        rdBtnNao.setSelected(true);
        try {
            int nextId = this.productDB.getNextId(ProductsDB.getPath(), 0);
            if(isCreation)txtId.setText(Integer.toString(nextId));
        } catch (IOException ex) {
        }

        if(!isCreation){
            txtNome.setText(this.produto.getNome());
            txtId.setText(Integer.toString(this.produto.getId()));
            rdBtnSim.setSelected(this.produto.isExigeReceita());
            rdBtnNao.setSelected(!this.produto.isExigeReceita());
            txtPreco.setText(Double.toString(this.produto.getPrecoDeCusto()));
            txtQuantidade.setText(Integer.toString(this.produto.getQuantidade()));
            
        }
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
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblReceita = new javax.swing.JLabel();
        rdBtnSim = new javax.swing.JRadioButton();
        rdBtnNao = new javax.swing.JRadioButton();
        btnSalvarProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastre um Produto");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 102, 102));
        lblNome.setText("Nome: ");

        txtNome.setBackground(new java.awt.Color(78, 171, 176));
        txtNome.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 102, 102));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 102, 102));
        lblId.setText("Id:");

        txtId.setBackground(new java.awt.Color(78, 171, 176));
        txtId.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 102, 102));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtPreco.setBackground(new java.awt.Color(78, 171, 176));
        txtPreco.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(0, 102, 102));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtQuantidade.setBackground(new java.awt.Color(78, 171, 176));
        txtQuantidade.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(0, 102, 102));
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(0, 102, 102));
        lblPreco.setText("Preço de Custo:");

        lblQuantidade.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(0, 102, 102));
        lblQuantidade.setText("Quantidade:");

        lblReceita.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblReceita.setForeground(new java.awt.Color(0, 102, 102));
        lblReceita.setText("Exige Receita?");

        rdBtnSim.setBackground(new java.awt.Color(149, 236, 236));
        rdBtnSim.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rdBtnSim.setForeground(new java.awt.Color(0, 102, 102));
        rdBtnSim.setText("Sim");
        rdBtnSim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdBtnSimMouseClicked(evt);
            }
        });
        rdBtnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnSimActionPerformed(evt);
            }
        });

        rdBtnNao.setBackground(new java.awt.Color(149, 236, 236));
        rdBtnNao.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rdBtnNao.setForeground(new java.awt.Color(0, 102, 102));
        rdBtnNao.setText("Não");
        rdBtnNao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdBtnNaoMouseClicked(evt);
            }
        });
        rdBtnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnNaoActionPerformed(evt);
            }
        });

        btnSalvarProd.setBackground(new java.awt.Color(78, 171, 176));
        btnSalvarProd.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSalvarProd.setForeground(new java.awt.Color(0, 102, 102));
        btnSalvarProd.setText("Salvar");
        btnSalvarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarProd))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdBtnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdBtnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 15, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco)
                            .addComponent(lblNome)
                            .addComponent(lblId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(302, 302, 302))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceita)
                    .addComponent(rdBtnSim)
                    .addComponent(rdBtnNao))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnSalvarProd)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void rdBtnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnSimActionPerformed
        
    }//GEN-LAST:event_rdBtnSimActionPerformed

    private void rdBtnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnNaoActionPerformed
        
    }//GEN-LAST:event_rdBtnNaoActionPerformed

    private void btnSalvarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdActionPerformed
        
        String nome = txtNome.getText();
        int id = parseInt(txtId.getText());
        String aux = txtPreco.getText();
        String aux1 = "";
        for(int i = 0; i < aux.length(); i++)
        {
            if(aux.charAt(i) == ',')
            {
                aux1 += '.';
            } else {
                aux1 += aux.charAt(i);
            }
        }

          double preco = parseDouble(aux1);

        boolean receita = (rdBtnSim.isSelected());
        int qnt = parseInt(txtQuantidade.getText());
        Produto produto = new Produto(nome, id, preco, receita, qnt, this.user.getId());
        
        try {
            if(this.isCreation)this.productDB.create(produto);
            else{
                this.productDB.update(produto);
            }
        } catch (IOException ex) {
            
        }
        txtId.setText("");
        txtPreco.setText("");
        rdBtnSim.setSelected(false);
        rdBtnNao.setSelected(true);
        txtQuantidade.setText("");
        
        this.setVisible(false);
        new telaDeEstoque(this.user).setVisible(true);
    }//GEN-LAST:event_btnSalvarProdActionPerformed

    private void rdBtnSimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdBtnSimMouseClicked
        if(!rdBtnSim.isSelected()){
            rdBtnSim.setSelected(true);
            rdBtnNao.setSelected(false);
        }
    }//GEN-LAST:event_rdBtnSimMouseClicked

    private void rdBtnNaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdBtnNaoMouseClicked
        if(!rdBtnNao.isSelected()){
            rdBtnNao.setSelected(true);
            rdBtnSim.setSelected(false);
        }
    }//GEN-LAST:event_rdBtnNaoMouseClicked

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
            java.util.logging.Logger.getLogger(telaDeCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeCadastroProduto(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarProd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblReceita;
    private javax.swing.JRadioButton rdBtnNao;
    private javax.swing.JRadioButton rdBtnSim;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
