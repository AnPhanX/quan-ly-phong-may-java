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

/**
 *
 * @author LTC
 */
public class DeleteLichThucHanh {
    public DeleteLichThucHanh(){};
    public void DeleteLichThucHanh_MaLichThucHanh(String MaLichThucHanh)
    {
        FileInputStream fin=null;
        ObjectInputStream obin= null;
        ArrayList<LichThucHanh> list= new ArrayList<LichThucHanh>();
        try
        {
            fin= new FileInputStream("./data/LichThucHanh.dat");
            obin= new ObjectInputStream(fin);
            while(true)
            {
                try
                {
                    LichThucHanh a= (LichThucHanh)obin.readObject();
                    if(!a.getMaLichThucHanh().equals(MaLichThucHanh))
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
            FileOutputStream fout= new FileOutputStream("./data/LichThucHanh.dat");
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
    
    public void DeleteLichThucHanh_MaLop(String MaLop)
    {
        FileInputStream fin=null;
        ObjectInputStream obin= null;
        ArrayList<LichThucHanh> list= new ArrayList<LichThucHanh>();
        try
        {
            fin= new FileInputStream("./data/LichThucHanh.dat");
            obin= new ObjectInputStream(fin);
            while(true)
            {
                try
                {
                    LichThucHanh a= (LichThucHanh)obin.readObject();
                    if(!a.getLopThucHanh().getMaLopHoc().equals(MaLop))
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
            FileOutputStream fout= new FileOutputStream("./data/LichThucHanh.dat");
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
