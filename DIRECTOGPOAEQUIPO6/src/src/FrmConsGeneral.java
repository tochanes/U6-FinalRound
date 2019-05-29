package src;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FrmConsGeneral extends javax.swing.JDialog {
    
    int x = 1;
    
    DefaultTableModel tbProfe = new DefaultTableModel();
    ArrayList<Profesor> listaProfe = new ArrayList<>();

    public FrmConsGeneral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoITCG.png")).getImage());
         jScrollPane2.setBackground(new Color( 0,0,0,0));
         jScrollPane2.setOpaque(false);
         tablaGeneral.setOpaque(false);
         ((DefaultTableCellRenderer)tablaGeneral.getDefaultRenderer(Object.class)).setOpaque(false);
         jScrollPane2.getViewport().setOpaque(false);
        setModel();
    }
    
    private void setModel(){
      String[] cabecera = {"Clave", "Nombre", "Departamento"};
      tbProfe.setColumnIdentifiers(cabecera);
      tablaGeneral.setModel(tbProfe);
    }
    
    private void llenarLista(){
        Profesor prof;
        int clave;
        prof = Principal.ap.getProfesor(x);
        clave = prof.getClave();
        if(clave != 0){
            listaProfe.add(prof);
        }
        else
            prof = new Profesor(0, null, null, null, 0);
        x++;
    }
    
    private void setDatos(){
        Object [] datos = new Object[tbProfe.getColumnCount()];
        tbProfe.setRowCount(0);
        
        for(Profesor prs : listaProfe){
            datos[0] = prs.getClave();
            datos[1] = prs.getNombre();
            datos[2] = prs.getDepartamento();
            tbProfe.addRow(datos);
        }
        tablaGeneral.setModel(tbProfe);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGeneral = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONSULTA GENERAL");
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
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

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jScrollPane2.setOpaque(false);

        tablaGeneral.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaGeneral.setFocusable(false);
        tablaGeneral.setGridColor(new java.awt.Color(0, 204, 204));
        tablaGeneral.setOpaque(false);
        tablaGeneral.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(tablaGeneral);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 730, 260));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 20)); // NOI18N
        jLabel1.setText("CONSULTA GENERAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

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
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-540, -210, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            do{
                llenarLista();
                setDatos(); 
            }while(true);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaGeneral;
    // End of variables declaration//GEN-END:variables
}
