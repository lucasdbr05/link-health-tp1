package screen;

import classes.Distribuidor;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Usuario;
import classes.database.UsersDB;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;


public class telaDeCadastro extends javax.swing.JFrame {

    /**
     * Creates new form telaDeCadastro
     */
    
    private Boolean chcHosp = false, chcAcetPf = false;
    private UsersDB userDb;
    
    public telaDeCadastro() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(149, 236, 236));
        setLocationRelativeTo(null);
        userDb = new UsersDB();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlDistrib = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeDistr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkAceitaPF = new javax.swing.JCheckBox();
        txtSenhaDistr = new javax.swing.JPasswordField();
        btnOkDistr = new javax.swing.JButton();
        txtCNPJDistr = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnOkPf = new javax.swing.JButton();
        txtSenhaPf = new javax.swing.JPasswordField();
        txtIdade = new javax.swing.JTextField();
        txtNomePf = new javax.swing.JTextField();
        txtCPFpf = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chkHospital = new javax.swing.JCheckBox();
        btnOkj = new javax.swing.JButton();
        txtNomePj = new javax.swing.JTextField();
        txtSenhaPj = new javax.swing.JPasswordField();
        txtCNPJpj = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastre se para usar o LinkHealth");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(149, 236, 236));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        pnlDistrib.setBackground(new java.awt.Color(149, 236, 236));
        pnlDistrib.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(149, 236, 236));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nome:");

        txtNomeDistr.setBackground(new java.awt.Color(78, 171, 176));
        txtNomeDistr.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtNomeDistr.setForeground(new java.awt.Color(0, 102, 102));
        txtNomeDistr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDistrActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CNPJ:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Senha:");

        chkAceitaPF.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkAceitaPF.setForeground(new java.awt.Color(0, 102, 102));
        chkAceitaPF.setText("Aceita Pessoa Física");
        chkAceitaPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAceitaPFActionPerformed(evt);
            }
        });

        txtSenhaDistr.setBackground(new java.awt.Color(78, 171, 176));
        txtSenhaDistr.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtSenhaDistr.setForeground(new java.awt.Color(0, 102, 102));

        btnOkDistr.setBackground(new java.awt.Color(78, 171, 176));
        btnOkDistr.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOkDistr.setForeground(new java.awt.Color(0, 102, 102));
        btnOkDistr.setText("OK");
        btnOkDistr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkDistrMouseClicked(evt);
            }
        });
        btnOkDistr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkDistrActionPerformed(evt);
            }
        });

        txtCNPJDistr.setBackground(new java.awt.Color(78, 171, 176));
        txtCNPJDistr.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCNPJDistr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJDistr.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        javax.swing.GroupLayout pnlDistribLayout = new javax.swing.GroupLayout(pnlDistrib);
        pnlDistrib.setLayout(pnlDistribLayout);
        pnlDistribLayout.setHorizontalGroup(
            pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDistribLayout.createSequentialGroup()
                .addGroup(pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDistribLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDistribLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeDistr, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkAceitaPF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDistribLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenhaDistr, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDistribLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNPJDistr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDistribLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnOkDistr)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        pnlDistribLayout.setVerticalGroup(
            pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDistribLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeDistr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCNPJDistr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(pnlDistribLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenhaDistr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(chkAceitaPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnOkDistr)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Distribuidor", pnlDistrib);

        jPanel2.setBackground(new java.awt.Color(149, 236, 236));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Idade:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("CPF:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Senha:");

        btnOkPf.setBackground(new java.awt.Color(78, 171, 176));
        btnOkPf.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOkPf.setForeground(new java.awt.Color(0, 102, 102));
        btnOkPf.setText("OK");
        btnOkPf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkPfMouseClicked(evt);
            }
        });
        btnOkPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkPfActionPerformed(evt);
            }
        });

        txtSenhaPf.setBackground(new java.awt.Color(78, 171, 176));
        txtSenhaPf.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtSenhaPf.setForeground(new java.awt.Color(0, 102, 102));

        txtIdade.setBackground(new java.awt.Color(78, 171, 176));
        txtIdade.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(0, 102, 102));
        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        txtNomePf.setBackground(new java.awt.Color(78, 171, 176));
        txtNomePf.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtNomePf.setForeground(new java.awt.Color(0, 102, 102));
        txtNomePf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePfActionPerformed(evt);
            }
        });

        txtCPFpf.setBackground(new java.awt.Color(78, 171, 176));
        txtCPFpf.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCPFpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPFpf.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomePf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCPFpf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenhaPf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnOkPf)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomePf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCPFpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSenhaPf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnOkPf)
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Pessoa Física", jPanel2);

        jPanel3.setBackground(new java.awt.Color(149, 236, 236));
        jPanel3.setForeground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("CNPJ:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Senha:");

        chkHospital.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        chkHospital.setForeground(new java.awt.Color(0, 102, 102));
        chkHospital.setText("Hospital");
        chkHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHospitalActionPerformed(evt);
            }
        });

        btnOkj.setBackground(new java.awt.Color(78, 171, 176));
        btnOkj.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOkj.setForeground(new java.awt.Color(0, 102, 102));
        btnOkj.setText("OK");
        btnOkj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkjMouseClicked(evt);
            }
        });
        btnOkj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkjActionPerformed(evt);
            }
        });

        txtNomePj.setBackground(new java.awt.Color(78, 171, 176));
        txtNomePj.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtNomePj.setForeground(new java.awt.Color(0, 102, 102));

        txtSenhaPj.setBackground(new java.awt.Color(78, 171, 176));
        txtSenhaPj.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        txtSenhaPj.setForeground(new java.awt.Color(0, 102, 102));

        txtCNPJpj.setBackground(new java.awt.Color(78, 171, 176));
        txtCNPJpj.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCNPJpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJpj.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHospital)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomePj, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSenhaPj, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(txtCNPJpj)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnOkj)))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomePj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCNPJpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSenhaPj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(chkHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnOkj)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Pessoa Jurídica", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeDistrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDistrActionPerformed
        
    }//GEN-LAST:event_txtNomeDistrActionPerformed

    private void btnOkDistrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkDistrActionPerformed
        
        
        String nome = txtNomeDistr.getText();
        String senha = new String(txtSenhaDistr.getPassword());
        String cnpj = txtCNPJDistr.getText();
        boolean aceitaPF = chkAceitaPF.isSelected();
        if(nome.equals("") || senha.equals("") || cnpj.equals("  .   .   /    -  ")){
            
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar marcados!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(senha.length() < 5){
            JOptionPane.showMessageDialog(null, "Sua senha deve conter 5 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            Usuario aux = this.userDb.findOne(cnpj, "0", 0);
            if(aux != null){
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse CNPJ!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
        }catch(Exception e){
        }
        
        try{
            
            Usuario aux = this.userDb.findOne("  .   .   /    -  ", senha, 0);
            if(aux != null){
                 JOptionPane.showMessageDialog(null, "Essa senha já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }
        }catch(Exception e){ 
        }
        Usuario usuario = new Distribuidor(nome, senha, cnpj, aceitaPF);
        
        try{
            this.userDb.create(usuario);
        } catch (Exception e){
            
            System.out.println(e);
        }
        
        txtNomeDistr.setText("");
        txtSenhaDistr.setText("");
        txtCNPJDistr.setText("");
        chkAceitaPF.setSelected(false);
        int DISPOSE_ON_CLOSE1 = initial_screen.DISPOSE_ON_CLOSE;
        this.setVisible(false);
        new telaPrincipalDistribuidor(usuario).setVisible(true);
        
       
    }//GEN-LAST:event_btnOkDistrActionPerformed

    private void chkAceitaPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAceitaPFActionPerformed
        
        this.chcAcetPf = !this.chcAcetPf;
    }//GEN-LAST:event_chkAceitaPFActionPerformed

    private void btnOkPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkPfActionPerformed

        String nome = txtNomePf.getText();
        String senha = new String(txtSenhaPf.getPassword());
        String cpf = txtCPFpf.getText();
        if(nome.equals("") || senha.equals("") || cpf.equals("   .   .   -  ") || txtIdade.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar marcados!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int idade;
        try{
            idade = parseInt(txtIdade.getText());
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Insira uma idade valida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }  
        
        if(senha.length() < 5){
            JOptionPane.showMessageDialog(null, "Sua senha deve conter 5 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
                
        try{
            
            Usuario aux = this.userDb.findOne(cpf, "0", 1);
            if(aux != null){
                 JOptionPane.showMessageDialog(null, "Já existe um usuário com esse CNPJ!", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }
        }catch(Exception e){ 
        }
        
        try{
            
            Usuario aux = this.userDb.findOne("   .   .   -  ", senha, 1);
            if(aux != null){
                 JOptionPane.showMessageDialog(null, "Essa senha já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }
        }catch(Exception e){ 
        }
        
        Usuario usuario = new PessoaFisica(nome, senha, cpf, idade);
        
        try{
            this.userDb.create(usuario);
        } catch (Exception e){
            
            System.out.println(e);
        }
        
        txtNomePf.setText("");
        txtSenhaPf.setText("");
        txtCPFpf.setText("");
        txtIdade.setText("");
        int DISPOSE_ON_CLOSE1 = initial_screen.DISPOSE_ON_CLOSE;
        this.setVisible(false);
        new TelaPrincipal(usuario).setVisible(true);
        
    }//GEN-LAST:event_btnOkPfActionPerformed

    private void txtNomePfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePfActionPerformed
        
    }//GEN-LAST:event_txtNomePfActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void chkHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHospitalActionPerformed
        
        this.chcHosp = !this.chcHosp;
    }//GEN-LAST:event_chkHospitalActionPerformed

    private void btnOkjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkjActionPerformed
        
        String nome = txtNomePj.getText();
        String senha = new String(txtSenhaPj.getPassword());
        String cnpj = txtCNPJpj.getText();
        boolean hospital = chkHospital.isSelected();
        
        if(nome.equals("") || senha.equals("") || cnpj.equals("  .   .   /    -  ")){
            
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar marcados!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(senha.length() < 5){
            JOptionPane.showMessageDialog(null, "Sua senha deve conter 5 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            
            Usuario aux = this.userDb.findOne(cnpj, "0", 2);
            if(aux != null){
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse CNPJ!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }catch(Exception e){
        }
        
        try{
            
            Usuario aux = this.userDb.findOne("  .   .   /    -  ", senha, 2);
            if(aux != null){
                 JOptionPane.showMessageDialog(null, "Essa senha já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                 return;
             }
        }catch(Exception e){ 
        }
        
        Usuario usuario = new PessoaJuridica(nome, senha, cnpj, hospital);
        try{
            this.userDb.create(usuario);
        } catch (Exception e){
            
            System.out.println(e);
        }
        this.setVisible(false);
        txtNomePj.setText("");
        txtSenhaPj.setText("");
        txtCNPJpj.setText("");
        chkHospital.setSelected(false);
        
        int DISPOSE_ON_CLOSE1 = initial_screen.DISPOSE_ON_CLOSE;
        new TelaPrincipal(usuario).setVisible(true);
        
    }//GEN-LAST:event_btnOkjActionPerformed

    private void btnOkDistrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkDistrMouseClicked

    }//GEN-LAST:event_btnOkDistrMouseClicked

    private void btnOkPfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkPfMouseClicked
       
    }//GEN-LAST:event_btnOkPfMouseClicked

    private void btnOkjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkjMouseClicked

    }//GEN-LAST:event_btnOkjMouseClicked

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
            java.util.logging.Logger.getLogger(telaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkDistr;
    private javax.swing.JButton btnOkPf;
    private javax.swing.JButton btnOkj;
    private javax.swing.JCheckBox chkAceitaPF;
    private javax.swing.JCheckBox chkHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlDistrib;
    private javax.swing.JFormattedTextField txtCNPJDistr;
    private javax.swing.JFormattedTextField txtCNPJpj;
    private javax.swing.JFormattedTextField txtCPFpf;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomeDistr;
    private javax.swing.JTextField txtNomePf;
    private javax.swing.JTextField txtNomePj;
    private javax.swing.JPasswordField txtSenhaDistr;
    private javax.swing.JPasswordField txtSenhaPf;
    private javax.swing.JPasswordField txtSenhaPj;
    // End of variables declaration//GEN-END:variables
}
