/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab A
 */
public class frmTicket extends javax.swing.JFrame {
ImageIcon Cromo=new ImageIcon();
    ImageIcon Escala=new ImageIcon();
    AutoByteDB you = new AutoByteDB();
    Connection cn = you.conexion();
    
    static int volver,confirmseguro,creditos;
    String seguro="",sql;
    double costoseguro,subtotauto,total,pago,falta;
    /**
     * Creates new form frmTicket
     */
    public frmTicket() {
        initComponents();
        Cromo=new ImageIcon(getClass().getResource("/Imagenes/frmTodo.jpg"));
        Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblFondo.getWidth(),lblFondo.getHeight(),Image.SCALE_DEFAULT));
        lblFondo.setIcon(Escala);
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        
        
        subtotauto=frmVentas.precio+frmMarcas.subtotauto;
        
        btnSeguros.setEnabled(false);
        if (creditos==0) {
        Ticket();
        btnInicio.setEnabled(false);
        btnVolver.setEnabled(false);
        btnCreditos.setEnabled(false);
        btnSalir.setEnabled(false);
        btnPagar.setEnabled(true);
        }
        else {
        btnInicio.setEnabled(true);
        btnVolver.setEnabled(true);
        btnCreditos.setEnabled(true);
        btnSalir.setEnabled(true);
        btnPagar.setEnabled(false);
        txtaTicket.setVisible(false);
    }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaTicket = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btnSeguros = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TICKET");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo 2.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, 110));

        txtaTicket.setEditable(false);
        txtaTicket.setColumns(20);
        txtaTicket.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtaTicket.setForeground(new java.awt.Color(0, 102, 102));
        txtaTicket.setRows(5);
        txtaTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "TICKET", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 1, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jScrollPane1.setViewportView(txtaTicket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 330, 450));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnsalir.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnpagar.png"))); // NOI18N
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnSeguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnseguros.png"))); // NOI18N
        btnSeguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSegurosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 280, 290));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnvolver.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 60, 60));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnapagar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 80, 80));

        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnacercade.png"))); // NOI18N
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 80, 80));

        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Ticket() {
            btnSeguros.setEnabled(true);
                total=subtotauto+costoseguro+frmMarcas.subtotadicionales+frmPartes.subtotpartes;
                txtaTicket.setText("=============AUTOBYTE============="
                + "\n\nCOMPROMETIDOS CON LA SEGURIDAD,"
                + "\nDEDICADOS A TU SATISFACCION\n\n"
                + "===================================="
                + "\n\nCLIENTE:\t"+frmVentas.nombre+
                "\nAUTOMOVIL:\t"+frmVentas.autocompra+frmMarcas.modelo+
                "\n\n===================================="+"\n\n>>>>>ADICIONALES<<<<<\n\n"+frmMarcas.adicionales +"\n"+">>>>>REFACCIONES<<<<<"+
                "\n\nNeumaticos:\t\t"+frmPartes.NNeumaticos+"\nEscapes:\t\t"+frmPartes.NEscapes+
                "\nFaros:\t\t"+frmPartes.NFaros+"\nTransmisiones:\t"+frmPartes.NTransmision+
                "\nSuspensiones:\t"+frmPartes.NSuspensiones+"\nLuces Traseras:\t"+frmPartes.NLucest+
                "\n\n>>>>>SEGURO<<<<<\n\n"+seguro+
                "\n\n==============PAGO==============\n\n"+"AUTOMOVIL:\t\t"+ String.format("$%.2f", subtotauto)+
                "\nADICIONALES:\t"+String.format("$%.2f", frmMarcas.subtotadicionales)+"\n\nREFACCIONES:\t"+String.format("$%.2f", frmPartes.subtotpartes)+
                "\nSEGURO:\t\t"+String.format("$%.2f",costoseguro )+"\n\nTOTAL:\t\t"+String.format("$%.2f", total)+ "\n\n====================================");
    }
    private void ActualizarExistencias(String Valor, int decremento){
        try
        {   
            sql="UPDATE almacen set stock=stock -"+decremento+" WHERE nombre='"+Valor+"'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.executeUpdate();

            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
            
        
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        dispose();
        new frmInicio().setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        
        
        
        
        
        dispose();
    switch (volver) {
        case 0:
            new frmVentas().setVisible(true);
            break;
        case 1:
            new frmMarcas().setVisible(true);
            break;
        case 2:
            new frmPartes().setVisible(true);
            break;
        
    }
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        txtaTicket.setVisible(false);
        pago=Double.parseDouble(JOptionPane.showInputDialog("Porfavor ingrese el pago de: $"+total));
        
        if(pago==total)
        {
            JOptionPane.showMessageDialog(null, "Pago completado con exito\n¡Gracias por su visita!");
        }
        else if (pago<total) {
            while (pago<total)
                {
                    falta = Double.parseDouble(JOptionPane.showInputDialog("Pago incompleto,\nPorfavor ingresa el faltante: $"+String.format("%.2f", total-pago)));
                    pago+=falta;
                    
                    if (pago==total)
                        {
                            JOptionPane.showMessageDialog(null, "Pago completado con exito\n¡Gracias por su visita!");
                        }
                    else if (pago>total)
                        {
                            JOptionPane.showMessageDialog(null, "Pago completado con exito\n¡Gracias por su visita!\n\nSu cambio es: $"+String.format("%.2f", pago-total));
                        }
                }
        }
        else if (pago>total)
                        {
                            JOptionPane.showMessageDialog(null, "Pago completado con exito\n¡Gracias por su visita!\n\nSu cambio es: $"+String.format("%.2f", pago-total));
                        }
        
        btnInicio.setEnabled(true);
        btnVolver.setEnabled(true);
        btnCreditos.setEnabled(true);
        btnSalir.setEnabled(true);
        btnPagar.setEnabled(false);
        
        ActualizarExistencias(frmVentas.autocompra+frmMarcas.modelo,1);
        ActualizarExistencias("Neumaticos",frmPartes.NNeumaticos);
        ActualizarExistencias("Frenos Traseros",frmPartes.NFrenos);
        ActualizarExistencias("Escapes",frmPartes.NEscapes);
        ActualizarExistencias("Faros",frmPartes.NFaros);
        ActualizarExistencias("Transmisiones",frmPartes.NTransmision);
        ActualizarExistencias("Suspensiones",frmPartes.NSuspensiones);
        ActualizarExistencias("Luces Traseras",frmPartes.NLucest);
        
        
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        dispose();
        new frmCreditos().setVisible(true);
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnSegurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSegurosActionPerformed
        confirmseguro = JOptionPane.showConfirmDialog(null, "¿Desea contratar el seguro AutoBytePro?", "CONFIRMAR",
				JOptionPane.YES_NO_OPTION);
            if (confirmseguro==0) {
               seguro="Seguro AutoBytePro"; 
               costoseguro=8000;
                btnSeguros.setEnabled(false);
               Ticket();
            }
           
    }//GEN-LAST:event_btnSegurosActionPerformed

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
            java.util.logging.Logger.getLogger(frmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCreditos;
    public static javax.swing.JButton btnInicio;
    public static javax.swing.JButton btnPagar;
    public static javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeguros;
    public static javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    public static javax.swing.JTextArea txtaTicket;
    // End of variables declaration//GEN-END:variables
}
