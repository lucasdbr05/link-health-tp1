/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

/**
 *
 * @author emers
 */
public class telaDeLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaDeLogin
     */
    
    private Boolean chcPf = false, chcPj = false, chcDistr = false;
    
    public telaDeLogin() {
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
        jPanel1 = new javax.swing.JPanel();
        chkDistribuidor = new javax.swing.JCheckBox();
        chkPf = new javax.swing.JCheckBox();
        chkPj = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCPFCNPJ = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insira seus dados");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(149, 236, 236));

        chkDistribuidor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkDistribuidor.setForeground(new java.awt.Color(0, 102, 102));
        chkDistribuidor.setText("Distribuidor");
        chkDistribuidor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDistribuidorItemStateChanged(evt);
            }
        });
        chkDistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkDistribuidorMouseClicked(evt);
            }
        });

        chkPf.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkPf.setForeground(new java.awt.Color(0, 102, 102));
        chkPf.setText("Pessoa Física");
        chkPf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPfItemStateChanged(evt);
            }
        });
        chkPf.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkPfStateChanged(evt);
            }
        });
        chkPf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkPfMouseClicked(evt);
            }
        });
        chkPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPfActionPerformed(evt);
            }
        });

        chkPj.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkPj.setForeground(new java.awt.Color(0, 102, 102));
        chkPj.setText("Pessoa Jurídica");
        chkPj.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkPjItemStateChanged(evt);
            }
        });
        chkPj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkPjMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/warehouse_116463.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/msn_user_avatar_person_people_icon_124220.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessmanoutline_102732.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDistribuidor)
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPj, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkDistribuidor)
                        .addComponent(chkPf)
                        .addComponent(chkPj))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(149, 236, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(149, 236, 236));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CPF / CNPJ:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Senha:");

        txtCPFCNPJ.setBackground(new java.awt.Color(149, 236, 236));
        txtCPFCNPJ.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtCPFCNPJ.setForeground(new java.awt.Color(0, 102, 102));
        txtCPFCNPJ.setEnabled(false);
        txtCPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCNPJActionPerformed(evt);
            }
        });

        pswSenha.setBackground(new java.awt.Color(149, 236, 236));
        pswSenha.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        pswSenha.setForeground(new java.awt.Color(0, 102, 102));
        pswSenha.setEnabled(false);

        btnOk.setBackground(new java.awt.Color(78, 171, 176));
        btnOk.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(0, 102, 102));
        btnOk.setText("OK");
        btnOk.setEnabled(false);
        btnOk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnOkItemStateChanged(evt);
            }
        });
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnOk)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnOk))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPfActionPerformed

    private void txtCPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCNPJActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void chkPfStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkPfStateChanged
  
    }//GEN-LAST:event_chkPfStateChanged

    private void chkPfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkPfMouseClicked

    }//GEN-LAST:event_chkPfMouseClicked

    private void chkDistribuidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkDistribuidorMouseClicked
        
    }//GEN-LAST:event_chkDistribuidorMouseClicked

    private void chkPjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkPjMouseClicked
       
    }//GEN-LAST:event_chkPjMouseClicked

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked

        //checa se é o user mesmo
        
        this.setVisible(false);
        
        if(this.chcDistr){new telaPrincipalDistribuidor().setVisible(true); return;}
        
        if(!this.chcPf && !this.chcPj){this.setVisible(true); return;}
        
        new TelaPrincipal().setVisible(true);
    }//GEN-LAST:event_btnOkMouseClicked

    private void chkDistribuidorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDistribuidorItemStateChanged
        this.chcDistr = !this.chcDistr;
        
        if(this.chcDistr){
            
            chkPf.setEnabled(false);
            chkPj.setEnabled(false);
            txtCPFCNPJ.setEnabled(true);
            btnOk.setEnabled(true);
            pswSenha.setEnabled(true);
            
            return;
        }
        
        txtCPFCNPJ.setText("");
        pswSenha.setText("");
        chkPf.setEnabled(true);
        chkPj.setEnabled(true);
        txtCPFCNPJ.setEnabled(false);
        btnOk.setEnabled(false);
        pswSenha.setEnabled(false);
    }//GEN-LAST:event_chkDistribuidorItemStateChanged

    private void chkPjItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPjItemStateChanged
         this.chcPj = !this.chcPj;
        
        if(this.chcPj){
            
            chkPf.setEnabled(false);
            chkDistribuidor.setEnabled(false);
            txtCPFCNPJ.setEnabled(true);
            btnOk.setEnabled(true);
            pswSenha.setEnabled(true);
            
            return;
        }
        
        txtCPFCNPJ.setText("");
        pswSenha.setText("");
        chkPf.setEnabled(true);
        chkDistribuidor.setEnabled(true);
        txtCPFCNPJ.setEnabled(false);
        btnOk.setEnabled(false);
        pswSenha.setEnabled(false);
    }//GEN-LAST:event_chkPjItemStateChanged

    private void chkPfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkPfItemStateChanged
                this.chcPf = !this.chcPf;
        
        if(this.chcPf){
            
            chkPj.setEnabled(false);
            chkDistribuidor.setEnabled(false);
            txtCPFCNPJ.setEnabled(true);
            btnOk.setEnabled(true);
            pswSenha.setEnabled(true);
            
            return;
        }
        
        txtCPFCNPJ.setText("");
        pswSenha.setText("");
        chkPj.setEnabled(true);
        chkDistribuidor.setEnabled(true);
        txtCPFCNPJ.setEnabled(false);
        btnOk.setEnabled(false);
        pswSenha.setEnabled(false);
    }//GEN-LAST:event_chkPfItemStateChanged

    private void btnOkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnOkItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkItemStateChanged

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
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox chkDistribuidor;
    private javax.swing.JCheckBox chkPf;
    private javax.swing.JCheckBox chkPj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtCPFCNPJ;
    // End of variables declaration//GEN-END:variables
}
