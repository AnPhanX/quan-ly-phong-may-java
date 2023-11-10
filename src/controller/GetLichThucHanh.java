/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import model.LichThucHanh;
import model.LopHoc;

/**
 *
 * @author LTC
 */
public class GetLichThucHanh extends LichThucHanh{
    public GetLichThucHanh() {
        super();
    }
    public GetLichThucHanh(String maLop)
    {
        super();
        try 
        {
            FileInputStream fin= new FileInputStream("./data/LichThucHanh.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    LichThucHanh a=(LichThucHanh)obin.readObject();
                    if(a.getLopThucHanh().getMaLopHoc().equals(maLop))
                    {
                        this.setMaLichThucHanh(a.getMaLichThucHanh());
                        this.setLopThucHanh(a.getLopThucHanh());
                        this.setPhongThucHanh(a.getPhongThucHanh());
                        this.setCaThucHanh(a.getCaThucHanh());
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
    public GetLichThucHanh(ArrayList<LichThucHanh> listLichThucHanh)
    {
        super();
        try 
        {
            FileInputStream fin= new FileInputStream("./data/LichThucHanh.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    LichThucHanh a=(LichThucHanh)obin.readObject();
                    listLichThucHanh.add(a);
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
