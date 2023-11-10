
package view.sinhvien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import view.DangNhap;
import view.giaovien.ThongTin;
import view.giaovien.DangKiPhongMay;
import view.giaovien.XemLich;
import view.initView;

/**
 *
 * @author LTC
 */
public class SinhVienView extends JFrame {
     private JTabbedPane jTabbedPane_TrangChu;
    
    public void addTab() throws Exception
    {
        jTabbedPane_TrangChu.add("Tìm kiếm phòng máy", new TimKiemPhongMay(this));
    }
    
    public SinhVienView() throws Exception
    {
        
        new initView(this);
        
        Font font= new Font("Calibri", Font.BOLD, 20);
        JLabel jLabel= new JLabel("Hệ Thống Phòng Máy Khoa Công Nghệ Thông Tin",JLabel.CENTER);
        jLabel.setFont(font);   
        jLabel.setForeground(Color.red);
        //Padding 
        jLabel.setBorder(new EmptyBorder(10, 0, 0, 0));
        this.add(jLabel, BorderLayout.NORTH);
        
        this.setTitle("Phòng máy khoa CNTT");
        
        jTabbedPane_TrangChu= new JTabbedPane();
        this.addTab();
        this.add(jTabbedPane_TrangChu);        
        this.setVisible(true);
    }

}
