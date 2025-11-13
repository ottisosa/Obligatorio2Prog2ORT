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
        jLabel5 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 190, 100, 25);

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
        jScrollPane1.setBounds(20, 60, 140, 110);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Managers:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 180, 160, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 90, 50, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 40, 110, 25);

        txtCI.setBackground(new java.awt.Color(255, 255, 255));
        txtCI.setForeground(new java.awt.Color(0, 0, 0));
        txtCI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCI);
        txtCI.setBounds(320, 90, 200, 30);

        btnAgregar.setBackground(new java.awt.Color(0, 102, 51));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnAgregar.setFocusPainted(false);
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(370, 340, 120, 40);

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSalario);
        txtSalario.setBounds(320, 190, 200, 30);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNom);
        txtNom.setBounds(320, 40, 200, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manager:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 240, 110, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 290, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cel:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 140, 60, 25);

        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setForeground(new java.awt.Color(0, 0, 0));
        txtArea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtArea);
        txtArea.setBounds(320, 290, 200, 30);

        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        txtCel.setForeground(new java.awt.Color(0, 0, 0));
        txtCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCel);
        txtCel.setBounds(320, 140, 200, 30);

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
        listaManagers.setBounds(20, 220, 140, 110);

        txtManager.setEditable(false);
        txtManager.setBackground(new java.awt.Color(255, 255, 255));
        txtManager.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtManager.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtManager);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(320, 240, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -5, 590, 430);

        setBounds(0, 0, 596, 428);
    }// </editor-fold>//GEN-END:initComponents

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaEmpleados;
    private javax.swing.JList listaManagers;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextPane txtManager;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
