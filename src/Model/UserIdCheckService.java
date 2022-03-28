package Model;
//aynı ID'den 2 farklı öğrenci eklenmesini önleyen program
import Model.IUserCheckService;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserIdCheckService implements IUserCheckService{
    
    @Override
    public boolean checkUser(int id){
            try {
                Ogrenci ogr = new Ogrenci();
                Connection c = ogr.conn.connDb();
                Statement st = c.createStatement();
                ResultSet rs = st.executeQuery("SELECT id FROM user;");
                
                while(rs.next()){
                    if(rs.getInt("id") == id){
                        return true;
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Ogrenci.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
    }
    
}
