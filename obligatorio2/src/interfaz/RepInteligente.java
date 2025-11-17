package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import dominio.*;
import java.io.File;
import java.util.*;
import javax.swing.*;

public class RepInteligente extends javax.swing.JFrame implements Observer{

    public RepInteligente(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.comboEmp.removeAllItems();
        this.gemini = new Gemini();
        this.reloj = new ImageIcon(getClass().getResource("/img/reloj.png"));
        this.tick = new ImageIcon(getClass().getResource("/img/marca-de-verificacion.png"));;
        this.cargarListas();
    }
    
    public void cargarListas(){
        this.listaAreas.setListData(this.modelo.getListaAreas().toArray());
        this.listaAreas2.setListData(this.modelo.getListaAreas().toArray());
    }

    public void cargarCombo(Area area) {
        ArrayList<Empleado> listaEmp = this.modelo.getListaEmpleados();
        this.comboEmp.removeAllItems();
        for (int i = 0; i < listaEmp.size(); i++) {
            if(listaEmp.get(i).getArea().equals(area)){
                this.comboEmp.addItem(listaEmp.get(i));
            }
        }
        if (this.comboEmp.getItemCount()==0){
            this.comboEmp.addItem("Sin empleados");
        }
    }
    
    public boolean verificarCampos(){
        boolean verifica = false;
        if(this.listaAreas.getSelectedValue()!=null && this.listaAreas2.getSelectedValue()!=null){
            if(!(this.comboEmp.getSelectedItem().equals("Sin empleados"))){
                Empleado emp = (Empleado)this.comboEmp.getSelectedItem();
                String nomCV = "/CV"+emp.getCi()+".txt";
                File dirCV = new File(System.getProperty("user.dir")+File.separator+"CVs"+nomCV);
                if(dirCV.exists()){
                    verifica = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo hallar el CV del empleado", "ERROR", 0);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione empleado a transferir", "ERROR", 0);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione areas de origen y transferencia", "ERROR", 0);
        }
        return verifica;
    }
    
    @Override
    public void update(Observable o, Object arg){
        this.cargarListas();
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        comboEmp = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAreas2 = new javax.swing.JList();
        btnGenerar = new javax.swing.JButton();
        panelReporte = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextPane();
        IconoEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de movimientos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 165, 247);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleados:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 20, 108, 32);

        comboEmp.setBackground(new java.awt.Color(255, 255, 255));
        comboEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEmp.setForeground(new java.awt.Color(0, 0, 0));
        comboEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin empleados" }));
        comboEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(comboEmp);
        comboEmp.setBounds(140, 60, 172, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Área de destino:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 110, 149, 32);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Área de origen:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 110, 154, 32);

        listaAreas2.setBackground(new java.awt.Color(255, 255, 255));
        listaAreas2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaAreas2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaAreas2.setForeground(new java.awt.Color(0, 0, 0));
        listaAreas2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaAreas2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(230, 150, 165, 247);

        btnGenerar.setBackground(new java.awt.Color(0, 0, 102));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar reporte");
        btnGenerar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenerar.setFocusPainted(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerar);
        btnGenerar.setBounds(150, 420, 129, 39);

        panelReporte.setBackground(new java.awt.Color(0, 0, 102));
        panelReporte.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        panelReporte.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Reporte Inteligente:");
        panelReporte.add(jLabel11);
        jLabel11.setBounds(40, 10, 250, 32);

        txtReporte.setEditable(false);
        txtReporte.setBackground(new java.awt.Color(255, 255, 255));
        txtReporte.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(txtReporte);

        panelReporte.add(jScrollPane6);
        jScrollPane6.setBounds(20, 50, 260, 390);

        jPanel1.add(panelReporte);
        panelReporte.setBounds(420, 20, 300, 460);
        jPanel1.add(IconoEstado);
        IconoEstado.setBounds(300, 420, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 540);

        setBounds(0, 0, 769, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAreasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreasValueChanged
        this.cargarCombo((Area)this.listaAreas.getSelectedValue());
    }//GEN-LAST:event_listaAreasValueChanged

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if(this.verificarCampos()){
            Area origen = (Area)this.listaAreas.getSelectedValue();
            Area destino = (Area)this.listaAreas2.getSelectedValue();
            Empleado emp = (Empleado)this.comboEmp.getSelectedItem();
            this.IconoEstado.setIcon(this.reloj);
            this.btnGenerar.setEnabled(false);
            
            SwingWorker<String, Void> worker = new SwingWorker<String, Void>() {
                
                @Override
                protected String doInBackground() throws Exception{
                    return gemini.generarReporte(origen, destino, emp);
                }
                
                @Override
                protected void done(){
                    try{
                        String reporte = this.get();
                        txtReporte.setText(reporte);
                        IconoEstado.setIcon(tick);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al generar el reporte: \n"+(e.getCause().getMessage()), "ERROR", 0);
                        IconoEstado.setIcon(null);
                    }
                    finally{
                        btnGenerar.setEnabled(true);
                    }
                }
            }; 
            
            worker.execute();
        }
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconoEstado;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox comboEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList listaAreas;
    private javax.swing.JList listaAreas2;
    private javax.swing.JPanel panelReporte;
    private javax.swing.JTextPane txtReporte;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private final Gemini gemini;
    private final ImageIcon reloj;
    private final ImageIcon tick;
}
