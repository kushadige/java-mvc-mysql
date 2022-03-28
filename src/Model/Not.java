
package Model;

public class Not {
    
    private String sinav_adi;
    private int ogrenci_id;
    private int not;
    
    public Not(String sinav_adi, int ogrenci_id, int not){
        this.sinav_adi = sinav_adi;
        this.ogrenci_id = ogrenci_id;
        this.not = not;
    }
    
    public int getOgrenci_id() {
        return ogrenci_id;
    }

    public void setOgrenci_id(int ogrenci_id) {
        this.ogrenci_id = ogrenci_id;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public String getSinav_adi() {
        return sinav_adi;
    }

    public void setSinav_adi(String sinav_adi) {
        this.sinav_adi = sinav_adi;
    }
    
    
}
