/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.NguoiDung;
import model.TaiKhoan;

/**
 *
 * @author LTC
 */
public class InsertTaiKhoan {
    public InsertTaiKhoan(){}
    public InsertTaiKhoan(TaiKhoan taiKhoan)
    {
        FileInputStream fin= null;
        ObjectInputStream obin= null;
        try {
            fin= new FileInputStream("./data/TaiKhoan.dat");
            obin= new ObjectInputStream(fin);
        } catch (Exception e) {
            try {
                FileOutputStream fout=new FileOutputStream("./data/TaiKhoan.dat");
            } catch (Exception ee) {
            }
        }
        ArrayList<TaiKhoan> ListTaiKhoan= new ArrayList<TaiKhoan>();
        while(true)
        {
            try {
                ListTaiKhoan.add((TaiKhoan)obin.readObject());
            } catch (Exception e) {
                break;
            }
        }
        
        for(int i=0;i<ListTaiKhoan.size();i++)
        {
            if(ListTaiKhoan.get(i).getTenDangNhap().equals(taiKhoan.getTenDangNhap()))
            {
                return;
            }
        }
        
        ListTaiKhoan.add(taiKhoan);
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/TaiKhoan.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<ListTaiKhoan.size();i++)
            {
                obout.writeObject(ListTaiKhoan.get(i));
            }

            fin.close();
            obin.close();
            obout.close();
            fout.close();
        } catch (Exception e) {
        }
        
        
    }
    
    public InsertTaiKhoan(ArrayList<TaiKhoan> listTaiKhoan)
    {
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/TaiKhoan.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<listTaiKhoan.size();i++)
            {
                obout.writeObject(listTaiKhoan.get(i));
            }

            obout.close();
            fout.close();
        } catch (Exception e) {
        }
    }
}
