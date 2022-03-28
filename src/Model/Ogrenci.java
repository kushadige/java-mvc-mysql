package Model;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ogrenci extends User{

	public Ogrenci(int id, String tcno, String password, String type, String name) {
		super(id, tcno, password, type, name);
		// TODO Auto-generated constructor stub
	}
	
	public Ogrenci() {}

}
