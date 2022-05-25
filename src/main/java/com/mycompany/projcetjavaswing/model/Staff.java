/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projcetjavaswing.model;

/**
 *
 * @author Admin
 */
public class Staff {
    private int id;
    private String name;
    private String gender;
    private int phone;
    
    
    
    
    public Staff(int id, String name, String gender, int phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Staff(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Staff() {
    }

    
    
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Staff(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    
    
}
