/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.giaovien;
import controller.giaovien.GiaoVienViewController;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import view.initView;

/**
 *
 * @author LTC
 */
public class GiaoVienView extends JFrame{
    
    private JTabbedPane jTabbedPane_TrangChu;
    private String MaGiaoVien;
    public void addTab(String MaGiaoVien) throws Exception
    {
        jTabbedPane_TrangChu.add("Đăng kí phòng máy", new DangKiPhongMay(this, MaGiaoVien));
        jTabbedPane_TrangChu.add("Xem lịch thực hành", new XemLich(this, MaGiaoVien));
        jTabbedPane_TrangChu.add("Thông tin", new ThongTin(this, MaGiaoVien));
    }
    
    public void refresh() throws Exception
    {
        jTabbedPane_TrangChu.removeAll();
        addTab(MaGiaoVien);
        jTabbedPane_TrangChu.revalidate();
        jTabbedPane_TrangChu.repaint();
        
    }
    
    
    public GiaoVienView(String MaGiaoVien) throws Exception
    {
        this.MaGiaoVien= MaGiaoVien;
        new initView(this);
        Font font= new Font("Calibri", Font.BOLD, 20);
        JLabel jLabel= new JLabel("Quản Lí Hệ Thống Phòng Máy Khoa Công Nghệ Thông Tin",JLabel.CENTER);
        jLabel.setFont(font);   
        jLabel.setForeground(Color.red);
        //Padding 
        jLabel.setBorder(new EmptyBorder(10, 0, 0, 0));
        this.add(jLabel, BorderLayout.NORTH);
        
        jTabbedPane_TrangChu= new JTabbedPane();
        this.addTab(MaGiaoVien);
        this.add(jTabbedPane_TrangChu,BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
   
}
