/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unikomKsi.PolyAndCaesar.view;

/**
 *
 * @author yudha
 */
public class Polyalphabetic_key extends javax.swing.JFrame {
    
    String jml_nilai_key;
    /**
     * Creates new form Polyalphabetic_key
     */
    public Polyalphabetic_key() {
        this.setResizable(false);
        initComponents();
        setDefaultCloseOperation(Polyalphabetic_key.DISPOSE_ON_CLOSE);
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
        jml_kunci = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        btn_proses_awal_dinamis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(452, 186));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 188, 156));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENKRIPSI TEKNIK POLYALPHABETICAL DINAMIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setText("*Jumlah 1 sampai 10");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, 20));

        jml_kunci.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jml_kunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml_kunciActionPerformed(evt);
            }
        });
        getContentPane().add(jml_kunci, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("PILIH JUMLAH KUNCI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        btn_proses_awal_dinamis.setText("PROSES");
        btn_proses_awal_dinamis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proses_awal_dinamisActionPerformed(evt);
            }
        });
        getContentPane().add(btn_proses_awal_dinamis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jml_kunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml_kunciActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jml_kunciActionPerformed

    private void btn_proses_awal_dinamisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proses_awal_dinamisActionPerformed
        // TODO add your handling code here:
        jml_nilai_key = (String)jml_kunci.getSelectedItem();
        Polyalphabetic_dinamis send = new Polyalphabetic_dinamis(jml_nilai_key);
//        tes send = new tes(jml_nilai_key);
        this.setVisible(false);
        send.setVisible(true);
    }//GEN-LAST:event_btn_proses_awal_dinamisActionPerformed

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
            java.util.logging.Logger.getLogger(Polyalphabetic_key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetic_key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetic_key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polyalphabetic_key.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polyalphabetic_key().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_proses_awal_dinamis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jml_kunci;
    // End of variables declaration//GEN-END:variables
}
