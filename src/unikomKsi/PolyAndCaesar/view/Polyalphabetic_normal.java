/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unikomKsi.PolyAndCaesar.view;

import java.util.ArrayList;
import unikomKsi.PolyAndCaesar.CryptoAlgorithm.Polyalphabetic;
import unikomKsi.PolyAndCaesar.CryptoAlgorithm.model.PolyalphabeticKey;

/**
 *
 * @author yudha
 */
public class Polyalphabetic_normal extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Caesar
     */
    public Polyalphabetic_normal() {
        this.setResizable(false);
        initComponents();
        setDefaultCloseOperation(Polyalphabetic_normal.DISPOSE_ON_CLOSE);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pol_plaintext_caesar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enk_kunci_pol = new javax.swing.JTextField();
        enk_proses_caesar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        enk_chipertext_caesar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dek_chipertext_caesar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dek_kunci_caesar = new javax.swing.JTextField();
        dek_proses_caesar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dek_plaintext_caesar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(648, 582));
        setPreferredSize(new java.awt.Dimension(648, 582));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 188, 156));
        jPanel1.setForeground(new java.awt.Color(26, 188, 156));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENKRIPSI TEKNIK  POLYALPHABETICAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("PLAIN TEKS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        pol_plaintext_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pol_plaintext_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(pol_plaintext_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 390, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("KUNCI 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        enk_kunci_pol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enk_kunci_polActionPerformed(evt);
            }
        });
        getContentPane().add(enk_kunci_pol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, -1));

        enk_proses_caesar.setText("PROSES");
        enk_proses_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enk_proses_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(enk_proses_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("CHIPER TEKS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        enk_chipertext_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enk_chipertext_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(enk_chipertext_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 390, -1));

        jPanel2.setBackground(new java.awt.Color(26, 188, 156));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEKRIPSI TEKNIK POLYALPHABETICAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 650, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("CHIPER TEKS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 20));

        dek_chipertext_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dek_chipertext_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(dek_chipertext_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 390, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("KUNCI 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 20));

        dek_kunci_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dek_kunci_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(dek_kunci_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, -1));

        dek_proses_caesar.setText("PROSES");
        dek_proses_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dek_proses_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(dek_proses_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("PLAIN TEKS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 20));

        dek_plaintext_caesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dek_plaintext_caesarActionPerformed(evt);
            }
        });
        getContentPane().add(dek_plaintext_caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 390, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pol_plaintext_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pol_plaintext_caesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pol_plaintext_caesarActionPerformed

    private void enk_kunci_polActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enk_kunci_polActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enk_kunci_polActionPerformed

    private void enk_proses_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enk_proses_caesarActionPerformed
        // TODO add your handling code here:        
        Polyalphabetic polyalphabetic = Polyalphabetic.getInstance();
        String enk_plaintext = pol_plaintext_caesar.getText();
        String enk_kunci = enk_kunci_pol.getText();
        
        ArrayList<PolyalphabeticKey> keyList = new ArrayList<>();
        keyList.add(new PolyalphabeticKey(0, enk_kunci));
        
        polyalphabetic.setKeys(keyList);
        
        enk_chipertext_caesar.setText(polyalphabetic.encode(enk_plaintext).toUpperCase());
    }//GEN-LAST:event_enk_proses_caesarActionPerformed

    private void enk_chipertext_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enk_chipertext_caesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enk_chipertext_caesarActionPerformed

    private void dek_chipertext_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dek_chipertext_caesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dek_chipertext_caesarActionPerformed

    private void dek_kunci_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dek_kunci_caesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dek_kunci_caesarActionPerformed

    private void dek_proses_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dek_proses_caesarActionPerformed
        // TODO add your handling code here:
        Polyalphabetic polyalphabetic = Polyalphabetic.getInstance();
        String dek_chiper = dek_chipertext_caesar.getText();
        String dek_kunci = dek_kunci_caesar.getText();
        
        ArrayList<PolyalphabeticKey> keyList = new ArrayList<>();
        keyList.add(new PolyalphabeticKey(0, dek_kunci));
        
        polyalphabetic.setKeys(keyList);
        
        dek_plaintext_caesar.setText(polyalphabetic.decode(dek_chiper).toUpperCase());
    }//GEN-LAST:event_dek_proses_caesarActionPerformed

    private void dek_plaintext_caesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dek_plaintext_caesarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dek_plaintext_caesarActionPerformed

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
            java.util.logging.Logger.getLogger(Polyalphabetic_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetic_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetic_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetic_normal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polyalphabetic_normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dek_chipertext_caesar;
    private javax.swing.JTextField dek_kunci_caesar;
    private javax.swing.JTextField dek_plaintext_caesar;
    private javax.swing.JButton dek_proses_caesar;
    private javax.swing.JTextField enk_chipertext_caesar;
    private javax.swing.JTextField enk_kunci_pol;
    private javax.swing.JButton enk_proses_caesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pol_plaintext_caesar;
    // End of variables declaration//GEN-END:variables
}
