/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.projcetjavaswing.view;

import com.k33ptoo.components.KButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class UserPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
    }

    public JTextField getEmail() {
        return Email;
    }

    public JPasswordField getPassword() {
        return Password;
    }

    public JComboBox<String> getRole() {
        return Role;
    }

    public JTable getTableUser() {
        return TableUser;
    }

    public JPanel getUserPanel() {
        return UserPanel;
    }

    public JTextField getUsername() {
        return Username;
    }

    public KButton getBtnDelete() {
        return btnDelete;
    }

    public KButton getBtnFind() {
        return btnFind;
    }

    public KButton getBtnSave() {
        return btnSave;
    }

    public KButton getBtnUpdate() {
        return btnUpdate;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserPanel = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Role = new javax.swing.JComboBox<>();
        Username = new javax.swing.JTextField();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        btnSave = new com.k33ptoo.components.KButton();
        btnUpdate = new com.k33ptoo.components.KButton();
        btnFind = new com.k33ptoo.components.KButton();
        btnDelete = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUser = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(896, 720));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tài Khoản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mật Khẩu");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ROLE");

        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROLE_ADMIN", "ROLE_USER", " " }));

        kGradientPanel4.setkBorderRadius(35);
        kGradientPanel4.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 255));

        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\add-icon.png")); // NOI18N
        btnSave.setText("Thêm");
        btnSave.setkBorderRadius(35);
        btnSave.setkEndColor(new java.awt.Color(255, 204, 102));
        btnSave.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSave.setkHoverColor(new java.awt.Color(170, 170, 170));
        btnSave.setkHoverEndColor(new java.awt.Color(170, 170, 170));
        btnSave.setkHoverForeGround(java.awt.Color.red);
        btnSave.setkHoverStartColor(new java.awt.Color(170, 170, 170));
        btnSave.setkStartColor(new java.awt.Color(255, 204, 102));

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\Pencil-icon.png")); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.setkBorderRadius(35);
        btnUpdate.setkEndColor(new java.awt.Color(255, 204, 102));
        btnUpdate.setkForeGround(new java.awt.Color(0, 0, 0));
        btnUpdate.setkHoverColor(new java.awt.Color(170, 170, 170));
        btnUpdate.setkHoverEndColor(new java.awt.Color(170, 170, 170));
        btnUpdate.setkHoverForeGround(java.awt.Color.red);
        btnUpdate.setkHoverStartColor(new java.awt.Color(170, 170, 170));
        btnUpdate.setkStartColor(new java.awt.Color(255, 204, 102));

        btnFind.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\search-icon.png")); // NOI18N
        btnFind.setText("Tìm ");
        btnFind.setkBorderRadius(35);
        btnFind.setkEndColor(new java.awt.Color(255, 204, 102));
        btnFind.setkForeGround(new java.awt.Color(0, 0, 0));
        btnFind.setkHoverColor(new java.awt.Color(170, 170, 170));
        btnFind.setkHoverEndColor(new java.awt.Color(170, 170, 170));
        btnFind.setkHoverForeGround(java.awt.Color.red);
        btnFind.setkHoverStartColor(new java.awt.Color(170, 170, 170));
        btnFind.setkStartColor(new java.awt.Color(255, 204, 102));

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\Close-2-icon.png")); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setkBorderRadius(35);
        btnDelete.setkEndColor(new java.awt.Color(255, 204, 102));
        btnDelete.setkForeGround(new java.awt.Color(0, 0, 0));
        btnDelete.setkHoverColor(new java.awt.Color(170, 170, 170));
        btnDelete.setkHoverEndColor(new java.awt.Color(170, 170, 170));
        btnDelete.setkHoverForeGround(java.awt.Color.red);
        btnDelete.setkHoverStartColor(new java.awt.Color(170, 170, 170));
        btnDelete.setkStartColor(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        TableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TÀI KHOẢN", "EMAIL", "ROLE"
            }
        ));
        jScrollPane1.setViewportView(TableUser);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(55, 55, 55)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username)
                    .addComponent(Password)
                    .addComponent(Role, 0, 299, Short.MAX_VALUE)
                    .addComponent(Email))
                .addGap(127, 127, 127)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel1.setkBorderRadius(35);
        kGradientPanel1.setkEndColor(new java.awt.Color(242, 153, 74));
        kGradientPanel1.setkStartColor(new java.awt.Color(242, 153, 74));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(814, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("QUẢN LÝ TÀI KHOẢN");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Documents\\NetBeansProjects\\projcetJavaswing\\projcetJavaswing\\src\\main\\java\\Icon\\icons8-user-24.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UserPanelLayout = new javax.swing.GroupLayout(UserPanel);
        UserPanel.setLayout(UserPanelLayout);
        UserPanelLayout.setHorizontalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UserPanelLayout.setVerticalGroup(
            UserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Password;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JTable TableUser;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JTextField Username;
    private com.k33ptoo.components.KButton btnDelete;
    private com.k33ptoo.components.KButton btnFind;
    private com.k33ptoo.components.KButton btnSave;
    private com.k33ptoo.components.KButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    // End of variables declaration//GEN-END:variables
}
