/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.nhanvien;

import controller.AccountLogin;
import controller.DeleteLichThucHanh;
import controller.DeleteTaiKhoan;
import controller.GetLopHoc;
import controller.GetPhongMay;
import controller.GetTaiKhoan;
import controller.GetLichThucHanh;
import controller.GetNguoiDung;
import controller.InsertLichThucHanh;
import controller.InsertLopHoc;
import controller.InsertNguoiDung;
import controller.InsertPhongMay;
import controller.InsertTaiKhoan;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LichThucHanh;
import model.LopHoc;
import model.NguoiDung;
import model.PhongMay;
import model.TaiKhoan;


/**
 *
 * @author phan xuan an
 */
public class AdminFrm extends javax.swing.JFrame {

    public ArrayList<LopHoc> listLH;
    public ArrayList<LopHoc> listLopTim;
    public ArrayList<TaiKhoan> listTK;
    public ArrayList<TaiKhoan> listTaiKhoanTim;
    public ArrayList<LichThucHanh> listLichTH;
    public ArrayList<LichThucHanh> listLichTHTim;
    public ArrayList<PhongMay> listPhongMay;
    public ArrayList<NguoiDung> listND;
    public ArrayList<NguoiDung> listNDTim;

    DefaultTableModel modelLichTH;
    DefaultTableModel modelLop;
    DefaultTableModel modelTaiKhoan;
    DefaultTableModel modelNguoiDung;

    TaiKhoan tk;
    LopHoc s;                   // lớp khi click vào bảng để sửa hoặc xóa
    NguoiDung nd;
    LichThucHanh lichitem;
    String flag = "add";             // add thì thêm, update thì sửa rồi lưu lại
    String flagtk = "check";
    String flaglich = "add";
    String flagnd = "add";
    boolean ischeckedDSLOP = false;// phải chọn để sửa hoặc xóa
    boolean ischeckedDSTaiKhoan = false;
    boolean ischeckedDSLichTH = false;
    boolean ischeckedDSNguoiDung = false;

    public AdminFrm() {
        listTK = new ArrayList<TaiKhoan>();
        new GetTaiKhoan(listTK);
        listLH = new ArrayList<LopHoc>();
        new GetLopHoc(listLH);
        listLichTH = new ArrayList<LichThucHanh>();
        new GetLichThucHanh(listLichTH);
        listPhongMay = new ArrayList<PhongMay>();
        new GetPhongMay(listPhongMay);
        listND = new ArrayList<NguoiDung>();
        new GetNguoiDung(listND);

        initComponents();

        setLocationRelativeTo(null);
        modelLop = (DefaultTableModel) tblDSLopHoc.getModel();
        modelTaiKhoan = (DefaultTableModel) tblDSTaiKhoan.getModel();
        modelLichTH = (DefaultTableModel) tblDSLichTH.getModel();
        modelNguoiDung = (DefaultTableModel) tblDSNguoiDung.getModel();

        createListPhongMay();
        addDSNguoiDung();
        addDSLichTH();
        addDSTaiKhoan();
        addDSLopHoc();
        admininfor();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtMaPhongMayTim = new javax.swing.JTextField();
        btnTimLichTH_PM = new javax.swing.JButton();
        btnRefresh2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDSLichTH = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCaTH = new javax.swing.JTextField();
        txtMaLopTH = new javax.swing.JTextField();
        txtMaPhongMay = new javax.swing.JTextField();
        btnLuuLichTH = new javax.swing.JButton();
        btnThemLichTH = new javax.swing.JButton();
        btnSuaLichTH = new javax.swing.JButton();
        btnXoaLichTH = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTenTKTim = new javax.swing.JTextField();
        btnLuuTK = new javax.swing.JButton();
        btnSuaTK = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnTimTK = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDSTaiKhoan = new javax.swing.JTable();
        btnRefresh1 = new javax.swing.JButton();
        txtTenTK = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenLop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaLopTim = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        btnTimLop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSLopHoc = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        txtMaLop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMaNguoiDungTim = new javax.swing.JTextField();
        btnTimND = new javax.swing.JButton();
        btnRefresh3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDSNguoiDung = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtMaNguoiDung = new javax.swing.JTextField();
        btnLuuND = new javax.swing.JButton();
        btnThemND = new javax.swing.JButton();
        btnSuaND = new javax.swing.JButton();
        btnXoaND = new javax.swing.JButton();
        txtChucVu = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        txtvPass = new javax.swing.JTextField();
        txtvName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Tìm phòng máy");
        jLabel9.setPreferredSize(new java.awt.Dimension(70, 30));

        txtMaPhongMayTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhongMayTimActionPerformed(evt);
            }
        });

        btnTimLichTH_PM.setBackground(new java.awt.Color(0, 153, 153));
        btnTimLichTH_PM.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTimLichTH_PM.setForeground(new java.awt.Color(255, 255, 255));
        btnTimLichTH_PM.setText("Tìm");
        btnTimLichTH_PM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimLichTH_PM.setPreferredSize(new java.awt.Dimension(65, 25));
        btnTimLichTH_PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimLichTH_PMActionPerformed(evt);
            }
        });

        btnRefresh2.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh2.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnRefresh2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh2ActionPerformed(evt);
            }
        });

        tblDSLichTH.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblDSLichTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Phòng Máy", "Mã Lớp", "Ca Thực Hành", "Mã Giáo Viên"
            }
        ));
        tblDSLichTH.setGridColor(new java.awt.Color(255, 255, 255));
        tblDSLichTH.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDSLichTH.setShowGrid(false);
        tblDSLichTH.setShowHorizontalLines(true);
        tblDSLichTH.setShowVerticalLines(true);
        tblDSLichTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSLichTHMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDSLichTH);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Mã Phòng ");
        jLabel10.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Mã Lớp ");
        jLabel11.setPreferredSize(new java.awt.Dimension(65, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Ca Thực Hành");
        jLabel12.setPreferredSize(new java.awt.Dimension(70, 30));

        txtCaTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaTHActionPerformed(evt);
            }
        });

        txtMaLopTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLopTHActionPerformed(evt);
            }
        });

        txtMaPhongMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhongMayActionPerformed(evt);
            }
        });

        btnLuuLichTH.setBackground(new java.awt.Color(0, 153, 153));
        btnLuuLichTH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLuuLichTH.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuLichTH.setText("Lưu");
        btnLuuLichTH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLuuLichTH.setPreferredSize(new java.awt.Dimension(65, 25));
        btnLuuLichTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuLichTHActionPerformed(evt);
            }
        });

        btnThemLichTH.setBackground(new java.awt.Color(0, 153, 153));
        btnThemLichTH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnThemLichTH.setForeground(new java.awt.Color(255, 255, 255));
        btnThemLichTH.setText("Thêm");
        btnThemLichTH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThemLichTH.setPreferredSize(new java.awt.Dimension(65, 25));
        btnThemLichTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLichTHActionPerformed(evt);
            }
        });

        btnSuaLichTH.setBackground(new java.awt.Color(0, 153, 153));
        btnSuaLichTH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSuaLichTH.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaLichTH.setText("Sửa");
        btnSuaLichTH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuaLichTH.setPreferredSize(new java.awt.Dimension(65, 25));
        btnSuaLichTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaLichTHActionPerformed(evt);
            }
        });

        btnXoaLichTH.setBackground(new java.awt.Color(0, 153, 153));
        btnXoaLichTH.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnXoaLichTH.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaLichTH.setText("Xóa");
        btnXoaLichTH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoaLichTH.setPreferredSize(new java.awt.Dimension(65, 25));
        btnXoaLichTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLichTHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaLopTH, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaTH, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhongMay, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLuuLichTH, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(btnXoaLichTH, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(btnSuaLichTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemLichTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtMaPhongMayTim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnTimLichTH_PM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaPhongMayTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTimLichTH_PM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuuLichTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThemLichTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSuaLichTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCaTH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXoaLichTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaPhongMay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtMaLopTH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý phòng máy", jPanel1);

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tìm tài khoản");
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 30));

        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Mật khẩu");
        jLabel7.setPreferredSize(new java.awt.Dimension(65, 30));

        txtTenTKTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTKTimActionPerformed(evt);
            }
        });

        btnLuuTK.setBackground(new java.awt.Color(0, 153, 153));
        btnLuuTK.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLuuTK.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuTK.setText("Lưu");
        btnLuuTK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLuuTK.setPreferredSize(new java.awt.Dimension(65, 25));
        btnLuuTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuTKActionPerformed(evt);
            }
        });

        btnSuaTK.setBackground(new java.awt.Color(0, 153, 153));
        btnSuaTK.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSuaTK.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaTK.setText("Sửa");
        btnSuaTK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuaTK.setPreferredSize(new java.awt.Dimension(65, 25));
        btnSuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTKActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tên đăng nhập");
        jLabel8.setPreferredSize(new java.awt.Dimension(70, 30));

        btnTimTK.setBackground(new java.awt.Color(0, 153, 153));
        btnTimTK.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTimTK.setForeground(new java.awt.Color(255, 255, 255));
        btnTimTK.setText("Tìm");
        btnTimTK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimTK.setPreferredSize(new java.awt.Dimension(65, 25));
        btnTimTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTKActionPerformed(evt);
            }
        });

        tblDSTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblDSTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên tài khoản", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSTaiKhoan.setGridColor(new java.awt.Color(255, 255, 255));
        tblDSTaiKhoan.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDSTaiKhoan.setShowGrid(false);
        tblDSTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDSTaiKhoan);
        if (tblDSTaiKhoan.getColumnModel().getColumnCount() > 0) {
            tblDSTaiKhoan.getColumnModel().getColumn(0).setResizable(false);
            tblDSTaiKhoan.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblDSTaiKhoan.getColumnModel().getColumn(0).setHeaderValue("STT");
            tblDSTaiKhoan.getColumnModel().getColumn(1).setHeaderValue("Tên tài khoản");
            tblDSTaiKhoan.getColumnModel().getColumn(2).setHeaderValue("Mật khẩu");
        }

        btnRefresh1.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnRefresh1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        txtTenTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLuuTK, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(btnSuaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(txtTenTKTim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimTK, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)
                            .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenTKTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLuuTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý tài khoản", jPanel3);

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Tìm Lớp");
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 30));

        txtTenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLopActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Tên Lớp  ");
        jLabel4.setPreferredSize(new java.awt.Dimension(65, 30));

        txtMaLopTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLopTimActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(0, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.setPreferredSize(new java.awt.Dimension(65, 25));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.setPreferredSize(new java.awt.Dimension(65, 25));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setBackground(new java.awt.Color(0, 153, 153));
        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLuu.setPreferredSize(new java.awt.Dimension(65, 25));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(0, 153, 153));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.setPreferredSize(new java.awt.Dimension(65, 25));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Mã Lớp  ");
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 30));

        txtMaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGVActionPerformed(evt);
            }
        });

        btnTimLop.setBackground(new java.awt.Color(0, 153, 153));
        btnTimLop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimLop.setForeground(new java.awt.Color(255, 255, 255));
        btnTimLop.setText("Tìm");
        btnTimLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimLop.setPreferredSize(new java.awt.Dimension(65, 25));
        btnTimLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimLopActionPerformed(evt);
            }
        });

        tblDSLopHoc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblDSLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Lớp", "Tên Lớp", "Mã Giáo Viên"
            }
        ));
        tblDSLopHoc.setGridColor(new java.awt.Color(255, 255, 255));
        tblDSLopHoc.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDSLopHoc.setShowGrid(false);
        tblDSLopHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSLopHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSLopHoc);

        btnRefresh.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        txtMaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLopActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Mã Giáo Viên");
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaLopTim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnTimLop, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaLopTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý lớp học", jPanel2);

        jPanel6.setBackground(new java.awt.Color(232, 232, 232));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Tìm Người Dùng");
        jLabel13.setPreferredSize(new java.awt.Dimension(70, 30));

        txtMaNguoiDungTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNguoiDungTimActionPerformed(evt);
            }
        });

        btnTimND.setBackground(new java.awt.Color(0, 153, 153));
        btnTimND.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimND.setForeground(new java.awt.Color(255, 255, 255));
        btnTimND.setText("Tìm");
        btnTimND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimND.setPreferredSize(new java.awt.Dimension(65, 25));
        btnTimND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimNDActionPerformed(evt);
            }
        });

        btnRefresh3.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh3.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnRefresh3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefresh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh3ActionPerformed(evt);
            }
        });

        tblDSNguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblDSNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Người Dùng", "Họ Tên", "SDT", "Chức Vụ"
            }
        ));
        tblDSNguoiDung.setGridColor(new java.awt.Color(255, 255, 255));
        tblDSNguoiDung.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDSNguoiDung.setShowGrid(false);
        tblDSNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSNguoiDungMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDSNguoiDung);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Mã Người Dùng ");
        jLabel14.setPreferredSize(new java.awt.Dimension(70, 30));

        txtMaNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNguoiDungActionPerformed(evt);
            }
        });

        btnLuuND.setBackground(new java.awt.Color(0, 153, 153));
        btnLuuND.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLuuND.setForeground(new java.awt.Color(255, 255, 255));
        btnLuuND.setText("Lưu");
        btnLuuND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLuuND.setPreferredSize(new java.awt.Dimension(65, 25));
        btnLuuND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuNDActionPerformed(evt);
            }
        });

        btnThemND.setBackground(new java.awt.Color(0, 153, 153));
        btnThemND.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnThemND.setForeground(new java.awt.Color(255, 255, 255));
        btnThemND.setText("Thêm");
        btnThemND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThemND.setPreferredSize(new java.awt.Dimension(65, 25));
        btnThemND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNDActionPerformed(evt);
            }
        });

        btnSuaND.setBackground(new java.awt.Color(0, 153, 153));
        btnSuaND.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSuaND.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaND.setText("Sửa");
        btnSuaND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuaND.setPreferredSize(new java.awt.Dimension(65, 25));
        btnSuaND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNDActionPerformed(evt);
            }
        });

        btnXoaND.setBackground(new java.awt.Color(0, 153, 153));
        btnXoaND.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnXoaND.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaND.setText("Xóa");
        btnXoaND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoaND.setPreferredSize(new java.awt.Dimension(65, 25));
        btnXoaND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNDActionPerformed(evt);
            }
        });

        txtChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChucVuActionPerformed(evt);
            }
        });

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Họ Tên ");
        jLabel15.setPreferredSize(new java.awt.Dimension(65, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Chức Vụ");
        jLabel16.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("SDT");
        jLabel17.setPreferredSize(new java.awt.Dimension(65, 30));

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuaND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnThemND, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLuuND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaNguoiDungTim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnTimND, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaNguoiDungTim, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLuuND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuaND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtMaNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý người dùng", jPanel6);

        jPanel5.setBackground(new java.awt.Color(232, 232, 232));

        btnDangXuat.setBackground(new java.awt.Color(255, 51, 51));
        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        txtvPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvPassActionPerformed(evt);
            }
        });

        txtvName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvNameActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Tài Khoản");
        jLabel18.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Mật Khẩu");
        jLabel19.setPreferredSize(new java.awt.Dimension(70, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtvName, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txtvPass))
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin", jPanel5);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Quản Lý Hệ Thống Phòng Máy Khoa Công Nghệ Thông Tin ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addDSNguoiDung() {
        this.showData(listND, modelNguoiDung);
    }

    public void addDSTaiKhoan() {
        this.showData(listTK, modelTaiKhoan);
    }

    public void addDSLopHoc() {
        this.showData(listLH, modelLop);
    }

    public void addDSLichTH() {
        this.showData(listLichTH, modelLichTH);
    }

    public void admininfor(){
        txtvName.setText("admin");
        for(TaiKhoan x:listTK){
            if(x.TenDangNhap.equals("admin"))
                txtvPass.setText(x.MatKhau);
        }
    }
    public void createListPhongMay() {
        PhongMay pm1 = new PhongMay("PM01");
        PhongMay pm2 = new PhongMay("PM02");
        PhongMay pm3 = new PhongMay("PM03");
        PhongMay pm4 = new PhongMay("PM04");
        PhongMay pm5 = new PhongMay("PM05");
        PhongMay pm6 = new PhongMay("PM06");
        PhongMay pm7 = new PhongMay("PM07");
        PhongMay pm8 = new PhongMay("PM08");
        PhongMay pm9 = new PhongMay("PM09");
        PhongMay pm10 = new PhongMay("PM10");
        listPhongMay.add(pm1);
        listPhongMay.add(pm2);
        listPhongMay.add(pm3);
        listPhongMay.add(pm4);
        listPhongMay.add(pm5);
        listPhongMay.add(pm6);
        listPhongMay.add(pm7);
        listPhongMay.add(pm8);
        listPhongMay.add(pm9);
        listPhongMay.add(pm10);
        for (PhongMay pm : listPhongMay) {
            new InsertPhongMay(pm);
        }

    }

    private void txtTenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLopActionPerformed

    private void txtMaLopTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLopTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLopTimActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        flag = "add";

        txtMaLop.setText("");
        txtTenLop.setText("");
        txtMaGV.setText("");

        this.txtMaLop.requestFocus();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        if (ischeckedDSLOP == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 lớp để xóa!");
        } else {
            listLH.remove(s);
            new InsertLopHoc(listLH);
            new DeleteLichThucHanh().DeleteLichThucHanh_MaLop(s.getMaLopHoc());
            listLichTH= new ArrayList<LichThucHanh>();
            new GetLichThucHanh(listLichTH);
            addDSLichTH();
            addDSLopHoc();
            ischeckedDSLOP = false;// phải chọn để sửa hoặc xóa
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        boolean isOK = true;
        String malop = txtMaLop.getText();
        String tenlop = txtTenLop.getText();
        String magv = txtMaGV.getText();

        if (malop.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mã lớp không được để trống!");
            isOK = false;
        } else if (tenlop.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tên lớp không được để trống!");
            isOK = false;
        } else if (magv.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mã giáo viên không được để trống!");
            isOK = false;
        }
        if (isOK) {
            if (flag.equals("add")) {
                int d = 0;
                for (LopHoc l : listLH) {
                    if (l.getMaLopHoc().equals(malop)) {
                        d=1;
                        break;
                    }
                }
                if(d==0)
                {
                    d=-1;
                    for(NguoiDung nguoiDungCheck: listND)
                    {
                        if(nguoiDungCheck.getMaNguoiDung().equals(magv))
                        {
                            d=0;
                            break;
                        }
                    }
                }
                if (d != 0) {
                    if(d==1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Lớp đã tồn tại!");
                    }
                    else if(d==-1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Không tồn tại mã giáo viên!");
                    }
                } else {
                    LopHoc l = new LopHoc(malop, tenlop, magv);
                    listLH.add(l);
                    new InsertLopHoc(listLH);
                    addDSLopHoc();
                    
                }

            } else if (flag.equals("update")) {
                if(checkMaLopThayDoi(malop)){
                    JOptionPane.showMessageDialog(rootPane, "Không thể thay đổi mã lớp!");
                }else{
                int p = 0;
                for (LopHoc l : listLH) {
                    if (l.getMaLopHoc().equals(malop)) {
                        if (!s.getMaLopHoc().equals(l.getMaLopHoc())) {
                            p++;
                        }
                    }
                }
                if (p != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Lớp đã tồn tại!");
                } else {
                    for (LopHoc l : listLH) {
                        if (l.getMaLopHoc().equals(s.getMaLopHoc())) {
                            l.setMaLopHoc(txtMaLop.getText());
                            l.setTenLopHoc(txtTenLop.getText());
                            l.setMaGiaoVien(txtMaGV.getText());
                        }
                    }
                }
                new InsertLopHoc(listLH);
                addDSLopHoc();
                flag = "add";
                ischeckedDSLOP = false;// phải chọn để sửa hoặc xóa
                }
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    public boolean checkMaLopThayDoi(String malop) {
        
        if(s.getMaLopHoc().equals(malop)) {
            return false;// chưa thay đổi tk
        } else {
            return true;// đã thay đổi tk
        }
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        if (ischeckedDSLOP == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 lớp để sửa!");
        } else {
            flag = "update";
            txtMaLop.setText(s.getMaLopHoc());
            txtTenLop.setText(s.getTenLopHoc());
            txtMaGV.setText(s.getMaGiaoVien());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtMaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGVActionPerformed

    private void btnTimLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimLopActionPerformed
        String mltim = txtMaLopTim.getText();
        boolean isOK = true;
        listLopTim = new ArrayList<>();

        if (mltim.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Nhập mã lớp cần tìm!");
            isOK = false;
        }
        if (isOK) {
            for (LopHoc lt : listLH) {
                if (mltim.equals(lt.getMaLopHoc())) {
                    listLopTim.add(lt);
                }
            }

            if (listLopTim.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!");
            } else {
                showData(listLopTim, modelLop);
            }
        }
    }//GEN-LAST:event_btnTimLopActionPerformed

    private LopHoc getLopHocAtPoint(int position) {
        return listLH.get(position);
    }
    private void tblDSLopHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSLopHocMouseClicked
        int rowId = tblDSLopHoc.rowAtPoint(evt.getPoint());
        s = getLopHocAtPoint(rowId);
        if (!s.getMaLopHoc().isEmpty())
            ischeckedDSLOP = true;
    }//GEN-LAST:event_tblDSLopHocMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        addDSLopHoc();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtMaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLopActionPerformed

//===================== QUẢN LÝ TÀI KHOẢN========================

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void txtTenTKTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTKTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTKTimActionPerformed

    private void btnLuuTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuTKActionPerformed

        boolean isOK = true;
        String tentk = txtTenTK.getText();
        String matkhau = txtMatKhau.getText();

        if (tentk.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Tên không được để trống!");
            isOK = false;
        } else if (matkhau.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không được để trống!");
            isOK = false;
        }
        if (isOK) {      // check rỗng
            if (checkNguoiDung(tentk) == false) {       // check kết nối Nguoi dung- Tai Khoan
                JOptionPane.showMessageDialog(rootPane, "Người dùng này không tồn tại!");
            } else if(checkTaiKhoanThayDoi(tentk)){          // check : không cho đổi tên tk
                JOptionPane.showMessageDialog(rootPane, "Không được thay đổi tên tài khoản!");
            }else if(flagtk.equals("check")){
                if(checkTaiKhoanTonTai(tentk)){
                    JOptionPane.showMessageDialog(rootPane, "Tài khoản đã tồn tại!");
                }
                else{
                    for (TaiKhoan t : listTK) {
                        if (tk.getTenDangNhap().equals(t.getTenDangNhap())) {
                            t.setMatKhau(txtMatKhau.getText());
                        }
                    }
                    new InsertTaiKhoan(listTK);
                    addDSTaiKhoan();
                    flagtk="check";
                    ischeckedDSTaiKhoan = false;
                }
                }else if(flagtk.equals("update")){
                    for (TaiKhoan t : listTK) {
                        if (tk.getTenDangNhap().equals(t.getTenDangNhap())) {
                            t.setMatKhau(txtMatKhau.getText());
                        }
                    }
                    new InsertTaiKhoan(listTK);
                    addDSTaiKhoan();
                    flagtk="check";
                    ischeckedDSTaiKhoan = false;
                }
        }       
    }//GEN-LAST:event_btnLuuTKActionPerformed

    public boolean checkTaiKhoanTonTai(String tentk){
        int n=0;
        for(TaiKhoan t: listTK){
            if(tentk.equals(t.TenDangNhap))
                n++;
        }
        if(n!=0){
            return true; // đã tồn tại
        }else{
            return false;
        }   
    }
    public boolean checkTaiKhoanThayDoi(String tentk) {
        
        if(tk.TenDangNhap.equals(tentk)) {
            return false;// chưa thay đổi tk
        } else {
            return true;// đã thay đổi tk
        }
    }
    public boolean checkNguoiDung(String tentk) {
        int d = 0;
        for (NguoiDung nd : listND) {
            if (tentk.equals(nd.getMaNguoiDung())) {
                d++;
            }
        }
        if (d == 0) {
            return false; // không tồn tại
        } else {
            return true;
        }
    }
    private void btnSuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTKActionPerformed
        if (ischeckedDSTaiKhoan == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 tài khoản để sửa!");
        } else {
            flagtk = "update";
            txtTenTK.setText(tk.getTenDangNhap());
            txtMatKhau.setText(tk.getMatKhau());
        }
    }//GEN-LAST:event_btnSuaTKActionPerformed

    private void btnTimTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTKActionPerformed
        String tentktim = txtTenTKTim.getText();
        boolean isOK = true;
        listTaiKhoanTim = new ArrayList<>();

        if (tentktim.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Nhập tên tài khoản cần tìm!");
            isOK = false;
        }
        if (isOK) {
            for (TaiKhoan tkt : listTK) {
                if (tentktim.equals(tkt.getTenDangNhap())) {
                    listTaiKhoanTim.add(tkt);
                }
            }

            if (listTaiKhoanTim.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!");
            } else {
                showData(listTaiKhoanTim, modelTaiKhoan);
            }
        }
    }//GEN-LAST:event_btnTimTKActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        addDSTaiKhoan();
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void txtTenTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTKActionPerformed

    private TaiKhoan getTaiKhoanAtPoint(int position) {
        return listTK.get(position);
    }

    private void tblDSTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSTaiKhoanMouseClicked
        int rowId = tblDSTaiKhoan.rowAtPoint(evt.getPoint());
        tk = getTaiKhoanAtPoint(rowId);
        if (!tk.getTenDangNhap().isEmpty())
            ischeckedDSTaiKhoan = true;
    }//GEN-LAST:event_tblDSTaiKhoanMouseClicked

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        try {
            new AccountLogin().setAccountLogout();
            this.setVisible(false);
            new view.DangNhap().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void txtMaPhongMayTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhongMayTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhongMayTimActionPerformed

    private void btnTimLichTH_PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimLichTH_PMActionPerformed
        String mapmtim = txtMaPhongMayTim.getText();
        boolean isOK = true;
        listLichTHTim = new ArrayList<>();

        if (mapmtim.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Nhập mã phòng máy cần tìm!");
            isOK = false;
        }
        if (isOK) {
            for (LichThucHanh lich : listLichTH) {
                if (mapmtim.equals(lich.getPhongThucHanh().getMaPhongMay())) {
                    listLichTHTim.add(lich);
                }
            }
            if (listLichTHTim.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!");
            } else {
                showData(listLichTHTim, modelLichTH);
            }
        }
    }//GEN-LAST:event_btnTimLichTH_PMActionPerformed

    private void btnRefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh2ActionPerformed
        addDSLichTH();
    }//GEN-LAST:event_btnRefresh2ActionPerformed

    private LichThucHanh getLichTHAtPoint(int position) {
        return listLichTH.get(position);
    }
    private void tblDSLichTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSLichTHMouseClicked
        int rowId = tblDSLichTH.rowAtPoint(evt.getPoint());
        lichitem = getLichTHAtPoint(rowId);
        if (!lichitem.getPhongThucHanh().getMaPhongMay().isEmpty())
            ischeckedDSLichTH = true;
    }//GEN-LAST:event_tblDSLichTHMouseClicked

    private void txtMaLopTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLopTHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLopTHActionPerformed

    private void txtMaPhongMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhongMayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhongMayActionPerformed

    public boolean CheckTonTaiPhongMay(String mapm) {
        int m = 0;
        for (PhongMay pm : listPhongMay) {
            if (mapm.equals(pm.getMaPhongMay())) {
                m++;
            }
        }
        if (m == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean CheckTonTaiLopHoc(String malop) {
        int m = 0;
        for (LopHoc lh : listLH) {
            if (malop.equals(lh.getMaLopHoc())) {
                m++;
            }
        }
        if (m == 0) {
            return false;
        } else {
            return true;
        }
    }
    private void btnLuuLichTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuLichTHActionPerformed
        boolean isOK = true;
        String maphongmay = txtMaPhongMay.getText();
        String malop = txtMaLopTH.getText();
        String cath = txtCaTH.getText();

        if (maphongmay.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mã phòng máy không được để trống!");
            isOK = false;
        } else if (malop.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mã lớp không được để trống!");
            isOK = false;
        } else if (cath.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ca thục hành không được để trống!");
            isOK = false;
        }
        if (isOK) {
            // thêm
            if (flaglich.equals("add")) {
// check trùng lịch
                int d = 0;
                for (LichThucHanh li : listLichTH) {
                    if (li.getPhongThucHanh().getMaPhongMay().equals(maphongmay) && li.getCaThucHanh().equals(cath)) {
                        d++;
                    }
                }
                if (d != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Trùng lịch!");
                } else {
// kiểm tra phòng vừa nhập có tồn tại trong listPhongMay hay không
                    if (CheckTonTaiPhongMay(maphongmay) == false) {
                        JOptionPane.showMessageDialog(rootPane, "Không có phòng này!");
                    } else if (CheckTonTaiLopHoc(malop) == false) {
                        JOptionPane.showMessageDialog(rootPane, "Không có lớp này!");

                    } else {
                        LopHoc lh = new GetLopHoc(malop);
                        new DeleteLichThucHanh().DeleteLichThucHanh_MaLop(malop);
                        PhongMay pm = new GetPhongMay(maphongmay);
                        LichThucHanh lichThucHanh = new LichThucHanh(lh, pm, cath);
                        //li.getPhongThucHanh().setMaPhongMay(mapm);
                        new InsertLichThucHanh(lichThucHanh);
                        listLichTH= new ArrayList<LichThucHanh>();
                        new GetLichThucHanh(listLichTH);
                        addDSLichTH();
                    }
                }
// sửa                
            } else if (flaglich.equals("update")) {
                int p = 0;
                for (LichThucHanh l : listLichTH) {
                    if (l.getPhongThucHanh().getMaPhongMay().equals(maphongmay) && l.getCaThucHanh().equals(cath)) {
                        if (!lichitem.getPhongThucHanh().getMaPhongMay().equals(l.getPhongThucHanh().getMaPhongMay())) {
                            p++;
                        }
                    }
                }
                if (p != 0) {
                    JOptionPane.showMessageDialog(rootPane, " Trùng lịch!");
                } else {
                    for (LichThucHanh l : listLichTH) {
                        if (l.getPhongThucHanh().getMaPhongMay().equals(lichitem.getPhongThucHanh().getMaPhongMay())) {
                            l.getPhongThucHanh().setMaPhongMay(txtMaPhongMay.getText());
                            l.getLopThucHanh().setMaLopHoc(txtMaLopTH.getText());
                            l.setCaThucHanh(txtCaTH.getText());
                        }
                    }
                }
                new InsertLichThucHanh(listLichTH);
                addDSLichTH();
                flaglich = "add";
                ischeckedDSLichTH = false;
            }
        }

    }//GEN-LAST:event_btnLuuLichTHActionPerformed

    private void btnThemLichTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLichTHActionPerformed
        flaglich = "add";
        txtMaPhongMay.setText("");
        txtMaLopTH.setText("");
        txtCaTH.setText("");
        this.txtMaPhongMay.requestFocus();
    }//GEN-LAST:event_btnThemLichTHActionPerformed

    private void btnSuaLichTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaLichTHActionPerformed
        if (ischeckedDSLichTH == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 lịch để sửa!");
        } else {
            flaglich = "update";
            txtMaPhongMay.setText(lichitem.getPhongThucHanh().getMaPhongMay());
            txtMaLopTH.setText(lichitem.getLopThucHanh().getMaLopHoc());
            txtCaTH.setText(lichitem.getCaThucHanh());
        }
    }//GEN-LAST:event_btnSuaLichTHActionPerformed

    private void btnXoaLichTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLichTHActionPerformed
        if (ischeckedDSLichTH == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 lich TH để xóa!");
        } else {
            listLichTH.remove(lichitem);
            new InsertLichThucHanh(listLichTH);
            addDSLichTH();
            ischeckedDSLichTH = false;
        }
    }//GEN-LAST:event_btnXoaLichTHActionPerformed

    private void txtvPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvPassActionPerformed

    private void txtvNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvNameActionPerformed
        
    }//GEN-LAST:event_txtvNameActionPerformed

    private void txtMaNguoiDungTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNguoiDungTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNguoiDungTimActionPerformed

    private void btnTimNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimNDActionPerformed
        String mandtim = txtMaNguoiDungTim.getText();
        boolean isOK = true;
        listNDTim = new ArrayList<>();

        if (mandtim.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Nhập mã người dùng cần tìm!");
            isOK = false;
        }
        if (isOK) {
            for (NguoiDung n : listND) {
                if (mandtim.equals(n.getMaNguoiDung())) {
                    listNDTim.add(n);
                }
            }
            if (listNDTim.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy!");
            } else {
                showData(listNDTim, modelNguoiDung);
            }
        }
    }//GEN-LAST:event_btnTimNDActionPerformed

    private void btnRefresh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh3ActionPerformed

        
        addDSNguoiDung();
    }//GEN-LAST:event_btnRefresh3ActionPerformed

    private NguoiDung getNguoiDungAtPoint(int position) {
        return listND.get(position);
    }
    private void tblDSNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSNguoiDungMouseClicked
        int row = tblDSNguoiDung.rowAtPoint(evt.getPoint());
        nd = getNguoiDungAtPoint(row);
        if (!nd.getMaNguoiDung().isEmpty())
            ischeckedDSNguoiDung = true;
    }//GEN-LAST:event_tblDSNguoiDungMouseClicked

    private void txtMaNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNguoiDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNguoiDungActionPerformed

    private void btnLuuNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuNDActionPerformed
        boolean isOK = true;
        String mand = txtMaNguoiDung.getText();
        String hoten = txtHoTen.getText();
        String sdt = txtSDT.getText();
        String chucvu = txtChucVu.getText();

        if (mand.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Mã người dùng không được để trống!");
            isOK = false;
        } else if (hoten.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Họ tên không được để trống!");
            isOK = false;
        } else if (sdt.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "SDT không được để trống!");
            isOK = false;
        } else if (chucvu.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Chuc vu không được để trống!");
            isOK = false;
        }
        if (isOK) {
            if (flagnd.equals("add")) {
                int d = 0;
                for (NguoiDung n : listND) {
                    if (n.getMaNguoiDung().equals(mand)) {
                        d++;
                    }
                }
                if (d != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Nguoi dùng đã tồn tại!");
                } else {
                    NguoiDung t = new NguoiDung(mand, hoten, sdt, chucvu);
                    new InsertNguoiDung(t);
                    listND= new ArrayList<NguoiDung>();
                    new GetNguoiDung(listND);
                    listTK = new ArrayList<TaiKhoan>();
                    new GetTaiKhoan(listTK);
                    addDSTaiKhoan();
                    addDSNguoiDung();
                    
                }

            } else if (flagnd.equals("update")) {
                if(checkNguoiDungThayDoi(mand)){
                    JOptionPane.showMessageDialog(rootPane, "Không thể thay đổi mã người dùng!");
                }else{
                for (NguoiDung li : listND) {
                    if (nd.getMaNguoiDung().equals(li.getMaNguoiDung())) {
                        li.setMaNguoiDung(txtMaNguoiDung.getText());
                        li.setHoTen(txtHoTen.getText());
                        li.setSDT(txtSDT.getText());
                        li.setChucVu(txtChucVu.getText());
                    }
                }
                new InsertNguoiDung(listND);
                //new GetTaiKhoan(listTK);
                //addDSTaiKhoan();
                addDSNguoiDung();
                flagnd = "add";
                ischeckedDSNguoiDung = false;
                }
            }
        }
    }//GEN-LAST:event_btnLuuNDActionPerformed

    public boolean checkNguoiDungThayDoi(String mand) {
        
        if(nd.getMaNguoiDung().equals(mand)) {
            return false;// chưa thay đổi nd
        } else {
            return true;// đã thay đổi nd
        }
    }
    private void btnThemNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNDActionPerformed
        flagnd = "add";
        txtMaNguoiDung.setText("");
        txtHoTen.setText("");
        txtSDT.setText("");
        txtChucVu.setText("");
        this.txtMaNguoiDung.requestFocus();
    }//GEN-LAST:event_btnThemNDActionPerformed

    private void btnSuaNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNDActionPerformed
        if (ischeckedDSNguoiDung == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 người dùng để sửa!");
        } else {
            flagnd = "update";
            txtMaNguoiDung.setText(nd.getMaNguoiDung());
            txtHoTen.setText(nd.getHoTen());
            txtSDT.setText(nd.getSDT());
            txtChucVu.setText(nd.getChucVu());
        }
    }//GEN-LAST:event_btnSuaNDActionPerformed

    private void btnXoaNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNDActionPerformed
        if (ischeckedDSNguoiDung == false) {
            JOptionPane.showMessageDialog(rootPane, "Chọn 1 Người dùng để xóa!");
        } else {
            listND.remove(nd);
            new DeleteTaiKhoan(nd.getMaNguoiDung());
            new InsertNguoiDung(listND);
            listTK= new ArrayList<TaiKhoan>();
            new GetTaiKhoan(listTK);
            addDSTaiKhoan();
            addDSNguoiDung();
            flagnd="add";
            ischeckedDSNguoiDung = false;// phải chọn để sửa hoặc xóa
        }
    }//GEN-LAST:event_btnXoaNDActionPerformed

    private void txtChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChucVuActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtCaTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaTHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaTHActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminFrm().setVisible(true);
//            }
//        });
//    }

    public <T> void showData(List<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        int soLopHoc = 0;
        int soTaiKhoan = 0;
        int lich = 0;
        int nd = 0;
        for (T t : list) {
            if (t instanceof LopHoc l) {
                soLopHoc++;
                model.addRow(new Object[]{
                    soLopHoc, l.getMaLopHoc(), l.getTenLopHoc(), l.getMaGiaoVien()
                });
            } else if (t instanceof TaiKhoan x) {
                soTaiKhoan++;
                model.addRow(new Object[]{
                    soTaiKhoan, x.getTenDangNhap(), x.getMatKhau()
                });
            } else if (t instanceof LichThucHanh z) {
                lich++;
                model.addRow(new Object[]{
                    lich, z.getPhongThucHanh().getMaPhongMay(), z.getLopThucHanh().getMaLopHoc(), z.getCaThucHanh(), z.getLopThucHanh().getMaGiaoVien()
                });
            } else if (t instanceof NguoiDung n) {
                nd++;
                model.addRow(new Object[]{
                    nd, n.getMaNguoiDung(), n.getHoTen(), n.getSDT(), n.getChucVu()
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuuLichTH;
    private javax.swing.JButton btnLuuND;
    private javax.swing.JButton btnLuuTK;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnRefresh2;
    private javax.swing.JButton btnRefresh3;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaLichTH;
    private javax.swing.JButton btnSuaND;
    private javax.swing.JButton btnSuaTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemLichTH;
    private javax.swing.JButton btnThemND;
    private javax.swing.JButton btnTimLichTH_PM;
    private javax.swing.JButton btnTimLop;
    private javax.swing.JButton btnTimND;
    private javax.swing.JButton btnTimTK;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaLichTH;
    private javax.swing.JButton btnXoaND;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDSLichTH;
    private javax.swing.JTable tblDSLopHoc;
    private javax.swing.JTable tblDSNguoiDung;
    private javax.swing.JTable tblDSTaiKhoan;
    private javax.swing.JTextField txtCaTH;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtMaLopTH;
    private javax.swing.JTextField txtMaLopTim;
    private javax.swing.JTextField txtMaNguoiDung;
    private javax.swing.JTextField txtMaNguoiDungTim;
    private javax.swing.JTextField txtMaPhongMay;
    private javax.swing.JTextField txtMaPhongMayTim;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txtTenTK;
    private javax.swing.JTextField txtTenTKTim;
    private javax.swing.JTextField txtvName;
    private javax.swing.JTextField txtvPass;
    // End of variables declaration//GEN-END:variables
}
