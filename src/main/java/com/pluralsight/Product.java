package com.pluralsight;
import java.util.HashMap;
public class Product {
    private String SKU;
    private String name;
    private double price;
    private String department;

    Product(String SKU, String name, double price, String department) {
        this.SKU = SKU;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public String getSKU() {
        return this.SKU;
    }
    public String getName() {
        return this.name;
    }
    public String getDepartment() {
        return this.department;
    }
    public double getPrice() {
        return this.price;
    }
    @Override
    public String toString() {
        return this.getSKU() + "|" + this.getName() + "|" + this.getPrice() + "|" + this.getDepartment();
    }
}