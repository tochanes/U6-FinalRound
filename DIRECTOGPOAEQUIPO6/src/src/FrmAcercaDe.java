package src;
import javax.swing.JOptionPane;
public class FrmAcercaDe extends javax.swing.JDialog {
    Profesor p;
    public FrmAcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        b0a.setVisible(false);
        b1a.setVisible(false);
        b2a.setVisible(false);
        b3a.setVisible(false);
        b4a.setVisible(false);
        br1.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b0a = new javax.swing.JButton();
        b1a = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4a = new javax.swing.JButton();
        b2a = new javax.swing.JButton();
        b3a = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        br1 = new javax.swing.JLabel();
        br = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACERCA DE");
        setMinimumSize(new java.awt.Dimension(400, 350));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(350, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b0a.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        b0a.setForeground(new java.awt.Color(51, 51, 51));
        b0a.setText("El TEC o ITCG ");
        b0a.setBorderPainted(false);
        b0a.setContentAreaFilled(false);
        b0a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b0a.setDefaultCapable(false);
        b0a.setFocusPainted(false);
        b0a.setFocusable(false);
        b0a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0aActionPerformed(evt);
            }
        });
        getContentPane().add(b0a, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        b1a.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        b1a.setForeground(new java.awt.Color(51, 51, 51));
        b1a.setText("Profe Chema");
        b1a.setBorderPainted(false);
        b1a.setContentAreaFilled(false);
        b1a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b1a.setDefaultCapable(false);
        b1a.setFocusPainted(false);
        b1a.setFocusable(false);
        b1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1aActionPerformed(evt);
            }
        });
        getContentPane().add(b1a, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        b3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        b3.setForeground(new java.awt.Color(51, 51, 51));
        b3.setText("Alvaro Rosales Damian");
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b3.setDefaultCapable(false);
        b3.setFocusPainted(false);
        b3.setFocusable(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        b4.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        b4.setForeground(new java.awt.Color(51, 51, 51));
        b4.setText("Jose Manuel Gomez Diaz");
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b4.setDefaultCapable(false);
        b4.setFocusPainted(false);
        b4.setFocusable(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, 20));

        b0.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setText("Intituto Tecnologico de Ciudad Guzman");
        b0.setBorderPainted(false);
        b0.setContentAreaFilled(false);
        b0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b0.setDefaultCapable(false);
        b0.setFocusPainted(false);
        b0.setFocusable(false);
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        b2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        b2.setForeground(new java.awt.Color(51, 51, 51));
        b2.setText("Juan Pablo Solis Guzman");
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b2.setDefaultCapable(false);
        b2.setFocusPainted(false);
        b2.setFocusable(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 20));

        b4a.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        b4a.setForeground(new java.awt.Color(51, 51, 51));
        b4a.setText("Gomez");
        b4a.setBorderPainted(false);
        b4a.setContentAreaFilled(false);
        b4a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b4a.setDefaultCapable(false);
        b4a.setFocusPainted(false);
        b4a.setFocusable(false);
        b4a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4aActionPerformed(evt);
            }
        });
        getContentPane().add(b4a, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 10));

        b2a.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        b2a.setForeground(new java.awt.Color(51, 51, 51));
        b2a.setText("Jan Pol");
        b2a.setBorderPainted(false);
        b2a.setContentAreaFilled(false);
        b2a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b2a.setDefaultCapable(false);
        b2a.setFocusPainted(false);
        b2a.setFocusable(false);
        b2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2aActionPerformed(evt);
            }
        });
        getContentPane().add(b2a, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, 10));

        b3a.setFont(new java.awt.Font("Century Gothic", 2, 10)); // NOI18N
        b3a.setForeground(new java.awt.Color(51, 51, 51));
        b3a.setText("Grillo");
        b3a.setBorderPainted(false);
        b3a.setContentAreaFilled(false);
        b3a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b3a.setDefaultCapable(false);
        b3a.setFocusPainted(false);
        b3a.setFocusable(false);
        b3a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3aActionPerformed(evt);
            }
        });
        getContentPane().add(b3a, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 10));

        b1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        b1.setForeground(new java.awt.Color(51, 51, 51));
        b1.setText("Prof: Jose Maria Amezcua Castrejon");
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b1.setDefaultCapable(false);
        b1.setFocusPainted(false);
        b1.setFocusable(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel1.setText("UNIDAD 5 y 6 Excepciones y Archivo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel2.setText("Programadores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 2, 9)); // NOI18N
        jButton1.setText(" Registro de Profesores Tecnologico de Zapotlan, All Rigths Reserved, v 3.0.0, 2019 ");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 360, -1, -1));

        br1.setFont(new java.awt.Font("Comic Sans MS", 0, 9)); // NOI18N
        br1.setText("Y si eh, estamos patentando esta cosa ;y");
        getContentPane().add(br1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        br.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        br.setText(" ");
        br.setMaximumSize(new java.awt.Dimension(400, 350));
        br.setMinimumSize(new java.awt.Dimension(400, 350));
        br.setPreferredSize(new java.awt.Dimension(400, 350));
        getContentPane().add(br, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -40, 510, 680));
        br.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b0aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0aActionPerformed
        b0a.setVisible(false);
    }//GEN-LAST:event_b0aActionPerformed

    private void b1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1aActionPerformed
        b1a.setVisible(false);
    }//GEN-LAST:event_b1aActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2a.setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2aActionPerformed
        b2a.setVisible(false);
    }//GEN-LAST:event_b2aActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        b3a.setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

    private void b3aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3aActionPerformed
        b3a.setVisible(false);
    }//GEN-LAST:event_b3aActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        b4a.setVisible(true);
    }//GEN-LAST:event_b4ActionPerformed

    private void b4aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4aActionPerformed
        b4a.setVisible(false);
    }//GEN-LAST:event_b4aActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1a.setVisible(true);
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        b0a.setVisible(true);
    }//GEN-LAST:event_b0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        br1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b0a;
    private javax.swing.JButton b1;
    private javax.swing.JButton b1a;
    private javax.swing.JButton b2;
    private javax.swing.JButton b2a;
    private javax.swing.JButton b3;
    private javax.swing.JButton b3a;
    private javax.swing.JButton b4;
    private javax.swing.JButton b4a;
    private javax.swing.JLabel br;
    private javax.swing.JLabel br1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
