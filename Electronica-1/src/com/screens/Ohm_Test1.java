/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.screens;

import com.curp.curp;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class Ohm_Test1 extends javax.swing.JFrame {

    int xMouse,yMouse;
    Boolean is_correct1 = false;
    Boolean is_correct2 = false;
    int points = 0;
    private int puntos;

    
    public Ohm_Test1() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void getPoints(int puntos){
        this.puntos = puntos;
        this.points = puntos;
    }
    curp c = new curp();
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("com/images/Icon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_group_1 = new javax.swing.ButtonGroup();
        btn_group_2 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        PanelQ_1 = new javax.swing.JPanel();
        Imagen = new javax.swing.JLabel();
        Pregunta_panel = new javax.swing.JPanel();
        Pregunta_1 = new javax.swing.JLabel();
        OpcionA1 = new javax.swing.JPanel();
        Opcion_A1 = new javax.swing.JRadioButton();
        OpcionB1 = new javax.swing.JPanel();
        Opcion_B1 = new javax.swing.JRadioButton();
        OpcionC1 = new javax.swing.JPanel();
        Opcion_C1 = new javax.swing.JRadioButton();
        OpcionD1 = new javax.swing.JPanel();
        Opcion_D1 = new javax.swing.JRadioButton();
        PanelQ_2 = new javax.swing.JPanel();
        Imagen1 = new javax.swing.JLabel();
        Pregunta_panel1 = new javax.swing.JPanel();
        Pregunta_2 = new javax.swing.JLabel();
        OpcionA2 = new javax.swing.JPanel();
        Opcion_A2 = new javax.swing.JRadioButton();
        OpcionB2 = new javax.swing.JPanel();
        Opcion_B2 = new javax.swing.JRadioButton();
        OpcionC2 = new javax.swing.JPanel();
        Opcion_C2 = new javax.swing.JRadioButton();
        OpcionD2 = new javax.swing.JPanel();
        Opcion_D2 = new javax.swing.JRadioButton();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exit_btn = new javax.swing.JLabel();
        Next = new javax.swing.JPanel();
        next_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 580));

        bg.setBackground(new java.awt.Color(196, 223, 230));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelQ_1.setBackground(new java.awt.Color(196, 223, 230));

        Imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Ohm/Circuito3.png"))); // NOI18N

        Pregunta_panel.setBackground(new java.awt.Color(7, 87, 91));

        Pregunta_1.setBackground(new java.awt.Color(102, 165, 173));
        Pregunta_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pregunta_1.setForeground(new java.awt.Color(252, 217, 0));
        Pregunta_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pregunta_1.setText("Cuanto es el valor de la resistencia?");

        javax.swing.GroupLayout Pregunta_panelLayout = new javax.swing.GroupLayout(Pregunta_panel);
        Pregunta_panel.setLayout(Pregunta_panelLayout);
        Pregunta_panelLayout.setHorizontalGroup(
            Pregunta_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pregunta_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pregunta_panelLayout.setVerticalGroup(
            Pregunta_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pregunta_1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        OpcionA1.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_1.add(Opcion_A1);
        Opcion_A1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_A1.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_A1.setText("425Ω");
        Opcion_A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_A1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionA1Layout = new javax.swing.GroupLayout(OpcionA1);
        OpcionA1.setLayout(OpcionA1Layout);
        OpcionA1Layout.setHorizontalGroup(
            OpcionA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(OpcionA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_A1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        OpcionA1Layout.setVerticalGroup(
            OpcionA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(OpcionA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_A1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        OpcionB1.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_1.add(Opcion_B1);
        Opcion_B1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_B1.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_B1.setText("330Ω");
        Opcion_B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_B1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionB1Layout = new javax.swing.GroupLayout(OpcionB1);
        OpcionB1.setLayout(OpcionB1Layout);
        OpcionB1Layout.setHorizontalGroup(
            OpcionB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(OpcionB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        OpcionB1Layout.setVerticalGroup(
            OpcionB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(OpcionB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        OpcionC1.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_1.add(Opcion_C1);
        Opcion_C1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_C1.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_C1.setText("30Ω");
        Opcion_C1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_C1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionC1Layout = new javax.swing.GroupLayout(OpcionC1);
        OpcionC1.setLayout(OpcionC1Layout);
        OpcionC1Layout.setHorizontalGroup(
            OpcionC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(OpcionC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        OpcionC1Layout.setVerticalGroup(
            OpcionC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(OpcionC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        OpcionD1.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_1.add(Opcion_D1);
        Opcion_D1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_D1.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_D1.setText("500Ω");
        Opcion_D1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_D1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionD1Layout = new javax.swing.GroupLayout(OpcionD1);
        OpcionD1.setLayout(OpcionD1Layout);
        OpcionD1Layout.setHorizontalGroup(
            OpcionD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opcion_D1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OpcionD1Layout.setVerticalGroup(
            OpcionD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opcion_D1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelQ_1Layout = new javax.swing.GroupLayout(PanelQ_1);
        PanelQ_1.setLayout(PanelQ_1Layout);
        PanelQ_1Layout.setHorizontalGroup(
            PanelQ_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQ_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelQ_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OpcionD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpcionC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpcionB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpcionA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pregunta_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelQ_1Layout.setVerticalGroup(
            PanelQ_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQ_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pregunta_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(PanelQ_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 520));

        PanelQ_2.setBackground(new java.awt.Color(196, 223, 230));

        Imagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Ohm/Circuito4.png"))); // NOI18N

        Pregunta_panel1.setBackground(new java.awt.Color(7, 87, 91));

        Pregunta_2.setBackground(new java.awt.Color(102, 165, 173));
        Pregunta_2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pregunta_2.setForeground(new java.awt.Color(252, 217, 0));
        Pregunta_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pregunta_2.setText("Cuanto es el valor de la resistencia?");

        javax.swing.GroupLayout Pregunta_panel1Layout = new javax.swing.GroupLayout(Pregunta_panel1);
        Pregunta_panel1.setLayout(Pregunta_panel1Layout);
        Pregunta_panel1Layout.setHorizontalGroup(
            Pregunta_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pregunta_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pregunta_panel1Layout.setVerticalGroup(
            Pregunta_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pregunta_2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        OpcionA2.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_2.add(Opcion_A2);
        Opcion_A2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_A2.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_A2.setText("445Ω");
        Opcion_A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_A2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionA2Layout = new javax.swing.GroupLayout(OpcionA2);
        OpcionA2.setLayout(OpcionA2Layout);
        OpcionA2Layout.setHorizontalGroup(
            OpcionA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(OpcionA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_A2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        OpcionA2Layout.setVerticalGroup(
            OpcionA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
            .addGroup(OpcionA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_A2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        OpcionB2.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_2.add(Opcion_B2);
        Opcion_B2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_B2.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_B2.setText("1.5kΩ");
        Opcion_B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_B2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionB2Layout = new javax.swing.GroupLayout(OpcionB2);
        OpcionB2.setLayout(OpcionB2Layout);
        OpcionB2Layout.setHorizontalGroup(
            OpcionB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(OpcionB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_B2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        OpcionB2Layout.setVerticalGroup(
            OpcionB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(OpcionB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_B2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        OpcionC2.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_2.add(Opcion_C2);
        Opcion_C2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_C2.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_C2.setText("2kΩ");
        Opcion_C2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_C2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionC2Layout = new javax.swing.GroupLayout(OpcionC2);
        OpcionC2.setLayout(OpcionC2Layout);
        OpcionC2Layout.setHorizontalGroup(
            OpcionC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(OpcionC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );
        OpcionC2Layout.setVerticalGroup(
            OpcionC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(OpcionC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Opcion_C2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        OpcionD2.setBackground(new java.awt.Color(102, 165, 173));

        btn_group_2.add(Opcion_D2);
        Opcion_D2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Opcion_D2.setForeground(new java.awt.Color(252, 217, 0));
        Opcion_D2.setText("1.25kΩ");
        Opcion_D2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Opcion_D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_D2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout OpcionD2Layout = new javax.swing.GroupLayout(OpcionD2);
        OpcionD2.setLayout(OpcionD2Layout);
        OpcionD2Layout.setHorizontalGroup(
            OpcionD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opcion_D2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OpcionD2Layout.setVerticalGroup(
            OpcionD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Opcion_D2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelQ_2Layout = new javax.swing.GroupLayout(PanelQ_2);
        PanelQ_2.setLayout(PanelQ_2Layout);
        PanelQ_2Layout.setHorizontalGroup(
            PanelQ_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQ_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelQ_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OpcionD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpcionC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpcionB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OpcionA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pregunta_panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelQ_2Layout.setVerticalGroup(
            PanelQ_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQ_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pregunta_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OpcionD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(PanelQ_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 400, 520));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exit_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_btn.setText("X");
        exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 770, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        Next.setBackground(new java.awt.Color(7, 87, 91));

        next_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        next_btn.setForeground(new java.awt.Color(252, 217, 0));
        next_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        next_btn.setText("Siguiente");
        next_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                next_btnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout NextLayout = new javax.swing.GroupLayout(Next);
        Next.setLayout(NextLayout);
        NextLayout.setHorizontalGroup(
            NextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(next_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        NextLayout.setVerticalGroup(
            NextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(next_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_btnMouseClicked

    private void exit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseEntered
        exitbtn.setBackground(Color.red);
    }//GEN-LAST:event_exit_btnMouseEntered

    private void exit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseExited
        exitbtn.setBackground(Color.white);
    }//GEN-LAST:event_exit_btnMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void Opcion_A1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_A1MousePressed
        c.getSelection(Opcion_A1.getLabel());
        if (Opcion_A1.getLabel() == "330Ω"){
            is_correct1 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct1 = false;
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_A1MousePressed

    private void Opcion_B1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_B1MousePressed
        c.getSelection(Opcion_B1.getLabel());
        if (Opcion_B1.getLabel() == "330Ω"){
            is_correct1 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct1 = false;
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_B1MousePressed

    private void Opcion_C1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_C1MousePressed
        c.getSelection(Opcion_C1.getLabel());
        if (Opcion_C1.getLabel() == "330Ω"){
            is_correct1 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct1 = false;
            System.out.println("Es Falso");
        }
        
    }//GEN-LAST:event_Opcion_C1MousePressed

    private void Opcion_D1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_D1MousePressed
        c.getSelection(Opcion_D1.getLabel());
        if (Opcion_D1.getLabel() == "330Ω"){
            is_correct1 = true;

            System.out.println("Es Correcto");
        }else{
            is_correct1 = false;
            
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_D1MousePressed

    private void next_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btnMousePressed
        if (this.is_correct1 == true && this.is_correct2 == true){
            this.points += 200;
            Ohm_Test2 ohm = new Ohm_Test2();
            ohm.getPoints(this.points);
            JOptionPane.showMessageDialog(this, "Ha conseguido: "+(this.points - this.puntos)+" puntos");
            ohm.setVisible(true);
            this.setVisible(false);
            
        }else if (this.is_correct1 == true || this.is_correct2 == true){
            this.points += 90;

            Ohm_Test2 ohm = new Ohm_Test2();
            ohm.getPoints(this.points);
            JOptionPane.showMessageDialog(this, "Ha conseguido: "+(this.points - this.puntos)+" puntos");
            ohm.setVisible(true);
            this.setVisible(false);

        }else{
            this.points -= 20;
            Ohm_Test2 ohm = new Ohm_Test2();
            ohm.getPoints(this.points);
            JOptionPane.showMessageDialog(this, "Ha Perdodo: "+(this.points - this.puntos)+" puntos");
            ohm.setVisible(true);
            this.setVisible(false);

            
        }
        System.out.println(this.points);
    }//GEN-LAST:event_next_btnMousePressed

    private void Opcion_A2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_A2MousePressed
        c.getSelection(Opcion_A2.getLabel());
        if (Opcion_A2.getLabel() == "2kΩ"){
            is_correct2 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct2 = false;
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_A2MousePressed

    private void Opcion_B2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_B2MousePressed
        c.getSelection(Opcion_B2.getLabel());
        if (Opcion_B2.getLabel() == "2kΩ"){
            is_correct2 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct2 = false;
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_B2MousePressed

    private void Opcion_C2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_C2MousePressed
        c.getSelection(Opcion_C2.getLabel());
        if (Opcion_C2.getLabel() == "2kΩ"){
            is_correct2 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct2 = false;
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_C2MousePressed

    private void Opcion_D2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_D2MousePressed
        c.getSelection(Opcion_D2.getLabel());
        if (Opcion_D2.getLabel() == "2kΩ"){
            is_correct2 = true;
            System.out.println("Es Correcto");
        }else{
            is_correct2 = false;
            System.out.println("Es Falso");
        }
    }//GEN-LAST:event_Opcion_D2MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ohm_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ohm_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ohm_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ohm_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ohm_Test1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JPanel Next;
    private javax.swing.JPanel OpcionA1;
    private javax.swing.JPanel OpcionA2;
    private javax.swing.JPanel OpcionB1;
    private javax.swing.JPanel OpcionB2;
    private javax.swing.JPanel OpcionC1;
    private javax.swing.JPanel OpcionC2;
    private javax.swing.JPanel OpcionD1;
    private javax.swing.JPanel OpcionD2;
    private javax.swing.JRadioButton Opcion_A1;
    private javax.swing.JRadioButton Opcion_A2;
    private javax.swing.JRadioButton Opcion_B1;
    private javax.swing.JRadioButton Opcion_B2;
    private javax.swing.JRadioButton Opcion_C1;
    private javax.swing.JRadioButton Opcion_C2;
    private javax.swing.JRadioButton Opcion_D1;
    private javax.swing.JRadioButton Opcion_D2;
    private javax.swing.JPanel PanelQ_1;
    private javax.swing.JPanel PanelQ_2;
    private javax.swing.JLabel Pregunta_1;
    private javax.swing.JLabel Pregunta_2;
    private javax.swing.JPanel Pregunta_panel;
    private javax.swing.JPanel Pregunta_panel1;
    private javax.swing.JPanel bg;
    public static javax.swing.ButtonGroup btn_group_1;
    private javax.swing.ButtonGroup btn_group_2;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel next_btn;
    // End of variables declaration//GEN-END:variables
}
