
package interfaz;

public class Managers extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Managers.class.getName());

    public Managers() {
        initComponents();
        jScrollPane1.getViewport().setBackground(java.awt.Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 290, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
