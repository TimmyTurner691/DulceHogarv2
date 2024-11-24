/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dulcehogar;

import java.util.ArrayList;

/**
 *
 * @author jaket
 */
public class EjecucionAplicacion extends javax.swing.JFrame {
    private static ArrayList<Socio> socios = new ArrayList<>();
    
    /**
     * Creates new form EjecucionAplicacion
     */
    public EjecucionAplicacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnt_registrar = new javax.swing.JMenuItem();
        mnt_datos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnt_pagar = new javax.swing.JMenuItem();
        mnt_consultar = new javax.swing.JMenuItem();
        mnt_numero = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Seleccion");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Bienvenido a Dulce Hogar!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Porfavor selecciona una opcion del menu de arriba.");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jMenu1.setText("Socios");

        mnt_registrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnt_registrar.setText("Registrar Socio");
        mnt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_registrarActionPerformed(evt);
            }
        });
        jMenu1.add(mnt_registrar);

        mnt_datos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnt_datos.setText("Ver Datos Socio");
        mnt_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_datosActionPerformed(evt);
            }
        });
        jMenu1.add(mnt_datos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cuenta Socio");

        mnt_pagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnt_pagar.setText("Pagar Cuota Mensual");
        mnt_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_pagarActionPerformed(evt);
            }
        });
        jMenu2.add(mnt_pagar);

        mnt_consultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnt_consultar.setText("Consultar Monto Total Cancelado");
        mnt_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnt_consultarActionPerformed(evt);
            }
        });
        jMenu2.add(mnt_consultar);

        mnt_numero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnt_numero.setText("Consultar N* Cuotas por Cancelar");
        jMenu2.add(mnt_numero);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_registrarActionPerformed
        new RegistrarSocio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnt_registrarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void mnt_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_datosActionPerformed
        new VerDatosSocio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnt_datosActionPerformed

    private void mnt_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_pagarActionPerformed
        new CancelarCuota().setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_mnt_pagarActionPerformed

    private void mnt_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnt_consultarActionPerformed
        new MontoTotal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnt_consultarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EjecucionAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjecucionAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjecucionAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjecucionAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjecucionAplicacion().setVisible(true);
            }
        });
    }

    public static ArrayList<Socio> getSocios() {
        return socios;
    }

    public static void setSocios(ArrayList<Socio> socios) {
        EjecucionAplicacion.socios = socios;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnt_consultar;
    private javax.swing.JMenuItem mnt_datos;
    private javax.swing.JMenuItem mnt_numero;
    private javax.swing.JMenuItem mnt_pagar;
    private javax.swing.JMenuItem mnt_registrar;
    // End of variables declaration//GEN-END:variables
}

