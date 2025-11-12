package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AreasMovimiento extends javax.swing.JFrame implements Observer{

    public AreasMovimiento(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarListas();
        this.cargarEmp();
    }
    
    public void cargarListas(){
        this.listaAreas.setListData(this.modelo.getListaAreas().toArray());
        this.listaAreas2.setListData(this.modelo.getListaAreas().toArray());
    }
    
    public void cargarEmp(){
        ArrayList<Empleado> listaEmp = this.modelo.getListaEmpleados();
        if(!listaEmp.isEmpty()){
            this.comboEmp.removeAllItems();
            for (int i = 0; i < listaEmp.size(); i++) {
                this.comboEmp.addItem(listaEmp.get(i));
            }
        }
    }
    
    public void moverEmp(){
        if(this.listaAreas.getSelectedValue()!=null && this.listaAreas2.getSelectedValue()!=null){
            if(!this.comboEmp.getSelectedItem().equals("Sin Empleados")){
                if(this.calcularSiMovPosible((Empleado)this.comboEmp.getSelectedItem())){
                    ((Empleado)this.comboEmp.getSelectedItem()).setArea((Area)this.listaAreas2.getSelectedValue());
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione empleado a transferir", "ERROR", 0);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione areas de origen y transferencia", "ERROR", 0);
        }
    }
    
    public boolean calcularSiMovPosible(Empleado emp){
        boolean posible = false;
        int mes = this.comboMes.getSelectedIndex();
        if(mes<0){
            JOptionPane.showMessageDialog(null, "Seleccione el mes de transferencia", "ERROR", 0);
        }
        else{
            mes++;
            int salarioTotal = (((Empleado)this.comboEmp.getSelectedItem()).getSalario())*(12-mes);
            if ((((Area)this.listaAreas2.getSelectedValue()).getPresupuesto()-salarioTotal)>=0){
                posible = true;
            }
        }
        return posible;
    }
    
    @Override
    public void update(Observable o, Object arg){
        this.cargarListas();
        this.cargarEmp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboMes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboEmp = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAreas2 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Areas movimiento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        comboMes.setBackground(new java.awt.Color(255, 255, 255));
        comboMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMes.setForeground(new java.awt.Color(0, 0, 0));
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(comboMes);
        comboMes.setBounds(29, 55, 121, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Área de origen:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(29, 126, 154, 32);

        listaAreas.setBackground(new java.awt.Color(255, 255, 255));
        listaAreas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaAreas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaAreas.setForeground(new java.awt.Color(0, 0, 0));
        listaAreas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaAreas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(29, 176, 165, 247);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(29, 17, 64, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleados:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(252, 17, 108, 32);

        comboEmp.setBackground(new java.awt.Color(255, 255, 255));
        comboEmp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboEmp.setForeground(new java.awt.Color(0, 0, 0));
        comboEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin Empleados", " ", " " }));
        comboEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(comboEmp);
        comboEmp.setBounds(252, 55, 172, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Área de destino:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(335, 126, 149, 32);

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
        jScrollPane2.setBounds(335, 176, 165, 247);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mover");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 40, 129, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 658, 443);

        setBounds(0, 0, 674, 451);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboEmp;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaAreas;
    private javax.swing.JList listaAreas2;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
