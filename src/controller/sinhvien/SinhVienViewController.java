/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.sinhvien;

import java.awt.event.*;
import view.sinhvien.TimKiemPhongMay;

/**
 *
 * @author LTC
 */
public class SinhVienViewController extends MouseAdapter{
    
    private TimKiemPhongMay timKiemPhongMay;
    
    public SinhVienViewController()
    {}
    
    public SinhVienViewController(TimKiemPhongMay timKiemPhongMay)
    {
        this.timKiemPhongMay= timKiemPhongMay;
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        timKiemPhongMay.getTimKiem();
    }
}
