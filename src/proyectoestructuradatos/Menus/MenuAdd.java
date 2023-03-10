/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoestructuradatos.Menus;

import java.awt.Color;
import java.util.Random;

import proyectoestructuradatos.ListaS;
import proyectoestructuradatos.ProyectoEstructuraDatos;

/**
 *
 * @author choungion
 */
public class MenuAdd extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    private misFuentes fuentes = new misFuentes();;
    
    public MenuAdd() {
        initComponents();
        setearFuentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Nota = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(254, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(800, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setOpaque(false);
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        bg.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        Titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(43, 122, 120));
        Titulo.setText("Ingrese los siguientes datos");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 122, 120));
        jLabel2.setText("Nombre");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 122, 120));
        jLabel1.setText("Apellido");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 122, 120));
        jLabel3.setText("Nota");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        Nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 57, 57), 2, true));
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreKeyPressed(evt);
            }
        });
        bg.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 650, 30));

        Apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 57, 57), 2));
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApellidoKeyPressed(evt);
            }
        });
        bg.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 650, 30));

        Nota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 57, 57), 2));
        Nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotaActionPerformed(evt);
            }
        });
        Nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NotaKeyPressed(evt);
            }
        });
        bg.add(Nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 650, 30));

        Cancelar.setBackground(new java.awt.Color(254, 255, 255));
        Cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(23, 57, 57));
        Cancelar.setText("Volver");
        Cancelar.setBorder(null);
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.setFocusPainted(false);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        bg.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 520, 120, 80));

        Agregar.setBackground(new java.awt.Color(23, 57, 57));
        Agregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Agregar.setForeground(new java.awt.Color(254, 255, 255));
        Agregar.setText("Agregar +");
        Agregar.setToolTipText("");
        Agregar.setBorder(null);
        Agregar.setBorderPainted(false);
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.setFocusPainted(false);
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarMouseExited(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        bg.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 150, 40));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void NotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotaActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        
        ListaS lista = new ListaS();
        String DatosAlumno = this.Nombre.getText() +" " + this.Apellido.getText() + " " + this.Nota.getText();
        try
        { 
            Double nota = Double.valueOf(this.Nota.getText());
            ProyectoEstructuraDatos.Add(DatosAlumno);
            this.setVisible(false);
        }
        catch (NumberFormatException ex) 
        {
            new Aviso().setVisible(true);
        }
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.setVisible(false);
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        Agregar.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
        Agregar.setBackground(new java.awt.Color(23, 57, 57));
    }//GEN-LAST:event_AgregarMouseExited

    private void NombreKeyPressed(java.awt.event.KeyEvent evt) 
    {
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isISOControl(c))
        {
            Nombre.setEditable(true);
            Nombre.setBackground(new java.awt.Color(254, 255, 255));
        }
        else
        {
            Nombre.setEditable(false);
            Nombre.setBackground(new java.awt.Color(241,215,216));
        }
    }

    private void ApellidoKeyPressed(java.awt.event.KeyEvent evt) 
    {
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isISOControl(c))
        {
            Apellido.setEditable(true);
            Apellido.setBackground(new java.awt.Color(254, 255, 255));
        }
        else
        {
            Apellido.setEditable(false);
            Apellido.setBackground(new java.awt.Color(241,215,216));
        }
    }

    private void NotaKeyPressed(java.awt.event.KeyEvent evt) 
    {
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || c == '.'|| Character.isISOControl(c))
        {
            Nota.setEditable(true);
            Nota.setBackground(new java.awt.Color(254, 255, 255));
        }
        else
        {
            Nota.setEditable(false);
            Nota.setBackground(new java.awt.Color(241,215,216));
        }
    }

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
            java.util.logging.Logger.getLogger(MenuAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Apellido;
    private javax.swing.JPanel Barra;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nota;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public void setearFuentes(){
        Titulo.setFont(fuentes.RobotoBold().deriveFont(36f));
        jLabel1.setFont(fuentes.Roboto().deriveFont(24f));
        jLabel2.setFont(fuentes.Roboto().deriveFont(24f));
        jLabel3.setFont(fuentes.Roboto().deriveFont(24f));
        Cancelar.setFont(fuentes.Roboto().deriveFont(18f));
        Agregar.setFont(fuentes.Roboto().deriveFont(18f));
        Nombre.setFont(fuentes.Roboto().deriveFont(15f));
        Apellido.setFont(fuentes.Roboto().deriveFont(15f));
        Nota.setFont(fuentes.Roboto().deriveFont(15f));
    }
}