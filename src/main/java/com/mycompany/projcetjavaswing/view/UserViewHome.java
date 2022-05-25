/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projcetjavaswing.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class UserViewHome extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public UserViewHome() {
        initComponents();
    }

    public JLabel getLblBanhang() {
        return lblBanhang;
    }

    public JLabel getLblSanpham() {
        return lblSanpham;
    }



    public JPanel getPanelRender() {
        return panelRender;
    }


    public JLabel getLblCategory() {
        return lblCategory;
    }

  
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        lblBanhang = new javax.swing.JLabel();
        lblSanpham = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRender = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkBorderRadius(30);
        kGradientPanel1.setkEndColor(new java.awt.Color(62, 74, 88));
        kGradientPanel1.setkStartColor(new java.awt.Color(62, 74, 88));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(199, 752));

        lblBanhang.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblBanhang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanhang.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\274320099_2528403203963984_2235057124678693702_n.png")); // NOI18N
        lblBanhang.setText("Bán hàng");

        lblSanpham.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblSanpham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanpham.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\274721005_521545505994163_7029190146882002744_n.png")); // NOI18N
        lblSanpham.setText("Sản phẩm");

        lblCategory.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\275180667_3296213524033910_5712194276200883982_n.png")); // NOI18N
        lblCategory.setText("Danh mục");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\avatar2.png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSanpham)
                    .addComponent(lblBanhang)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblCategory)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(57, 57, 57)
                .addComponent(lblBanhang)
                .addGap(63, 63, 63)
                .addComponent(lblSanpham)
                .addGap(77, 77, 77)
                .addComponent(lblCategory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRender.setPreferredSize(new java.awt.Dimension(896, 765));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRender, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRender, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(UserViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblBanhang;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblSanpham;
    private javax.swing.JPanel panelRender;
    // End of variables declaration//GEN-END:variables
}