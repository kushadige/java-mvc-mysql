
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DersListesi extends Ders {
    public ArrayList<Ders> getCourseList() throws SQLException{
        ArrayList<Ders> list = new ArrayList<>();  

        Connection con = conn.connDb();
        Ders obj;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ders;");
        
            while(rs.next()){
                obj = new Ders(rs.getInt("id"),rs.getString("name"),rs.getFloat("credits"));
                list.add(obj);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Personel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return list;
    }
}
