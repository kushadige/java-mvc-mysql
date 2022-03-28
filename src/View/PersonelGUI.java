
package View;
import Helper.*;
import Model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PersonelGUI extends javax.swing.JFrame implements IFunctions{
    
    static Personel personel = new Personel();
    static Ders ders = new Ders();
    static DersListesi derslist = new DersListesi();
    private DefaultTableModel ogrenciModel = null;
    private DefaultTableModel dersModel = null;
    private Object[] ogrenciData = null;
    
    public PersonelGUI(Personel personel) throws SQLException {
        
        ogrenciModel = new DefaultTableModel();
        Object[] colStudentName = new Object[5];
        colStudentName[0] = "ID";
        colStudentName[1] = "TC NO";
        colStudentName[2] = "Sifre";
        colStudentName[3] = "Type";
        colStudentName[4] = "Ad Soyad";
        ogrenciModel.setColumnIdentifiers(colStudentName);
        ogrenciData = new Object[5];
        for(int i = 0 ; i < personel.ogrenciListesi().size() ; i++ ) {
            ogrenciData[0] = personel.ogrenciListesi().get(i).getId(); 
            ogrenciData[1] = personel.ogrenciListesi().get(i).getTcno();
            ogrenciData[2] = personel.ogrenciListesi().get(i).getPassword();
            ogrenciData[3] = personel.ogrenciListesi().get(i).getType();
            ogrenciData[4] = personel.ogrenciListesi().get(i).getName();
            ogrenciModel.addRow(ogrenciData);
        }
        
        this.personel = personel;
        dersListele();
        initComponents();
        w_studentTable.setModel(ogrenciModel);
        w_courseTable.setModel(dersModel);
        jLabel1.setText("Hoşgeldiniz, Sayın " + personel.getName());
    }
    
    private void dersListele() throws SQLException {
        DersListesi derslist = new DersListesi();
        Object[] dersData = null;
        dersModel = new DefaultTableModel();
        Object[] colCourseName = new Object[3];
        colCourseName[0] = "ID";
        colCourseName[1] = "name";
        colCourseName[2] = "credits";
        dersModel.setColumnIdentifiers(colCourseName);
        dersData = new Object[3];
        for(int i = 0 ; i < derslist.getCourseList().size() ; i++ ) {
            dersData[0] = derslist.getCourseList().get(i).getId(); 
            dersData[1] = derslist.getCourseList().get(i).getName();
            dersData[2] = derslist.getCourseList().get(i).getCredits();
            dersModel.addRow(dersData);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w_pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cikis_yap = new javax.swing.JButton();
        btn_dersprogramihazirla = new javax.swing.JButton();
        sifre_degistir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_sil = new javax.swing.JButton();
        btn_ekle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        w_studentTable = new javax.swing.JTable();
        fld_adsoyad = new javax.swing.JTextField();
        fld_tcno = new javax.swing.JTextField();
        fld_pass = new javax.swing.JTextField();
        fld_ekleid = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        w_courseTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        fld_ekleid1 = new javax.swing.JTextField();
        btn_ekle1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        fld_credits = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_sil2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci İşleri Otomasyonu");
        setBounds(new java.awt.Rectangle(425, 150, 0, 0));
        setResizable(false);

        w_pane.setBackground(new java.awt.Color(255, 255, 255));
        w_pane.setPreferredSize(new java.awt.Dimension(650, 500));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("Hoşgeldiniz, Sayın ");

        cikis_yap.setText("Çıkış Yap");
        cikis_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_yapActionPerformed(evt);
            }
        });

        btn_dersprogramihazirla.setText("Ders Programı Hazırla");
        btn_dersprogramihazirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dersprogramihazirlaActionPerformed(evt);
            }
        });

        sifre_degistir.setText("Şifre Değiştir");
        sifre_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_degistirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("T.C. No");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Ad Soyad");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Şifre");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("ID");

        btn_sil.setBackground(new java.awt.Color(153, 153, 153));
        btn_sil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_ekle.setBackground(new java.awt.Color(153, 153, 153));
        btn_ekle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_ekle.setText("Ekle");
        btn_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekleActionPerformed(evt);
            }
        });

        w_studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        w_studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w_studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(w_studentTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(btn_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(fld_adsoyad)
                        .addComponent(fld_tcno)
                        .addComponent(fld_pass)
                        .addComponent(fld_ekleid))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_ekleid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_tcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btn_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Öğrenci Yönetimi", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        w_courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        w_courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w_courseTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(w_courseTable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 221, 331));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Ders Adı");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 10, 137, -1));
        jPanel2.add(fld_ekleid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 32, 137, -1));

        btn_ekle1.setBackground(new java.awt.Color(153, 153, 153));
        btn_ekle1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_ekle1.setText("Ekle");
        btn_ekle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ekle1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ekle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 104, 137, -1));
        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 233, 331));
        jPanel2.add(fld_credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 79, 137, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Kredi");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 57, 137, -1));

        btn_sil2.setBackground(new java.awt.Color(153, 153, 153));
        btn_sil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_sil2.setText("Sil");
        btn_sil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sil2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 143, 137, -1));

        jTabbedPane1.addTab("Dersler", jPanel2);

        javax.swing.GroupLayout w_paneLayout = new javax.swing.GroupLayout(w_pane);
        w_pane.setLayout(w_paneLayout);
        w_paneLayout.setHorizontalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(w_paneLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(cikis_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(w_paneLayout.createSequentialGroup()
                        .addComponent(btn_dersprogramihazirla, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sifre_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        w_paneLayout.setVerticalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikis_yap))
                .addGap(32, 32, 32)
                .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dersprogramihazirla, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, 502, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cikis_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_yapActionPerformed
        cikis_yap();
    }//GEN-LAST:event_cikis_yapActionPerformed
    private void btn_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekleActionPerformed
        ekle();
    }//GEN-LAST:event_btn_ekleActionPerformed
    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        delete();
    }//GEN-LAST:event_btn_silActionPerformed
    private void btn_dersprogramihazirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dersprogramihazirlaActionPerformed
        Helper.showMsg("Ders Programi");
    }//GEN-LAST:event_btn_dersprogramihazirlaActionPerformed
    private void sifre_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_degistirActionPerformed
        sifre_degistir();
    }//GEN-LAST:event_sifre_degistirActionPerformed
    
    //MOUSE CLICK KONTROLÜYLE DEĞER ALMA
    String selected_pass;
    int selected_id;
    
    private void w_studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w_studentTableMouseClicked
        int selected_row = w_studentTable.getSelectedRow();
        selected_id = Integer.valueOf(w_studentTable.getValueAt(selected_row, 0).toString());
        selected_pass = w_studentTable.getValueAt(selected_row,2).toString();
        if(selected_row == -1){
            selected_id = -1;
        }
    }//GEN-LAST:event_w_studentTableMouseClicked
    // DERS EKLE
    private void btn_ekle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ekle1ActionPerformed
        if(fld_ekleid1.getText().length()==0 || fld_credits.getText().length() == 0){
            Helper.showMsg("Ders eklemek için İsim ve Kredi girişi zorunludur...");
            return;
        }
        try {
            Connection con = ders.getConn().connDb();
            Statement st1 = con.createStatement();
            ResultSet rs = st1.executeQuery("SELECT * FROM ders;");
            
            Statement st2 = con.createStatement();
            ResultSet enBuyukId = st2.executeQuery("SELECT id FROM ders EXCEPT SELECT d1.id FROM ders d1, ders d2 WHERE d1.id < d2.id;");
            
            int sayac=0;
            while(rs.next()){
                sayac++;
            }
            
            int enb = 0;
            while(enBuyukId.next()){
                enb = enBuyukId.getInt("id");
            }
            if(sayac==0){
                st1.executeUpdate("INSERT INTO ders VALUES(" + 0 + ",'" + fld_ekleid1.getText() + "'," + fld_credits.getText() + ");");
            }else{
                st2.executeUpdate("INSERT INTO ders VALUES(" + (enb+1) + ",'" + fld_ekleid1.getText() + "'," +
                                fld_credits.getText() + ");");
            }
            dispose();
            PersonelGUI pGUI = new PersonelGUI(personel);
            pGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ekle1ActionPerformed

    private void btn_sil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sil2ActionPerformed
        dersSil();
    }//GEN-LAST:event_btn_sil2ActionPerformed
    int selected_id_derstablosu;
    private void w_courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w_courseTableMouseClicked
        int selected_row_derstablosu = w_courseTable.getSelectedRow();
        selected_id_derstablosu = Integer.valueOf(w_courseTable.getValueAt(selected_row_derstablosu, 0).toString()); 
        if(selected_row_derstablosu == -1){
            selected_id_derstablosu = -1;
        }
    }//GEN-LAST:event_w_courseTableMouseClicked
    
    public void dersSil(){
        try {
        Connection con = ders.getConn().connDb();
        Statement st = con.createStatement();
        if(w_courseTable.getSelectedRow()==-1){
            Helper.showMsg("Silmek için bir ders seçiniz..");
            return;
        }
        if(selected_id_derstablosu!=-1){
            st.executeUpdate("DELETE FROM ders WHERE id = " + selected_id_derstablosu + ";");
            dispose();
            PersonelGUI pGUI = new PersonelGUI(personel);
            pGUI.setVisible(true);
        }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PersonelGUI(personel).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dersprogramihazirla;
    private javax.swing.JButton btn_ekle;
    private javax.swing.JButton btn_ekle1;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_sil2;
    private javax.swing.JButton cikis_yap;
    private javax.swing.JTextField fld_adsoyad;
    private javax.swing.JTextField fld_credits;
    private javax.swing.JTextField fld_ekleid;
    private javax.swing.JTextField fld_ekleid1;
    private javax.swing.JTextField fld_pass;
    private javax.swing.JTextField fld_tcno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton sifre_degistir;
    private javax.swing.JTable w_courseTable;
    private javax.swing.JPanel w_pane;
    private javax.swing.JTable w_studentTable;
    // End of variables declaration//GEN-END:variables
    
    
    @Override
    //ÖĞRENCİ SİL
    public void delete() {
        try {
        //Helper.showMsg("Sil Butonu");
        Connection con = personel.getConn().connDb();
        Statement st = con.createStatement();
        if(w_studentTable.getSelectedRow()==-1){
            Helper.showMsg("Silmek için bir kullanici seçiniz..");
            return;
        }
        if(selected_id!=-1){
            st.executeUpdate("DELETE FROM user WHERE id = " + selected_id + ";");
            dispose();
            PersonelGUI pGUI = new PersonelGUI(personel);
            pGUI.setVisible(true);
        }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    //ÖĞRENCİ EKLE
    public void ekle(){
        if(fld_ekleid.getText().length()==0 || fld_adsoyad.getText().length() == 0 || fld_tcno.getText().length()==0 || fld_pass.getText().length()==0 ){
            Helper.showMsg("Kullanıcı eklemek için ID, İsim, TC ve Şifre girişi zorunludur...");
            return;
        }
        
        try {
            //Helper.showMsg("Ekle Butonu");
                
            UserIdCheckService idCheck = new UserIdCheckService();
            if ( idCheck.checkUser(  Integer.valueOf(fld_ekleid.getText().trim()) ) ) {
                Helper.showMsg("Ayni ID'ye ait iki kullanici tanimlanamaz...");
                return;
            }
            
            Connection con = personel.getConn().connDb();
            Statement st = con.createStatement();
            
            st.executeUpdate("INSERT INTO user VALUES(" + fld_ekleid.getText() + ",'" + fld_tcno.getText() + "','" +
                            fld_pass.getText() + "','ogrenci','" + fld_adsoyad.getText() + "');");
            //Helper.showMsg("Kullanici eklendi..");
            dispose();
            PersonelGUI pGUI = new PersonelGUI(personel);
            pGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void cikis_yap(){
        LoginGUI lGUI = new LoginGUI();
        lGUI.setVisible(true);
        dispose();
    }
    @Override
    public void sifre_degistir() { 
        if(w_studentTable.getSelectedRow() == -1){
            Helper.showMsg("Şifresini güncellemek istediğiniz kullaniciyi seçiniz..");
            return;
        }
        
        String new_pass = JOptionPane.showInputDialog("Yeni oluturmak istediğiniz şifreyi giriniz", selected_pass);
        if(new_pass.length()==0){
            Helper.showMsg("Şifre boş olamaz..");
            return;
        }
        try {
            Connection con = personel.getConn().connDb();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE user SET password='" + new_pass + "' WHERE id = " + selected_id + ";");
            dispose();
            PersonelGUI pGUI = new PersonelGUI(personel);
            pGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PersonelGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
