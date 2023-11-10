/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import java.util.ArrayList;
import model.LichThucHanh;
import model.LopHoc;
import model.PhongMay;
/**
 *
 * @author Dell
 */
public class InsertLichThucHanh {
    public InsertLichThucHanh(){}
    
    public InsertLichThucHanh(LichThucHanh a)
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
                    list.add((LichThucHanh)obin.readObject());
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
        
        a.setMaLichThucHanh(String.valueOf(list.size()+1));
        list.add(a);
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
    
    public InsertLichThucHanh(ArrayList<LichThucHanh> listLichThucHanh)
    {
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/LichThucHanh.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<listLichThucHanh.size();i++)
            {
                obout.writeObject(listLichThucHanh.get(i));
            }

            obout.close();
            fout.close();
        } 
        catch (IOException e) 
        {

        }
    }
    
}
