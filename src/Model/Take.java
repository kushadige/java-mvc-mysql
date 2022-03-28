
package Model;

public class Take {
    private String ogrenci_tc;
    private String ders_adi;

    public Take(String ogrenci_tc, String ders_adi) {
        this.ogrenci_tc = ogrenci_tc;
        this.ders_adi = ders_adi;
    }

    public String getOgrenci_tc() {
        return ogrenci_tc;
    }

    public void setOgrenci_tc(String ogrenci_tc) {
        this.ogrenci_tc = ogrenci_tc;
    }

    public String getDers_adi() {
        return ders_adi;
    }

    public void setDers_adi(String ders_adi) {
        this.ders_adi = ders_adi;
    }
    
    
}
