package src;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmConsGenl extends javax.swing.JDialog {
    
    DefaultTableModel profesores = new DefaultTableModel();
    ArrayList<Profesor>listaProfesores = new ArrayList<>();
    int x = 1, clave;
    boolean ban = false;

    public FrmConsGenl(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setModelo();
    }
    
    private void setModelo(){
        String[] cabecera = {"Clave","Nombre", "Departamento"};
        profesores.setColumnIdentifiers(cabecera);
        tablaGeneral.setModel(profesores);
    }
    
    private void llenarLista(){
        Profesor prs;
        int celda = Principal.ap.getCelda(x);
        if(celda!=0)
        {
            prs = Principal.ap.getProfesor(celda);
            listaProfesores.add(prs);
            ban = true;
            x++;
        }
        else{
            prs = Principal.ap.getProfesor(x);
            prs.setClave(0);
            listaProfesores.add(prs);
            ban = false;
            x++;
        }
        /*String clave = Integer.toString(listaProfesores.get(x).getClave());
        String nombre = listaProfesores.get(x).getNombre();
        String departamento = listaProfesores.get(x).getDepartamento();
        */
    }
    
    private void setDatos(){
        
        for (int i = 0; i < listaProfesores.size() - 1; i++) {
            System.out.println(listaProfesores.get(i).getClave());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGeneral = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta General");
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
        jScrollPane2.setViewportView(tablaGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
         do{
            llenarLista();
            if(ban == true)
                setDatos();
        }while(true);   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaGeneral;
    // End of variables declaration//GEN-END:variables
}
