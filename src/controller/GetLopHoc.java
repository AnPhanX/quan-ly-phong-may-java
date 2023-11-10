/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import model.LopHoc;
import model.NguoiDung;

/**
 *
 * @author LTC
 */
public class GetLopHoc extends LopHoc {

    public GetLopHoc() {
    }
    public GetLopHoc(String MaLop)
    {
        this.setMaLopHoc("");
        this.setMaGiaoVien("");
        this.setTenLopHoc("");
        try 
        {
            FileInputStream fin= new FileInputStream("./data/LopHoc.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    LopHoc a=(LopHoc)obin.readObject();
                    if(a.getMaLopHoc().equals(MaLop))
                    {
                        
                        this.setMaLopHoc(a.getMaLopHoc());
                        this.setMaGiaoVien(a.getMaGiaoVien());
                        this.setTenLopHoc(a.getTenLopHoc());
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
    public GetLopHoc(ArrayList<LopHoc> listLopHoc)
    {
        try 
        {
            FileInputStream fin= new FileInputStream("./data/LopHoc.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    LopHoc a=(LopHoc)obin.readObject();
                    listLopHoc.add(a);
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
