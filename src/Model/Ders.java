
package Model;

import Helper.*;

public class Ders {
    
    private int id;
	String name;
        float credits;
        DBConnection conn = new DBConnection();
	
	public Ders(int id, String name, float credits) {
		super();
		this.id = id;
		this.name = name;
                this.credits = credits;
	}
        
        public Ders(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public DBConnection getConn() {
        return conn;
    }

    public void setConn(DBConnection conn) {
        this.conn = conn;
    }
        
        
        
    
}
