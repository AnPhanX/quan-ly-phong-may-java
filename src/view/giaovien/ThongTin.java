/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.giaovien;

import controller.AccountLogin;
import controller.GetNguoiDung;
import controller.ThongTinNguoiDungController;
import controller.UpdateNguoiDung;
import java.awt.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import model.NguoiDung;

/**
 *
 * @author LTC
 */
public class ThongTin extends JPanel{

    private GiaoVienView giaoVienView;
    
    private JTextField jTextField_MaGV;
    private JTextField jTextField_HoTen;
    private JTextField jTextField_SDT;
    private JTextField jTextField_ChucVu;
    private JButton jButton_Sua;
    private JButton jButton_Luu;
    private JButton jButton_Huy;
    private String Backup_MaGV;
    private String Backup_HoTen;
    private String Backup_SDT;
    private String Backup_ChucVu;
    private JPanel jPanel_Button;
    private JButton jButtonLogout;

    public JButton getjButtonLogout() {
        return jButtonLogout;
    }

    public void setjButtonLogout(JButton jButtonLogout) {
        this.jButtonLogout = jButtonLogout;
    }
    
    private NguoiDung nguoiDung;
    private String MaNguoiDung;
    

    public JTextField getjTextField_MaGV() {
        return jTextField_MaGV;
    }

    public JButton getjButton_Sua() {
        return jButton_Sua;
    }

    public JButton getjButton_Luu() {
        return jButton_Luu;
    }

    public JButton getjButton_Huy() {
        return jButton_Huy;
    }

    public JTextField getjTextField_HoTen() {
        return jTextField_HoTen;
    }

    public JTextField getjTextField_SDT() {
        return jTextField_SDT;
    }

    public JTextField getjTextField_ChucVu() {
        return jTextField_ChucVu;
    }
    
    public ThongTin(GiaoVienView giaoVienView, String MaNguoiDung) throws Exception
    {
        this.giaoVienView= giaoVienView;
        this.MaNguoiDung=MaNguoiDung;
        nguoiDung= new GetNguoiDung(MaNguoiDung);
        this.setSize(800, 300);
        this.setLayout(new GridLayout(10, 2, 10, 10));
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel jLabel_MaGV= new JLabel ("Mã người dùng");
        this.jTextField_MaGV= new JTextField(50);
        this.jTextField_MaGV.setText(nguoiDung.getMaNguoiDung());
        this.jTextField_MaGV.setEditable(false);
        this.add(jLabel_MaGV);
        this.add(jTextField_MaGV);
        
        JLabel jLabel_HoTen= new JLabel ("Họ tên người dùng");
        this.jTextField_HoTen= new JTextField(50);
        this.jTextField_HoTen.setText(nguoiDung.getHoTen());
        this.jTextField_HoTen.setEditable(false);
        this.add(jLabel_HoTen);
        this.add(jTextField_HoTen);
        
        JLabel jLabel_SDT= new JLabel ("SDT người dùng");
        this.jTextField_SDT= new JTextField(50);
        this.jTextField_SDT.setText(nguoiDung.getSDT());
        this.jTextField_SDT.setEditable(false);
        this.add(jLabel_SDT);
        this.add(jTextField_SDT);
        
        JLabel jLabel_ChucVu= new JLabel ("Chức vụ");
        this.jTextField_ChucVu= new JTextField(50);
        this.jTextField_ChucVu.setText(nguoiDung.getChucVu());
        this.jTextField_ChucVu.setEditable(false);
        this.add(jLabel_ChucVu);
        this.add(jTextField_ChucVu);
        
        
        
        
        ThongTinNguoiDungController mac= new ThongTinNguoiDungController(this); 
        jPanel_Button= new JPanel();
        jPanel_Button.setLayout(new GridLayout(1, 3, 5, 5));
        jButton_Sua= new JButton("Sửa");
        jButton_Sua.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_Sua.setFocusPainted(false);
        jButton_Sua.addMouseListener(mac);
        jButton_Luu= new JButton("Lưu");
        jButton_Luu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_Luu.setFocusPainted(false);
        jButton_Luu.addMouseListener(mac);
        jButton_Huy= new JButton("Hủy");
        jButton_Huy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_Huy.setFocusPainted(false);
        jButton_Huy.addMouseListener(mac);
        jPanel_Button.add(jButton_Sua);
        jPanel_Button.add(jButton_Luu);
        jPanel_Button.add(jButton_Huy);
        this.add(jPanel_Button);
        
        
        JPanel jPanelButtonLogout= new JPanel();
        jPanelButtonLogout.setBorder(new EmptyBorder(0, 50, 0 , 0));
        jButtonLogout= new JButton("Đăng xuất");
        jButtonLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButtonLogout.setFocusPainted(false);
        jButtonLogout.addMouseListener(mac);
        jPanelButtonLogout.add(jButtonLogout);
        this.add(jPanelButtonLogout);
        
        Backup_MaGV=jTextField_MaGV.getText();
        Backup_HoTen=jTextField_HoTen.getText();
        Backup_SDT=jTextField_SDT.getText();
        Backup_ChucVu=jTextField_ChucVu.getText();
    }
    public void button_Logout()
    {
        new AccountLogin().setAccountLogout();
        this.giaoVienView.setVisible(false);
        new view.DangNhap().setVisible(true);
    }
    public void button_Sua()
    {
        Backup_HoTen=jTextField_HoTen.getText();
        Backup_SDT=jTextField_SDT.getText();
        
        jTextField_HoTen.setEditable(true);
        jTextField_SDT.setEditable(true);
    }
    public void button_Luu()
    {
        Backup_HoTen=jTextField_HoTen.getText();
        Backup_SDT=jTextField_SDT.getText();
        
        jTextField_HoTen.setEditable(false);
        jTextField_SDT.setEditable(false);
        
        if(!nguoiDung.getMaNguoiDung().equals(""))
        {
            new UpdateNguoiDung(new NguoiDung(MaNguoiDung,jTextField_HoTen.getText(), jTextField_SDT.getText(), jTextField_ChucVu.getText()));
        }
    }
    public void button_Huy()
    {
        jTextField_MaGV.setText(Backup_MaGV);
        jTextField_HoTen.setText(Backup_HoTen);
        jTextField_SDT.setText(Backup_SDT);
        jTextField_ChucVu.setText(Backup_ChucVu);
        
        jTextField_MaGV.setEditable(false);
        jTextField_HoTen.setEditable(false);
        jTextField_SDT.setEditable(false);
        jTextField_ChucVu.setEditable(false);
    }
}
