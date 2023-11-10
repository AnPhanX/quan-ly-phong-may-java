/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import model.PhongMay;

/**
 *
 * @author phan xuan an
 */
public class GetPhongMay extends PhongMay {
    public GetPhongMay(){
        
    }
    
    public GetPhongMay(String mapm){
        this.setMaPhongMay(""); 
        try 
        {
            FileInputStream fin= new FileInputStream("./data/PhongMay.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    PhongMay a=(PhongMay)obin.readObject();
                    if(a.getMaPhongMay().equals(mapm))
                    {
                        this.setMaPhongMay(a.getMaPhongMay());
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
    public GetPhongMay(ArrayList<PhongMay> listPM)
    {
        try 
        {
            FileInputStream fin= new FileInputStream("./data/PhongMay.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            
            while(true)
            {
                try
                {
                    PhongMay a=(PhongMay)obin.readObject();
                    listPM.add(a);
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
