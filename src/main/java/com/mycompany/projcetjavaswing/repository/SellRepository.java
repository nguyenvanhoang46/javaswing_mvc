/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projcetjavaswing.repository;

import com.mycompany.projcetjavaswing.model.Product;
import static com.mycompany.projcetjavaswing.repository.ProductRepository.PASSWORD;
import static com.mycompany.projcetjavaswing.repository.ProductRepository.URL;
import static com.mycompany.projcetjavaswing.repository.ProductRepository.USERNAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SellRepository {

    static final String URL = "jdbc:mysql://localhost:3306/pizza_manager";
    static final String PASSWORD = "";
    static final String USERNAME = "root";

    public static List<Product> find() {
        List<Product> productList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //query
            String sql = "select * from product";
            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(sql);
//            System.out.println(resultSet.isBeforeFirst());
            while (rs.next()) {
                Product product = new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("category_id"),
                        rs.getInt("price"),
                        rs.getInt("quantity"),
                        rs.getString("unit"),
                        rs.getString("image")
                );
                productList.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        return productList;

    }

    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //query
            String sql = "delete from product where id = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
