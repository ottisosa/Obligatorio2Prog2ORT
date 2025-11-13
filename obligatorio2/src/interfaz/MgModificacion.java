package interfaz;

import dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class MgModificacion extends javax.swing.JFrame implements Observer {

    public MgModificacion(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        modelo.addObserver(this);
        cargarLista();
    }

    public void cargarLista() {

        this.listaManagers.setListData(this.modelo.getListaManagers().toArray());

    }

    public void modificarManager() {

        if (!this.txtCel.getText().equals("")) {

            String nuevoCel = this.txtCel.getText();

            this.managerModificar.setCelular(nuevoCel);

            this.modelo.modificacion();

            this.txtNom.setText("");
            this.txtCi.setText("");
            this.txtAntig.setText("");
            this.txtCel.setText("");

            this.cargarLista();

        } else {
            JOptionPane.showMessageDialog(null, "Complete los campos para Modificar un manager", "ERROR", 0);
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
        btnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCi = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAntig = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtNom = new javax.swing.JTextPane();
        txtCel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cel:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 250, 40, 25);

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
        jLabel3.setBounds(190, 190, 130, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CI:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 130, 40, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 70, 80, 25);

        btnModificar.setBackground(new java.awt.Color(0, 0, 102));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(350, 310, 120, 40);

        txtCi.setEditable(false);
        txtCi.setBackground(new java.awt.Color(255, 255, 255));
        txtCi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtCi.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtCi);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(320, 130, 180, 30);

        txtAntig.setEditable(false);
        txtAntig.setBackground(new java.awt.Color(255, 255, 255));
        txtAntig.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtAntig.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(txtAntig);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(320, 190, 180, 30);

        txtNom.setEditable(false);
        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(txtNom);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(320, 70, 180, 30);

        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        txtCel.setForeground(new java.awt.Color(0, 0, 0));
        txtCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtCel);
        txtCel.setBounds(320, 250, 180, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 596, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (this.listaManagers.getSelectedValue() != null) {

            modificarManager();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un manager a modificar", "ERROR", 0);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void listaManagersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaManagersValueChanged

        if (this.listaManagers.getSelectedValue() != null) {

            Manager man = (Manager) this.listaManagers.getSelectedValue();

            this.managerModificar = man;

            this.txtNom.setText(man.getNombre());
            this.txtCi.setText(man.getCi());
            this.txtAntig.setText("" + man.getAntiguedad());
            this.txtCel.setText(man.getCelular());
        }


    }//GEN-LAST:event_listaManagersValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList listaManagers;
    private javax.swing.JTextPane txtAntig;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextPane txtCi;
    private javax.swing.JTextPane txtNom;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private Manager managerModificar;

}
