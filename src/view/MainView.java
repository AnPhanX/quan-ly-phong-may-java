/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.AccountLogin;
import model.TaiKhoan;
import view.giaovien.GiaoVienView;
import view.nhanvien.AdminFrm;

/**
 *
 * @author LTC
 */
public class MainView {
    
    public static void main(String args[]) throws Exception {
        TaiKhoan taiKhoan= new AccountLogin();
        if(taiKhoan.getTenDangNhap().equals(""))
        {
            new DangNhap().setVisible(true);
        }
        else
        {
            if(taiKhoan.getTenDangNhap().equals("admin"))
            {
                new AdminFrm();
            }
            else
            {
                new GiaoVienView(taiKhoan.getTenDangNhap());
            }
        }
    }
}
