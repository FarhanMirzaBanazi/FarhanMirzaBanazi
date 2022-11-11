/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menuTiket;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import menuTiket.encapsulation;

/**
 *
 * @author 
 */
public class avengersframe extends javax.swing.JFrame { // pewarisan atau inheritance
    String kursi; // intant variabel 

    encapsulation day = new encapsulation();
    
    public avengersframe() {
        initComponents();
        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("avengers.jpg")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(ave.getWidth(), ave.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon avengers=new ImageIcon(img2);
        ave.setIcon(avengers);
        
        ImageIcon myimagee=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("bg2.png")));
        Image img1a = myimagee.getImage();
        Image img2a = img1a.getScaledInstance(bgr.getWidth(), bgr.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bg2=new ImageIcon(img2a);
        bgr.setIcon(bg2);
        day.setHari();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        C_day = new javax.swing.JComboBox<>();
        t_harga = new javax.swing.JTextField();
        C_waktu = new javax.swing.JComboBox<>();
        t_waktu = new javax.swing.JTextField();
        R_1C = new javax.swing.JRadioButton();
        T_kursi = new javax.swing.JTextField();
        R_1B = new javax.swing.JRadioButton();
        R_1A = new javax.swing.JRadioButton();
        R_1D = new javax.swing.JRadioButton();
        R_1E = new javax.swing.JRadioButton();
        R_1F = new javax.swing.JRadioButton();
        R_2C = new javax.swing.JRadioButton();
        R_2B = new javax.swing.JRadioButton();
        R_2A = new javax.swing.JRadioButton();
        R_2D = new javax.swing.JRadioButton();
        R_2E = new javax.swing.JRadioButton();
        R_2F = new javax.swing.JRadioButton();
        C_Bayar = new javax.swing.JComboBox<>();
        T_Bayar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        ave = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        bgr = new javax.swing.JLabel();

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

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Minggu ", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" }));
        C_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_dayActionPerformed(evt);
            }
        });
        getContentPane().add(C_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 230, 30));
        getContentPane().add(t_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 270, 30));

        C_waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Waktu--", "13:00", "16:00", "19:00" }));
        C_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_waktuActionPerformed(evt);
            }
        });
        getContentPane().add(C_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 230, 30));

        t_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_waktuActionPerformed(evt);
            }
        });
        getContentPane().add(t_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 270, 30));

        R_1C.setText("1C");
        R_1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_1CActionPerformed(evt);
            }
        });
        getContentPane().add(R_1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        T_kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_kursiActionPerformed(evt);
            }
        });
        getContentPane().add(T_kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 346, 210, 30));

        R_1B.setText("1B");
        R_1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_1BActionPerformed(evt);
            }
        });
        getContentPane().add(R_1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        R_1A.setText("1A");
        R_1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_1AActionPerformed(evt);
            }
        });
        getContentPane().add(R_1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        R_1D.setText("1D");
        R_1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_1DActionPerformed(evt);
            }
        });
        getContentPane().add(R_1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        R_1E.setText("1E");
        R_1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_1EActionPerformed(evt);
            }
        });
        getContentPane().add(R_1E, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        R_1F.setText("1F");
        R_1F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_1FActionPerformed(evt);
            }
        });
        getContentPane().add(R_1F, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        R_2C.setText("2C");
        R_2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_2CActionPerformed(evt);
            }
        });
        getContentPane().add(R_2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        R_2B.setText("2B");
        R_2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_2BActionPerformed(evt);
            }
        });
        getContentPane().add(R_2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));

        R_2A.setText("2A");
        R_2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_2AActionPerformed(evt);
            }
        });
        getContentPane().add(R_2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        R_2D.setText("2D");
        R_2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_2DActionPerformed(evt);
            }
        });
        getContentPane().add(R_2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        R_2E.setText("2E");
        R_2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_2EActionPerformed(evt);
            }
        });
        getContentPane().add(R_2E, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, -1, -1));

        R_2F.setText("2F");
        R_2F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_2FActionPerformed(evt);
            }
        });
        getContentPane().add(R_2F, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        C_Bayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Tunai", "E-Money", " " }));
        C_Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_BayarActionPerformed(evt);
            }
        });
        getContentPane().add(C_Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 230, 30));
        getContentPane().add(T_Bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 270, 30));

        jButton3.setText("Submit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, -1, -1));
        getContentPane().add(ave, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 240));

        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));
        getContentPane().add(bgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_dayActionPerformed
        int harga;  
        if(C_day.getSelectedItem() == "Minggu"){
            harga = 50000;
        }
        else if (C_day.getSelectedItem() == "Senin"){
            harga = 35000;
        }
        else if (C_day.getSelectedItem() == "Selasa"){
            harga = 35000;
        }
        else if (C_day.getSelectedItem() == "Rabu"){
            harga = 35000;
        }
        else if (C_day.getSelectedItem() == "Kamis"){
            harga = 35000;
        }
        else if (C_day.getSelectedItem() == "Jumat"){
            harga = 35000;
        }
        else {
            // Sabtu
            harga = 50000;
        }

        t_harga.setText(String.valueOf(harga));
    }//GEN-LAST:event_C_dayActionPerformed

    private void C_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_waktuActionPerformed
        String waktu;
        if(C_waktu.getSelectedItem() == "13:00"){
            waktu = "13:00";
        }
        else if(C_waktu.getSelectedItem() == "16:00"){
            waktu = "16:00";
        }
        else{
            waktu = "19:00";
        }
                t_waktu.setText(String.valueOf(waktu));
    }//GEN-LAST:event_C_waktuActionPerformed

    private void t_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_waktuActionPerformed
    }//GEN-LAST:event_t_waktuActionPerformed

    private void R_1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_1CActionPerformed
        if(R_1C.isSelected()){
            kursi = "1C";
        }
            else {
            kursi = "Pilih Kursi";
        }
        
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_1CActionPerformed

    private void R_1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_1AActionPerformed
        // TODO add your handling code here:
        if(R_1A.isSelected()){
            kursi = "1A";
        }
        else {
            kursi = "Pilih Kursi";   
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_1AActionPerformed

    private void R_1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_1BActionPerformed
        if(R_1B.isSelected()){
            kursi = "1B";
        }
        else {
            kursi = "Pilih Kursi";
        }  
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_1BActionPerformed

    private void T_kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_kursiActionPerformed
        
    }//GEN-LAST:event_T_kursiActionPerformed

    private void R_1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_1DActionPerformed
        if(R_1D.isSelected()){
            kursi = "1D";
        }
        else {
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_1DActionPerformed

    private void R_1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_1EActionPerformed
        if(R_1E.isSelected()){
            kursi = "1E";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_1EActionPerformed

    private void R_1FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_1FActionPerformed
        if(R_1F.isSelected()){
            kursi = "1F";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_1FActionPerformed

    private void R_2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_2CActionPerformed
        if(R_2C.isSelected()){
            kursi = "2C";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_2CActionPerformed

    private void R_2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_2BActionPerformed
        if(R_2B.isSelected()){
            kursi = "2B";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_2BActionPerformed

    private void R_2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_2AActionPerformed
        if(R_2A.isSelected()){
            kursi = "2A";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_2AActionPerformed

    private void R_2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_2DActionPerformed
        if(R_2D.isSelected()){
            kursi = "2D";
        }
        else {
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_2DActionPerformed

    private void R_2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_2EActionPerformed
        if(R_2E.isSelected()){
            kursi = "2E";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_2EActionPerformed

    private void R_2FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_2FActionPerformed
        if(R_2F.isSelected()){
            kursi = "2F";
        }
        else{
            kursi = "Pilih Kursi";
        }
        T_kursi.setText(String.valueOf(kursi));
    }//GEN-LAST:event_R_2FActionPerformed

    private void C_BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_BayarActionPerformed
        String metBayar;
        if(C_Bayar.getSelectedItem() == "Tunai"){
            metBayar = "Tunai";
        }
        else if(C_Bayar.getSelectedItem() == "E-Money"){
            metBayar = "E-Money";
        }
        else{
            metBayar = "Pilih Metode Pembayaran";
        }
        T_Bayar.setText(String.valueOf(metBayar));
    }//GEN-LAST:event_C_BayarActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Menu menu = new Menu();
        this.dispose();
        this.setVisible(false);
        menu.pack();
        menu.setLocationRelativeTo(null);
        new Menu().setVisible(true);
        menu.setDefaultCloseOperation(avengersframe.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Home h = new Home();
        this.dispose();
        this.setVisible(false);
        h.pack();
        h.setLocationRelativeTo(null);
        new Home().setVisible(true);
        h.setDefaultCloseOperation(avengersframe.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton3MouseClicked
    
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
            java.util.logging.Logger.getLogger(avengersframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(avengersframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(avengersframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(avengersframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new avengersframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C_Bayar;
    private javax.swing.JComboBox<String> C_day;
    private javax.swing.JComboBox<String> C_waktu;
    private javax.swing.JRadioButton R_1A;
    private javax.swing.JRadioButton R_1B;
    private javax.swing.JRadioButton R_1C;
    private javax.swing.JRadioButton R_1D;
    private javax.swing.JRadioButton R_1E;
    private javax.swing.JRadioButton R_1F;
    private javax.swing.JRadioButton R_2A;
    private javax.swing.JRadioButton R_2B;
    private javax.swing.JRadioButton R_2C;
    private javax.swing.JRadioButton R_2D;
    private javax.swing.JRadioButton R_2E;
    private javax.swing.JRadioButton R_2F;
    private javax.swing.JTextField T_Bayar;
    private javax.swing.JTextField T_kursi;
    private javax.swing.JLabel ave;
    private javax.swing.JLabel bgr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_waktu;
    // End of variables declaration//GEN-END:variables
}
