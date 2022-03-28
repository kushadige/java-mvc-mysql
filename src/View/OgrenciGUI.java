
package View;
import Helper.*;
import Model.*;
import static View.OgretmenGUI.ogretimuyesi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OgrenciGUI extends javax.swing.JFrame implements IFunctions {

    static Ogrenci ogrenci = new Ogrenci();
    private DefaultTableModel ogrenciModel = null;
    private Object[] ogrenciData = null;
        
    DersListesi derslist = new DersListesi();
    DefaultTableModel dersModel = null;
    Object[] dersData = null;
    
    public OgrenciGUI(Ogrenci ogrenci) throws SQLException {
        
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
        
        this.ogrenci = ogrenci;
        initComponents();
        jLabel1.setText("Hoşgeldiniz, " + ogrenci.getName());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w_pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cikis_yap = new javax.swing.JButton();
        ders_programi = new javax.swing.JButton();
        sinavlar = new javax.swing.JButton();
        sifre_degistir = new javax.swing.JButton();
        duyurular = new javax.swing.JButton();
        not_goruntule = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogrenci_table = new javax.swing.JTable();
        ders_sec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci İşleri Otomasyonu");
        setBounds(new java.awt.Rectangle(425, 150, 0, 0));
        setResizable(false);

        w_pane.setBackground(new java.awt.Color(255, 255, 255));
        w_pane.setPreferredSize(new java.awt.Dimension(650, 500));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setText("Hoşgeldiniz, ");

        cikis_yap.setText("Çıkış Yap");
        cikis_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_yapActionPerformed(evt);
            }
        });

        ders_programi.setText("Dersler");
        ders_programi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ders_programiActionPerformed(evt);
            }
        });

        sinavlar.setText("Sınavlar");
        sinavlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinavlarActionPerformed(evt);
            }
        });

        sifre_degistir.setText("Şifre Değiştir");
        sifre_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_degistirActionPerformed(evt);
            }
        });

        duyurular.setText("Duyurular");
        duyurular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duyurularActionPerformed(evt);
            }
        });

        not_goruntule.setText("Notlar");
        not_goruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                not_goruntuleActionPerformed(evt);
            }
        });

        ogrenci_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ogrenci_table);

        ders_sec.setText("Ders Seç");
        ders_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ders_secActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout w_paneLayout = new javax.swing.GroupLayout(w_pane);
        w_pane.setLayout(w_paneLayout);
        w_paneLayout.setHorizontalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(w_paneLayout.createSequentialGroup()
                        .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, w_paneLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(w_paneLayout.createSequentialGroup()
                                .addComponent(ders_programi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(duyurular, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sinavlar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(not_goruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ders_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sifre_degistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cikis_yap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(ders_programi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duyurular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(not_goruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinavlar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ders_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, 502, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ders_programiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ders_programiActionPerformed
        ogrenci_table.setModel(dersModel);
    }//GEN-LAST:event_ders_programiActionPerformed

    private void cikis_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_yapActionPerformed
        cikis_yap();
    }//GEN-LAST:event_cikis_yapActionPerformed

    private void sifre_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_degistirActionPerformed
        sifre_degistir();
    }//GEN-LAST:event_sifre_degistirActionPerformed

    private void duyurularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duyurularActionPerformed
        
        DefaultTableModel duyuruModel = new DefaultTableModel();
        Object[] colDuyuru = new Object[2];
        colDuyuru[0] = "Hoca Adi";
        colDuyuru[1] = "Duyuru";
        duyuruModel.setColumnIdentifiers(colDuyuru);
        
        Object[] duyuruData = new Object[2];
        
        for(int i = 0 ; i < ogretimuyesi.duyuruListesi().size() ; i++ ) {
            duyuruData[0] = ogretimuyesi.duyuruListesi().get(i).getHoca_adi(); 
            duyuruData[1] = ogretimuyesi.duyuruListesi().get(i).getDuyuru();

            duyuruModel.addRow(duyuruData);
        }
        
        ogrenci_table.setModel(duyuruModel);
    }//GEN-LAST:event_duyurularActionPerformed

    private void sinavlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinavlarActionPerformed
        DefaultTableModel sinavModel = new DefaultTableModel();
        Object[] colSinav = new Object[3];
        colSinav[0] = "Sinav Adi";
        colSinav[1] = "Soru Sayisi";
        colSinav[2] = "Tarih";
        sinavModel.setColumnIdentifiers(colSinav);
        
        OgretimUyesi u = ogretimuyesi;
        Object[] sinavData = new Object[3];
        for(int i=0 ; i < u.sinavListesi().size() ; i++){
            sinavData[0] = u.sinavListesi().get(i).getSinav_adi();
            sinavData[1] = u.sinavListesi().get(i).getSoru_sayisi();
            sinavData[2] = u.sinavListesi().get(i).getTarih();
            
            sinavModel.addRow(sinavData);
        }
        
        ogrenci_table.setModel(sinavModel);
    }//GEN-LAST:event_sinavlarActionPerformed

    private void not_goruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_not_goruntuleActionPerformed
        DefaultTableModel notModel = new DefaultTableModel();
        Object[] colModel = new Object[3];
        colModel[0] = "Sınav Adı";
        colModel[1] = "Öğrenci ID";
        colModel[2] = "Not";
        notModel.setColumnIdentifiers(colModel);
        
        Object[] colData = new Object[3];
        for(int i=0;i<ogretimuyesi.notListesi().size();i++){
            colData[0] = ogretimuyesi.notListesi().get(i).getSinav_adi();
            colData[1] = ogretimuyesi.notListesi().get(i).getOgrenci_id();
            colData[2] = ogretimuyesi.notListesi().get(i).getNot();
            notModel.addRow(colData);
        }
        ogrenci_table.setModel(notModel);
    }//GEN-LAST:event_not_goruntuleActionPerformed

    private void ders_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ders_secActionPerformed
        
        dispose();
        DersSecGUI dGUI = new DersSecGUI(ogrenci);
        dGUI.setVisible(true);
    }//GEN-LAST:event_ders_secActionPerformed
    


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OgrenciGUI(ogrenci).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OgrenciGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis_yap;
    private javax.swing.JButton ders_programi;
    private javax.swing.JButton ders_sec;
    private javax.swing.JButton duyurular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton not_goruntule;
    private javax.swing.JTable ogrenci_table;
    private javax.swing.JButton sifre_degistir;
    private javax.swing.JButton sinavlar;
    private javax.swing.JPanel w_pane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void ekle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void cikis_yap() {
        LoginGUI lGUI = new LoginGUI();
        lGUI.setVisible(true);
        dispose();
    }
    @Override
    public void sifre_degistir() {
        String new_pass = JOptionPane.showInputDialog("Yeni oluturmak istediğiniz şifreyi giriniz", ogrenci.getPassword());
        if(new_pass.length()==0){
            Helper.showMsg("Şifre boş olamaz..");
            return;
        }
        try {
            Connection con = ogrenci.getConn().connDb();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE user SET password = '" + new_pass +"' WHERE id = " + ogrenci.getId() + ";");
            Helper.showMsg("Şifre güncellendi..");
            ogrenci.setPassword(new_pass);
            dispose();
            OgrenciGUI oGUI = new OgrenciGUI(ogrenci);
            oGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
