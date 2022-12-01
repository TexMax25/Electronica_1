/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.screens;

import com.conection.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class LoginScreen extends javax.swing.JFrame {
    
    Conexion cx;
    
    public static String users = "";
    public static int puntos_ant;
    
    int xMouse,yMouse;
    public LoginScreen() {
        initComponents();
        this.setLocationRelativeTo(this);
        cx = new Conexion("sql10581290");

    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("com/images/Icon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nombre_app = new javax.swing.JLabel();
        nombre_app1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exit_btn = new javax.swing.JLabel();
        Iniciar_Sesion_text = new javax.swing.JLabel();
        mini_logo1 = new javax.swing.JLabel();
        user_text = new javax.swing.JLabel();
        user_entry = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        password_text = new javax.swing.JLabel();
        password_entry = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        login_btn = new javax.swing.JPanel();
        Iniciar_sesion_text = new javax.swing.JLabel();
        Register_btn = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 165, 173));

        logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(252, 217, 0));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo_Unal.png"))); // NOI18N
        logo.setToolTipText("");

        nombre_app.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre_app.setForeground(new java.awt.Color(0, 59, 70));
        nombre_app.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_app.setText("Erick Enrique Bastidas Santana");

        nombre_app1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombre_app1.setForeground(new java.awt.Color(0, 59, 70));
        nombre_app1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_app1.setText("Santiago Jesus Marquez Calderon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre_app1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_app, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre_app1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre_app, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 500));

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

        Iniciar_Sesion_text.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Iniciar_Sesion_text.setForeground(new java.awt.Color(0, 59, 70));
        Iniciar_Sesion_text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Iniciar_Sesion_text.setText("Iniciar Sesion");
        bg.add(Iniciar_Sesion_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 190, 60));

        mini_logo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mini_logo1.setForeground(new java.awt.Color(0, 59, 70));
        mini_logo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mini_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo.png"))); // NOI18N
        bg.add(mini_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 210, 80));

        user_text.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        user_text.setForeground(new java.awt.Color(0, 59, 70));
        user_text.setText("Usuario");
        bg.add(user_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        user_entry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_entry.setForeground(new java.awt.Color(153, 153, 153));
        user_entry.setText("Ingrese su usuario");
        user_entry.setBorder(null);
        user_entry.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user_entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user_entryMousePressed(evt);
            }
        });
        bg.add(user_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 59, 70));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 380, 30));

        password_text.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        password_text.setForeground(new java.awt.Color(0, 59, 70));
        password_text.setText("Contraseña");
        bg.add(password_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 30));

        password_entry.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_entry.setForeground(new java.awt.Color(153, 153, 153));
        password_entry.setText("********");
        password_entry.setBorder(null);
        password_entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                password_entryMousePressed(evt);
            }
        });
        bg.add(password_entry, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 420, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 59, 70));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 380, 30));

        login_btn.setBackground(new java.awt.Color(102, 165, 173));
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Iniciar_sesion_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Iniciar_sesion_text.setForeground(new java.awt.Color(0, 59, 70));
        Iniciar_sesion_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Iniciar_sesion_text.setText("Iniciar Sesion");
        Iniciar_sesion_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciar_sesion_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Iniciar_sesion_textMousePressed(evt);
            }
        });

        javax.swing.GroupLayout login_btnLayout = new javax.swing.GroupLayout(login_btn);
        login_btn.setLayout(login_btnLayout);
        login_btnLayout.setHorizontalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar_sesion_text, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        login_btnLayout.setVerticalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar_sesion_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 170, 40));

        Register_btn.setForeground(new java.awt.Color(153, 153, 153));
        Register_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Register_btn.setText("Registrarse");
        Register_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Register_btnMousePressed(evt);
            }
        });
        bg.add(Register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 170, -1));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 70, 30));

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
   
            
            
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_btnMouseClicked

    private void exit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseEntered
        exitbtn.setBackground(Color.red);
    }//GEN-LAST:event_exit_btnMouseEntered

    private void exit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseExited
        exitbtn.setBackground(Color.white);
    }//GEN-LAST:event_exit_btnMouseExited

    private void user_entryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_entryMousePressed
        if (user_entry.getText().equals("Ingrese su usuario")){
            user_entry.setText("");
            user_entry.setForeground(new Color(0,59,70));
        }
        if (String.valueOf(password_entry.getPassword()).isEmpty()){
            password_entry.setText("********");
            password_entry.setForeground(Color.gray);
        }
    }//GEN-LAST:event_user_entryMousePressed

    private void password_entryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_entryMousePressed
        if (String.valueOf(password_entry.getPassword()).equals("********")){
            password_entry.setText("");
            password_entry.setForeground(new Color(0,59,70));
        }
        if (user_entry.getText().isEmpty()){ 
            user_entry.setText("Ingrese su usuario");
            user_entry.setForeground(Color.gray);
        }
    }//GEN-LAST:event_password_entryMousePressed

    private void Iniciar_sesion_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iniciar_sesion_textMousePressed
        try {
            String user=user_entry.getText();
            String password=String.valueOf(password_entry.getPassword());
            
            String query = "SELECT * FROM usuario WHERE user='"+user+"' and password='"+password+"'";
            //String query1 = "SELECT puntos FROM usuario WHERE user='"+user+"'";
                  
            
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);


            
            
            if (rs.next()){
                JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso");
                JOptionPane.showMessageDialog(this, "1. Se recomienda responder todos los test en la misma sesion (los puntos no se guardan entre sesiones)\n"
                        + "2. Despues de realizar un tema recomendamos utilizar el boton de recargar \n"
                        + "3. Si se encuentra algun error reportarlo con los creadores: \n"
                        + "          Santiago Marquez y Erick Bastidas", "Recomendaciones de uso",JOptionPane. INFORMATION_MESSAGE);
                MainScreen ms = new MainScreen();
                puntos_ant = rs.getInt(4);
                users = rs.getString("user");
                System.out.println("hola"+puntos_ant);
                ms.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "El usuario NO se encuentra registrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_Iniciar_sesion_textMousePressed

    private void Register_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_btnMousePressed
        RegisterScreen r = new RegisterScreen();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Register_btnMousePressed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Iniciar_Sesion_text;
    private javax.swing.JLabel Iniciar_sesion_text;
    private javax.swing.JLabel Register_btn;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel login_btn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mini_logo1;
    private javax.swing.JLabel nombre_app;
    private javax.swing.JLabel nombre_app1;
    private javax.swing.JPasswordField password_entry;
    private javax.swing.JLabel password_text;
    private javax.swing.JTextField user_entry;
    private javax.swing.JLabel user_text;
    // End of variables declaration//GEN-END:variables
}
