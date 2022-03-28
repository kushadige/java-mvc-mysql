
package View;

import Helper.*;
import Model.Ders;
import Model.DersListesi;
import Model.Ogrenci;
import Model.Personel;
import Model.Take;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class DersSecGUI extends javax.swing.JFrame {

    DefaultTableModel dersModel = null;
    DefaultTableModel secilenModel = null;
    DersListesi derslist = new DersListesi();
    static Ogrenci ogrenci;
    DBConnection dbc = new DBConnection();
    
    public DersSecGUI(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
        initComponents();
        dersListele();
        ders_listesi.setModel(dersModel);
        secilenListele();
        secilen_dersler.setModel(secilenModel);
    }
    
    public void dersListele(){
        try {
            dersModel = new DefaultTableModel();
            Object[] dersCol = new Object[3];
            dersCol[0] = "Ders ID";
            dersCol[1] = "Ders Adı";
            dersCol[2] = "Kredi";
            dersModel.setColumnIdentifiers(dersCol);
            
            
            Object[] dersData = new Object[3];
            for(int i = 0 ; i < derslist.getCourseList().size(); i++ ){
                dersData[0] = derslist.getCourseList().get(i).getId();
                dersData[1] = derslist.getCourseList().get(i).getName();
                dersData[2] = derslist.getCourseList().get(i).getCredits();
                dersModel.addRow(dersData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DersSecGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void secilenListele(){
        secilenModel = new DefaultTableModel();
        Object[] dersCol = new Object[3];
        dersCol[0] = "Ders ID";
        dersCol[1] = "Ders Adı";
        dersCol[2] = "Kredi";
        secilenModel.setColumnIdentifiers(dersCol);
        
        ArrayList<Ders> list = new ArrayList<>();  

        Connection con = dbc.connDb();
        Ders obj;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT ders.* FROM ders,take WHERE ders.name = take.ders_adi;");
        
            while(rs.next()){
                obj = new Ders(rs.getInt("id"),rs.getString("name"),rs.getFloat("credits"));
                list.add(obj);
            }
            Object[] dersData = new Object[3];
            for(int i = 0 ; i<list.size(); i++ ){
                dersData[0] = list.get(i).getId();
                dersData[1] = list.get(i).getName();
                dersData[2] = list.get(i).getCredits();
                secilenModel.addRow(dersData);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ders_listesi = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        secilen_dersler = new javax.swing.JTable();
        ders_sec = new javax.swing.JButton();
        ders_cikar = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ders Seçimi");
        setBounds(new java.awt.Rectangle(425, 150, 0, 0));
        setPreferredSize(new java.awt.Dimension(615, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel1.setText("              Seçilen Dersler");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel2.setText("                Ders Listesi");

        ders_listesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ders_listesi);

        secilen_dersler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(secilen_dersler);

        ders_sec.setText("Ders Seç");
        ders_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ders_secActionPerformed(evt);
            }
        });

        ders_cikar.setText("Çıkar");
        ders_cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ders_cikarActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ders_sec, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(ders_cikar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ders_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ders_cikar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(exit))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        try {
            OgrenciGUI oGUI = new OgrenciGUI(ogrenci);
            oGUI.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(DersSecGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void ders_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ders_secActionPerformed
        try {
            if(ders_listesi.getSelectedRow()==-1){
                return;
            }
            
            Connection c = dbc.connDb();
            Statement kontrol = c.createStatement();
            ResultSet rs = kontrol.executeQuery("SELECT name FROM ders WHERE name IN(SELECT ders_adi FROM take) AND name = '"+
                                            ders_listesi.getValueAt(ders_listesi.getSelectedRow(), 1) + "';");
            int rowCount = 0;
            while (rs.next()) {
                rowCount++;
            }     
            if(rowCount!=0){
                Helper.showMsg("Aynı dersten iki adet seçilemez..");
                return;
            }
            
            Statement st = c.createStatement();
            st.executeUpdate("INSERT INTO take VALUES('" + ogrenci.getTcno() + "','" 
                    + ders_listesi.getValueAt(ders_listesi.getSelectedRow(), 1) + "');");
            
            c.close();
            
            dispose();
            DersSecGUI dGUI = new DersSecGUI(ogrenci);
            dGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DersSecGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ders_secActionPerformed

    private void ders_cikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ders_cikarActionPerformed
        try {
            if(secilen_dersler.getSelectedRow()==-1){
                return;
            }
            Connection c = dbc.connDb();
            
            Statement st = c.createStatement();
            st.executeUpdate("DELETE FROM take WHERE ders_adi = '" + secilen_dersler.getValueAt(secilen_dersler.getSelectedRow(), 1) + "';");
            
            c.close();
            
            dispose();
            DersSecGUI dGUI = new DersSecGUI(ogrenci);
            dGUI.setVisible(true);         
        } catch (SQLException ex) {
            Logger.getLogger(DersSecGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ders_cikarActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DersSecGUI(ogrenci).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ders_cikar;
    private javax.swing.JTable ders_listesi;
    private javax.swing.JButton ders_sec;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable secilen_dersler;
    // End of variables declaration//GEN-END:variables
}
