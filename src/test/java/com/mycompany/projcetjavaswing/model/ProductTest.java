/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.projcetjavaswing.model;

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
public class ProductTest {
    
    public ProductTest() {
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

    /**
     * Test of getId method, of class Product.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class Product.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Product instance = new Product();
        instance.setId(id);
        int expected = 1;
        assertEquals(expected, instance.getId());
    }

    /**
     * Test of getNameproduct method, of class Product.
     */
    @Test
    public void testNameproduct() {
        System.out.println("getNameproduct");
        Product instance = new Product();
        String expResult = "product1";
        instance.setNameproduct(expResult);
        String result = instance.getNameproduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of getCategory_id method, of class Product.
     */
    @Test
    public void testGetCategory_id() {
        System.out.println("getCategory_id");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getCategory_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCategory_id method, of class Product.
     */
    @Test
    public void testSetCategory_id() {
        System.out.println("setCategory_id");
        int category_id = 0;
        Product instance = new Product();
        instance.setCategory_id(category_id);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 560;
        Product instance = new Product();
        instance.setPrice(price);
        int expected = 560;
        int result = instance.getPrice();
        
        assertEquals(expected, result, 0);
    }

    /**
     * Test of getQuantity method, of class Product.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 200;
        Product instance = new Product();
        instance.setQuantity(quantity);
        int expected = 200;
        assertEquals(quantity, instance.getQuantity());
    }


    /**
     * Test of setUnit method, of class Product.
     */
    @Test
    public void testUnit() {
        System.out.println("setUnit");
        String unit = "Cai";
        Product instance = new Product();
        instance.setUnit(unit);
        assertEquals(unit, instance.getUnit());
    }

}
