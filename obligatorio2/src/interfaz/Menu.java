package interfaz;
import dominio.*;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    
    public Menu(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.modelo=sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        arAlta = new javax.swing.JMenuItem();
        arBaja = new javax.swing.JMenuItem();
        arMod = new javax.swing.JMenuItem();
        arMov = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mgAlta = new javax.swing.JMenuItem();
        mgBaja = new javax.swing.JMenuItem();
        mgMod = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        empAlta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        repInt = new javax.swing.JMenuItem();
        repAr = new javax.swing.JMenuItem();
        repMov = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 410);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        jMenu1.setText("Areas");

        arAlta.setText("Alta");
        arAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arAltaActionPerformed(evt);
            }
        });
        jMenu1.add(arAlta);

        arBaja.setText("Baja");
        jMenu1.add(arBaja);

        arMod.setText("Modificación");
        jMenu1.add(arMod);

        arMov.setText("Realizar Movimiento");
        jMenu1.add(arMov);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Managers");

        mgAlta.setText("Alta");
        jMenu2.add(mgAlta);

        mgBaja.setText("Baja");
        jMenu2.add(mgBaja);

        mgMod.setText("Modificación");
        jMenu2.add(mgMod);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empleados");

        empAlta.setText("Alta");
        jMenu3.add(empAlta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        repInt.setText("Reporte Inteligente");
        jMenu4.add(repInt);

        repAr.setText("Reporte de estado de áreas");
        jMenu4.add(repAr);

        repMov.setText("Reporte de movimientos");
        jMenu4.add(repMov);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 550, 434);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_F1) {
            JOptionPane.showMessageDialog(null, "Autores: Santiago Quintana (327886), Octavio Sosa (363131)");
        }

    }//GEN-LAST:event_formKeyPressed

    private void arAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arAltaActionPerformed
        AreasAlta vent = new AreasAlta();
        vent.setVisible(true);
    }//GEN-LAST:event_arAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arAlta;
    private javax.swing.JMenuItem arBaja;
    private javax.swing.JMenuItem arMod;
    private javax.swing.JMenuItem arMov;
    private javax.swing.JMenuItem empAlta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mgAlta;
    private javax.swing.JMenuItem mgBaja;
    private javax.swing.JMenuItem mgMod;
    private javax.swing.JMenuItem repAr;
    private javax.swing.JMenuItem repInt;
    private javax.swing.JMenuItem repMov;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
