package interfaz;
import dominio.*;

// Autores: Santiago Quintana (327886), Octavio Sosa (363131)
public class Comenzar extends javax.swing.JFrame {

    public Comenzar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSisNuevo = new javax.swing.JButton();
        btnSisGuardado = new javax.swing.JButton();
        btnSisCargado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comenzar");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("Eliga una opcion");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setName(""); // NOI18N

        btnSisNuevo.setBackground(new java.awt.Color(0, 0, 204));
        btnSisNuevo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSisNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnSisNuevo.setText("Sistema nuevo");
        btnSisNuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnSisNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSisNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisNuevoActionPerformed(evt);
            }
        });

        btnSisGuardado.setBackground(new java.awt.Color(0, 0, 204));
        btnSisGuardado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSisGuardado.setForeground(new java.awt.Color(255, 255, 255));
        btnSisGuardado.setText("Sistema guardado");
        btnSisGuardado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnSisGuardado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSisGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisGuardadoActionPerformed(evt);
            }
        });

        btnSisCargado.setBackground(new java.awt.Color(0, 0, 204));
        btnSisCargado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSisCargado.setForeground(new java.awt.Color(255, 255, 255));
        btnSisCargado.setText("Sistema con datos precargados");
        btnSisCargado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        btnSisCargado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSisCargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSisCargadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSisNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSisGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSisCargado, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSisNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSisGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSisCargado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 230);

        setBounds(0, 0, 573, 231);
    }// </editor-fold>//GEN-END:initComponents


    private void btnSisNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisNuevoActionPerformed

        Menu men = new Menu();
        this.dispose();
        men.setVisible(true);
    }//GEN-LAST:event_btnSisNuevoActionPerformed

    private void btnSisGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisGuardadoActionPerformed

        Menu men = new Menu();
        this.dispose();
        men.setVisible(true);
    }//GEN-LAST:event_btnSisGuardadoActionPerformed

    private void btnSisCargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSisCargadoActionPerformed

        Menu men = new Menu();
        this.dispose();
        men.setVisible(true);
        Area per = new Area("Personal","Reclutamiento de personal, promociones, gestión de cargos",100000);
        Area RRHH = new Area("RRHH","Relacionamiento en la empresa, organigrama, gestión de equipo",80000);
        Area seg = new Area("Seguridad","Seguridad física, vigilancia, seguridad informática, protocolos y políticas de seguridad",120000);
        Area com = new Area("Comunicaciones","Comunicaciones internas, reglas y protocolos, comunicaciones con proveedores y clientes",20000);
        Area mark = new Area("Marketing","Acciones planificadas, publicidad en medios masivos, publicidad en redes, gestión de redes",95000);
        Manager man1 = new Manager(10,"Ana Martinez","4.568.369-1","099123456");
        Manager man2 = new Manager(4,"Ricardo Morales","3.214.589-3","094121212");
        Manager man3 = new Manager(1,"Laura Torales","3.589.257-5","099654321");
        Manager man4 = new Manager(5,"Juan Pablo Zapata","4.555.197-7","099202020");
        
    }//GEN-LAST:event_btnSisCargadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSisCargado;
    private javax.swing.JButton btnSisGuardado;
    private javax.swing.JButton btnSisNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
