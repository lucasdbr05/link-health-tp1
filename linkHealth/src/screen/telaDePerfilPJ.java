/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.FormaDePagamento;
import classes.PessoaJuridica;
import classes.database.UsersDB;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author emers
 */
public class telaDePerfilPJ extends javax.swing.JFrame {

    /**
     * Creates new form telaDePerfilPJ
     */
    private PessoaJuridica user;
    private UsersDB userDb;
    
    public telaDePerfilPJ(PessoaJuridica par) {
        initComponents();
        this.user = par;
        this.userDb = new UsersDB();
        getContentPane().setBackground(new java.awt.Color(149, 236, 236));
        setLocationRelativeTo(null);
        
        this.txtCNPJ.setEnabled(false);
        this.txtNome.setEnabled(false);
        this.chkHosp.setEnabled(false);
        this.btnAlterar.setEnabled(true);
        this.btnExcluir.setEnabled(true);
        this.btnOk.setEnabled(false);
        
        // setando as informações do usuário
        
        this.txtCNPJ.setText(user.getCnpj());
        this.txtNome.setText(user.getNome());
        this.chkHosp.setSelected(user.isHospital());
        
        for (String ender : this.user.getEnderco()) {
            this.cboxEndereços.addItem(ender);
        }

        for (String num : this.user.getFormasDePagamento().keySet()) {

            this.cboxFormasPagamento.addItem(num);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkHosp = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboxEndereços = new javax.swing.JComboBox<>();
        btnAddEnder = new javax.swing.JButton();
        btnAlterEnder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboxFormasPagamento = new javax.swing.JComboBox<>();
        btnAddNewPay = new javax.swing.JButton();
        btnEditPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações pessoais");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Informações pessoais");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-profile_icon-icons.com_71302.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addGap(9, 9, 9))
        );

        jPanel2.setBackground(new java.awt.Color(78, 171, 176));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CNPJ:");

        chkHosp.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkHosp.setForeground(new java.awt.Color(0, 102, 102));
        chkHosp.setText("Hospital");
        chkHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHospActionPerformed(evt);
            }
        });

        txtNome.setBackground(new java.awt.Color(149, 236, 236));
        txtNome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 102, 102));
        txtNome.setCaretColor(new java.awt.Color(149, 236, 236));
        txtNome.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        txtNome.setSelectedTextColor(new java.awt.Color(149, 236, 236));

        txtCNPJ.setBackground(new java.awt.Color(149, 236, 236));
        txtCNPJ.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtCNPJ.setForeground(new java.awt.Color(0, 102, 102));
        txtCNPJ.setDisabledTextColor(new java.awt.Color(0, 102, 102));

        btnAlterar.setBackground(new java.awt.Color(149, 236, 236));
        btnAlterar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 102, 102));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3643749-edit-pen-pencil-write-writing_113397.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(149, 236, 236));
        btnOk.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(0, 102, 102));
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(149, 236, 236));
        btnExcluir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 102, 102));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lixeira_menor.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Endereços:");

        cboxEndereços.setBackground(new java.awt.Color(149, 236, 236));
        cboxEndereços.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboxEndereços.setForeground(new java.awt.Color(0, 102, 102));

        btnAddEnder.setBackground(new java.awt.Color(149, 236, 236));
        btnAddEnder.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAddEnder.setForeground(new java.awt.Color(0, 102, 102));
        btnAddEnder.setText("Adicionar novo endereço");
        btnAddEnder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnderActionPerformed(evt);
            }
        });

        btnAlterEnder.setBackground(new java.awt.Color(149, 236, 236));
        btnAlterEnder.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAlterEnder.setForeground(new java.awt.Color(0, 102, 102));
        btnAlterEnder.setText("Alterar endereço");
        btnAlterEnder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterEnderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Formas de pagamento:");

        cboxFormasPagamento.setBackground(new java.awt.Color(149, 236, 236));
        cboxFormasPagamento.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboxFormasPagamento.setForeground(new java.awt.Color(0, 102, 102));

        btnAddNewPay.setBackground(new java.awt.Color(149, 236, 236));
        btnAddNewPay.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAddNewPay.setForeground(new java.awt.Color(0, 102, 102));
        btnAddNewPay.setText("Adicionar nova forma de pagamento");
        btnAddNewPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewPayActionPerformed(evt);
            }
        });

        btnEditPay.setBackground(new java.awt.Color(149, 236, 236));
        btnEditPay.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEditPay.setForeground(new java.awt.Color(0, 102, 102));
        btnEditPay.setText("Alterar forma de pagamento");
        btnEditPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cboxEndereços, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkHosp))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAlterEnder)
                            .addComponent(btnAddEnder))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(29, 29, 29)
                        .addComponent(btnOk)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddNewPay)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxFormasPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEditPay))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboxEndereços, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(chkHosp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnAlterar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddEnder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterEnder)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboxFormasPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddNewPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOk)
                            .addComponent(btnExcluir))))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHospActionPerformed
        
    }//GEN-LAST:event_chkHospActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        
        try{
            this.userDb.deleteUsuario(this.user.getId());
        } catch(Exception e){
            
            System.out.println(e);
        }
        
        System.exit(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        
        this.txtCNPJ.setEnabled(true);
        this.txtNome.setEnabled(true);
        this.chkHosp.setEnabled(true);
        this.btnAlterar.setEnabled(false);
        this.btnExcluir.setEnabled(false);
        this.btnOk.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        String patCnpj  = "  .   .   /    -  ";
        String inCNPJ = this.txtCNPJ.getText();
        String inNome = this.txtNome.getText();
        Boolean inHosp = this.chkHosp.isSelected();
        
        if(inCNPJ.equals(patCnpj)){
            
            JOptionPane.showMessageDialog(null, "Insira um CNPJ valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(inNome.equals("")){
            
            JOptionPane.showMessageDialog(null, "O campo de Nome não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.user.setCnpj(inCNPJ);
        this.user.setHospital(inHosp);
        this.user.setNome(inNome);
        
        try{
            this.userDb.update(this.user);
        } catch(Exception e){
            System.out.println(e);
        }
        
        // trazendo os espaços de input para o estado original
        
        this.txtCNPJ.setEnabled(false);
        this.txtNome.setEnabled(false);
        this.chkHosp.setEnabled(false);
        this.btnAlterar.setEnabled(true);
        this.btnExcluir.setEnabled(true);
        this.btnOk.setEnabled(false);
        
        // resetando as informações do usuário
        
        this.txtCNPJ.setText(user.getCnpj());
        this.txtNome.setText(user.getNome());
        this.chkHosp.setSelected(user.isHospital());
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAddEnderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnderActionPerformed
        String newEnder = JOptionPane.showInputDialog(null, "Insira seu novo endereço:", "Endereço novo!", JOptionPane.INFORMATION_MESSAGE);
        
        while(newEnder.equals("")){
            newEnder = JOptionPane.showInputDialog(null, "Insira seu novo endereço:", "Endereço novo!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.user.setEnderco(newEnder);
        
        try{
            this.userDb.update(this.user);
        } catch (IOException ex){
        }
        
        this.cboxEndereços.removeAllItems();
        for(String x : this.user.getEnderco())
            this.cboxEndereços.addItem(x);
    }//GEN-LAST:event_btnAddEnderActionPerformed

    private void btnAlterEnderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterEnderActionPerformed
         String actEnder = this.cboxEndereços.getSelectedItem().toString();
        
        this.user.getEnderco().remove(actEnder);
        
        String newEnder = JOptionPane.showInputDialog(null, "Atualize seu endereço:", "Endereço atual = " + actEnder, JOptionPane.INFORMATION_MESSAGE);
        
        while(newEnder.equals("")){
            newEnder = JOptionPane.showInputDialog(null, "Atualize seu endereço:", "Endereço atual = " + actEnder , JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.user.setEnderco(newEnder);
        
        try{
            this.userDb.update(this.user);
        } catch (IOException ex){
        }
        
        this.cboxEndereços.removeAllItems();
        for(String x : this.user.getEnderco())
            this.cboxEndereços.addItem(x);
    }//GEN-LAST:event_btnAlterEnderActionPerformed

    private void btnAddNewPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewPayActionPerformed
           
        this.setVisible(false);
        new TelaCadastroFormaPayment(this.user).setVisible(true);
    }//GEN-LAST:event_btnAddNewPayActionPerformed

    private void btnEditPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPayActionPerformed
        this.setVisible(false);
        
        FormaDePagamento aux = this.user.pegarFormaPagamento(this.cboxFormasPagamento.getSelectedItem().toString());
                
        this.user.removeFormaDePagamento(this.cboxFormasPagamento.getSelectedItem().toString());
        new TelaCadastroFormaPayment(aux, this.user).setVisible(true);
    }//GEN-LAST:event_btnEditPayActionPerformed

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
            java.util.logging.Logger.getLogger(telaDePerfilPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDePerfilPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDePerfilPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDePerfilPJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDePerfilPJ(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnder;
    private javax.swing.JButton btnAddNewPay;
    private javax.swing.JButton btnAlterEnder;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnEditPay;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cboxEndereços;
    private javax.swing.JComboBox<String> cboxFormasPagamento;
    private javax.swing.JCheckBox chkHosp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
