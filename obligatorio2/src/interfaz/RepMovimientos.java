package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import dominio.*;
import java.io.File;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RepMovimientos extends javax.swing.JFrame implements Observer{
    
    public RepMovimientos(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        
        this.modeloTabla = new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.modeloTabla.addColumn("Mes");
        this.modeloTabla.addColumn("Origen");
        this.modeloTabla.addColumn("Destino");
        this.modeloTabla.addColumn("Empleado");
        this.tablaMov.setModel(modeloTabla);
        
        this.cargarCombos();
    }
    
    public void cargarTabla(){
        modeloTabla.setRowCount(0);
        
        ArrayList<Movimiento> listaMov = new ArrayList<>();
        for (int i = 0; i < this.modelo.getListaMovimientos().size(); i++) {
            listaMov.add(this.modelo.getListaMovimientos().get(i));
        }
        
        for (int i = listaMov.size()-1; i >= 0; i--) {
            boolean remove = false;
            if(this.comboMes.getSelectedIndex()!=0 && this.comboMes.getSelectedIndex()!=-1 && !remove){
                if(!this.comboMes.getSelectedItem().equals(listaMov.get(i).getMes())){
                    listaMov.remove(i);
                    remove = true;
                }
            }
            
            if(this.comboOrigen.getSelectedIndex()!=0 && this.comboOrigen.getSelectedIndex()!=-1 && !remove){
                if(!this.comboOrigen.getSelectedItem().equals(listaMov.get(i).getOrigen())){
                    listaMov.remove(i);
                    remove = true;
                }
            }
            
            if(this.comboDestino.getSelectedIndex()!=0 && this.comboDestino.getSelectedIndex()!=-1 && !remove){
                if(!this.comboDestino.getSelectedItem().equals(listaMov.get(i).getDestino())){
                    listaMov.remove(i);
                    remove = true;
                }
            }
            
            if(this.comboEmpleado.getSelectedIndex()!=0 && this.comboEmpleado.getSelectedIndex()!=-1 && !remove){
                if(!this.comboEmpleado.getSelectedItem().equals(listaMov.get(i).getEmp())){
                    listaMov.remove(i);
                    remove = true;
                }
            }
        }
        
        for (int i = 0; i < listaMov.size(); i++) {
            Movimiento m = listaMov.get(i);
            this.modeloTabla.addRow(new Object[]{
                    m.getMes(),
                    m.getOrigen().getNombre(),
                    m.getDestino().getNombre(),
                    m.getEmp().getNombre()
            });
        }
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
    
    
    @Override
    public void update(Observable o, Object arg){
        this.cargarCombos();
        this.cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        comboOrigen = new javax.swing.JComboBox();
        comboEmpleado = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMov = new javax.swing.JTable();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de movimientos");
        setResizable(false);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(70, 130, 180));
        panel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por:");
        panel.add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 32);

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
        comboMes.setBounds(20, 90, 130, 22);

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
        comboOrigen.setBounds(20, 160, 130, 22);

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
        comboEmpleado.setBounds(20, 300, 130, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Empleado");
        panel.add(jLabel7);
        jLabel7.setBounds(20, 270, 110, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mes");
        panel.add(jLabel11);
        jLabel11.setBounds(20, 60, 110, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Origen");
        panel.add(jLabel12);
        jLabel12.setBounds(20, 130, 110, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Destino");
        panel.add(jLabel13);
        jLabel13.setBounds(20, 200, 110, 30);

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
        comboDestino.setBounds(20, 230, 130, 22);

        tablaMov.setBackground(new java.awt.Color(255, 255, 255));
        tablaMov.setForeground(new java.awt.Color(0, 0, 0));
        tablaMov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaMov);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(180, 50, 350, 230);

        btnExportar.setBackground(new java.awt.Color(0, 0, 102));
        btnExportar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("Eliminar ");
        btnExportar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExportar.setFocusPainted(false);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        panel.add(btnExportar);
        btnExportar.setBounds(290, 300, 129, 40);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 570, 390);

        setBounds(0, 0, 578, 394);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        this.cargarTabla();
    }//GEN-LAST:event_comboMesActionPerformed

    private void comboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenActionPerformed
        this.cargarTabla();
    }//GEN-LAST:event_comboOrigenActionPerformed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        this.cargarTabla();
    }//GEN-LAST:event_comboDestinoActionPerformed

    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
        this.cargarTabla();
    }//GEN-LAST:event_comboEmpleadoActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        if(this.tablaMov.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar", "ERROR", 0);
        }
        else{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar CSV");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos CSV (*.csv)", "csv"));
            int userSelection = fileChooser.showSaveDialog(this);
            
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                String ruta = fileToSave.getAbsolutePath();
                if (!ruta.toLowerCase().endsWith(".csv")) {
                    ruta += ".csv";
                }
                
                File tempFile = new File(ruta);
                boolean reemplazar = true;
                if (tempFile.exists()) {
                    int respuesta = JOptionPane.showConfirmDialog(this, 
                        "El archivo ya existe. ¿Desea reemplazarlo?", 
                        "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (respuesta != JOptionPane.YES_OPTION) {
                        reemplazar = false;
                    }
                }
                
                if (reemplazar){
                    ArchGrabacion arch = new ArchGrabacion(ruta);
                    arch.grabarLinea("Mes;Origen;Destino;Empleado");
                    for (int i = 0; i < this.tablaMov.getRowCount(); i++) {
                        String mes = this.tablaMov.getValueAt(i, 0).toString();
                        String origen = this.tablaMov.getValueAt(i, 1).toString();
                        String destino = this.tablaMov.getValueAt(i, 2).toString();
                        String emp = this.tablaMov.getValueAt(i, 3).toString();
                
                        arch.grabarLinea(mes + ";" + origen + ";" + destino + ";" + emp);
                    }
                    arch.cerrar();
                    JOptionPane.showMessageDialog(this, "Archivo creado exitosamente en: \n" + ruta);
                }
            }
        }
    }//GEN-LAST:event_btnExportarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JComboBox comboDestino;
    private javax.swing.JComboBox comboEmpleado;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox comboOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaMov;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private javax.swing.table.DefaultTableModel modeloTabla;
}
