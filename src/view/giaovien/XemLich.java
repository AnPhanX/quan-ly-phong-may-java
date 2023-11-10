/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this.jPanel_xemLich license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this.jPanel_xemLich template
 */
package view.giaovien;

import controller.giaovien.GetLichThucHanhGiaoVien;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author LTC
 */
public class XemLich extends JScrollPane{
    private JPanel jPanel_xemLich;
    private GiaoVienView giaoVienView;
    private String MaGiaoVien;
    public XemLich(){};
    public XemLich(GiaoVienView giaoVienView, String MaGiaoVien)
    {
        this.giaoVienView= giaoVienView;
        this.MaGiaoVien= MaGiaoVien;
        
        jPanel_xemLich= new JPanel();
        jPanel_xemLich.setLayout(new GridLayout(10, 1));
        jPanel_xemLich.setBorder(new EmptyBorder(20, 20, 0, 20));
        
       
        JLabel xemLich_title= new JLabel("Lịch thực hành các lớp do bạn giảng dạy", JLabel.CENTER);
        xemLich_title.setBorder(new EmptyBorder(0, 0, 20, 0));
        xemLich_title.setFont(new Font("Arial", Font.BOLD, 25));
        jPanel_xemLich.add(xemLich_title);
        
        Font font= new Font("Arial", Font.BOLD, 14);
        JPanel jPanelXemLich__header= new JPanel();
        Border blueline= BorderFactory.createLineBorder(Color.blue);
        jPanelXemLich__header.setLayout(new GridLayout(1, 5));
        JLabel jLabelXemLich__header_MaLop= new JLabel("Mã lớp", JLabel.CENTER);
        jLabelXemLich__header_MaLop.setFont(font);
        jLabelXemLich__header_MaLop.setBorder(blueline);
        JLabel jLabelXemLich__header_TenLop= new JLabel("Tên lớp", JLabel.CENTER);
        jLabelXemLich__header_TenLop.setFont(font);
        jLabelXemLich__header_TenLop.setBorder(blueline);
        JLabel jLabelXemLich__header_PhongTH= new JLabel("Phòng thực hành", JLabel.CENTER);
        jLabelXemLich__header_PhongTH.setFont(font);
        jLabelXemLich__header_PhongTH.setBorder(blueline);
        JLabel jLabelXemLich__header_CaTH= new JLabel("Ca thực hành", JLabel.CENTER);
        jLabelXemLich__header_CaTH.setFont(font);
        jLabelXemLich__header_CaTH.setBorder(blueline);
        JLabel jLabelXemLich__header_Huy= new JLabel("Hủy thực hành", JLabel.CENTER);
        jLabelXemLich__header_Huy.setFont(font);
        jLabelXemLich__header_Huy.setBorder(blueline);
        
        
        jPanelXemLich__header.add(jLabelXemLich__header_MaLop);
        jPanelXemLich__header.add(jLabelXemLich__header_TenLop);
        jPanelXemLich__header.add(jLabelXemLich__header_PhongTH);
        jPanelXemLich__header.add(jLabelXemLich__header_CaTH);
        jPanelXemLich__header.add(jLabelXemLich__header_Huy);
        
        jPanel_xemLich.add(jPanelXemLich__header);
        jPanel_xemLich.add(new GetLichThucHanhGiaoVien(this, MaGiaoVien));
        
        this.setViewportView(jPanel_xemLich);
    }
    
    public void refresh() throws Exception
    {
        jPanel_xemLich.removeAll();
        
        JLabel xemLich_title= new JLabel("Lịch thực hành các lớp do bạn giảng dạy", JLabel.CENTER);
        xemLich_title.setBorder(new EmptyBorder(0, 0, 20, 0));
        xemLich_title.setFont(new Font("Arial", Font.BOLD, 25));
        jPanel_xemLich.add(xemLich_title);
        
        Font font= new Font("Arial", Font.BOLD, 14);
        JPanel jPanelXemLich__header= new JPanel();
        Border blueline= BorderFactory.createLineBorder(Color.blue);
        jPanelXemLich__header.setLayout(new GridLayout(1, 5));
        JLabel jLabelXemLich__header_MaLop= new JLabel("Mã lớp", JLabel.CENTER);
        jLabelXemLich__header_MaLop.setFont(font);
        jLabelXemLich__header_MaLop.setBorder(blueline);
        JLabel jLabelXemLich__header_TenLop= new JLabel("Tên lớp", JLabel.CENTER);
        jLabelXemLich__header_TenLop.setFont(font);
        jLabelXemLich__header_TenLop.setBorder(blueline);
        JLabel jLabelXemLich__header_PhongTH= new JLabel("Phòng thực hành", JLabel.CENTER);
        jLabelXemLich__header_PhongTH.setFont(font);
        jLabelXemLich__header_PhongTH.setBorder(blueline);
        JLabel jLabelXemLich__header_CaTH= new JLabel("Ca thực hành", JLabel.CENTER);
        jLabelXemLich__header_CaTH.setFont(font);
        jLabelXemLich__header_CaTH.setBorder(blueline);
        JLabel jLabelXemLich__header_Huy= new JLabel("Hủy thực hành", JLabel.CENTER);
        jLabelXemLich__header_Huy.setFont(font);
        jLabelXemLich__header_Huy.setBorder(blueline);
        
        
        jPanelXemLich__header.add(jLabelXemLich__header_MaLop);
        jPanelXemLich__header.add(jLabelXemLich__header_TenLop);
        jPanelXemLich__header.add(jLabelXemLich__header_PhongTH);
        jPanelXemLich__header.add(jLabelXemLich__header_CaTH);
        jPanelXemLich__header.add(jLabelXemLich__header_Huy);
        
        jPanel_xemLich.add(jPanelXemLich__header);
        jPanel_xemLich.add(new GetLichThucHanhGiaoVien(this, MaGiaoVien));
        
        jPanel_xemLich.repaint();
        jPanel_xemLich.revalidate();
        this.setViewportView(jPanel_xemLich);
    }
}
