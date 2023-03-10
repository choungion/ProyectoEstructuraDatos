/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoestructuradatos.Menus;

/**
 *
 * @author choungion
 */
public class MenuInfoNotas extends javax.swing.JFrame {

    int xMouse, yMouse;
    misFuentes fuentes = new misFuentes();
    
    public MenuInfoNotas() {
        initComponents();
        setearFuentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Promedio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NotaMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NotaMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Desviacion = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(254, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 122, 120));
        jLabel1.setText("Promedio general:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        Promedio.setEditable(false);
        Promedio.setBackground(new java.awt.Color(254, 255, 255));
        Promedio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Promedio.setForeground(new java.awt.Color(43, 122, 120));
        Promedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Promedio.setText("0");
        Promedio.setToolTipText("");
        Promedio.setBorder(null);
        Promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromedioActionPerformed(evt);
            }
        });
        bg.add(Promedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 130, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 122, 120));
        jLabel2.setText("Nota maxima:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        NotaMax.setEditable(false);
        NotaMax.setBackground(new java.awt.Color(254, 255, 255));
        NotaMax.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NotaMax.setForeground(new java.awt.Color(43, 122, 120));
        NotaMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NotaMax.setText("0");
        NotaMax.setToolTipText("");
        NotaMax.setBorder(null);
        NotaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotaMaxActionPerformed(evt);
            }
        });
        bg.add(NotaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 130, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 122, 120));
        jLabel3.setText("Nota minima:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        NotaMin.setEditable(false);
        NotaMin.setBackground(new java.awt.Color(254, 255, 255));
        NotaMin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NotaMin.setForeground(new java.awt.Color(43, 122, 120));
        NotaMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NotaMin.setText("0");
        NotaMin.setToolTipText("");
        NotaMin.setBorder(null);
        NotaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotaMinActionPerformed(evt);
            }
        });
        bg.add(NotaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 130, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 122, 120));
        jLabel4.setText("Desviacion estandar:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        Desviacion.setEditable(false);
        Desviacion.setBackground(new java.awt.Color(254, 255, 255));
        Desviacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Desviacion.setForeground(new java.awt.Color(43, 122, 120));
        Desviacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Desviacion.setText("0");
        Desviacion.setToolTipText("");
        Desviacion.setBorder(null);
        Desviacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesviacionActionPerformed(evt);
            }
        });
        bg.add(Desviacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 130, -1));

        Cerrar.setBackground(new java.awt.Color(254, 255, 255));
        Cerrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(23, 57, 57));
        Cerrar.setText("Volver");
        Cerrar.setBorder(null);
        Cerrar.setBorderPainted(false);
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.setFocusPainted(false);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        bg.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 120, 80));

        jPanel1.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 2, 400));

        jPanel2.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 130, 600, 2));

        jPanel3.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 210, 600, 2));

        jPanel4.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 290, 600, 2));

        jPanel5.setBackground(new java.awt.Color(23, 37, 42));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bg.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 380, 600, 2));

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

    private void PromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PromedioActionPerformed

    private void NotaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotaMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotaMaxActionPerformed

    private void NotaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotaMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotaMinActionPerformed

    private void DesviacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesviacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesviacionActionPerformed

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) 
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
            java.util.logging.Logger.getLogger(MenuInfoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInfoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInfoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInfoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInfoNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField Desviacion;
    private javax.swing.JTextField NotaMax;
    private javax.swing.JTextField NotaMin;
    private javax.swing.JTextField Promedio;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    public void setearFuentes(){
        jLabel1.setFont(fuentes.RobotoBold().deriveFont(24f));
        jLabel2.setFont(fuentes.RobotoBold().deriveFont(24f));
        jLabel3.setFont(fuentes.RobotoBold().deriveFont(24f));
        jLabel4.setFont(fuentes.RobotoBold().deriveFont(24f));
        Desviacion.setFont(fuentes.RobotoBold().deriveFont(24f));
        NotaMax.setFont(fuentes.RobotoBold().deriveFont(24f));
        NotaMin.setFont(fuentes.RobotoBold().deriveFont(24f));
        Promedio.setFont(fuentes.RobotoBold().deriveFont(24f));
        Cerrar.setFont(fuentes.Roboto().deriveFont(18f));
    }
}
