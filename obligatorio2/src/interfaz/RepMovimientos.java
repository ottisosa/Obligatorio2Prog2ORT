package interfaz;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

import dominio.*;

public class RepMovimientos extends javax.swing.JFrame {
    
    public RepMovimientos(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo = sistema;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMovimientos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        comboMes1 = new javax.swing.JComboBox<>();
        comboMes2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de movimientos");
        setResizable(false);
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(70, 130, 180));
        panel.setLayout(null);

        listaMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        listaMovimientos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        listaMovimientos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        listaMovimientos.setForeground(new java.awt.Color(0, 0, 0));
        listaMovimientos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaMovimientos);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 154, 247);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movimientos:");
        panel.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtrar:");
        panel.add(jLabel4);
        jLabel4.setBounds(230, 20, 110, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Movimiento:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 10, 150, 30);

        panel.add(jPanel1);
        jPanel1.setBounds(350, 40, 170, 260);

        comboMes.setBackground(new java.awt.Color(255, 255, 255));
        comboMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMes.setForeground(new java.awt.Color(0, 0, 0));
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(comboMes);
        comboMes.setBounds(200, 80, 130, 22);

        comboMes1.setBackground(new java.awt.Color(255, 255, 255));
        comboMes1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMes1.setForeground(new java.awt.Color(0, 0, 0));
        comboMes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboMes1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(comboMes1);
        comboMes1.setBounds(200, 150, 130, 22);

        comboMes2.setBackground(new java.awt.Color(255, 255, 255));
        comboMes2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboMes2.setForeground(new java.awt.Color(0, 0, 0));
        comboMes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        comboMes2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        comboMes2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.add(comboMes2);
        comboMes2.setBounds(200, 230, 130, 22);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 550, 370);

        setBounds(0, 0, 554, 362);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> comboMes1;
    private javax.swing.JComboBox<String> comboMes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaMovimientos;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
