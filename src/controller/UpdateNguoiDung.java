/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.*;
import java.util.ArrayList;
import model.NguoiDung;

/**
 *
 * @author LTC
 */
public class UpdateNguoiDung {
    public UpdateNguoiDung(NguoiDung nguoiDung)
    {
        FileInputStream fin= null;
        ObjectInputStream obin= null;
        try {
            fin= new FileInputStream("./data/NguoiDung.dat");
            obin= new ObjectInputStream(fin);
        } 
        catch (FileNotFoundException e) {
        } 
        catch (IOException ex) {
            
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
                ListNguoiDung.set(i, nguoiDung);
            }
        }
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
    }
}
