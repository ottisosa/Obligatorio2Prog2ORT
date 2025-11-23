package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class MgBaja extends javax.swing.JFrame implements Observer {

    public MgBaja(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        cargarLista();
    }

    public void cargarLista() {
        this.listaManagers.setListData(this.modelo.getListaManagers().toArray());
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
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCi = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAntig = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCel = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtNom = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar manager");
        setResizable(false);
        getContentPane().setLayout(null);

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

        btnEliminar.setBackground(new java.awt.Color(102, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(350, 310, 120, 40);

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

        txtCel.setEditable(false);
        txtCel.setBackground(new java.awt.Color(255, 255, 255));
        txtCel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtCel.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(txtCel);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(320, 250, 180, 30);

        txtNom.setEditable(false);
        txtNom.setBackground(new java.awt.Color(255, 255, 255));
        txtNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        txtNom.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(txtNom);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(320, 70, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 420);

        setBounds(0, 0, 596, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (this.listaManagers.getSelectedValue() != null) {
            this.modelo.eliminarListaManagers((Manager) this.listaManagers.getSelectedValue());
            this.cargarLista();

            this.txtNom.setText("");
            this.txtCi.setText("");
            this.txtAntig.setText("");
            this.txtCel.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un manager a eliminar", "ERROR", 0);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void listaManagersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaManagersValueChanged

        if (this.listaManagers.getSelectedValue() != null) {
            Manager man = (Manager) this.listaManagers.getSelectedValue();
            this.txtNom.setText(man.getNombre());
            this.txtCi.setText(man.getCi());
            this.txtAntig.setText("" + man.getAntiguedad());
            this.txtCel.setText(man.getCelular());
        }

    }//GEN-LAST:event_listaManagersValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList listaManagers;
    private javax.swing.JTextPane txtAntig;
    private javax.swing.JTextPane txtCel;
    private javax.swing.JTextPane txtCi;
    private javax.swing.JTextPane txtNom;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
