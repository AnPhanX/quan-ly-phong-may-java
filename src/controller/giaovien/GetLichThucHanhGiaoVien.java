/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.giaovien;

import controller.DeleteLichThucHanh;
import controller.GetLichThucHanh;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import model.LichThucHanh;
import model.LopHoc;
import view.giaovien.XemLich;

/**
 *
 * @author LTC
 */
public class GetLichThucHanhGiaoVien extends JPanel{
    
    public GetLichThucHanhGiaoVien(XemLich jPanelXemLich, String maGiaoVien)
    {
        ArrayList<LopHoc> listLopHoc= new ArrayList<LopHoc>();
        try {
            FileInputStream fin= new FileInputStream("./data/LopHoc.dat");
            ObjectInputStream obin= new ObjectInputStream(fin);
            while(true)
            {
                try {
                    LopHoc a= (LopHoc)obin.readObject();
                    if(a.getMaGiaoVien().equals(maGiaoVien))
                    {
                        listLopHoc.add(a);                        
                    }
                } catch (Exception e) {
                    break;
                }
            }
            obin.close();
            fin.close();
        } catch (Exception e) {
        }
        this.setLayout(new GridLayout(listLopHoc.size()+1, 1, 0, 0));
        ArrayList<LichThucHanh> listLichThucHanh= new ArrayList<LichThucHanh>();
        new GetLichThucHanh(listLichThucHanh);
        for(int i=0;i<listLopHoc.size();i++)
        {
            int check=0;
            for(int j=listLichThucHanh.size()-1;j>=0;j--)
            {
                LichThucHanh a= listLichThucHanh.get(j);
                if(listLichThucHanh.get(j).getLopThucHanh().getMaLopHoc().equals(listLopHoc.get(i).getMaLopHoc()))
                {
                    JPanel jPanel= new JPanel();
                    jPanel.setLayout(new GridLayout(1, 5));

                    Font font= new Font("Arial", Font.BOLD, 14);
                    Border blueline= BorderFactory.createLineBorder(Color.blue);
                    JTextField jLabelXemLich_MaLop= new JTextField(listLopHoc.get(i).getMaLopHoc());
                    jLabelXemLich_MaLop.setFont(font);
                    jLabelXemLich_MaLop.setHorizontalAlignment(JTextField.CENTER);
                    jLabelXemLich_MaLop.setEditable(false);
                    jLabelXemLich_MaLop.setBorder(blueline);
                    JTextField jLabelXemLich_TenLop= new JTextField(listLopHoc.get(i).getTenLopHoc());
                    jLabelXemLich_TenLop.setFont(font);
                    jLabelXemLich_TenLop.setHorizontalAlignment(JTextField.CENTER);
                    jLabelXemLich_TenLop.setEditable(false);
                    jLabelXemLich_TenLop.setBorder(blueline);
                    JTextField jLabelXemLich_PhongTH= new JTextField(listLichThucHanh.get(j).getPhongThucHanh().getMaPhongMay());
                    jLabelXemLich_PhongTH.setFont(font);
                    jLabelXemLich_PhongTH.setHorizontalAlignment(JTextField.CENTER);
                    jLabelXemLich_PhongTH.setEditable(false);
                    jLabelXemLich_PhongTH.setBorder(blueline);
                    JTextField jLabelXemLich_CaTH= new JTextField(listLichThucHanh.get(j).getCaThucHanh());
                    jLabelXemLich_CaTH.setFont(font);
                    jLabelXemLich_CaTH.setHorizontalAlignment(JTextField.CENTER);
                    jLabelXemLich_CaTH.setEditable(false);
                    jLabelXemLich_CaTH.setBorder(blueline);

                    jPanel.add(jLabelXemLich_MaLop);
                    jPanel.add(jLabelXemLich_TenLop);
                    jPanel.add(jLabelXemLich_PhongTH);
                    jPanel.add(jLabelXemLich_CaTH);

                    JPanel jPanelButtonHuy= new JPanel();
                    jPanelButtonHuy.setBorder(new EmptyBorder(10, 0, 10, 10));
                    jPanelButtonHuy.setBorder(blueline);
                    JButton jButtonHuy= new JButton("Hủy lịch");
                    jButtonHuy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    jButtonHuy.setFocusPainted(false);
                    jPanelButtonHuy.add(jButtonHuy);
                    jPanel.add(jPanelButtonHuy);

                    jButtonHuy.addMouseListener(new MouseAdapter(){
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {
                            int option = JOptionPane.showConfirmDialog(null, "Xác nhận xóa lịch thực hành?", "Xác nhận", JOptionPane.YES_NO_OPTION);
                            if(option==JOptionPane.YES_OPTION)
                            {
                                new DeleteLichThucHanh().DeleteLichThucHanh_MaLichThucHanh(a.getMaLichThucHanh());
                                try {
                                    jPanelXemLich.refresh();
                                } catch (Exception ex) {
                                    Logger.getLogger(GetLichThucHanhGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    });

                    this.add(jPanel);
                    check=1;
                    break;
                }
            }
            if(check==0)
            {
                
                JPanel jPanel= new JPanel();
                jPanel.setLayout(new GridLayout(1, 5));
                Font font= new Font("Arial", Font.BOLD, 14);
                Border blueline= BorderFactory.createLineBorder(Color.blue);
                JTextField jLabelXemLich_MaLop= new JTextField(listLopHoc.get(i).getMaLopHoc());
                jLabelXemLich_MaLop.setFont(font);
                jLabelXemLich_MaLop.setHorizontalAlignment(JTextField.CENTER);
                jLabelXemLich_MaLop.setEditable(false);
                jLabelXemLich_MaLop.setBorder(blueline);
                JTextField jLabelXemLich_TenLop= new JTextField(listLopHoc.get(i).getTenLopHoc());
                jLabelXemLich_TenLop.setFont(font);
                jLabelXemLich_TenLop.setHorizontalAlignment(JTextField.CENTER);
                jLabelXemLich_TenLop.setEditable(false);
                jLabelXemLich_TenLop.setBorder(blueline);
                JTextField jLabelXemLich_PhongTH= new JTextField("Chưa có lịch");
                jLabelXemLich_PhongTH.setFont(font);
                jLabelXemLich_PhongTH.setHorizontalAlignment(JTextField.CENTER);
                jLabelXemLich_PhongTH.setEditable(false);
                jLabelXemLich_PhongTH.setBorder(blueline);
                JTextField jLabelXemLich_CaTH= new JTextField("Chưa có lịch");
                jLabelXemLich_CaTH.setFont(font);
                jLabelXemLich_CaTH.setHorizontalAlignment(JTextField.CENTER);
                jLabelXemLich_CaTH.setEditable(false);
                jLabelXemLich_CaTH.setBorder(blueline);

                jPanel.add(jLabelXemLich_MaLop);
                jPanel.add(jLabelXemLich_TenLop);
                jPanel.add(jLabelXemLich_PhongTH);
                jPanel.add(jLabelXemLich_CaTH);

                JLabel jLabelHuy= new JLabel();
                jLabelHuy.setBorder(blueline);
                jPanel.add(jLabelHuy);

                this.add(jPanel);
            }
        }
        
        
        
    }
}
