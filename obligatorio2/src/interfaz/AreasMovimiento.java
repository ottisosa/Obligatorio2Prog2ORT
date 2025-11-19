package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import dominio.*;
import java.util.*;
import javax.swing.JOptionPane;

public class AreasMovimiento extends javax.swing.JFrame implements Observer {

    public AreasMovimiento(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.cargarListas();
    }

    public void cargarListas() {

        this.modelo.ordenarAreaPorNombre(this.modelo.getListaAreas());

        this.listaAreas.setListData(this.modelo.getListaAreas().toArray());
        this.listaAreas2.setListData(this.modelo.getListaAreas().toArray());
    }

    public void cargarEmp(Area area) {
        ArrayList<Empleado> listaEmp = this.modelo.getListaEmpleados();
        this.comboEmp.removeAllItems();
        for (int i = 0; i < listaEmp.size(); i++) {
            if (listaEmp.get(i).getArea().equals(area)) {
                this.comboEmp.addItem(listaEmp.get(i));
            }
        }
        if (this.comboEmp.getItemCount() == 0) {
            this.comboEmp.addItem("Sin empleados");
        }
    }

    public void moverEmp() {
        if (this.listaAreas.getSelectedValue() != null && this.listaAreas2.getSelectedValue() != null) {
            System.out.println(this.comboEmp.getSelectedItem());
            if (!(this.comboEmp.getSelectedItem().equals("Sin empleados"))) {
                long salTotal = this.calcularSalarioTotal((Empleado) this.comboEmp.getSelectedItem());
                if ((((Area) this.listaAreas2.getSelectedValue()).getPresupuesto() - salTotal) >= 0) {
                    ((Empleado) this.comboEmp.getSelectedItem()).setArea((Area) this.listaAreas2.getSelectedValue());
                    ((Area) this.listaAreas2.getSelectedValue()).setPresupuesto(((Area) this.listaAreas2.getSelectedValue()).getPresupuesto() - salTotal);
                    ((Area) this.listaAreas.getSelectedValue()).setPresupuesto(((Area) this.listaAreas.getSelectedValue()).getPresupuesto() + salTotal);
                    
                    String mes = (String)this.comboMes.getSelectedItem();
                    int nroMes = this.comboMes.getSelectedIndex();
                    Empleado emp = (Empleado)this.comboEmp.getSelectedItem();
                    Area origen = (Area)this.listaAreas.getSelectedValue();
                    Area destino = (Area)this.listaAreas2.getSelectedValue();
                    Movimiento mov = new Movimiento(mes, nroMes, emp, origen, destino, this.modelo);
                    
                    this.modelo.modificacion();
                } else {
                    JOptionPane.showMessageDialog(null, "Presupuesto no es suficiente", "ERROR", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione empleado a transferir", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione areas de origen y transferencia", "ERROR", 0);
        }
    }

    public long calcularSalarioTotal(Empleado emp) {
        long salarioTotal = -1;
        int mes = this.comboMes.getSelectedIndex();
        if (mes < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el mes de transferencia", "ERROR", 0);
        } else {
            salarioTotal = (((Empleado) this.comboEmp.getSelectedItem()).getSalario()) * (12 - mes);
        }
        return salarioTotal;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.cargarListas();
        if (this.listaAreas.getSelectedValue() != null) {
            this.cargarEmp((Area) this.listaAreas.getSelectedValue());
        }
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
        btnModificar = new javax.swing.JButton();

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
        listaAreas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAreasValueChanged(evt);
            }
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
        comboEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sin empleados" }));
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

        btnModificar.setBackground(new java.awt.Color(0, 0, 102));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Mover");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(500, 40, 129, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 658, 490);

        setBounds(0, 0, 674, 496);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAreasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAreasValueChanged
        this.cargarEmp((Area) this.listaAreas.getSelectedValue());
    }//GEN-LAST:event_listaAreasValueChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.moverEmp();
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox comboEmp;
    private javax.swing.JComboBox<String> comboMes;
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
