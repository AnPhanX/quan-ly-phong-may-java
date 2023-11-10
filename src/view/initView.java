/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author LTC
 */
public class initView {
    private JFrame jFrame;
    
    public initView(JFrame jFrame)
    {
        this.jFrame= jFrame;
        this.jFrame.setTitle("Quản lí phòng máy");
        this.jFrame.setSize(800, 600);
        this.jFrame.setLocationRelativeTo(null);
        this.jFrame.setDefaultCloseOperation(this.jFrame.EXIT_ON_CLOSE);
        this.jFrame.setLayout(new BorderLayout(10, 10));
    }
}
