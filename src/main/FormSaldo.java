package main;

import java.awt.event.KeyEvent;

public class FormSaldo extends javax.swing.JFrame {
    
    Akun acc = new Akun();
    public String pilSaldo;
    public double saldo = acc.getSaldo();
    
    public FormSaldo() {
        initComponents();
    }
    
    void eksekusi() {
        switch (pilSaldo) {
            case "5K":
                saldo = saldo + 5000;
                acc.setSaldo(saldo);
                break;
            case "10K":
                saldo = saldo + 10000;
                acc.setSaldo(saldo);
                break;
            case "15K":
                saldo = saldo + 15000;
                acc.setSaldo(saldo);
                break;
            case "20K":
                saldo = saldo + 20000;
                acc.setSaldo(saldo);
                break;
            case "25K":
                saldo = saldo + 25000;
                acc.setSaldo(saldo);
                break;
            case "50K":
                saldo = saldo + 50000;
                acc.setSaldo(saldo);
                break;
            case "100K":
                saldo = saldo + 100000;
                acc.setSaldo(saldo);
                break;
            default:
                acc.setSaldo(saldo);
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihanSaldo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        pulsa5K = new javax.swing.JRadioButton();
        pulsa10K = new javax.swing.JRadioButton();
        pulsa15K = new javax.swing.JRadioButton();
        pulsa20K = new javax.swing.JRadioButton();
        pulsa25K = new javax.swing.JRadioButton();
        pulsa50K = new javax.swing.JRadioButton();
        pulsa100K = new javax.swing.JRadioButton();
        inputPulsa = new javax.swing.JTextField();
        pulsaOther = new javax.swing.JRadioButton();
        bTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Tambah Saldo");

        pilihanSaldo.add(pulsa5K);
        pulsa5K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa5K.setText("5000");
        pulsa5K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa5KActionPerformed(evt);
            }
        });

        pilihanSaldo.add(pulsa10K);
        pulsa10K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa10K.setText("10000");
        pulsa10K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa10KActionPerformed(evt);
            }
        });

        pilihanSaldo.add(pulsa15K);
        pulsa15K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa15K.setText("15000");
        pulsa15K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa15KActionPerformed(evt);
            }
        });

        pilihanSaldo.add(pulsa20K);
        pulsa20K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa20K.setText("20000");
        pulsa20K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa20KActionPerformed(evt);
            }
        });

        pilihanSaldo.add(pulsa25K);
        pulsa25K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa25K.setText("25000");
        pulsa25K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa25KActionPerformed(evt);
            }
        });

        pilihanSaldo.add(pulsa50K);
        pulsa50K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa50K.setText("50000");
        pulsa50K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa50KActionPerformed(evt);
            }
        });

        pilihanSaldo.add(pulsa100K);
        pulsa100K.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulsa100K.setText("100000");
        pulsa100K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsa100KActionPerformed(evt);
            }
        });

        inputPulsa.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        inputPulsa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputPulsaKeyPressed(evt);
            }
        });

        pilihanSaldo.add(pulsaOther);
        pulsaOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsaOtherActionPerformed(evt);
            }
        });

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pulsa5K)
                            .addComponent(pulsa10K))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pulsa15K)
                            .addComponent(pulsa20K))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pulsa25K)
                            .addComponent(pulsa50K))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pulsa100K)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pulsaOther)
                                .addGap(0, 0, 0)
                                .addComponent(inputPulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pulsa5K)
                    .addComponent(pulsa15K)
                    .addComponent(pulsa25K)
                    .addComponent(pulsa100K))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pulsa10K)
                        .addComponent(pulsa20K)
                        .addComponent(pulsa50K))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pulsaOther)
                        .addComponent(inputPulsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTambah)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pulsa5KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa5KActionPerformed
        pilSaldo = "5K";
    }//GEN-LAST:event_pulsa5KActionPerformed

    private void pulsa10KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa10KActionPerformed
        pilSaldo = "10K";
    }//GEN-LAST:event_pulsa10KActionPerformed

    private void pulsa15KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa15KActionPerformed
        pilSaldo = "15K";
    }//GEN-LAST:event_pulsa15KActionPerformed

    private void pulsa20KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa20KActionPerformed
        pilSaldo = "20K";
    }//GEN-LAST:event_pulsa20KActionPerformed

    private void pulsa25KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa25KActionPerformed
        pilSaldo = "25K";
    }//GEN-LAST:event_pulsa25KActionPerformed

    private void pulsa50KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa50KActionPerformed
        pilSaldo = "50K";
    }//GEN-LAST:event_pulsa50KActionPerformed

    private void pulsa100KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsa100KActionPerformed
        pilSaldo = "100K";
    }//GEN-LAST:event_pulsa100KActionPerformed

    private void inputPulsaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPulsaKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            double iSaldo = Double.parseDouble(inputPulsa.getText());
            
            saldo = saldo + iSaldo;
            acc.setSaldo(saldo);
            
            FormPulsa home = new FormPulsa();
            home.setVisible(true);
            home.cekSaldo();
            this.dispose();
        }
    }//GEN-LAST:event_inputPulsaKeyPressed

    private void pulsaOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsaOtherActionPerformed
        pilSaldo = "0K";
        inputPulsa.setEnabled(true);
        inputPulsa.requestFocus();
    }//GEN-LAST:event_pulsaOtherActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        if (pulsaOther.isSelected()) {
            double iSaldo = Double.parseDouble(inputPulsa.getText());
            
            saldo = saldo + iSaldo;
            acc.setSaldo(saldo);
            
            FormPulsa home = new FormPulsa();
            home.setVisible(true);
            home.cekSaldo();
            this.dispose();
        } else {
            eksekusi();
            FormPulsa home = new FormPulsa();
            home.setVisible(true);
            home.cekSaldo();
            this.dispose();
        }    
    }//GEN-LAST:event_bTambahActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bTambah;
    private javax.swing.JTextField inputPulsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup pilihanSaldo;
    private javax.swing.JRadioButton pulsa100K;
    private javax.swing.JRadioButton pulsa10K;
    private javax.swing.JRadioButton pulsa15K;
    private javax.swing.JRadioButton pulsa20K;
    private javax.swing.JRadioButton pulsa25K;
    private javax.swing.JRadioButton pulsa50K;
    private javax.swing.JRadioButton pulsa5K;
    private javax.swing.JRadioButton pulsaOther;
    // End of variables declaration//GEN-END:variables
}
