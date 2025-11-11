
// Autores: Santiago Quintana (327886), Octavio Sosa (363131)

package interfaz;
import dominio.*;

public class AreasModificacion extends javax.swing.JFrame {

    public AreasModificacion(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = sistema;

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
        textoDesc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoNom = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textoPres = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Area");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
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
        jScrollPane1.setViewportView(listaAreas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(22, 70, 154, 247);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 80, 70, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripcion:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 140, 96, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Presupuesto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 200, 102, 30);

        btnModificar.setBackground(new java.awt.Color(0, 0, 102));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.setFocusPainted(false);
        jPanel1.add(btnModificar);
        btnModificar.setBounds(377, 266, 129, 39);

        textoDesc.setBackground(new java.awt.Color(255, 255, 255));
        textoDesc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoDesc.setForeground(new java.awt.Color(0, 0, 0));
        textoDesc.setToolTipText("");
        textoDesc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(textoDesc);
        textoDesc.setBounds(340, 140, 230, 29);

        textoNom.setBackground(new java.awt.Color(255, 255, 255));
        textoNom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        textoNom.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(textoNom);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(340, 80, 230, 30);

        textoPres.setBackground(new java.awt.Color(255, 255, 255));
        textoPres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        textoPres.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(textoPres);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(340, 200, 230, 30);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaAreas;
    private javax.swing.JTextField textoDesc;
    private javax.swing.JTextPane textoNom;
    private javax.swing.JTextPane textoPres;
    // End of variables declaration//GEN-END:variables
private Sistema modelo;
}
