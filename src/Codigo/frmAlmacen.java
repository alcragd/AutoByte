/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab A
 */
public class frmAlmacen extends javax.swing.JFrame {
    ImageIcon Cromo=new ImageIcon();
    ImageIcon Escala=new ImageIcon();
    AutoByteDB you = new AutoByteDB();
    Connection cn = you.conexion();
    DefaultTableModel tabla = new DefaultTableModel();
    
    String []inventario = new String[4];
    
    String sql,id,elim,busqueda;
    int n,uno;
    
    public frmAlmacen() {
        initComponents();
        Cromo=new ImageIcon(getClass().getResource("/Imagenes/frmAlmacen_1.jpg"));
        Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblFondo.getWidth(),lblFondo.getHeight(),Image.SCALE_DEFAULT));
        lblFondo.setIcon(Escala);
        
        
        tabla.addColumn("ID");
        tabla.addColumn("PRODUCTO");
        tabla.addColumn("EXISTENCIAS");
        tabla.addColumn("PRECIO");
        this.tblInventario.setModel(tabla);
    }
    
    public void Inventario(String Valor)
    {
        int elit = tblInventario.getRowCount();
        for(n=elit-1; n>=0;n--)
            tabla.removeRow(n);
        if(Valor.equals(""))
            sql = "SELECT * FROM almacen";
        
        else
            sql = "SELECT * FROM almacen WHERE type = '"+Valor+"'";
        try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            inventario[0]=rs.getString(1);
            inventario[1]=rs.getString(2);
            inventario[2]=rs.getString(3);
            inventario[3]=("$ "+rs.getString(4));
            tabla.addRow(inventario);
            
            
        }
        tblInventario.setModel(tabla);
        }
        catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
                }

    public void Buscar(String Valor)
    {
        int elit = tblInventario.getRowCount();
        for(n=elit-1; n>=0;n--) 
            tabla.removeRow(n);
        
        sql = "SELECT * FROM almacen WHERE nombre LIKE '%"+Valor+"%'" + "OR idproducto LIKE '%"+Valor+"%'";
        try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            inventario[0]=rs.getString(1);
            inventario[1]=rs.getString(2);
            inventario[2]=rs.getString(3);
            inventario[3]=("$ "+rs.getString(4));
            tabla.addRow(inventario);
            
            
        }
        tblInventario.setModel(tabla);
        }
        catch(SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
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

        rdbgEmpresas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblLema = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnPartes = new javax.swing.JButton();
        btnAutos = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLema.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblLema.setForeground(new java.awt.Color(255, 255, 255));
        lblLema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLema.setText("\"Comprometidos con la seguridad, \ndedicados a tu satisfaccion\"");
        lblLema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblLema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 630, 30));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo mini.jpg"))); // NOI18N
        lblLogo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 100, 50));

        btnPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPieazas.png"))); // NOI18N
        btnPartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartesActionPerformed(evt);
            }
        });
        getContentPane().add(btnPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 80));

        btnAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCoches.png"))); // NOI18N
        btnAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 80, 80));

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnPedido.png"))); // NOI18N
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 80, 60));

        txtBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 270, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnBuscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 80, 80));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblInventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInventario);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 800, 220));

        lblFondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosActionPerformed
        Inventario("0");
    }//GEN-LAST:event_btnAutosActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnPartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartesActionPerformed
        Inventario("1");
    }//GEN-LAST:event_btnPartesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        busqueda=txtBuscar.getText();
        
        Buscar(busqueda);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPartes;
    private javax.swing.JButton btnPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLema;
    private javax.swing.JLabel lblLogo;
    private javax.swing.ButtonGroup rdbgEmpresas;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
