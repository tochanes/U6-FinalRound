package src;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FrmAltas extends javax.swing.JDialog {

    public FrmAltas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void accionBuscar(){
        try{
        int clave, celda;
        clave = Integer.parseInt(txtClave.getText());
        if(clave > 0 && clave < 66){
            celda = Principal.ap.getCelda(clave);
            if(celda == -1)
            {
                txtClave.setEditable(false);
                btnBuscar.setEnabled(false);
                txtNombre.setEditable(true);
                txtTitulo.setEditable(true);
                txtDepartamento.setEditable(true);
                txtHoras.setEditable(true);
                btnGuardar.setEnabled(true);
                txtNombre.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(this, "Clave existente",
                        "REPETIDA", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
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
    
    public void accionGuardar(){
        int clave, horas;
        String nombre, departamento, titulo;
        
        try {
            clave = Integer.parseInt(txtClave.getText());
            nombre = txtNombre.getText();
                if(nombre.length() > 40)
                    nombre = nombre.substring(0, 40);
            titulo = txtTitulo.getText();
                if(titulo.length() > 30)
                    titulo = titulo.substring(0, 30);
            departamento = txtDepartamento.getText();
                if(departamento.length() > 30)
                    departamento = departamento.substring(0, 30);
            horas = Integer.parseInt(txtHoras.getText());
            
            Profesor pf = new Profesor(clave, nombre, titulo, departamento, horas);
            Principal.ap.escribir(pf);
            
            JOptionPane.showMessageDialog(this, "Guardado con exito",
                        "GUARDADO", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingresa solamente numeros enteros donde corresponda", 
                            "CARÁCTER INVALIDO", JOptionPane.ERROR_MESSAGE);
        }
        catch(RuntimeException e){
            JOptionPane.showMessageDialog(this, "Situacion anomala en tiempo de ejecución, vuelve a intentarlo", 
                            "SITUACIÓN ANOMALA", JOptionPane.ERROR_MESSAGE);
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
        btnGuardar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTAS");
        setPreferredSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 11)); // NOI18N
        jLabel1.setText("ALTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setText("Clave: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setText("Titulo: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel5.setText("Departamento: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel6.setText("Horas: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 46, 104, -1));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 85, 240, -1));

        txtTitulo.setEditable(false);
        txtTitulo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTitulo.setOpaque(false);
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 117, 240, -1));

        txtDepartamento.setEditable(false);
        txtDepartamento.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDepartamento.setOpaque(false);
        getContentPane().add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 156, 240, -1));

        txtHoras.setEditable(false);
        txtHoras.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtHoras.setOpaque(false);
        txtHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHorasKeyPressed(evt);
            }
        });
        getContentPane().add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 195, 240, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setDefaultCapable(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 44, 81, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setDefaultCapable(false);
        btnGuardar.setEnabled(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 227, 177, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -570, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        accionBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        accionGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            accionBuscar();
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtHorasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            accionGuardar();
    }//GEN-LAST:event_txtHorasKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
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
