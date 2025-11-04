
package interfaz;

public class SplashScreen extends javax.swing.JFrame {
    
    public SplashScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
        }
        this.dispose();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(516, 526));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\Obligatorio2Prog2ORT\\obligatorio2\\img\\logo azul.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 500);

        setBounds(0, 0, 516, 526);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
