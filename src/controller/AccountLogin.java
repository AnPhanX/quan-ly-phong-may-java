

package controller;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.LopHoc;
import model.TaiKhoan;

public class AccountLogin extends TaiKhoan {
    public AccountLogin()
    {
        this.setMatKhau("");
        this.setTenDangNhap("");
        try 
        {
            FileInputStream fin= new FileInputStream("./data/TaiKhoanLogin.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            TaiKhoan a= (TaiKhoan)obin.readObject();
            this.setMatKhau(a.getMatKhau());
            this.setTenDangNhap(a.getTenDangNhap());
            obin.close();
            fin.close();
        } catch (Exception e) {
        }
    }
    
    public void setAccountLogin(TaiKhoan taiKhoan)
    {
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/TaiKhoanLogin.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);
            obout.writeObject(taiKhoan);
            
            obout.close();
            fout.close();
        } catch (Exception e) {
        }
        
    }
    
    public void setAccountLogout()
    {
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/TaiKhoanLogin.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);
        } catch (Exception e) {
        }
    }
}
