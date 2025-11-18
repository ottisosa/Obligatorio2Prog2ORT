package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import dominio.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class RepAreas extends javax.swing.JFrame implements Observer {

    public RepAreas(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarLista();

    }

    public void cargarLista() {
        
       this.modelo.ordenarAreaPorcentaje(this.modelo.getListaAreas());
       this.listaAreas.setListData(this.modelo.getListaAreas().toArray());

       
    }

    public void cargarListaEmp(Area area) {
        

        ArrayList<Empleado> empleados = this.modelo.getListaEmpleados();

        ArrayList<Empleado> empleadosFiltrados = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getArea().equals(area)) {
                empleadosFiltrados.add(empleado);
            }

            if (empleadosFiltrados.isEmpty()) {

                String[] mensaje = {"Sin empleados"};

                this.listaEmp.setListData(mensaje);
            } else {

                this.listaEmp.setListData(empleadosFiltrados.toArray());
            }
        }

    }

    @Override
    public void update(Observable o, Object arg) {
        this.cargarLista();

        if (this.listaAreas.getSelectedValue() != null) {
            this.cargarListaEmp((Area) this.listaAreas.getSelectedValue());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEmp = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte estado de areas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));

        listaAreas.setBackground(new java.awt.Color(255, 255, 255));
        listaAreas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaAreas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaAreas.setForeground(new java.awt.Color(0, 0, 0));
        listaAreas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaAreas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAreasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaAreas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Áreas:");

        listaEmp.setBackground(new java.awt.Color(255, 255, 255));
        listaEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaEmp.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaEmp.setForeground(new java.awt.Color(0, 0, 0));
        listaEmp.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Sin area seleccionada" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaEmp);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 540);

        setBounds(0, 0, 730, 543);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAreasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreasValueChanged

        this.cargarListaEmp((Area) this.listaAreas.getSelectedValue());

    }//GEN-LAST:event_listaAreasValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaAreas;
    private javax.swing.JList listaEmp;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
