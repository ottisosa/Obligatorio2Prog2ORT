package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

public class AreasAlta extends javax.swing.JFrame implements Observer {

    public AreasAlta(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarLista();
    }

    public void cargarLista() {
        this.listaAreas.setListData(this.modelo.getListaAreas().toArray());
    }

    public void agregarArea() {
        if ((!this.txtNom.getText().equals("")) && (!this.txtDescrip.getText().equals("")) && (!this.txtPres.getText().equals(""))){
            if (!this.modelo.verificarNombreArea(this.txtNom.getText())){
                try{
                    String Nombre = this.txtNom.getText();
                    String Descrip = this.txtDescrip.getText();
                    long Presupuesto = Long.parseLong(this.txtPres.getText());;

                    Area area = new Area(Nombre, Descrip, Presupuesto, this.modelo);

                    this.txtNom.setText("");
                    this.txtDescrip.setText("");
                    this.txtPres.setText("");
                    
                    this.cargarLista();
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Presupuesto debe ser un número", "ERROR", 0);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Area con el nombre ya existe", "ERROR", 0);                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Complete los campos para agregar un area", "ERROR", 0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        txtPres = new javax.swing.JTextField();
        btnAregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar un area");
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
        jScrollPane1.setViewportView(listaAreas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(23, 80, 154, 247);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Áreas:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(42, 30, 79, 32);

        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.setToolTipText("");
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNom);
        txtNom.setBounds(339, 92, 200, 29);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(205, 89, 110, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(205, 155, 130, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Presupuesto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(207, 225, 120, 30);

        txtDescrip.setBackground(new java.awt.Color(255, 255, 255));
        txtDescrip.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescrip.setForeground(new java.awt.Color(0, 0, 0));
        txtDescrip.setToolTipText("");
        txtDescrip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtDescrip);
        txtDescrip.setBounds(339, 158, 200, 29);

        txtPres.setBackground(new java.awt.Color(255, 255, 255));
        txtPres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPres.setForeground(new java.awt.Color(0, 0, 0));
        txtPres.setToolTipText("");
        txtPres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPres);
        txtPres.setBounds(339, 228, 200, 29);

        btnAregar.setBackground(new java.awt.Color(0, 102, 51));
        btnAregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAregar.setText("Agregar");
        btnAregar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnAregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAregar.setFocusPainted(false);
        btnAregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAregar);
        btnAregar.setBounds(380, 283, 129, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 380);

        setBounds(0, 0, 614, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAregarActionPerformed
        agregarArea();
    }//GEN-LAST:event_btnAregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaAreas;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPres;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
