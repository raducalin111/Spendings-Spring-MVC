package com.calin.modelview;

import java.util.ArrayList;

/**
 * Created by Calin on 6/26/2016.
 */
public class Split {
    private ArrayList<String> persons;
    private ArrayList<Product> products;

    public Split(ArrayList<String> persons, ArrayList<Product> products) {
        this.persons = persons;
        this.products = products;
    }

    public Split() {
    }

    public ArrayList<String> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<String> persons) {
        this.persons = persons;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Split{" +
                "persons=" + persons +
                ", products=" + products +
                '}';
    }
}
