
package interfaz;
import dominio.*;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

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
        this.abrirF1();
    }
    
    public void abrirF1(){
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener(){
            @Override
            public void eventDispatched(AWTEvent event){
                if(event.getID() == KeyEvent.KEY_PRESSED){
                    KeyEvent keyevent = (KeyEvent) event;
                    if(keyevent.getKeyCode() == KeyEvent.VK_F1){
                        keyevent.consume();
                        JOptionPane.showMessageDialog(null, "Autores: \nSantiago Quintana (327886), SQ327886@fi365.ort.edu.uy\nOctavio Sosa (363131), OS363131@fi365.ort.edu.uy");
                    }
                }
            }
        }, AWTEvent.KEY_EVENT_MASK);
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
