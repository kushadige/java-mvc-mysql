
package Model;

public class Sinav {
    
    private String sinav_adi;
    private int soru_sayisi;
    private String tarih;

    public Sinav(String sinav_adi, int soru_sayisi, String tarih) {
        this.sinav_adi = sinav_adi;
        this.soru_sayisi = soru_sayisi;
        this.tarih = tarih;
    }
    
    
    public String getSinav_adi() {
        return sinav_adi;
    }

    public void setSinav_adi(String sinav_adi) {
        this.sinav_adi = sinav_adi;
    }

    public int getSoru_sayisi() {
        return soru_sayisi;
    }

    public void setSoru_sayisi(int soru_sayisi) {
        this.soru_sayisi = soru_sayisi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
    
    
}
