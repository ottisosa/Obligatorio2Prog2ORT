package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class EmpAlta extends javax.swing.JFrame implements Observer{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EmpAlta.class.getName());

    public EmpAlta(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarLista();
    }
    
    public void cargarLista(){
        this.listaEmpleados.setListData(this.modelo.getListaEmpleados().toArray());
        this.listaEmpleados.setListData(this.modelo.getListaManagers().toArray());
    }
    
    public void AgregarEmpleado(){
        if((!this.txtNom.getText().equals("")) && (!this.txtCI.getText().equals("")) && (!this.txtSalario.getText().equals("")) && (!this.txtManager.getText().equals("")) && (!this.txtArea.getText().equals(""))){
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Complete los campos para agregar un empleado", "ERROR", 0);
        }
    }
    

    @Override
    public void update(Observable o, Object arg){
        this.cargarLista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtSalario = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        listaManagers = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtManager = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nomEmp = new javax.swing.JLabel();
        ciEmp = new javax.swing.JLabel();
        celEmp = new javax.swing.JLabel();
        salEmp = new javax.swing.JLabel();
        managerEmp = new javax.swing.JLabel();
        areaEmp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 190, 100, 25);

        listaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        listaEmpleados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        listaEmpleados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaEmpleados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 140, 130);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Managers:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 210, 160, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 90, 110, 25);

        txtCI.setBackground(new java.awt.Color(255, 255, 255));
        txtCI.setForeground(new java.awt.Color(0, 0, 0));
        txtCI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCI);
        txtCI.setBounds(510, 90, 180, 30);

        btnAgregar.setBackground(new java.awt.Color(0, 102, 51));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnAgregar.setFocusPainted(false);
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(540, 340, 120, 40);

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSalario);
        txtSalario.setBounds(510, 190, 180, 30);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNom);
        txtNom.setBounds(510, 40, 180, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manager:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(410, 240, 100, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 290, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cel:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 140, 120, 25);

        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setForeground(new java.awt.Color(0, 0, 0));
        txtArea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtArea);
        txtArea.setBounds(510, 290, 180, 30);

        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        txtCel.setForeground(new java.awt.Color(0, 0, 0));
        txtCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCel);
        txtCel.setBounds(510, 140, 180, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Empleados:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 20, 160, 32);

        listaManagers.setBackground(new java.awt.Color(255, 255, 255));
        listaManagers.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaManagers.setForeground(new java.awt.Color(0, 0, 0));
        listaManagers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jPanel1.add(listaManagers);
        listaManagers.setBounds(20, 250, 140, 120);

        txtManager.setEditable(false);
        txtManager.setBackground(new java.awt.Color(255, 255, 255));
        txtManager.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtManager.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtManager);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(510, 240, 180, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(410, 40, 110, 25);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        nomEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomEmp.setForeground(new java.awt.Color(255, 255, 255));
        nomEmp.setText("Nombre");
        jPanel2.add(nomEmp);
        nomEmp.setBounds(10, 10, 180, 25);

        ciEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ciEmp.setForeground(new java.awt.Color(255, 255, 255));
        ciEmp.setText("CI");
        jPanel2.add(ciEmp);
        ciEmp.setBounds(10, 60, 180, 25);

        celEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        celEmp.setForeground(new java.awt.Color(255, 255, 255));
        celEmp.setText("Cel");
        jPanel2.add(celEmp);
        celEmp.setBounds(10, 110, 180, 25);

        salEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salEmp.setForeground(new java.awt.Color(255, 255, 255));
        salEmp.setText("Salario");
        jPanel2.add(salEmp);
        salEmp.setBounds(10, 160, 180, 25);

        managerEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        managerEmp.setForeground(new java.awt.Color(255, 255, 255));
        managerEmp.setText("Manager");
        jPanel2.add(managerEmp);
        managerEmp.setBounds(10, 210, 180, 25);

        areaEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        areaEmp.setForeground(new java.awt.Color(255, 255, 255));
        areaEmp.setText("Area");
        jPanel2.add(areaEmp);
        areaEmp.setBounds(10, 260, 180, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 30, 200, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -5, 760, 430);

        setBounds(0, 0, 757, 428);
    }// </editor-fold>//GEN-END:initComponents

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaEmp;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel celEmp;
    private javax.swing.JLabel ciEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaEmpleados;
    private javax.swing.JList listaManagers;
    private javax.swing.JLabel managerEmp;
    private javax.swing.JLabel nomEmp;
    private javax.swing.JLabel salEmp;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextPane txtManager;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
