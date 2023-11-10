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
import model.LopHoc;
import model.PhongMay;

/**
 *
 * @author phan xuan an
 */
public class InsertPhongMay {
    public InsertPhongMay(){
        
    }
    public InsertPhongMay(PhongMay pm)
    {
        FileInputStream fin= null;
        ObjectInputStream obin= null;
        try {
            fin= new FileInputStream("./data/PhongMay.dat");
            obin= new ObjectInputStream(fin);
        } catch (Exception e) {
            try {
                FileOutputStream fout=new FileOutputStream("./data/PhongMay.dat");
            } catch (Exception ee) {
            }
        }
        ArrayList<PhongMay> ListPhongMay= new ArrayList<PhongMay>();
        while(true)
        {
            try {
                ListPhongMay.add((PhongMay)obin.readObject());
            } catch (Exception e) {
                break;
            }
        }
        
        for(int i=0;i<ListPhongMay.size();i++)
        {
            if(ListPhongMay.get(i).getMaPhongMay().equals(pm.getMaPhongMay()))
            {
                return;
            }
        }
        
        ListPhongMay.add(pm);
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/PhongMay.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<ListPhongMay.size();i++)
            {
                obout.writeObject(ListPhongMay.get(i));
            }

            fin.close();
            obin.close();
            obout.close();
            fout.close();
        } catch (Exception e) {
        }
    }
    
    public InsertPhongMay(ArrayList<PhongMay> listPhongMay)
    {
         try 
        {
            FileOutputStream fout= new FileOutputStream("./data/PhongMay.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<listPhongMay.size();i++)
            {
                obout.writeObject(listPhongMay.get(i));
            }

            obout.close();
            fout.close();
        } catch (IOException e) {
        }
    }
}
