/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projcetjavaswing.controller;

import com.mycompany.projcetjavaswing.view.CategoryPanel;
import com.mycompany.projcetjavaswing.view.HomeView;
import com.mycompany.projcetjavaswing.view.ProductPanel;
import com.mycompany.projcetjavaswing.view.SellPanel;
import com.mycompany.projcetjavaswing.view.StaffPanel;
import com.mycompany.projcetjavaswing.view.UserPanel;
import com.mycompany.projcetjavaswing.view.UserViewHome;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class UserHomeController {

    private UserViewHome view;
    private ProductController productController = new ProductController(new ProductPanel());
    private CategoryController categoryController = new CategoryController(new CategoryPanel());
    private SellController sellController = new SellController(new SellPanel());
    private StaffController staffController = new StaffController(new StaffPanel());
    private UserController userController = new UserController(new UserPanel());
//    private ChartController chartController =  new ChartController(new ChartPanel());

    public UserHomeController(UserViewHome view) {
        this.view = view;
        this.view.setVisible(true);
        listener();
    }

    public void listener() {
                        switchPanel(sellController.index());
        btnProduct();
        btnCategory();
        btnSell();
    }

    public void btnSell() {
        this.view.getLblBanhang().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(sellController.index());
            }

        });
    }

    public void btnProduct() {
        this.view.getLblSanpham().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(productController.index());
            }

        });
    }

    public void btnCategory() {
        this.view.getLblCategory().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(categoryController.index());
            }

        });
    }

    public void switchPanel(JPanel panel) {
        this.view.getPanelRender().removeAll();
        this.view.getPanelRender().add(panel);
        this.view.getPanelRender().repaint();
        this.view.getPanelRender().revalidate();
    }
}
