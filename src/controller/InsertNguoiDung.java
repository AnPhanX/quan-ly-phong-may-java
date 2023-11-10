/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.io.*;
import model.NguoiDung;
import java.util.*;
import model.LopHoc;
import model.TaiKhoan;
/**
 *
 * @author LTC
 */
public class InsertNguoiDung {
    public InsertNguoiDung(){}
    public InsertNguoiDung(ArrayList<NguoiDung> listND)
    {
         try 
        {
            FileOutputStream fout= new FileOutputStream("./data/NguoiDung.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<listND.size();i++)
            {
                obout.writeObject(listND.get(i));
            }

            obout.close();
            fout.close();
        } catch (Exception e) {
        }
    }
    public InsertNguoiDung(NguoiDung nguoiDung)
    {
        FileInputStream fin= null;
        ObjectInputStream obin= null;
        try {
            fin= new FileInputStream("./data/NguoiDung.dat");
            obin= new ObjectInputStream(fin);
        } catch (Exception e) {
            try {
                FileOutputStream fout=new FileOutputStream("./data/NguoiDung.dat");
            } catch (Exception ee) {
            }
        }
        ArrayList<NguoiDung> ListNguoiDung= new ArrayList<NguoiDung>();
        while(true)
        {
            try {
                ListNguoiDung.add((NguoiDung)obin.readObject());
            } catch (Exception e) {
                break;
            }
        }
        
        for(int i=0;i<ListNguoiDung.size();i++)
        {
            if(ListNguoiDung.get(i).getMaNguoiDung().equals(nguoiDung.getMaNguoiDung()))
            {
                return;
            }
        }
        
        ListNguoiDung.add(nguoiDung);
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/NguoiDung.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<ListNguoiDung.size();i++)
            {
                obout.writeObject(ListNguoiDung.get(i));
            }

            fin.close();
            obin.close();
            obout.close();
            fout.close();
        } catch (Exception e) {
        }
        new InsertTaiKhoan(new TaiKhoan(nguoiDung.getMaNguoiDung(), "12345678"));         
    }
}
