/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projcetjavaswing.repository;

import com.mycompany.projcetjavaswing.model.Category;
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
public class CategoryRepository {
    static final String URL = "jdbc:mysql://localhost:3306/pizza_manager";
    static final String PASSWORD = "";
    static final String USERNAME = "root";
    public static List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //query 
            String sql = "select * from category";
            statement = connection.createStatement();
            ResultSet rSet = statement.executeQuery(sql);
            while (rSet.next()) {
                Category category = new Category(rSet.getInt("id"),
                        rSet.getString("name"));
                categoryList.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return categoryList;

    }

    public static void insert(Category cr) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //query
            String sql = "insert into category(name) values(?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, cr.getName());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void delete(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //query
            String sql = "delete from category where id = ?";
            statement = connection.prepareCall(sql);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void update(int id, Category ctgr) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //query
            String sql = "update category set name=? where id= ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, ctgr.getName());
            statement.setInt(2, id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static Category findById(int id) {
        Category cate = new Category();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //query 
            String sql = "select * from category where ID=" + id + "";
            statement = connection.prepareStatement(sql);
            ResultSet rSet = statement.executeQuery();
            while (rSet.next()) {
               cate = new Category(rSet.getInt("ID"), rSet.getString("NAME"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return cate;

    }

    
        public static List<Category> findCategory(String name) {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //query 
            String sql = "select * from category where name like ? ";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + name + "%");
            ResultSet rSet = statement.executeQuery();
            while (rSet.next()) {
                Category category = new Category(rSet.getInt("id"),
                        rSet.getString("name"));
                categoryList.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return categoryList;

    }
   
}
