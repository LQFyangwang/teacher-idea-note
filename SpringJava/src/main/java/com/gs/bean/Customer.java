package com.gs.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Master on 2017/8/4.
 */
public class Customer {

    private int id;
    private String name;
    private String[] books;
    private List<String> hobbies;
    private Map<String, String> values;
    private Properties props;
    private Product product;

    public Customer() {

    }

    public Customer(int id, String name, String[] books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
