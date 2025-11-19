package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import dominio.*;
import java.util.*;

public class RepMovimientos extends javax.swing.JFrame implements Observer{
    
    public RepMovimientos(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarLista();
        this.cargarCombos();
    }
    
    public void cargarLista(){
        ArrayList<Movimiento> listaMov = new ArrayList<>();
        for (int i = 0; i < this.modelo.getListaMovimientos().size(); i++) {
            listaMov.add(this.modelo.getListaMovimientos().get(i));
        }
        
        if(this.comboMes.getSelectedIndex()!=0){
            for (int i = listaMov.size()-1; i >= 0; i--) {
                if(!(listaMov.get(i).getMes().equals(this.comboMes.getSelectedItem()))){
                    listaMov.remove(i);
                }
            }
        }
        if(this.comboOrigen.getSelectedIndex()!=0){
            for (int i = listaMov.size()-1; i >= 0; i--) {
                if(!(listaMov.get(i).getOrigen().equals(this.comboOrigen.getSelectedItem()))){
                    listaMov.remove(i);
                }
            }
        }
        if(this.comboDestino.getSelectedIndex()!=0){
            for (int i = listaMov.size()-1; i >= 0; i--) {
                if(!(listaMov.get(i).getDestino().equals(this.comboDestino.getSelectedItem()))){
                    listaMov.remove(i);
                }
            }
        }
        if(this.comboEmpleado.getSelectedIndex()!=0){
            for (int i = listaMov.size()-1; i >= 0; i--) {
                if(!(listaMov.get(i).getEmp().equals(this.comboEmpleado.getSelectedItem()))){
                    listaMov.remove(i);
                }
            }
        }
        this.listaMovimientos.setListData(listaMov.toArray());
    }
    
    public void cargarCombos(){
        ArrayList<Area> listaAr = this.modelo.getListaAreas();
        ArrayList<Empleado> listaEmp = this.modelo.getListaEmpleados();
        this.comboOrigen.removeAllItems();
        this.comboOrigen.addItem("Sin filtro");
        for (int i = 0; i < listaAr.size(); i++) {
                this.comboOrigen.addItem(listaAr.get(i));
        }
        this.comboDestino.removeAllItems();
        this.comboDestino.addItem("Sin filtro");
        for (int i = 0; i < listaAr.size(); i++) {
                this.comboDestino.addItem(listaAr.get(i));
        }
        this.comboEmpleado.removeAllItems();
        this.comboEmpleado.addItem("Sin filtro");
        for (int i = 0; i < listaEmp.size(); i++) {
                this.comboEmpleado.addItem(listaEmp.get(i));
        }
    }
    
    public void cargarDatos(){
        
    }
    
    @Override
    public void update(Observable o, Object arg){
        this.cargarLista();
        this.cargarCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMovimientos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        txtDestino = new javax.swing.JLabel();
        txtMes = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        comboOrigen = new javax.swing.JComboBox();
        comboEmpleado = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de movimientos");
        setResizable(false);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(70, 130, 180));
        panel.setLayout(null);

        listaMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        listaMovimientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaMovimientos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaMovimientos.setForeground(new java.awt.Color(0, 0, 0));
        listaMovimientos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaMovimientos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMovimientosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaMovimientos);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 154, 270);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por:");
        panel.add(jLabel1);
        jLabel1.setBounds(210, 40, 150, 32);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Movimiento:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 10, 150, 30);

        txtEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpleado.setText("Empleado");
        jPanel1.add(txtEmpleado);
        txtEmpleado.setBounds(20, 210, 110, 30);

        txtOrigen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Origen");
        jPanel1.add(txtOrigen);
        txtOrigen.setBounds(20, 110, 110, 30);

        txtDestino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Destino");
        jPanel1.add(txtDestino);
        txtDestino.setBounds(20, 160, 110, 30);

        txtMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMes.setForeground(new java.awt.Color(255, 255, 255));
        txtMes.setText("Mes");
        jPanel1.add(txtMes);
        txtMes.setBounds(20, 60, 110, 30);

        panel.add(jPanel1);
        jPanel1.setBounds(350, 80, 170, 270);

        comboMes.setBackground(new java.awt.Color(255, 255, 255));
        comboMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMes.setForeground(new java.awt.Color(0, 0, 0));
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin filtro", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });
        panel.add(comboMes);
        comboMes.setBounds(200, 110, 130, 22);

        comboOrigen.setBackground(new java.awt.Color(255, 255, 255));
        comboOrigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboOrigen.setForeground(new java.awt.Color(0, 0, 0));
        comboOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin filtro" }));
        comboOrigen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboOrigen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrigenActionPerformed(evt);
            }
        });
        panel.add(comboOrigen);
        comboOrigen.setBounds(200, 180, 130, 22);

        comboEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        comboEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        comboEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin filtro" }));
        comboEmpleado.setToolTipText("");
        comboEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadoActionPerformed(evt);
            }
        });
        panel.add(comboEmpleado);
        comboEmpleado.setBounds(200, 320, 130, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Empleado");
        panel.add(jLabel7);
        jLabel7.setBounds(200, 290, 110, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mes");
        panel.add(jLabel11);
        jLabel11.setBounds(200, 80, 110, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Origen");
        panel.add(jLabel12);
        jLabel12.setBounds(200, 150, 110, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Destino");
        panel.add(jLabel13);
        jLabel13.setBounds(200, 220, 110, 30);

        comboDestino.setBackground(new java.awt.Color(255, 255, 255));
        comboDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboDestino.setForeground(new java.awt.Color(0, 0, 0));
        comboDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin filtro" }));
        comboDestino.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoActionPerformed(evt);
            }
        });
        panel.add(comboDestino);
        comboDestino.setBounds(200, 250, 130, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Movimientos:");
        panel.add(jLabel2);
        jLabel2.setBounds(20, 30, 170, 32);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 570, 390);

        setBounds(0, 0, 578, 394);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        this.cargarLista();
    }//GEN-LAST:event_comboMesActionPerformed

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        this.cargarLista();
    }//GEN-LAST:event_comboOrigenActionPerformed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        this.cargarLista();
    }//GEN-LAST:event_comboDestinoActionPerformed

    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
        this.cargarLista();
    }//GEN-LAST:event_comboEmpleadoActionPerformed

    private void listaMovimientosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMovimientosValueChanged
        this.cargarDatos();
    }//GEN-LAST:event_listaMovimientosValueChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboDestino;
    private javax.swing.JComboBox comboEmpleado;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox comboOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaMovimientos;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JLabel txtEmpleado;
    private javax.swing.JLabel txtMes;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
