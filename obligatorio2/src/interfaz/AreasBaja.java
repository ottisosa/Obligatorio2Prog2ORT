// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AreasBaja extends javax.swing.JFrame implements Observer {

    public AreasBaja(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarListaSinEmp();
    }

    public void cargarListaSinEmp() {
        
        this.modelo.ordenarAreaPorNombre(this.modelo.getListaAreas());

        this.listaAreas.setListData(this.modelo.getListaAreasSinEmp().toArray());
    }

    @Override
    public void update(Observable o, Object arg) {
        this.cargarListaSinEmp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoNom = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoDesc = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textoPres = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar un area");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 110, 110, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("sin empleados:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(22, 38, 159, 26);

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
        jScrollPane1.setBounds(22, 76, 154, 261);

        btnEliminar.setBackground(new java.awt.Color(102, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar ");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(370, 290, 129, 39);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Áreas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(22, 6, 71, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 170, 120, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Presupuesto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 230, 120, 25);

        textoNom.setEditable(false);
        textoNom.setBackground(new java.awt.Color(255, 255, 255));
        textoNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        textoNom.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(textoNom);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(320, 110, 230, 30);

        textoDesc.setEditable(false);
        textoDesc.setBackground(new java.awt.Color(255, 255, 255));
        textoDesc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        textoDesc.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(textoDesc);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(320, 170, 230, 30);

        textoPres.setEditable(false);
        textoPres.setBackground(new java.awt.Color(255, 255, 255));
        textoPres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        textoPres.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(textoPres);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(320, 230, 230, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 390);

        setBounds(0, 0, 614, 388);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAreasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreasValueChanged
        if (this.listaAreas.getSelectedValue() != null) {
            Area ar = (Area) this.listaAreas.getSelectedValue();
            this.textoNom.setText(ar.getNombre());
            this.textoDesc.setText(ar.getDescripcion());
            this.textoPres.setText("" + ar.getPresupuesto());
        }
    }//GEN-LAST:event_listaAreasValueChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.listaAreas.getSelectedValue() != null) {
            this.modelo.eliminarListaAreas((Area) this.listaAreas.getSelectedValue());
            this.cargarListaSinEmp();
            this.textoNom.setText("");
            this.textoDesc.setText("");
            this.textoPres.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un area a eliminar", "ERROR", 0);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaAreas;
    private javax.swing.JTextPane textoDesc;
    private javax.swing.JTextPane textoNom;
    private javax.swing.JTextPane textoPres;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

}
