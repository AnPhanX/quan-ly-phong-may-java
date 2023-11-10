/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.sinhvien;

import controller.GetLichThucHanh;
import controller.GetLopHoc;
import controller.sinhvien.SinhVienViewController;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.LichThucHanh;
import model.LopHoc;
import view.DangNhap;

/**
 *
 * @author LTC
 */
public class TimKiemPhongMay extends JPanel{

    private JTextField jTextField_TimKiem;
    private JFrame jFrame;
    private JPanel jPanelXemLich;
    
    public TimKiemPhongMay(JFrame jFrame) 
    {
        this.jFrame= jFrame;
        this.setLayout(new GridLayout(10, 1, 0 , 5));
        this.setBorder(new EmptyBorder(10, 30, 0, 30));
        
        Font font= new Font("Arial", Font.BOLD, 14);
        
        //Tìm kiếm
        JPanel jPanel_TimKiem = new JPanel();
        jPanel_TimKiem.setLayout(new GridLayout(1, 5));
        JLabel jLabel_TimKiem =  new JLabel("Nhập mã lớp cần tìm");
        jTextField_TimKiem= new JTextField(50);
        JButton jButton_TimKiem= new JButton("Tìm");
        
        jPanel_TimKiem.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel_TimKiem.add(new JLabel());
        jPanel_TimKiem.add(jLabel_TimKiem);
        jPanel_TimKiem.add(jTextField_TimKiem);
        jPanel_TimKiem.add(new JLabel());
        jPanel_TimKiem.add(jButton_TimKiem);
        
        this.add(jPanel_TimKiem);
        
        SinhVienViewController msc= new SinhVienViewController(this);
        jButton_TimKiem.addMouseListener(msc);
        
        //Table header
        JPanel jPanelXemLich__header= new JPanel();
        Border blueline= BorderFactory.createLineBorder(Color.blue);
        jPanelXemLich__header.setLayout(new GridLayout(1, 4));
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
        
        jPanelXemLich__header.add(jLabelXemLich__header_MaLop);
        jPanelXemLich__header.add(jLabelXemLich__header_TenLop);
        jPanelXemLich__header.add(jLabelXemLich__header_PhongTH);
        jPanelXemLich__header.add(jLabelXemLich__header_CaTH);
        
        this.add(jPanelXemLich__header);
        
        jPanelXemLich= new JPanel();
        jPanelXemLich.setLayout(new GridLayout(1, 4));
        
        this.add(jPanelXemLich);
        
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        
        JPanel jPanelButtonDangNhap= new JPanel();
        jPanelButtonDangNhap.setBorder(new EmptyBorder(10, 0, 10, 10));
        JButton jButtonDangNhap= new JButton("Quay lại đăng nhập");
        jButtonDangNhap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButtonDangNhap.setFocusPainted(false);
        jButtonDangNhap.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e)
            {
                jFrame.setVisible(false);
                new DangNhap().setVisible(true);
            }
        });
        jPanelButtonDangNhap.add(jButtonDangNhap);
        this.add(jPanelButtonDangNhap);
        
        
    }
    
    
    public void getTimKiem()
    {
        String textSearch= jTextField_TimKiem.getText();
        LopHoc result= new GetLopHoc(textSearch);
        if(result.getMaLopHoc().equals(""))
        {
            JOptionPane.showMessageDialog(this.jFrame, "Không tìm thấy lớp học có mã: "+textSearch);
        }
        else
        {
            LichThucHanh lichThucHanh= new GetLichThucHanh(textSearch);
            if(lichThucHanh.getMaLichThucHanh().equals(""))
            {
                JOptionPane.showMessageDialog(this.jFrame, "Không tìm thấy lịch thực hành cho lớp học có mã: "+textSearch);
            }
            else
            {        
                Font font= new Font("Arial", Font.BOLD, 14);
                jPanelXemLich.removeAll();
                Border blueline= BorderFactory.createLineBorder(Color.blue);
                JLabel jLabelXemLich_MaLop= new JLabel(lichThucHanh.getLopThucHanh().getMaLopHoc(), JLabel.CENTER);
                jLabelXemLich_MaLop.setFont(font);
                jLabelXemLich_MaLop.setBorder(blueline);
                JLabel jLabelXemLich_TenLop= new JLabel(lichThucHanh.getLopThucHanh().getTenLopHoc(), JLabel.CENTER);
                jLabelXemLich_TenLop.setFont(font);
                jLabelXemLich_TenLop.setBorder(blueline);
                JLabel jLabelXemLich_PhongTH= new JLabel(lichThucHanh.getPhongThucHanh().getMaPhongMay(), JLabel.CENTER);
                jLabelXemLich_PhongTH.setFont(font);
                jLabelXemLich_PhongTH.setBorder(blueline);
                JLabel jLabelXemLich_CaTH= new JLabel(lichThucHanh.getCaThucHanh(), JLabel.CENTER);
                jLabelXemLich_CaTH.setFont(font);
                jLabelXemLich_CaTH.setBorder(blueline);

                jPanelXemLich.add(jLabelXemLich_MaLop);
                jPanelXemLich.add(jLabelXemLich_TenLop);
                jPanelXemLich.add(jLabelXemLich_PhongTH);
                jPanelXemLich.add(jLabelXemLich_CaTH);
                
                jPanelXemLich.repaint();
                jPanelXemLich.revalidate();

            }
        }
    }
}
