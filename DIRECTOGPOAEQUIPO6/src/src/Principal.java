package src;

public class Principal extends javax.swing.JFrame {
    
    public static AdmonProfesores ap = new AdmonProfesores();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        setTitle("Menu");

        jMenu1.setText("Archivo");

        opcAcercaDe.setText("Acerca de...");
        jMenu1.add(opcAcercaDe);

        opcSalir.setText("Salir");
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opcSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operaciones");

        opcAltas.setText("Altas");
        opcAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAltasActionPerformed(evt);
            }
        });
        jMenu2.add(opcAltas);

        opcModifiacion.setText("Modificacion");
        opcModifiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcModifiacionActionPerformed(evt);
            }
        });
        jMenu2.add(opcModifiacion);

        opcBajas.setText("Baja");
        opcBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcBajasActionPerformed(evt);
            }
        });
        jMenu2.add(opcBajas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        opcIndividual.setText("Individual");
        jMenu3.add(opcIndividual);

        opcGeneral.setText("General");
        jMenu3.add(opcGeneral);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
