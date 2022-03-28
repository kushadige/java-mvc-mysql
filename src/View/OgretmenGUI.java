
package View;
import Helper.*;
import Model.*;
import static View.PersonelGUI.ders;
import static View.PersonelGUI.personel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import javax.swing.table.DefaultTableModel;


public class OgretmenGUI extends javax.swing.JFrame implements IFunctions {
       
    static OgretimUyesi ogretimuyesi = new OgretimUyesi();
    private DefaultTableModel notModel = null;
    private DefaultTableModel duyuruModel = null;
    private DefaultTableModel sinavModel = null;
    
    public OgretmenGUI(OgretimUyesi ogretimuyesi) {
        this.ogretimuyesi = ogretimuyesi;
        initComponents();
        jLabel1.setText("Hoşgeldiniz, Sayın " + ogretimuyesi.getName());
        notListele();
        not_tablosu.setModel(notModel);
        duyuruListele();
        duyuru_tablosu.setModel(duyuruModel);
        sinavListele();
        sinav_tablosu.setModel(sinavModel);
    }
    
    public void notListele(){
        notModel = new DefaultTableModel();
        Object[] colNot = new Object[3];
        colNot[0] = "Sınav Adı";
        colNot[1] = "Öğrenci ID";
        colNot[2] = "Not";
        notModel.setColumnIdentifiers(colNot);
        
        Object[] dataNot = new Object[3];
        
        for(int i = 0; i < ogretimuyesi.notListesi().size() ; i++ ){
            dataNot[0] = ogretimuyesi.notListesi().get(i).getSinav_adi();
            dataNot[1] = ogretimuyesi.notListesi().get(i).getOgrenci_id();
            dataNot[2] = ogretimuyesi.notListesi().get(i).getNot();
            notModel.addRow(dataNot);
        }
    }
    public void duyuruListele(){
        duyuruModel = new DefaultTableModel();
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
    }
    public void sinavListele(){
        sinavModel = new DefaultTableModel();
        Object[] colSinav = new Object[3];
        colSinav[0] = "Sinav Adi";
        colSinav[1] = "Soru Sayisi";
        colSinav[2] = "Tarih";
        sinavModel.setColumnIdentifiers(colSinav);
        
        Object[] sinavData = new Object[3];
        for(int i=0 ; i < ogretimuyesi.sinavListesi().size() ; i++){
            sinavData[0] = ogretimuyesi.sinavListesi().get(i).getSinav_adi();
            sinavData[1] = ogretimuyesi.sinavListesi().get(i).getSoru_sayisi();
            sinavData[2] = ogretimuyesi.sinavListesi().get(i).getTarih();
            sinavModel.addRow(sinavData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        w_pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cikis_yap = new javax.swing.JButton();
        sifre_degistir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        duyuru_tablosu = new javax.swing.JTable();
        duyuru_yap = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        fld_duyuru = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        duyuru_tablosu_sil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sinav_tablosu = new javax.swing.JTable();
        sinav_tanimla = new javax.swing.JButton();
        sinav_tablosu_sil = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fld_sinav_adi1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fld_soru_sayisi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fld_tarih = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        not_tablosu = new javax.swing.JTable();
        not_girisi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fld_sinav_adi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fld_ogrenci_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fld_not = new javax.swing.JTextField();
        not_tablosu_sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci İşleri Otomasyonu");
        setBounds(new java.awt.Rectangle(425, 150, 0, 0));
        setPreferredSize(new java.awt.Dimension(680, 534));
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

        sifre_degistir.setText("Şifre Değiştir");
        sifre_degistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_degistirActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        duyuru_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(duyuru_tablosu);

        duyuru_yap.setText("Gönder");
        duyuru_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duyuru_yapActionPerformed(evt);
            }
        });

        fld_duyuru.setColumns(20);
        fld_duyuru.setRows(5);
        jScrollPane3.setViewportView(fld_duyuru);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("Duyuru");

        duyuru_tablosu_sil.setText("Sil");
        duyuru_tablosu_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duyuru_tablosu_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duyuru_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(duyuru_tablosu_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(duyuru_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(duyuru_tablosu_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Duyuru Yap", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        sinav_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(sinav_tablosu);

        sinav_tanimla.setText("Sınav Oluştur");
        sinav_tanimla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinav_tanimlaActionPerformed(evt);
            }
        });

        sinav_tablosu_sil.setText("Sil");
        sinav_tablosu_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinav_tablosu_silActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("Sınav Adı");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Soru Sayısı");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Tarih");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sinav_tablosu_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addComponent(fld_sinav_adi1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_soru_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sinav_tanimla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fld_tarih, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_sinav_adi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_soru_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinav_tanimla, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sinav_tablosu_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sınav Tanımla", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        not_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(not_tablosu);

        not_girisi.setText("Not Ekle");
        not_girisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                not_girisiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("Sınav Adı");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Öğrenci ID");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Not");

        not_tablosu_sil.setText("Sil");
        not_tablosu_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                not_tablosu_silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fld_not)
                            .addComponent(fld_sinav_adi)
                            .addComponent(fld_ogrenci_id)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(not_girisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(not_tablosu_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_sinav_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_ogrenci_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_not, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(not_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(not_tablosu_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Not Girişi", jPanel1);

        javax.swing.GroupLayout w_paneLayout = new javax.swing.GroupLayout(w_pane);
        w_pane.setLayout(w_paneLayout);
        w_paneLayout.setHorizontalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(w_paneLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(w_paneLayout.createSequentialGroup()
                        .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(w_paneLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233)
                                .addComponent(cikis_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(w_paneLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sifre_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        w_paneLayout.setVerticalGroup(
            w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(w_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikis_yap))
                .addGap(32, 32, 32)
                .addComponent(sifre_degistir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(w_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikis_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_yapActionPerformed
        cikis_yap();
    }//GEN-LAST:event_cikis_yapActionPerformed

    private void sifre_degistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_degistirActionPerformed
        sifre_degistir();
    }//GEN-LAST:event_sifre_degistirActionPerformed

    private void duyuru_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duyuru_yapActionPerformed
        
        if(fld_duyuru.getText().length()==0){
            //Helper.showMsg("");
            return;
        }
        ogretimuyesi.duyuruYap(ogretimuyesi.getName(), fld_duyuru.getText());
        
        dispose();
        OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
        oGUI.setVisible(true);
    }//GEN-LAST:event_duyuru_yapActionPerformed

    private void sinav_tanimlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinav_tanimlaActionPerformed
        
        if(fld_sinav_adi1.getText().length()==0 || fld_soru_sayisi.getText().length() == 0 || fld_tarih.getText().length() == 0){
            Helper.showMsg("Sinav eklemek için tüm alanlari doldurunuz...");
            return;
        }
        
        try {
            Connection con = ders.getConn().connDb();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO sinav VALUES ('" + fld_sinav_adi1.getText() + "'," + fld_soru_sayisi.getText() + ",'"
                    + fld_tarih.getText() + "');");
            JOptionPane.showMessageDialog(null, "YENİ SINAV OLUŞTURULDU..");
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
        oGUI.setVisible(true);
    }//GEN-LAST:event_sinav_tanimlaActionPerformed
  
    private void not_girisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_not_girisiActionPerformed
        ekle();
    }//GEN-LAST:event_not_girisiActionPerformed

    private void duyuru_tablosu_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duyuru_tablosu_silActionPerformed
        delete();
    }//GEN-LAST:event_duyuru_tablosu_silActionPerformed

    private void sinav_tablosu_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinav_tablosu_silActionPerformed
        try {
            Connection con = ogretimuyesi.getConn().connDb();
            Statement st = con.createStatement();
            if(sinav_tablosu.getSelectedRow()==-1){
                Helper.showMsg("Silmek için bir sınav seçiniz..");
                return;
            }
            
            st.executeUpdate("DELETE FROM sinav WHERE sinav_adi = '" + sinav_tablosu.getValueAt(sinav_tablosu.getSelectedRow(), 0) + 
                                               "' AND soru_sayisi = " + sinav_tablosu.getValueAt(sinav_tablosu.getSelectedRow(), 1) +
                                               " AND tarih = '" + sinav_tablosu.getValueAt(sinav_tablosu.getSelectedRow(), 2) + "';");
            dispose();
            OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
            oGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenGUI.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_sinav_tablosu_silActionPerformed

    private void not_tablosu_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_not_tablosu_silActionPerformed
        try {
            Connection con = ogretimuyesi.getConn().connDb();
            Statement st = con.createStatement();
            if(not_tablosu.getSelectedRow()==-1){
                Helper.showMsg("Silmek için bir not seçiniz..");
                return;
            }
            
            st.executeUpdate("DELETE FROM notlar WHERE sinav_adi = '" + not_tablosu.getValueAt(not_tablosu.getSelectedRow(), 0) + 
                                               "' AND ogrenci_id = " + not_tablosu.getValueAt(not_tablosu.getSelectedRow(), 1) +
                                               ";");
            dispose();
            OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
            oGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_not_tablosu_silActionPerformed
            
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgretmenGUI(ogretimuyesi).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis_yap;
    private javax.swing.JTable duyuru_tablosu;
    private javax.swing.JButton duyuru_tablosu_sil;
    private javax.swing.JButton duyuru_yap;
    private javax.swing.JTextArea fld_duyuru;
    private javax.swing.JTextField fld_not;
    private javax.swing.JTextField fld_ogrenci_id;
    private javax.swing.JTextField fld_sinav_adi;
    private javax.swing.JTextField fld_sinav_adi1;
    private javax.swing.JTextField fld_soru_sayisi;
    private javax.swing.JTextField fld_tarih;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton not_girisi;
    private javax.swing.JTable not_tablosu;
    private javax.swing.JButton not_tablosu_sil;
    private javax.swing.JButton sifre_degistir;
    private javax.swing.JTable sinav_tablosu;
    private javax.swing.JButton sinav_tablosu_sil;
    private javax.swing.JButton sinav_tanimla;
    private javax.swing.JPanel w_pane;
    // End of variables declaration//GEN-END:variables
    @Override
    //DUYURU SİL
    public void delete() {
        try {
        Connection con = ogretimuyesi.getConn().connDb();
        Statement st = con.createStatement();
        if(duyuru_tablosu.getSelectedRow()==-1){
            Helper.showMsg("Silmek için bir duyuru seçiniz..");
            return;
        }
        
        st.executeUpdate("DELETE FROM duyuru WHERE metin = '" + duyuru_tablosu.getValueAt(duyuru_tablosu.getSelectedRow(), 1) + "';");
        dispose();
        OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
        oGUI.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void ekle(){
        if(fld_sinav_adi.getText().length()==0 || fld_ogrenci_id.getText().length() == 0 || fld_not.getText().length() == 0){
            Helper.showMsg("Not eklemek için tüm alanlari doldurunuz...");
            return;
        }        
        try {
            OgretimUyesi u = new OgretimUyesi();
            Connection con = u.getConn().connDb();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO notlar VALUES ('" + fld_sinav_adi.getText() + "'," + fld_ogrenci_id.getText() + ","
                    + fld_not.getText() + ");"); 
            JOptionPane.showMessageDialog(null, "NOT GİRİŞİ BAŞARILI!");
            con.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
        oGUI.setVisible(true);
    }
    @Override
    public void cikis_yap(){
        LoginGUI lGUI = new LoginGUI();
        lGUI.setVisible(true);
        dispose();
    }
    @Override
    public void sifre_degistir() {  
        String new_pass = JOptionPane.showInputDialog("Yeni oluturmak istediğiniz şifreyi giriniz", ogretimuyesi.getPassword());
        if(new_pass.length()==0){
            Helper.showMsg("Şifre boş olamaz..");
            return;
        }
        try {
            Connection con = ogretimuyesi.getConn().connDb();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE user SET password = '" + new_pass +"' WHERE id = " + ogretimuyesi.getId() + ";");
            Helper.showMsg("Şifre güncellendi..");
            ogretimuyesi.setPassword(new_pass);
            dispose();
            OgretmenGUI oGUI = new OgretmenGUI(ogretimuyesi);
            oGUI.setVisible(true);
        } catch (SQLException ex) {
        }
    }
    
}
