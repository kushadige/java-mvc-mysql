
package Model;

public class Duyuru {
    private String hoca_adi;
    private String duyuru;
    
    public String getDuyuru() {
        return duyuru;
    }

    public void setDuyuru(String duyuru) {
        this.duyuru = duyuru;
    }

    public String getHoca_adi() {
        return hoca_adi;
    }

    public void setHoca_adi(String hoca_adi) {
        this.hoca_adi = hoca_adi;
    }

    public Duyuru(String hoca_adi, String duyuru) {
        this.hoca_adi = hoca_adi;
        this.duyuru = duyuru;
    }

    
}
