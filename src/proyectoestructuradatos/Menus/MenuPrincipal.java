/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoestructuradatos.Menus;

import java.awt.Color;
import java.util.Arrays;

import javax.swing.ImageIcon;

import proyectoestructuradatos.ListaS;
import proyectoestructuradatos.ProyectoEstructuraDatos;
/**
 *
 * @author Choungion
 */
public class MenuPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;
    private misFuentes fuentes = new misFuentes();;
    
    public MenuPrincipal() {
        initComponents();
        setearImagenes();
        setearFuentes();
        System.out.println("owo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alumnos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ID = new javax.swing.JList<>();
        titulo = new javax.swing.JLabel();
        menubg = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        ConsultarNota = new javax.swing.JButton();
        ConsultarInfo = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        EmpresaLogo = new javax.swing.JLabel();
        AgregarLogo = new javax.swing.JLabel();
        EliminarLogo = new javax.swing.JLabel();
        ConsultarNotaLogo = new javax.swing.JLabel();
        InformacionLogo = new javax.swing.JLabel();
        SalirLogo = new javax.swing.JLabel();
        subrayado = new javax.swing.JPanel();
        barrita = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(254, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(800, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra.setEnabled(false);
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 122, 120));
        jLabel1.setText("Alumnos");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 122, 120));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 120, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

        Alumnos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Alumnos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ProyectoEstructuraDatos.nombres();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Alumnos);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 120, 300));

        jScrollPane2.setBorder(null);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setEnabled(false);

        ID.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ID.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ProyectoEstructuraDatos.id();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ID);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 250, 80, 300));

        titulo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(23, 57, 57));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Sistema Gestor de Alumnos");
        titulo.setToolTipText("");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setRequestFocusEnabled(false);
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 470, 30));

        menubg.setBackground(new java.awt.Color(43, 122, 120));
        menubg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setBackground(new java.awt.Color(43, 122, 120));
        Agregar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Agregar.setForeground(new java.awt.Color(222, 242, 241));
        Agregar.setText("Agregar Alumno");
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
        menubg.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 90));

        Eliminar.setBackground(new java.awt.Color(43, 122, 120));
        Eliminar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(222, 242, 241));
        Eliminar.setText("Eliminar Alumno");
        Eliminar.setBorder(null);
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.setFocusPainted(false);
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarMouseExited(evt);
            }
        });
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        menubg.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 240, 90));

        ConsultarNota.setBackground(new java.awt.Color(43, 122, 120));
        ConsultarNota.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ConsultarNota.setForeground(new java.awt.Color(222, 242, 241));
        ConsultarNota.setText("Consultar Nota");
        ConsultarNota.setBorder(null);
        ConsultarNota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConsultarNota.setFocusPainted(false);
        ConsultarNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultarNotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultarNotaMouseExited(evt);
            }
        });
        ConsultarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarNotaActionPerformed(evt);
            }
        });
        menubg.add(ConsultarNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 240, 90));

        ConsultarInfo.setBackground(new java.awt.Color(43, 122, 120));
        ConsultarInfo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ConsultarInfo.setForeground(new java.awt.Color(222, 242, 241));
        ConsultarInfo.setText("Información Notas");
        ConsultarInfo.setBorder(null);
        ConsultarInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConsultarInfo.setFocusPainted(false);
        ConsultarInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultarInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultarInfoMouseExited(evt);
            }
        });
        ConsultarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarInfoActionPerformed(evt);
            }
        });
        menubg.add(ConsultarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 240, 90));

        Salir.setBackground(new java.awt.Color(43, 122, 120));
        Salir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(222, 242, 241));
        Salir.setText("Salir");
        Salir.setBorder(null);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.setFocusPainted(false);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menubg.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 240, 90));

        EmpresaLogo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        EmpresaLogo.setForeground(new java.awt.Color(222, 242, 241));
        EmpresaLogo.setText("EduTec");
        menubg.add(EmpresaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 80));

        AgregarLogo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        menubg.add(AgregarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 70));
        menubg.add(EliminarLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 70));
        menubg.add(ConsultarNotaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 70, 70));
        menubg.add(InformacionLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, 70));
        menubg.add(SalirLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 70, 70));

        subrayado.setBackground(new java.awt.Color(222, 242, 241));
        subrayado.setForeground(new java.awt.Color(222, 242, 241));

        javax.swing.GroupLayout subrayadoLayout = new javax.swing.GroupLayout(subrayado);
        subrayado.setLayout(subrayadoLayout);
        subrayadoLayout.setHorizontalGroup(
            subrayadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        subrayadoLayout.setVerticalGroup(
            subrayadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        menubg.add(subrayado, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 300, 3));

        bg.add(menubg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        barrita.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout barritaLayout = new javax.swing.GroupLayout(barrita);
        barrita.setLayout(barritaLayout);
        barritaLayout.setHorizontalGroup(
            barritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barritaLayout.setVerticalGroup(
            barritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        bg.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 2, 350));

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

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        new MenuAdd().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        new MenuEliminar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        Agregar.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
        Agregar.setBackground(new java.awt.Color(42, 122, 120));
    }//GEN-LAST:event_AgregarMouseExited

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        Eliminar.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_EliminarMouseEntered

    private void ConsultarNotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarNotaMouseEntered
        ConsultarNota.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_ConsultarNotaMouseEntered

    private void ConsultarInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarInfoMouseEntered
        ConsultarInfo.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_ConsultarInfoMouseEntered

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_SalirMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        Eliminar.setBackground(new java.awt.Color(42, 122, 120));
    }//GEN-LAST:event_EliminarMouseExited

    private void ConsultarNotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarNotaMouseExited
       ConsultarNota.setBackground(new java.awt.Color(42, 122, 120));
    }//GEN-LAST:event_ConsultarNotaMouseExited

    private void ConsultarInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarInfoMouseExited
        ConsultarInfo.setBackground(new java.awt.Color(42, 122, 120));
    }//GEN-LAST:event_ConsultarInfoMouseExited

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new java.awt.Color(42, 122, 120));
    }//GEN-LAST:event_SalirMouseExited

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) 
    {
        System.exit(0);
    }

    private void ConsultarNotaActionPerformed(java.awt.event.ActionEvent evt) 
    {
        new MenuNota().setVisible(true);
        this.setVisible(false);
    }

    private void ConsultarInfoActionPerformed(java.awt.event.ActionEvent evt) 
    {
        new MenuInfoNotas().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel AgregarLogo;
    private javax.swing.JList<String> Alumnos;
    private javax.swing.JPanel Barra;
    private javax.swing.JButton ConsultarInfo;
    private javax.swing.JButton ConsultarNota;
    private javax.swing.JLabel ConsultarNotaLogo;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel EliminarLogo;
    private javax.swing.JLabel EmpresaLogo;
    private javax.swing.JList<String> ID;
    private javax.swing.JLabel InformacionLogo;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel SalirLogo;
    private javax.swing.JPanel barrita;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menubg;
    private javax.swing.JPanel subrayado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    
    public void setearImagenes(){
        try{
            AgregarLogo.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarLogo.png")));
            EliminarLogo.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarLogo.png")));
            ConsultarNotaLogo.setIcon(new ImageIcon(getClass().getResource("/imagenes/notaLogo.png")));
            InformacionLogo.setIcon(new ImageIcon(getClass().getResource("/imagenes/informacionLogo.png")));
            SalirLogo.setIcon(new ImageIcon(getClass().getResource("/imagenes/salirLogo.png")));
        }catch(Exception ex){
            System.out.println("Error no se encontro alguna imagen");
        }
    }
    
    public void setearFuentes(){
        titulo.setFont(fuentes.RobotoBold().deriveFont(30f));
        EmpresaLogo.setFont(fuentes.Roboto().deriveFont(48f));
        Agregar.setFont(fuentes.Roboto().deriveFont(24f));
        Eliminar.setFont(fuentes.Roboto().deriveFont(24f));
        ConsultarNota.setFont(fuentes.Roboto().deriveFont(24f));
        ConsultarInfo.setFont(fuentes.Roboto().deriveFont(24f));
        Salir.setFont(fuentes.Roboto().deriveFont(24f));
        jLabel1.setFont(fuentes.RobotoBold().deriveFont(28f));
        jLabel2.setFont(fuentes.RobotoBold().deriveFont(28f));
        Alumnos.setFont(fuentes.Roboto().deriveFont(20f));
        ID.setFont(fuentes.Roboto().deriveFont(20f));
    }
}
