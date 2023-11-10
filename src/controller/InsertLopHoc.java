
package controller;

import java.io.*;
import java.util.ArrayList;
import model.LopHoc;
import model.NguoiDung;

public class InsertLopHoc {
    public InsertLopHoc()
    {
        
    }
    
    public InsertLopHoc(LopHoc lopHoc)
    {
        FileInputStream fin= null;
        ObjectInputStream obin= null;
        try {
            fin= new FileInputStream("./data/LopHoc.dat");
            obin= new ObjectInputStream(fin);
        } catch (Exception e) {
            try {
                FileOutputStream fout=new FileOutputStream("./data/LopHoc.dat");
            } catch (Exception ee) {
            }
        }
        ArrayList<LopHoc> ListLopHoc= new ArrayList<LopHoc>();
        while(true)
        {
            try {
                ListLopHoc.add((LopHoc)obin.readObject());
            } catch (Exception e) {
                break;
            }
        }
        
        for(int i=0;i<ListLopHoc.size();i++)
        {
            if(ListLopHoc.get(i).getMaLopHoc().equals(lopHoc.getMaLopHoc()))
            {
                return;
            }
        }
        
        ListLopHoc.add(lopHoc);
        try 
        {
            FileOutputStream fout= new FileOutputStream("./data/LopHoc.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<ListLopHoc.size();i++)
            {
                obout.writeObject(ListLopHoc.get(i));
            }

            fin.close();
            obin.close();
            obout.close();
            fout.close();
        } catch (Exception e) {
        }
        
    }
    
    public InsertLopHoc(ArrayList<LopHoc> listLopHoc)
    {
         try 
        {
            FileOutputStream fout= new FileOutputStream("./data/LopHoc.dat");
            ObjectOutputStream obout= new ObjectOutputStream(fout);

            for(int i=0;i<listLopHoc.size();i++)
            {
                obout.writeObject(listLopHoc.get(i));
            }

            obout.close();
            fout.close();
        } catch (Exception e) {
        }
    }
}
