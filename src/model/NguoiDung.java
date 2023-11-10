
package model;

import java.io.Serializable;


public class NguoiDung implements Serializable {
    private String MaNguoiDung;
    private String HoTen;
    private String SDT;
    private String ChucVu;

    public NguoiDung() {
    }

    public NguoiDung(String MaNguoiDung, String HoTen, String SDT, String ChucVu) {
        this.MaNguoiDung = MaNguoiDung;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.ChucVu = ChucVu;
    }

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
    
}
