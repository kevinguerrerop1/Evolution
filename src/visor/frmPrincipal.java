package visor;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public final class frmPrincipal extends javax.swing.JFrame {

    public static int idPersonal;

    public static void centrar(JInternalFrame frm) {
        Dimension desktopSize = vista.getSize();
        Dimension FrameSize = frm.getSize();
        frm.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        frm.show();
    }

    public frmPrincipal() {
        initComponents();
        this.setExtendedState(6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vista = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        iniciar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        cerrar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel3 = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gimnasio Evolution");

        vista.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator3);

        iniciar.setText("Iniciar");
        iniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iniciar.setFocusable(false);
        iniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        jToolBar1.add(iniciar);
        jToolBar1.add(jSeparator2);

        cerrar.setText("Cerrar");
        cerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrar.setFocusable(false);
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(cerrar);

        jToolBar2.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre: ");
        jToolBar2.add(jLabel1);

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToolBar2.add(nombre);
        jToolBar2.add(jSeparator1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cargo: ");
        jToolBar2.add(jLabel3);

        cargo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToolBar2.add(cargo);

        vista.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        vista.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout vistaLayout = new javax.swing.GroupLayout(vista);
        vista.setLayout(vistaLayout);
        vistaLayout.setHorizontalGroup(
            vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
        );
        vistaLayout.setVerticalGroup(
            vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vistaLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 759, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Inscribir Clientes");
        jMenu1.setEnabled(false);
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Inscribir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Actualizar Membresia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Trabajadores");
        jMenu2.setEnabled(false);
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem3.setText("Admin. Trabajadores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vista)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vista)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        frmIngreso log = new frmIngreso();
        vista.add(log);
        centrar(log);
    }//GEN-LAST:event_iniciarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

    }//GEN-LAST:event_jMenu1MouseClicked

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        frmCargos frm = new frmCargos();
        vista.add(frm);
        centrar(frm);
    }//GEN-LAST:event_cerrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmActualizar frm2 = new frmActualizar();
        vista.add(frm2);
        centrar(frm2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmIngreso frm = new frmIngreso();
        vista.add(frm);
        centrar(frm);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       frmAminTra frm = new frmAminTra();
       vista.add(frm);
        centrar(frm);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //Windows mode
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

                    //Metalico
                    //javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cargo;
    public static javax.swing.JButton cerrar;
    public static javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JDesktopPane vista;
    // End of variables declaration//GEN-END:variables
}
