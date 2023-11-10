/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import model.NguoiDung;
import model.TaiKhoan;

/**
 *
 * @author LTC
 */
public class GetTaiKhoan extends TaiKhoan {
    public GetTaiKhoan(){};
    public GetTaiKhoan(String TenDangNhap)
    {
        this.setTenDangNhap("");
        this.setMatKhau("");
        try 
        {
            FileInputStream fin= new FileInputStream("./data/TaiKhoan.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    TaiKhoan a=(TaiKhoan)obin.readObject();
                    if(a.getTenDangNhap().equals(TenDangNhap))
                    {
                        this.setTenDangNhap(TenDangNhap);
                        this.setMatKhau(a.getMatKhau());
                        break;
                    }
                }
                catch(Exception e)
                {
                    break;
                }
            }
            obin.close();
            fin.close();
        } 
        catch (Exception e) 
        {
        }
    }
    
    public GetTaiKhoan(ArrayList<TaiKhoan> listTaiKhoan)
    {
        try 
        {
            FileInputStream fin= new FileInputStream("./data/TaiKhoan.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    TaiKhoan a=(TaiKhoan)obin.readObject();
                    listTaiKhoan.add(a);
                }
                catch(Exception e)
                {
                    break;
                }
            }
        } 
        catch (Exception e) 
        {
        }
    }
}
