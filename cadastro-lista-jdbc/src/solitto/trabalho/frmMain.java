/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitto.trabalho;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author aliss_000
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
       
    public frmMain() {
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

        dsk = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mnPrincipal = new javax.swing.JMenuBar();
        mnSubCadastro = new javax.swing.JMenu();
        mnItemCliente = new javax.swing.JMenuItem();
        mnItemProduto = new javax.swing.JMenuItem();
        mnItemVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro com Lista");

        javax.swing.GroupLayout dskLayout = new javax.swing.GroupLayout(dsk);
        dsk.setLayout(dskLayout);
        dskLayout.setHorizontalGroup(
            dskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dskLayout.setVerticalGroup(
            dskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jButton1.setText("Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product.png"))); // NOI18N
        jButton2.setText("Produtos");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy.png"))); // NOI18N
        jButton3.setText("Venda");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        mnSubCadastro.setText("Cadastros");

        mnItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        mnItemCliente.setText("Cliente");
        mnItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemClienteActionPerformed(evt);
            }
        });
        mnSubCadastro.add(mnItemCliente);

        mnItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product.png"))); // NOI18N
        mnItemProduto.setText("Produto");
        mnItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemProdutoActionPerformed(evt);
            }
        });
        mnSubCadastro.add(mnItemProduto);

        mnItemVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy.png"))); // NOI18N
        mnItemVenda.setText("Venda");
        mnItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemVendaActionPerformed(evt);
            }
        });
        mnSubCadastro.add(mnItemVenda);

        mnPrincipal.add(mnSubCadastro);

        setJMenuBar(mnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dsk)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsk))
        );

        setSize(new java.awt.Dimension(1428, 833));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemClienteActionPerformed
        
        frmCliente c = new frmCliente();
        c.lstClientes.addAll(Copia.lstCliente);
        dsk.add(c);        
        c.setVisible(true);
    }//GEN-LAST:event_mnItemClienteActionPerformed

    private void mnItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemProdutoActionPerformed
        
        frmProduto p = new frmProduto();
        p.lstProdutos.addAll(Copia.lstProduto);        
        dsk.add(p);        
        p.setVisible(true);
    }//GEN-LAST:event_mnItemProdutoActionPerformed

    private void mnItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemVendaActionPerformed
        
        frmVenda v = new frmVenda();
        v.lstClientes.addAll(Copia.lstCliente);
        v.lstProdutos.addAll(Copia.lstProduto);
        dsk.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_mnItemVendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmCliente c = new frmCliente();
        c.lstClientes.addAll(Copia.lstCliente);
        dsk.add(c);        
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmProduto p = new frmProduto();
        p.lstProdutos.addAll(Copia.lstProduto);        
        dsk.add(p);        
        p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frmVenda v = new frmVenda();
        v.lstClientes.addAll(Copia.lstCliente);
        v.lstProdutos.addAll(Copia.lstProduto);
        dsk.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dsk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnItemCliente;
    private javax.swing.JMenuItem mnItemProduto;
    private javax.swing.JMenuItem mnItemVenda;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JMenu mnSubCadastro;
    // End of variables declaration//GEN-END:variables
}
