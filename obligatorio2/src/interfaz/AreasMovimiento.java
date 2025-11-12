package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import dominio.*;
import java.util.*;

public class AreasMovimiento extends javax.swing.JFrame implements Observer{

    public AreasMovimiento(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
        this.modelo.addObserver(this);
        this.crearComboMeses();
    }
    
    public void crearComboMeses(){
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
        for (int i = 0; i < meses.length; i++) {
            this.comboMes.addItem(meses[i]);
        }
        
    }
    
    @Override
    public void update(Observable o, Object arg){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboMes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboEmp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Areas movimiento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        comboMes.setBackground(new java.awt.Color(255, 255, 255));
        comboMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMes.setForeground(new java.awt.Color(0, 0, 0));
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        comboMes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(comboMes);
        comboMes.setBounds(29, 55, 121, 22);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Área de origen:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(29, 126, 154, 32);

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jList1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

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
        comboEmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Empleados", " ", " " }));
        comboEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(comboEmp);
        comboEmp.setBounds(252, 55, 172, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Área de destino:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(335, 126, 149, 32);

        jList2.setBackground(new java.awt.Color(255, 255, 255));
        jList2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jList2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jList2.setForeground(new java.awt.Color(0, 0, 0));
        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(335, 176, 165, 247);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mover");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jPanel1.add(jButton2);
        jButton2.setBounds(500, 40, 129, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 658, 443);

        setBounds(0, 0, 674, 451);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboEmp;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
