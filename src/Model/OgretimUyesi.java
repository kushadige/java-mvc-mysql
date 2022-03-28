package Model;

import Helper.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class OgretimUyesi extends User {
	
    public OgretimUyesi(int id, String tcno, String password, String type, String name) {
        super(id, tcno, password, type, name);
	// TODO Auto-generated constructor stub
    }
	
    public OgretimUyesi() {}
    
    public void duyuruYap(String hoca_adi, String metin){

        try {
            Connection con = conn.connDb();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO duyuru VALUES ('" + hoca_adi + "','" + metin + "');");
            JOptionPane.showMessageDialog(null, "DUYURU GÖNDERİLDİ!");
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OgretimUyesi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static Connection con = conn.connDb();
    static Statement st = null;
    static ResultSet rs = null;
    public static ArrayList<Duyuru> duyuruListesi(){
        
        ArrayList<Duyuru> list = new ArrayList<>();
        
        Duyuru obj;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM duyuru;");
            
            while(rs.next()){
                obj = new Duyuru(rs.getString("hoca_adi"),rs.getString("metin"));
                list.add(obj);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(OgretimUyesi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    public static ArrayList<Sinav> sinavListesi(){
        
        ArrayList<Sinav> list = new ArrayList<>();
        
        Sinav obj;
        
        try {
            Connection con1 = conn.connDb();
            Statement stmt =  con1.createStatement();
            
            ResultSet rslt = stmt.executeQuery("SELECT * FROM sinav;");
            
            while(rslt.next()){
                obj = new Sinav(rslt.getString("sinav_adi"),rslt.getInt("soru_sayisi"),rslt.getString("tarih"));
                list.add(obj);
            }
            con1.close();
        } catch (SQLException ex) {
            Logger.getLogger(OgretimUyesi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    public static ArrayList<Not> notListesi(){
        
        ArrayList<Not> list = new ArrayList<>();
        
        try {
            Connection con2 = conn.connDb();
            Statement stmnt = con2.createStatement();
            ResultSet rsset = stmnt.executeQuery("SELECT * FROM notlar;");
            
            Not obj;
            while(rsset.next()){
                obj = new Not(rsset.getString("sinav_adi"), rsset.getInt("ogrenci_id"), rsset.getInt("notlar"));
                list.add(obj);
            }
            con2.close();

        } catch (SQLException ex) {
            Logger.getLogger(OgretimUyesi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
}
