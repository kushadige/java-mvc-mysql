package Helper;
import java.sql.*;
//Database bağlantı apisi
public class DBConnection {
	Connection c = null;
	
	public DBConnection() {}
	
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_adi = "ogrisleri";
    private String host = "localhost";
    private int port = 3306;
    //"jdbc:mysql://localhost:3306/ogrisleri"
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + db_adi;
	
	public Connection connDb() {
		try {
			this.c = DriverManager.getConnection(url, kullanici_adi, parola);
			//System.out.println("baglandi..");
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
}
