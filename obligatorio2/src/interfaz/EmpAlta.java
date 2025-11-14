package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

public class EmpAlta extends javax.swing.JFrame implements Observer{
    

    public EmpAlta(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarLista();
        this.panelEmp.setVisible(false);        
    }
    
    public void cargarLista(){
        this.listaEmpleados.setListData(this.modelo.getListaEmpleados().toArray());
        this.listaManagers.setListData(this.modelo.getListaManagers().toArray());
        this.listaAreas.setListData(this.modelo.getListaAreas().toArray());
    }
    
    public void agregarEmpleado(){
        if((!this.txtNom.getText().equals("")) && (!this.txtCI.getText().equals("")) && (!this.txtSalario.getText().equals("")) && (!this.txtManager.getText().equals("")) && (!this.txtArea.getText().equals("")) && (!this.txtCv.getText().equals(""))){
                if(!this.modelo.verificarCedula(this.txtCI.getText())){
                    try{
                        if(this.calcularSalario()){
                            int sal = Integer.parseInt(this.txtSalario.getText());
                            Manager man = this.manager;
                            Area ar = this.area;
                            String nom = this.txtNom.getText();
                            String ci = this.txtCI.getText();
                            String cel = this.txtCel.getText();
                            
                            Empleado empleado = new Empleado(sal, man, ar, nom, ci, cel, this.modelo);
                            
                            File dirCv = new File(System.getProperty("user.dir")+File.separator+"CVs");
                            if(!dirCv.exists()){
                                dirCv.mkdir();
                            }
                            
                            
                            this.txtSalario.setText("");
                            this.txtManager.setText("");
                            this.txtArea.setText("");
                            this.txtNom.setText("");
                            this.txtCI.setText("");
                            this.txtCel.setText("");
                            this.txtCv.setText("");
                            
                            this.cargarLista();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Area no tiene suficiente presupuesto", "ERROR", 0);
                        }
                    }
                    catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Salario debe ser un número", "ERROR", 0);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Cedula ya esta ingresada\n¡¡NO AL ROBO DE IDENTIDAD!!", "ERROR", 0);
                }                        
        }
        else{
            JOptionPane.showMessageDialog(null, "Complete los campos para agregar un empleado", "ERROR", 0);
        }
    }
    
    public boolean calcularSalario(){
        boolean hayPlata = false;
                
        int salTotal = ((Integer.parseInt(this.txtSalario.getText()))*12);
        int Pres = this.area.getPresupuesto();
        if(salTotal<=Pres){
            hayPlata = true;
            this.area.setPresupuesto(Pres - salTotal);
        }
        return hayPlata;
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
        txtCel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtManager = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        panelEmp = new javax.swing.JPanel();
        nomEmp = new javax.swing.JLabel();
        ciEmp = new javax.swing.JLabel();
        celEmp = new javax.swing.JLabel();
        salEmp = new javax.swing.JLabel();
        managerEmp = new javax.swing.JLabel();
        areaEmp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomEmp1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaManagers = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextPane();
        panelCv = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCv = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Salario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 220, 100, 25);

        listaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        listaEmpleados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        listaEmpleados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaEmpleadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaEmpleados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 140, 100);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Areas:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 310, 160, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(180, 100, 110, 25);

        txtCI.setBackground(new java.awt.Color(255, 255, 255));
        txtCI.setForeground(new java.awt.Color(0, 0, 0));
        txtCI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCI);
        txtCI.setBounds(280, 100, 180, 30);

        btnAgregar.setBackground(new java.awt.Color(0, 102, 51));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(310, 400, 120, 40);

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSalario);
        txtSalario.setBounds(280, 220, 180, 30);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNom);
        txtNom.setBounds(280, 40, 180, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manager:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 280, 100, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 340, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cel:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(180, 160, 120, 25);

        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        txtCel.setForeground(new java.awt.Color(0, 0, 0));
        txtCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCel);
        txtCel.setBounds(280, 160, 180, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Empleados:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 160, 32);

        txtManager.setEditable(false);
        txtManager.setBackground(new java.awt.Color(255, 255, 255));
        txtManager.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtManager.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtManager);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(280, 280, 180, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(180, 40, 110, 25);

        panelEmp.setBackground(new java.awt.Color(0, 0, 102));
        panelEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        panelEmp.setLayout(null);

        nomEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomEmp.setForeground(new java.awt.Color(255, 255, 255));
        nomEmp.setText("Nombre");
        panelEmp.add(nomEmp);
        nomEmp.setBounds(20, 70, 180, 25);

        ciEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ciEmp.setForeground(new java.awt.Color(255, 255, 255));
        ciEmp.setText("CI");
        panelEmp.add(ciEmp);
        ciEmp.setBounds(20, 120, 180, 25);

        celEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        celEmp.setForeground(new java.awt.Color(255, 255, 255));
        celEmp.setText("Cel");
        panelEmp.add(celEmp);
        celEmp.setBounds(20, 180, 180, 25);

        salEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salEmp.setForeground(new java.awt.Color(255, 255, 255));
        salEmp.setText("Salario");
        panelEmp.add(salEmp);
        salEmp.setBounds(20, 240, 180, 25);

        managerEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        managerEmp.setForeground(new java.awt.Color(255, 255, 255));
        managerEmp.setText("Manager");
        panelEmp.add(managerEmp);
        managerEmp.setBounds(20, 300, 180, 25);

        areaEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        areaEmp.setForeground(new java.awt.Color(255, 255, 255));
        areaEmp.setText("Area");
        panelEmp.add(areaEmp);
        areaEmp.setBounds(20, 360, 180, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Empleado:");
        panelEmp.add(jLabel10);
        jLabel10.setBounds(40, 10, 150, 32);

        nomEmp1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomEmp1.setForeground(new java.awt.Color(255, 255, 255));
        nomEmp1.setText("(Lista)");
        panelEmp.add(nomEmp1);
        nomEmp1.setBounds(80, 40, 60, 25);

        jPanel1.add(panelEmp);
        panelEmp.setBounds(740, 20, 200, 400);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Managers:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 160, 160, 32);

        listaAreas.setBackground(new java.awt.Color(255, 255, 255));
        listaAreas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
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
        jScrollPane3.setViewportView(listaAreas);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 350, 140, 100);

        listaManagers.setBackground(new java.awt.Color(255, 255, 255));
        listaManagers.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaManagers.setForeground(new java.awt.Color(0, 0, 0));
        listaManagers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaManagers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaManagersValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listaManagers);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 200, 140, 100);

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(255, 255, 255));
        txtArea.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtArea.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(txtArea);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(280, 340, 180, 30);

        panelCv.setBackground(new java.awt.Color(0, 0, 102));
        panelCv.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        panelCv.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CV:");
        panelCv.add(jLabel11);
        jLabel11.setBounds(80, 10, 110, 32);

        txtCv.setBackground(new java.awt.Color(255, 255, 255));
        txtCv.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(txtCv);

        panelCv.add(jScrollPane6);
        jScrollPane6.setBounds(20, 50, 160, 330);

        jPanel1.add(panelCv);
        panelCv.setBounds(500, 20, 200, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -5, 1000, 500);

        setBounds(0, 0, 995, 495);
    }// </editor-fold>//GEN-END:initComponents

    private void listaEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaEmpleadosValueChanged
        if(this.listaEmpleados.getSelectedValue()!=null){
            Empleado emp = (Empleado)this.listaEmpleados.getSelectedValue();
            this.nomEmp.setText(emp.getNombre());
            this.ciEmp.setText(emp.getCi());
            this.celEmp.setText(emp.getCelular());
            this.salEmp.setText(""+emp.getSalario());
            this.managerEmp.setText(emp.getManager().toString());
            this.areaEmp.setText(emp.getArea().toString());
            this.panelEmp.setVisible(true);
        }
    }//GEN-LAST:event_listaEmpleadosValueChanged

    private void listaAreasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreasValueChanged
        if (this.listaAreas.getSelectedValue()!=null){
            Area ar = (Area)this.listaAreas.getSelectedValue();
            this.area = ar;
            this.txtArea.setText(ar.toString());
        }    }//GEN-LAST:event_listaAreasValueChanged

    private void listaManagersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaManagersValueChanged
        if (this.listaManagers.getSelectedValue()!=null){
            Manager man = (Manager)this.listaManagers.getSelectedValue();
            this.manager = man;
            this.txtManager.setText(man.toString());
        }
    }//GEN-LAST:event_listaManagersValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.agregarEmpleado();
    }//GEN-LAST:event_btnAgregarActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaEmp;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel celEmp;
    private javax.swing.JLabel ciEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList listaAreas;
    private javax.swing.JList listaEmpleados;
    private javax.swing.JList listaManagers;
    private javax.swing.JLabel managerEmp;
    private javax.swing.JLabel nomEmp;
    private javax.swing.JLabel nomEmp1;
    private javax.swing.JPanel panelCv;
    private javax.swing.JPanel panelEmp;
    private javax.swing.JLabel salEmp;
    private javax.swing.JTextPane txtArea;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextPane txtCv;
    private javax.swing.JTextPane txtManager;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private Manager manager;
    private Area area;
}
