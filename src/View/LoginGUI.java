package View;

import Helper.*;
import Model.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
    }
    
    
    private DBConnection conn = new DBConnection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w_pane = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fld_ogrenciTc = new javax.swing.JTextField();
        fld_ogrenciPass = new javax.swing.JPasswordField();
        btn_ogrenciLogin = new javax.swing.JButton();
        btn_register = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fld_ogretmenTc = new javax.swing.JTextField();
        fld_ogretmenPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn_ogretmenLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fld_personelTc = new javax.swing.JTextField();
        fld_personelPass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        btn_personelLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci İşleri Otomasyonu");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(500, 225, 0, 0));
        setResizable(false);

        w_pane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel2.setText("T.C. Numaranız : ");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel3.setText("Şifre :");

        fld_ogrenciTc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_ogrenciTcActionPerformed(evt);
            }
        });

        btn_ogrenciLogin.setText("Giriş Yap");
        btn_ogrenciLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrenciLoginActionPerformed(evt);
            }
        });

        btn_register.setText("Kayıt Ol");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        jLabel6.setText("           (örnek personel  -  tc:admin  sifre:admin)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_ogrenciPass))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_ogrenciTc))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ogrenciLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fld_ogrenciTc)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fld_ogrenciPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ogrenciLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btn_register, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jLabel6))
        );

        jTabbedPane1.addTab("Öğrenci Girişi", jPanel1);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel4.setText("T.C. Numaranız : ");

        fld_ogretmenTc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_ogretmenTcActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel5.setText("Şifre :");

        btn_ogretmenLogin.setText("Giriş Yap");
        btn_ogretmenLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogretmenLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_ogretmenLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_ogretmenPass, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_ogretmenTc)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fld_ogretmenTc)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fld_ogretmenPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ogretmenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Öğretmen Girişi", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel8.setText("T.C. Numaranız : ");

        fld_personelTc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fld_personelTcActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel9.setText("Şifre :");

        btn_personelLogin.setText("Giriş Yap");
        btn_personelLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_personelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_personelPass, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fld_personelTc)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fld_personelTc)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fld_personelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_personelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personel Girişi", jPanel3);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Öğrenci İşleri Otomasyonuna Hoşgeldiniz");

        javax.swing.GroupLayout w_paneLayout = new javax.swing.GroupLayout(w_pane);
        w_pane.setLayout(w_paneLayout);
        w_paneLayout.setHorizontalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(w_paneLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        w_paneLayout.setVerticalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fld_ogrenciTcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_ogrenciTcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_ogrenciTcActionPerformed

    private void fld_ogretmenTcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_ogretmenTcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_ogretmenTcActionPerformed

    private void fld_personelTcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fld_personelTcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fld_personelTcActionPerformed

    private void btn_ogretmenLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogretmenLoginActionPerformed
        if(fld_ogretmenTc.getText().length()==0 && fld_ogretmenPass.getText().length()==0){
            Helper.showMsg("fill");
        }else {
            try {
                Connection con = conn.connDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM user WHERE type='ogretimuyesi';");
                while(rs.next()){
                    if (fld_ogretmenTc.getText().equals(rs.getString("tcno")) && fld_ogretmenPass.getText().equals(rs.getString("password"))) {
                        OgretimUyesi ouyesi = new OgretimUyesi();
                        ouyesi.setId(rs.getInt("id"));
                        ouyesi.setPassword(rs.getString("password"));
                        ouyesi.setTcno(rs.getString("tcno"));
                        ouyesi.setName(rs.getString("name"));
                        ouyesi.setType(rs.getString("type"));
                        OgretmenGUI oGUI = new OgretmenGUI(ouyesi);
                        oGUI.setVisible(true);
                        dispose();
                        return;
                    }
                }
                Helper.showMsg("Eksik ya da yanlış tuşladınız..");
            } catch (SQLException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_ogretmenLoginActionPerformed

    private void btn_ogrenciLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrenciLoginActionPerformed
        if(fld_ogrenciTc.getText().length()==0 && fld_ogrenciPass.getText().length()==0){
            Helper.showMsg("fill");
        }else {
            try {
                Connection con = conn.connDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM user WHERE type='ogrenci';");
                while(rs.next()){
                    if (fld_ogrenciTc.getText().equals(rs.getString("tcno")) && fld_ogrenciPass.getText().equals(rs.getString("password"))) {
                        Ogrenci ogrenci = new Ogrenci();
                        ogrenci.setId(rs.getInt("id"));
                        ogrenci.setPassword(rs.getString("password"));
                        ogrenci.setTcno(rs.getString("tcno"));
                        ogrenci.setName(rs.getString("name"));
                        ogrenci.setType(rs.getString("type"));
                        OgrenciGUI oGUI = new OgrenciGUI(ogrenci);
                        oGUI.setVisible(true);
                        dispose();
                        return;
                    }
                }
                Helper.showMsg("Eksik ya da yanlış tuşladınız..");
            } catch (SQLException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_ogrenciLoginActionPerformed

    private void btn_personelLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelLoginActionPerformed
        if(fld_personelTc.getText().length()==0 && fld_personelPass.getText().length()==0){
            Helper.showMsg("fill");
        }else {
            try {
                Connection con = conn.connDb();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM user WHERE type='personel';");
                while(rs.next()){
                    if (fld_personelTc.getText().equals(rs.getString("tcno")) && fld_personelPass.getText().equals(rs.getString("password"))) {
                        Personel personel = new Personel();
                        personel.setId(rs.getInt("id"));
                        personel.setPassword(rs.getString("password"));
                        personel.setTcno(rs.getString("tcno"));
                        personel.setName(rs.getString("name"));
                        personel.setType(rs.getString("type"));
                        PersonelGUI pGUI = new PersonelGUI(personel);
                        pGUI.setVisible(true);
                        dispose();
                        return;
                    }
                }
                Helper.showMsg("Eksik ya da yanlış tuşladınız..");
            } catch (SQLException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_personelLoginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        RegisterGUI rGUI = new RegisterGUI();
        rGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_registerActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ogrenciLogin;
    private javax.swing.JButton btn_ogretmenLogin;
    private javax.swing.JButton btn_personelLogin;
    private javax.swing.JButton btn_register;
    private javax.swing.JPasswordField fld_ogrenciPass;
    private javax.swing.JTextField fld_ogrenciTc;
    private javax.swing.JPasswordField fld_ogretmenPass;
    private javax.swing.JTextField fld_ogretmenTc;
    private javax.swing.JPasswordField fld_personelPass;
    private javax.swing.JTextField fld_personelTc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel w_pane;
    // End of variables declaration//GEN-END:variables
}
