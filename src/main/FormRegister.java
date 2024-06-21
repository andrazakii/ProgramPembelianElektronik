package main;

import java.awt.event.KeyEvent;

public class FormRegister extends javax.swing.JFrame {

    Akun acc = new Akun();
    
    public FormRegister() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        panggilan = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        sandi = new javax.swing.JPasswordField();
        ulang = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hello !");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Masukkan Data Anda!");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setText("Re-type password");

        nama.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        panggilan.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        panggilan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panggilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panggilanActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        warning.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setText("l");

        sandi.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        sandi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sandi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sandiKeyPressed(evt);
            }
        });

        ulang.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        ulang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ulang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ulangKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ulang, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panggilan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(warning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(panggilan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ulang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(warning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(register)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
    }//GEN-LAST:event_namaActionPerformed

    private void panggilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panggilanActionPerformed
    }//GEN-LAST:event_panggilanActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String nameText = nama.getText().trim();
        String usernameText = panggilan.getText().trim();
        String passwordText = new String(sandi.getPassword()).trim();
        String retypePasswordText = new String(ulang.getPassword()).trim();

        if (nameText.isEmpty() || usernameText.isEmpty() || passwordText.isEmpty() || retypePasswordText.isEmpty()) {
            warning.setText("Data tidak boleh kosong!");
        } else if (!passwordText.equals(retypePasswordText)) {
            warning.setText("Password tidak sama!");
        } else {
            acc.setName(nameText);
            acc.setUsername(usernameText);
            acc.setPassword(passwordText);

            FormLogin log = new FormLogin();
            this.dispose();
            log.setVisible(true);
        }
    }//GEN-LAST:event_registerActionPerformed

    private void ulangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ulangKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String nameText = nama.getText().trim();
            String usernameText = panggilan.getText().trim();
            String passwordText = new String(sandi.getPassword()).trim();
            String retypePasswordText = new String(ulang.getPassword()).trim();

            if (nameText.isEmpty() || usernameText.isEmpty() || passwordText.isEmpty() || retypePasswordText.isEmpty()) {
                warning.setText("Data tidak boleh kosong!");
            } else if (!passwordText.equals(retypePasswordText)) {
                warning.setText("Password tidak sama!");
            } else {
                acc.setName(nameText);
                acc.setUsername(usernameText);
                acc.setPassword(passwordText);

                FormLogin log = new FormLogin();
                this.dispose();
                log.setVisible(true);
            }
        }
    }//GEN-LAST:event_ulangKeyPressed

    private void sandiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sandiKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String nameText = nama.getText().trim();
            String usernameText = panggilan.getText().trim();
            String passwordText = new String(sandi.getPassword()).trim();
            String retypePasswordText = new String(ulang.getPassword()).trim();

            if (nameText.isEmpty() || usernameText.isEmpty() || passwordText.isEmpty() || retypePasswordText.isEmpty()) {
                warning.setText("Data tidak boleh kosong!");
            } else if (!passwordText.equals(retypePasswordText)) {
                warning.setText("Password tidak sama!");
            } else {
                acc.setName(nameText);
                acc.setUsername(usernameText);
                acc.setPassword(passwordText);

                FormLogin log = new FormLogin();
                this.dispose();
                log.setVisible(true);
            }
        }
    }//GEN-LAST:event_sandiKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField panggilan;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField sandi;
    private javax.swing.JPasswordField ulang;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
