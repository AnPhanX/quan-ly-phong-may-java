/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.LichThucHanh;
import model.TaiKhoan;

/**
 *
 * @author LTC
 */
public class DeleteTaiKhoan {
    public DeleteTaiKhoan(){}
    public DeleteTaiKhoan(String TenDangNhap)
    {
        
        FileInputStream fin=null;
        ObjectInputStream obin= null;
        ArrayList<TaiKhoan> list= new ArrayList<TaiKhoan>();
        try
        {
            fin= new FileInputStream("./data/TaiKhoan.dat");
            obin= new ObjectInputStream(fin);
            while(true)
            {
                try
                {
                    TaiKhoan a= (TaiKhoan)obin.readObject();
                    if(!a.getTenDangNhap().equals(TenDangNhap))
                    {
                        list.add(a);
                    }
                    
                }
                catch (Exception e) 
                {
                        break;
                }
            }
        }
        catch(Exception e)
        {
        }
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/TaiKhoan.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<list.size();i++)
            {
                obout.writeObject(list.get(i));
            }

            obout.close();
            fout.close();
        } 
        catch (IOException e) 
        {

        }
    }
}
