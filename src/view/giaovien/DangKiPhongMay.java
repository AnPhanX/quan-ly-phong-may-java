/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.giaovien;

import controller.DeleteLichThucHanh;
import controller.GetLichThucHanh;
import controller.GetLopHoc;
import controller.GetNguoiDung;
import controller.GetPhongMay;
import controller.InsertLichThucHanh;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import model.LichThucHanh;
import model.LopHoc;
import model.NguoiDung;
import model.PhongMay;



/**
 *
 * @author LTC
 */
public class DangKiPhongMay extends JPanel{
    private JTextField jTextField_Malichthuchanh;
    private JTextField jTextField_MaGV;
    private JTextField jTextField_MaLopHoc;
    private JTextField jTextField_ca;
    private JButton jButton_dangki;
    private JButton jButton_huy;
    
       public JTextField getjTextField_Malichthuchanh() {
        return jTextField_Malichthuchanh;
    }
     public JTextField getjTextField_ca()
            {
                 return jTextField_ca;
            }
     public JButton getjButton_dangki()
     {
         return jButton_dangki;
     }
       public JButton jButton_huy()
     {
         return jButton_huy;
     }
     public DangKiPhongMay(GiaoVienView jFrame, String MaNguoiDung) throws Exception
     {
        this.setSize(800, 300);
        this.setLayout(new GridLayout(15, 2, 10, 10));
        this.setBorder(new EmptyBorder(20, 20, 0, 20));
        
        NguoiDung nguoiDung= new GetNguoiDung(MaNguoiDung);
        JLabel jLabel_MaGV= new JLabel ("Mã người dùng");//Padding 
        this.jTextField_MaGV= new JTextField(50);
        this.jTextField_MaGV.setText(nguoiDung.getMaNguoiDung());
        this.jTextField_MaGV.setEditable(false);
        this.add(jLabel_MaGV);
        this.add(jTextField_MaGV);
        
              
        JLabel jlabel_malop= new JLabel("Mã lớp học");
        ArrayList<LopHoc> listLopHoc= new ArrayList<LopHoc>();
        new GetLopHoc(listLopHoc);
        JComboBox<String> jComboBox_MaLop=new JComboBox();
        for(LopHoc lop: listLopHoc)
        {
            if(lop.getMaGiaoVien().equals(MaNguoiDung))
            jComboBox_MaLop.addItem(lop.getMaLopHoc());
        }
        this.add(jComboBox_MaLop);
          
          
        ArrayList<PhongMay> listPhongMay= new ArrayList<PhongMay>();
        new GetPhongMay(listPhongMay);  
        JLabel jlabel_maphong= new JLabel("Mã Phòng Máy :");
        JComboBox<String> jComboBox_MaPhongMay=new JComboBox();
        for(PhongMay phong: listPhongMay)
        {   
            jComboBox_MaPhongMay.addItem(phong.getMaPhongMay());
        }
        this.add(jlabel_maphong);
        this.add(jComboBox_MaPhongMay);
        
        
        JLabel jlabel_ca= new JLabel("Ca thực hành");
        JComboBox jComboBox_Ca= new JComboBox();
            for(int j=2;j<=7;j++)
                for(int i=1; i<=3;i++)
            {
                String str="Ca "+i+" Thứ "+j;
                jComboBox_Ca.addItem(str);
            }
            
        this.add(jlabel_ca);
        this.add(jComboBox_Ca);
          
        
        JPanel jPanelButton= new JPanel();
        jPanelButton.setLayout(new GridLayout(1,4, 10, 0));
        jButton_dangki=new JButton("Đăng kí");
        jButton_dangki .setFont(new java.awt.Font("Segoe UI", 1, 12));
        jButton_dangki.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton_dangki.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_dangki.setFocusPainted(false);
        jPanelButton.add(new JLabel());
        jPanelButton.add(jButton_dangki);
        
        jButton_huy=new JButton("Hủy");
        jButton_huy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton_huy.setFocusPainted(false);
        jPanelButton.add(jButton_huy);
        jPanelButton.add(new JLabel());
        
        
        this.add(new JLabel());
        this.add(jPanelButton);
        
        jButton_dangki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
           
                String maphongmay=(String) jComboBox_MaPhongMay.getSelectedItem();
                String ca= (String) jComboBox_Ca.getSelectedItem();
                if(TrungLichThucHanh(maphongmay,ca))
                   JOptionPane.showMessageDialog(null, "Trùng lịch thực hành!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                else
                {
                    LopHoc a = new GetLopHoc((String) jComboBox_MaLop.getSelectedItem());
                    new DeleteLichThucHanh().DeleteLichThucHanh_MaLop(a.getMaLopHoc());
                    PhongMay b = new PhongMay(maphongmay);
                    LichThucHanh l = new LichThucHanh("", a, b,ca);
                    new InsertLichThucHanh(l);

                    JOptionPane.showMessageDialog(null, "Đăng ký thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE); 
                    jComboBox_MaLop.setSelectedIndex(0);
                    jComboBox_MaPhongMay.setSelectedIndex(0);
                    jComboBox_Ca.setSelectedIndex(0);

                    try {
                        jFrame.refresh();
                    } catch (Exception ex) {
                        Logger.getLogger(DangKiPhongMay.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                     
            
            }
        });
        
        jButton_huy.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jComboBox_MaLop.setSelectedIndex(0);
                jComboBox_MaPhongMay.setSelectedIndex(0);
                jComboBox_Ca.setSelectedIndex(0);
            }
   
        });
     }
   
     public boolean TrungLichThucHanh(String maphongmay, String cathuchanh)
     {
          ArrayList<LichThucHanh> listLichThucHanh=new ArrayList<LichThucHanh>();
                        new GetLichThucHanh(listLichThucHanh);
               for(LichThucHanh lich: listLichThucHanh)
               {
                   if(lich.getPhongThucHanh().getMaPhongMay().equals(maphongmay))
                       if (lich.getCaThucHanh().equals(cathuchanh))
                    return true;
                }
         
         return false;
     }
    
}
