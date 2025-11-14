package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import dominio.*;
import java.util.ArrayList;

public class RepInteligente extends javax.swing.JFrame {

    public RepInteligente(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;

        cargarCombo();

    }

    public void cargarCombo() {

        ArrayList<Area> listaAr = this.modelo.getListaAreas();
        this.comboAr.removeAllItems();
        
        
        for (Area ar : listaAr) {
            comboAr.addItem(ar.getNombre());
        }
   
            if (this.comboAr.getItemCount() == 0) {
            this.comboAr.addItem("Sin Areas");
        }

    }
    
    public void cargarTextPane(){
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboAr = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpaneEmp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de movimientos");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));

        comboAr.setBackground(new java.awt.Color(255, 255, 255));
        comboAr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboAr.setForeground(new java.awt.Color(0, 0, 0));
        comboAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtpaneEmp.setEditable(false);
        txtpaneEmp.setBackground(new java.awt.Color(255, 255, 255));
        txtpaneEmp.setColumns(20);
        txtpaneEmp.setForeground(new java.awt.Color(0, 0, 0));
        txtpaneEmp.setRows(5);
        jScrollPane1.setViewportView(txtpaneEmp);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAr, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(comboAr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 540);

        setBounds(0, 0, 769, 545);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtpaneEmp;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
