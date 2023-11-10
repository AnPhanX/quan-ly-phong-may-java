
package model;

import java.io.Serializable;

public class PhongMay implements Serializable{
    private String MaPhongMay;

    public PhongMay() {
        MaPhongMay="";
    }

    public PhongMay(String MaPhongMay) {
        this.MaPhongMay = MaPhongMay;
    }

    public String getMaPhongMay() {
        return MaPhongMay;
    }

    public void setMaPhongMay(String MaPhongMay) {
        this.MaPhongMay = MaPhongMay;
    }
    
}
