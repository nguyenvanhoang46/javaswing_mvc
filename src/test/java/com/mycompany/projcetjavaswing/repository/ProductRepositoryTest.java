/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.projcetjavaswing.repository;

import com.mycompany.projcetjavaswing.model.Product;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nguye
 */
public class ProductRepositoryTest {
    
    public ProductRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        List<Product> expResult = null;
        List<Product> result = ProductRepository.findAll();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Product product = null;
        ProductRepository.insert(product);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Product pt = null;
        ProductRepository.update(id, pt);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ProductRepository.delete(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchName() {
        System.out.println("searchName");
        String name = "";
        List<Product> expResult = null;
        List<Product> result = ProductRepository.searchName(name);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
