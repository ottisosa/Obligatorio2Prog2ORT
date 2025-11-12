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
        jLabel1 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo blanco.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 440);

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
        arBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arBajaActionPerformed(evt);
            }
        });
        jMenu1.add(arBaja);

        arMod.setText("Modificación");
        arMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arModActionPerformed(evt);
            }
        });
        jMenu1.add(arMod);

        arMov.setText("Realizar Movimiento");
        arMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arMovActionPerformed(evt);
            }
        });
        jMenu1.add(arMov);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Managers");

        mgAlta.setText("Alta");
        mgAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgAltaActionPerformed(evt);
            }
        });
        jMenu2.add(mgAlta);

        mgBaja.setText("Baja");
        mgBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgBajaActionPerformed(evt);
            }
        });
        jMenu2.add(mgBaja);

        mgMod.setText("Modificación");
        mgMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgModActionPerformed(evt);
            }
        });
        jMenu2.add(mgMod);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empleados");

        empAlta.setText("Alta");
        empAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAltaActionPerformed(evt);
            }
        });
        jMenu3.add(empAlta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        repInt.setText("Reporte Inteligente");
        repInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repIntActionPerformed(evt);
            }
        });
        jMenu4.add(repInt);

        repAr.setText("Reporte de estado de áreas");
        repAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repArActionPerformed(evt);
            }
        });
        jMenu4.add(repAr);

        repMov.setText("Reporte de movimientos");
        repMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repMovActionPerformed(evt);
            }
        });
        jMenu4.add(repMov);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 510, 395);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_F1) {
            JOptionPane.showMessageDialog(null, "Autores: \nSantiago Quintana (327886), 19 años, SQ327886@fi365.ort.edu.uy\nOctavio Sosa (363131), 20 años, OS363131@fi365.ort.edu.uy");
        }
    }//GEN-LAST:event_formKeyPressed

    private void arAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arAltaActionPerformed
        AreasAlta vent = new AreasAlta(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_arAltaActionPerformed

    private void arBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arBajaActionPerformed
        AreasBaja vent = new AreasBaja(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_arBajaActionPerformed

    private void arModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arModActionPerformed
        AreasModificacion vent = new AreasModificacion(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_arModActionPerformed

    private void arMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arMovActionPerformed
        AreasMovimiento vent = new AreasMovimiento(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_arMovActionPerformed

    private void mgAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgAltaActionPerformed
        MgAlta vent = new MgAlta(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_mgAltaActionPerformed

    private void mgBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgBajaActionPerformed
        MgBaja vent = new MgBaja(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_mgBajaActionPerformed

    private void mgModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgModActionPerformed
        MgModificacion vent = new MgModificacion(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_mgModActionPerformed

    private void empAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAltaActionPerformed
        EmpAlta vent = new EmpAlta(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_empAltaActionPerformed

    private void repIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repIntActionPerformed
        RepInteligente vent = new RepInteligente(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_repIntActionPerformed

    private void repArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repArActionPerformed
        RepAreas vent = new RepAreas(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_repArActionPerformed

    private void repMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repMovActionPerformed
        RepMovimientos vent = new RepMovimientos(this.modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_repMovActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arAlta;
    private javax.swing.JMenuItem arBaja;
    private javax.swing.JMenuItem arMod;
    private javax.swing.JMenuItem arMov;
    private javax.swing.JMenuItem empAlta;
    private javax.swing.JLabel jLabel1;
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
