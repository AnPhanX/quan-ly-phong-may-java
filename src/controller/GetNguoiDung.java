/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import model.NguoiDung;
import java.util.*;
import model.LopHoc;

/**
 *
 * @author LTC
 */
public class GetNguoiDung extends NguoiDung{
    
    public GetNguoiDung()
    {
        
    }
    
    public GetNguoiDung(String MaNguoiDung)
    {
        this.setChucVu("");
        this.setMaNguoiDung("");
        this.setHoTen("");
        this.setSDT("");
        try 
        {
            FileInputStream fin= new FileInputStream("./data/NguoiDung.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    NguoiDung a=(NguoiDung)obin.readObject();
                    if(a.getMaNguoiDung().equals(MaNguoiDung))
                    {
                        this.setChucVu(a.getChucVu());
                        this.setMaNguoiDung(a.getMaNguoiDung());
                        this.setHoTen(a.getHoTen());
                        this.setSDT(a.getSDT());
                        break;
                    }
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
    public GetNguoiDung(ArrayList<NguoiDung> listND)
    {
        try 
        {
            FileInputStream fin= new FileInputStream("./data/NguoiDung.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    NguoiDung a=(NguoiDung)obin.readObject();
                    listND.add(a);
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
