package interfaz;
import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)


public class AreasModificacion extends javax.swing.JFrame implements Observer {

    public AreasModificacion(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = sistema;
        modelo.addObserver(this);
        cargarLista();

    }

    public void cargarLista() {

        this.listaAreas.setListData(this.modelo.getListaAreas().toArray());

    }

    public void modificarArea() {
        if (!this.txtDescrip.getText().equals("")) {

            String nuevaDescrip = this.txtDescrip.getText();

            this.areaAModificar.setDescripcion(nuevaDescrip);

            this.modelo.modificacion();

            this.txtNom.setText("");
            this.txtDescrip.setText("");
            this.txtPros.setText("");

            this.cargarLista();

        } else {
            JOptionPane.showMessageDialog(null, "Complete los campos para Modificar un area", "ERROR", 0);
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
        listaAreas = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        txtPros = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescrip = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Area");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Áreas:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(22, 20, 79, 32);

        listaAreas.setBackground(new java.awt.Color(255, 255, 255));
        listaAreas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaAreas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaAreas.setForeground(new java.awt.Color(0, 0, 0));
        listaAreas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaAreas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaAreas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAreasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaAreas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(22, 70, 154, 247);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 80, 120, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 140, 120, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Presupuesto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 200, 120, 30);

        btnModificar.setBackground(new java.awt.Color(0, 0, 102));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(377, 266, 129, 39);

        txtPros.setEditable(false);
        txtPros.setBackground(new java.awt.Color(255, 255, 255));
        txtPros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPros.setForeground(new java.awt.Color(0, 0, 0));
        txtPros.setToolTipText("");
        txtPros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtPros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtPros);
        txtPros.setBounds(340, 200, 230, 29);

        txtNom.setEditable(false);
        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        txtNom.setToolTipText("");
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtNom);
        txtNom.setBounds(340, 80, 230, 29);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDescrip.setBackground(new java.awt.Color(255, 255, 255));
        txtDescrip.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(txtDescrip);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(340, 140, 230, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 614, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (this.listaAreas.getSelectedValue() != null) {

            modificarArea();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un area a modificar", "ERROR", 0);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void listaAreasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreasValueChanged

        if (this.listaAreas.getSelectedValue() != null) {
            Area ar = (Area) this.listaAreas.getSelectedValue();
            this.areaAModificar = ar;
            this.txtNom.setText(ar.getNombre());
            this.txtDescrip.setText(ar.getDescripcion());
            this.txtPros.setText("" + ar.getPresupuesto());

        }

    }//GEN-LAST:event_listaAreasValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaAreas;
    private javax.swing.JTextPane txtDescrip;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPros;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
    private Area areaAModificar;
}
