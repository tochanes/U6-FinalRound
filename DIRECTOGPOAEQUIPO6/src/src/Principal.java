package src;

public class Principal extends javax.swing.JFrame {
    
    public static AdmonProfesores ap = new AdmonProfesores();

    public Principal() {
        initComponents();
        usuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono = new javax.swing.JLabel();
        copyrigth = new javax.swing.JLabel();
        bienvenida = new javax.swing.JButton();
        usuario = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opcAcercaDe = new javax.swing.JMenuItem();
        opcSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opcAltas = new javax.swing.JMenuItem();
        opcModifiacion = new javax.swing.JMenuItem();
        opcBajas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opcIndividual = new javax.swing.JMenuItem();
        opcGeneral = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        icono.setText(" ");
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, -1, -1));

        copyrigth.setFont(new java.awt.Font("Comic Sans MS", 2, 9)); // NOI18N
        copyrigth.setText("Sistema Unidad 5 y 6: Directotio de Profesores del Tecnologico de Zapotlan, All Rights Reserved, 2019");
        getContentPane().add(copyrigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        bienvenida.setFont(new java.awt.Font("Century Gothic", 3, 50)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(35, 15, 114));
        bienvenida.setText("BIENVENIDO");
        bienvenida.setBorderPainted(false);
        bienvenida.setContentAreaFilled(false);
        bienvenida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bienvenida.setDefaultCapable(false);
        bienvenida.setFocusPainted(false);
        bienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bienvenidaActionPerformed(evt);
            }
        });
        getContentPane().add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        usuario.setFont(new java.awt.Font("Century Gothic", 3, 25)); // NOI18N
        usuario.setForeground(new java.awt.Color(34, 21, 122));
        usuario.setText("Estimado Usuario");
        usuario.setBorderPainted(false);
        usuario.setContentAreaFilled(false);
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuario.setDefaultCapable(false);
        usuario.setFocusPainted(false);
        usuario.setFocusable(false);
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -220, -1, -1));

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        opcAcercaDe.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcAcercaDe.setText("Acerca de...");
        opcAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAcercaDeActionPerformed(evt);
            }
        });
        jMenu1.add(opcAcercaDe);

        opcSalir.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcSalir.setText("Salir");
        opcSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opcSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        opcAltas.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcAltas.setText("Altas");
        opcAltas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAltasActionPerformed(evt);
            }
        });
        jMenu2.add(opcAltas);

        opcModifiacion.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcModifiacion.setText("Modificacion");
        opcModifiacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcModifiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcModifiacionActionPerformed(evt);
            }
        });
        jMenu2.add(opcModifiacion);

        opcBajas.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcBajas.setText("Baja");
        opcBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcBajasActionPerformed(evt);
            }
        });
        jMenu2.add(opcBajas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenu3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        opcIndividual.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcIndividual.setText("Individual");
        opcIndividual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcIndividualActionPerformed(evt);
            }
        });
        jMenu3.add(opcIndividual);

        opcGeneral.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        opcGeneral.setText("General");
        opcGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(opcGeneral);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAltasActionPerformed
        FrmAltas vis = new FrmAltas(this, true);
        vis.setVisible(true);
    }//GEN-LAST:event_opcAltasActionPerformed

    private void opcSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcSalirActionPerformed

    private void opcModifiacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcModifiacionActionPerformed
        FrmModificacion fm = new FrmModificacion(this, true);
        fm.setVisible(true);
    }//GEN-LAST:event_opcModifiacionActionPerformed

    private void opcBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcBajasActionPerformed
        FrmBajas fb = new FrmBajas(this, true);
        fb.setVisible(true);
    }//GEN-LAST:event_opcBajasActionPerformed

    private void opcIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcIndividualActionPerformed
        FrmConsIndividual ci = new FrmConsIndividual(this, true);
        ci.setVisible(true);
        ci.setResizable(false);
    }//GEN-LAST:event_opcIndividualActionPerformed

    private void bienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bienvenidaActionPerformed
        usuario.setVisible(true);
    }//GEN-LAST:event_bienvenidaActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        usuario.setVisible(false);
    }//GEN-LAST:event_usuarioActionPerformed

    private void opcAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAcercaDeActionPerformed
        FrmAcercaDe acd = new FrmAcercaDe(this, true);
        acd.setVisible(true);
    }//GEN-LAST:event_opcAcercaDeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.setVisible(true);
                principal.setResizable(false);
                principal.setLocationRelativeTo(null);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bienvenida;
    private javax.swing.JLabel copyrigth;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opcAcercaDe;
    private javax.swing.JMenuItem opcAltas;
    private javax.swing.JMenuItem opcBajas;
    private javax.swing.JMenuItem opcGeneral;
    private javax.swing.JMenuItem opcIndividual;
    private javax.swing.JMenuItem opcModifiacion;
    private javax.swing.JMenuItem opcSalir;
    private javax.swing.JButton usuario;
    // End of variables declaration//GEN-END:variables
}
