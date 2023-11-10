/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.*;
import view.giaovien.ThongTin;

/**
 *
 * @author LTC
 */
public class ThongTinNguoiDungController extends MouseAdapter {
    
    private ThongTin thongTinGiaoVien;

    public ThongTinNguoiDungController(ThongTin thongTinGiaoVien) {
        this.thongTinGiaoVien = thongTinGiaoVien;
    }

    
    
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
       if(e.getSource()==thongTinGiaoVien.getjButton_Sua())
       {
           thongTinGiaoVien.button_Sua();
       }
       else if(e.getSource()==thongTinGiaoVien.getjButton_Luu())
       {
           thongTinGiaoVien.button_Luu();
       }
       else if(e.getSource()==thongTinGiaoVien.getjButton_Huy())
       {
           thongTinGiaoVien.button_Huy();
       }
       else if(e.getSource()==thongTinGiaoVien.getjButtonLogout())
       {
           thongTinGiaoVien.button_Logout();
       }
    }
}
