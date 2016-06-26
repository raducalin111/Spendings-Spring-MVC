package com.calin.modelview;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Calin on 6/26/2016.
 */
public class Product {
    private String name;
    private BigDecimal price;
    private ArrayList<String> persons;

    public Product(String name, BigDecimal price, ArrayList<String> persons) {
        this.name = name;
        this.price = price;
        this.persons = persons;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ArrayList<String> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<String> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", persons=" + persons +
                '}';
    }
}
