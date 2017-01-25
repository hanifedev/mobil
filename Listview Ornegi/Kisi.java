package tr.com.hanifekurnaz.customlistview;

/**
 * Created by Hanf on 9.12.2016.
 */

public class Kisi {
    private String isim; // Nesne degiskeni
    private boolean kadinMi;
    public Kisi(String isim, boolean kadinMi)
    {
        this.isim=isim;
        this.kadinMi=kadinMi;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public boolean isKadinMi() {
        return kadinMi;
    }
    public void setKadinMi(boolean kadinMi) {
        this.kadinMi = kadinMi;
    }
}
