/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

/**
 *
 * @author emers
 */
public class telaDeEstoque extends javax.swing.JFrame {

    /**
     * Creates new form telaDeEstoque
     */
    public telaDeEstoque() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(149, 236, 236));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAcessar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seu estoque");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());

        jScrollPane1.setBackground(new java.awt.Color(149, 236, 236));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        tblProdutos.setBackground(new java.awt.Color(78, 171, 176));
        tblProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblProdutos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tblProdutos.setForeground(new java.awt.Color(0, 102, 102));
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "ID", "Preço de Custo", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setGridColor(new java.awt.Color(78, 171, 176));
        tblProdutos.setSelectionBackground(new java.awt.Color(149, 236, 236));
        tblProdutos.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setResizable(false);
            tblProdutos.getColumnModel().getColumn(1).setResizable(false);
            tblProdutos.getColumnModel().getColumn(2).setResizable(false);
            tblProdutos.getColumnModel().getColumn(3).setResizable(false);
        }

        btnNew.setBackground(new java.awt.Color(78, 171, 176));
        btnNew.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 102, 102));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_insert_new_plus_button_icon_142943.png"))); // NOI18N
        btnNew.setText("Novo");

        btnAlterar.setBackground(new java.awt.Color(78, 171, 176));
        btnAlterar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 102, 102));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3643749-edit-pen-pencil-write-writing_113397.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(78, 171, 176));
        btnExcluir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 102, 102));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/biggarbagebin_121980.png"))); // NOI18N
        btnExcluir.setText("Excluir");

        btnAcessar.setBackground(new java.awt.Color(78, 171, 176));
        btnAcessar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAcessar.setForeground(new java.awt.Color(0, 102, 102));
        btnAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3844476-eye-see-show-view-watch_110339.png"))); // NOI18N
        btnAcessar.setText("Acessar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnNew)
                .addGap(26, 26, 26)
                .addComponent(btnAlterar)
                .addGap(30, 30, 30)
                .addComponent(btnExcluir)
                .addGap(31, 31, 31)
                .addComponent(btnAcessar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAcessar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(telaDeEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNew;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}