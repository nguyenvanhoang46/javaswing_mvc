/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projcetjavaswing.controller;

import com.mycompany.projcetjavaswing.model.Category;
import com.mycompany.projcetjavaswing.model.Product;
import com.mycompany.projcetjavaswing.model.Sell;
import com.mycompany.projcetjavaswing.model.Staff;
import com.mycompany.projcetjavaswing.repository.CategoryRepository;
import com.mycompany.projcetjavaswing.repository.ProductRepository;
import com.mycompany.projcetjavaswing.repository.SellRepository;
import com.mycompany.projcetjavaswing.repository.StaffRepository;
import com.mycompany.projcetjavaswing.view.BillingDialog;
import com.mycompany.projcetjavaswing.view.SellPanel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class SellController {

    DefaultTableModel tabbleModel;
    DefaultTableModel model;
    DefaultTableModel modelSell;

    private SellPanel view;
    private BillingDialog dialog = new BillingDialog();
    List<Sell> sellList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Category> categoryList = new ArrayList<>();
    List<Staff> staffList = new ArrayList<>();
    ArrayList<Product> arr = new ArrayList<>();
    DefaultTableModel tableBill;

    public SellController(SellPanel view) {
        this.view = view;
        this.view.setVisible(true);
        setUpListener();

    }

    public SellPanel index() {
        return this.view;
    }

    public void setUpListener() {
        showProduct();
        showCombo();
        tblProduct();
        insert();
        showStaffCombo();
        billing();
    }

    private void showProduct() {
        productList = ProductRepository.findAll();
        tabbleModel = (DefaultTableModel) this.view.getTableProduct().getModel();

        tabbleModel.setRowCount(0);

        productList.forEach(p -> {
            Category category = CategoryRepository.findById(p.getCategory_id());
            tabbleModel.addRow(new Object[]{
                p.getId(),
                p.getNameproduct(),
                category.getName(),
                p.getPrice(),
                p.getQuantity(),
                p.getUnit(),
                p.getImage(),
                categoryFindById(p.getCategory_id()) != null ? categoryFindById(p.getCategory_id()).getName() : ""

            });
        });
    }

    private void showStaffCombo() {
        staffList = StaffRepository.findAll();
        staffList.forEach(staff -> {
            view.getStaffcombo().addItem(staff);
        });
    }

    private Staff staffFindById(int id) {
        for (Staff staff : staffList) {
            if (staff.getId() == id) {
                return staff;
            }
        }
        return null;
    }

    private void showCombo() {
        categoryList = CategoryRepository.findAll();
        categoryList.forEach(category -> {
            view.getCategoryproduct().addItem(category);
        });
    }

    public Category categoryFindById(int id) {
        for (Category category : categoryList) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    private void tblProduct() {
        view.getTableProduct().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int index = -1;
                index = view.getTableProduct().getSelectedRow();
                Product prt = productList.get(index);
                if (index >= 0) {
                    Product product = productList.get(index);
                    view.getIdproduct().setText(String.valueOf(product.getId()));
                    view.getNameproduct().setText(product.getNameproduct());
                    view.getPriceproduct().setText(String.valueOf(product.getPrice()));
                    view.getCategoryproduct().getModel().setSelectedItem(categoryFindById(product.getCategory_id()));
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(product.getImage()).getImage().getScaledInstance(230, 155, Image.SCALE_DEFAULT));
                    view.getLblImage().setIcon(imageIcon);
                }
            }
        });
    }
    int Total;

    private void insert() {
        this.view.getBtnAddtocart().addActionListener((ActionEvent e) -> {
            model = (DefaultTableModel) view.getTableCart().getModel();
            int id = Integer.parseInt(view.getIdproduct().getText());
            String name = view.getNameproduct().getText();
            int quantity = Integer.parseInt(view.getQuantytiproduct().getText());
            int price = Integer.parseInt(view.getPriceproduct().getText());

            model.setRowCount(0);
            Sell sell = new Sell(id, name, quantity, price);

            sellList.add(sell);
            sellList.forEach(item -> {
                model.addRow(new Object[]{
                    item.getId(), item.getName(), item.getQuantity(), item.getPrice(), Total = item.getQuantity() * item.getPrice()
                });
            });

        });
    }

    private void delete() {
        this.view.getBtnDelete().addActionListener((ActionEvent e) -> {
            productList = ProductRepository.findAll();
        });
    }
    int  Totally = 0;
    private void billing() {
        this.view.getBtnThanhtoan().addActionListener((ActionEvent e) -> {
            dialog.setVisible(true);

            Staff staff = (Staff) view.staffcombo.getSelectedItem();
            tableBill = (DefaultTableModel) dialog.getTblBillingDialog().getModel();

            dialog.getStaffcombo().setText(staff.getName());
            tableBill.setRowCount(0);
            sellList.forEach(item -> {
                tableBill.addRow(new Object[]{
                    item.getName(),
                    item.getQuantity(),
                  Total= item.getPrice() * item.getQuantity()
                });
                Totally = (Totally + Total);
            dialog.getLblTong(Totally);
            });
            
           
            
        });
    }

}
