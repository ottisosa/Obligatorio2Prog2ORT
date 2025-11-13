package interfaz;

import dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class MgAlta extends javax.swing.JFrame implements Observer {

    public MgAlta(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        cargarLista();
    }

    public void cargarLista() {
        this.listaManagers.setListData(this.modelo.getListaManagers().toArray());
    }

    public void agregarManager() {
        if ((!this.txtNom.getText().equals("")) && (!this.txtCI.getText().equals("")) && (!this.txtAntiguedad.getText().equals("")) && (!this.txtCel.getText().equals(""))) {
            if (!this.modelo.verificarCedula(this.txtCI.getText())) {
                try {
                    String Nombre = this.txtNom.getText();
                    String ci = this.txtCI.getText();
                    int Antiguedad = Integer.parseInt(this.txtAntiguedad.getText());;
                    String Cel = this.txtCel.getText();

                    Manager manager = new Manager(Antiguedad, Nombre, ci, Cel, this.modelo);

                    this.txtNom.setText("");
                    this.txtCI.setText("");
                    this.txtAntiguedad.setText("");
                    this.txtCel.setText("");

                    this.cargarLista();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "La antiguedad debe ser un número", "ERROR", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya hay un manager registrado con esa cedula", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete los campos para agregar un area", "ERROR", 0);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.cargarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaManagers = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtAntiguedad = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar manager");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cel:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 250, 50, 25);

        listaManagers.setBackground(new java.awt.Color(255, 255, 255));
        listaManagers.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaManagers.setForeground(new java.awt.Color(0, 0, 0));
        listaManagers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaManagers);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 140, 250);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Managers:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 130, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Antiguedad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 190, 130, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 130, 30, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 70, 90, 25);

        txtCI.setBackground(new java.awt.Color(255, 255, 255));
        txtCI.setForeground(new java.awt.Color(0, 0, 0));
        txtCI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCI);
        txtCI.setBounds(320, 130, 170, 30);

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
        btnAgregar.setBounds(350, 310, 120, 40);

        txtAntiguedad.setBackground(new java.awt.Color(255, 255, 255));
        txtAntiguedad.setForeground(new java.awt.Color(0, 0, 0));
        txtAntiguedad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtAntiguedad);
        txtAntiguedad.setBounds(320, 190, 170, 30);

        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        txtCel.setForeground(new java.awt.Color(0, 0, 0));
        txtCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCel);
        txtCel.setBounds(320, 250, 170, 30);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNom);
        txtNom.setBounds(320, 70, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -5, 580, 420);

        setBounds(0, 0, 594, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        agregarManager();

    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaManagers;
    private javax.swing.JTextField txtAntiguedad;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
