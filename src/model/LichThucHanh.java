

package model;

import java.io.Serializable;

public class LichThucHanh implements Serializable{
    private String MaLichThucHanh;
    private LopHoc LopThucHanh;
    private PhongMay PhongThucHanh;
    private String CaThucHanh;

    public LichThucHanh() {
        MaLichThucHanh="";
        LopThucHanh= new LopHoc();
        PhongThucHanh= new PhongMay();
        CaThucHanh="";
    }

    public LichThucHanh(String MaLichThucHanh, LopHoc LopThucHanh, PhongMay PhongThucHanh,String CaThucHanh) {
        this.MaLichThucHanh = MaLichThucHanh;
        this.LopThucHanh = LopThucHanh;
        this.PhongThucHanh = PhongThucHanh;
      this.CaThucHanh=CaThucHanh;
    }
    public LichThucHanh( LopHoc LopThucHanh, PhongMay PhongThucHanh,String CaThucHanh) {
        this.LopThucHanh = LopThucHanh;
        this.PhongThucHanh = PhongThucHanh;
      this.CaThucHanh=CaThucHanh;
    }

    public String getMaLichThucHanh() {
        return MaLichThucHanh;
    }

    public void setMaLichThucHanh(String MaLichThucHanh) {
        this.MaLichThucHanh = MaLichThucHanh;
    }
     public String getCaThucHanh() {
        return CaThucHanh;
    }

    public void setCaThucHanh(String CaThucHanh) {
        this.CaThucHanh = CaThucHanh;
    }

    public LopHoc getLopThucHanh() {
        return LopThucHanh;
    }

    public void setLopThucHanh(LopHoc LopThucHanh) {
        this.LopThucHanh = LopThucHanh;
    }

    public PhongMay getPhongThucHanh() {
        return PhongThucHanh;
    }

    public void setPhongThucHanh(PhongMay PhongThucHanh) {
        this.PhongThucHanh = PhongThucHanh;
    }
    
    
}
