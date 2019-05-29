package src;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class FrmConsIndividual extends javax.swing.JDialog {
    Profesor p;
    public FrmConsIndividual(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoITCG.png")).getImage());
    }
    
    public void accionBuscar(){
        try{
        int clave, celda;
        clave = Integer.parseInt(txtClave.getText());
        if(clave > 0 && clave < 66){
            celda = Principal.ap.getCelda(clave);
            if(celda != -1){
                p = Principal.ap.getProfesor(celda);
                txtNombre.setText(p.getNombre());
                txtTitulo.setText(p.getTitulo());
                txtDepartamento.setText(p.getDepartamento());
                txtHoras.setText(Integer.toString(p.getHoras()));
                txtClave.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(this, "Clave inexistente",
                        "INEXISTENTE", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Ingrese una clave de 1 a 65", 
                            "CLAVE FUERA DE RANGO", JOptionPane.ERROR_MESSAGE);
        }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros enteros ", 
                            "CARÁCTER INVALIDO", JOptionPane.ERROR_MESSAGE);  
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(this, "Situacion anomala en tiempo de ejecución, vuelve a intentarlo", 
                            "SITUACION ANOMALA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA INDIVIDUAL");
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 20)); // NOI18N
        jLabel1.setText("INDIVIDUAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setText("Clave:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setText("Titulo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel5.setText("Departamento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel6.setText("Horas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtClave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtClave.setOpaque(false);
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 133, -1));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 250, -1));

        txtTitulo.setEditable(false);
        txtTitulo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTitulo.setOpaque(false);
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 250, -1));

        txtDepartamento.setEditable(false);
        txtDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtDepartamento.setAutoscrolls(false);
        txtDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDepartamento.setOpaque(false);
        getContentPane().add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, -1));

        txtHoras.setEditable(false);
        txtHoras.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtHoras.setAutoscrolls(false);
        txtHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHoras.setOpaque(false);
        getContentPane().add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 250, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bscr.png"))); // NOI18N
        btnBuscar.setText(" ");
        btnBuscar.setToolTipText("BUSCAR");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setDefaultCapable(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vlvr.jpg"))); // NOI18N
        btnVolver.setText(" ");
        btnVolver.setToolTipText("VOLVER");
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setDefaultCapable(false);
        btnVolver.setFocusPainted(false);
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        fondo.setText(" ");
        fondo.setMaximumSize(new java.awt.Dimension(400, 350));
        fondo.setMinimumSize(new java.awt.Dimension(400, 350));
        fondo.setPreferredSize(new java.awt.Dimension(400, 350));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -320, 530, 680));
        fondo.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        accionBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            accionBuscar();
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtClave.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
