package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personel extends User {
    
    public Personel(int id, String tcno, String password, String type, String name) {
        super(id, tcno, password, type, name);
	// TODO Auto-generated constructor stub
    }
	
    public Personel() {}
    
    static Connection con = conn.connDb();
        
    public ArrayList<User> ogrenciListesi(){
        ArrayList<User> list = new ArrayList<>();  


        User obj;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE type = 'ogrenci';");
        
            while(rs.next()){
                obj = new User(rs.getInt("id"),rs.getString("tcno"),rs.getString("password"),rs.getString("type"),rs.getString("name"));
                list.add(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

}
