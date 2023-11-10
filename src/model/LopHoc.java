

package model;

import java.io.Serializable;

public class LopHoc implements Serializable {
    private String MaLopHoc;
    private String TenLopHoc;
    private String MaGiaoVien;
    public LopHoc() {
        MaLopHoc="";
        TenLopHoc="";
        MaGiaoVien="";
    }

    
    public LopHoc(String MaLopHoc, String TenLopHoc, String MaGiaoVien) {
        this.MaLopHoc = MaLopHoc;
        this.TenLopHoc = TenLopHoc;
        this.MaGiaoVien = MaGiaoVien;
    }

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String TenLopHoc) {
        this.TenLopHoc = TenLopHoc;
    }

    public String getMaGiaoVien() {
        return MaGiaoVien;
    }

    public void setMaGiaoVien(String MaGiaoVien) {
        this.MaGiaoVien = MaGiaoVien;
    }
    
    
    
}
