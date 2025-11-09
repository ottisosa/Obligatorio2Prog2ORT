
package interfaz;
import dominio.*;

public class SplashScreen extends javax.swing.JFrame {
    
    public SplashScreen(Sistema sistema) {
        initComponents();
        this.modelo = sistema;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
        }
        this.dispose();
        
        Comenzar com = new Comenzar(this.modelo);
        com.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(516, 526));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo azul.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 500, 540);

        setBounds(0, 0, 514, 532);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
