package src;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmConsGenrl extends javax.swing.JDialog {
    
    int x = 1;
    
    DefaultTableModel tbProfe = new DefaultTableModel();
    ArrayList<Profesor> listaProfe = new ArrayList<>();

    public FrmConsGenrl(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGeneral = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jScrollPane1.setViewportView(tablaGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaGeneral;
    // End of variables declaration//GEN-END:variables
}