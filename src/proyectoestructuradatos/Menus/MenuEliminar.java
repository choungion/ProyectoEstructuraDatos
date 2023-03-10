/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package proyectoestructuradatos.Menus;

import proyectoestructuradatos.ListaS;
import proyectoestructuradatos.ProyectoEstructuraDatos;

/**
 *
 * @author choungion
 */
public class MenuEliminar extends javax.swing.JFrame {

    int xMouse, yMouse;
    private misFuentes fuentes = new misFuentes();
    
    public MenuEliminar() {
        initComponents();
        setearFuentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alumnos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ID1 = new javax.swing.JList<>();
        barrita = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(254, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(43, 122, 120));
        Titulo.setText("Escriba el ID del alumno que desee eliminar");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 37, 42), 2));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDKeyPressed(evt);
            }
        });
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 260, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 122, 120));
        jLabel2.setText("Nombre del alumno:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Nombre.setEditable(false);
        Nombre.setBackground(new java.awt.Color(254, 255, 255));
        Nombre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Nombre.setForeground(new java.awt.Color(43, 122, 120));
        Nombre.setBorder(null);
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        bg.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 180, 28));

        Eliminar.setBackground(new java.awt.Color(254, 255, 255));
        Eliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(23, 37, 42));
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        bg.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 130, 40));

        Cancelar.setBackground(new java.awt.Color(254, 255, 255));
        Cancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(23, 57, 57));
        Cancelar.setText("Volver");
        Cancelar.setBorder(null);
        Cancelar.setBorderPainted(false);
        Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelar.setFocusPainted(false);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        bg.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 120, 80));

        Buscar.setBackground(new java.awt.Color(23, 57, 57));
        Buscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(254, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorderPainted(false);
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setFocusPainted(false);
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        bg.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 130, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 122, 120));
        jLabel3.setText("Alumnos");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 122, 120));
        jLabel4.setText("ID");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 20, 20));

        jScrollPane1.setBorder(null);

        Alumnos.setBorder(null);
        Alumnos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Alumnos.setForeground(new java.awt.Color(23, 37, 42));
        Alumnos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ProyectoEstructuraDatos.nombres();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Alumnos);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 60, 260));

        jScrollPane2.setBorder(null);

        ID1.setBorder(null);
        ID1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ID1.setForeground(new java.awt.Color(23, 37, 42));
        ID1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = ProyectoEstructuraDatos.id();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ID1);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 50, 260));

        barrita.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout barritaLayout = new javax.swing.GroupLayout(barrita);
        barrita.setLayout(barritaLayout);
        barritaLayout.setHorizontalGroup(
            barritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        barritaLayout.setVerticalGroup(
            barritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        bg.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 2, 270));

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

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void EliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseEntered
        Eliminar.setBackground(new java.awt.Color(23, 57, 57));
        Eliminar.setForeground(new java.awt.Color(254, 255, 255));
    }//GEN-LAST:event_EliminarMouseEntered

    private void EliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseExited
        Eliminar.setBackground(new java.awt.Color(254, 255, 255));
        Eliminar.setForeground(new java.awt.Color(23, 57, 57));
    }//GEN-LAST:event_EliminarMouseExited

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        Buscar.setBackground(new java.awt.Color(64, 135, 133));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        Buscar.setBackground(new java.awt.Color(23, 57, 57));
    }//GEN-LAST:event_BuscarMouseExited

    private void IDKeyPressed(java.awt.event.KeyEvent evt) 
    {
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c))
        {
            ID.setEditable(true);
            ID.setBackground(new java.awt.Color(254, 255, 255));
        }
        else
        {
            ID.setEditable(false);
            ID.setBackground(new java.awt.Color(241,215,216));
        }
    }                             

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        ProyectoEstructuraDatos.Completar(this.ID.getText());
        this.Nombre.setText(ListaS.nombre());
    }

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        try
        {
            Integer.parseInt(this.ID.getText());
            ProyectoEstructuraDatos.Eliminar(this.ID.getText());
            this.setVisible(false);
        }
        catch (NumberFormatException ex) 
        {
            new Aviso().setVisible(true);
        }
    }

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        this.setVisible(false);
        new MenuPrincipal().setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Alumnos;
    private javax.swing.JPanel Barra;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField ID;
    private javax.swing.JList<String> ID1;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel barrita;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    public void setearFuentes(){
        Titulo.setFont(fuentes.RobotoBold().deriveFont(24f));
        jLabel2.setFont(fuentes.RobotoBold().deriveFont(24f));
        jLabel3.setFont(fuentes.RobotoBold().deriveFont(18f));
        jLabel4.setFont(fuentes.RobotoBold().deriveFont(18f));
        Buscar.setFont(fuentes.Roboto().deriveFont(14f));
        Eliminar.setFont(fuentes.Roboto().deriveFont(14f));
        Cancelar.setFont(fuentes.Roboto().deriveFont(18f));
        Alumnos.setFont(fuentes.Roboto().deriveFont(12f));
        ID1.setFont(fuentes.Roboto().deriveFont(12f));
        ID.setFont(fuentes.Roboto().deriveFont(14f));
    }
}
