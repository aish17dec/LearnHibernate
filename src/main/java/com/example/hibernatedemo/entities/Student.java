package com.example.hibernatedemo.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNum;

    private String name;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBook() {
        return books;
    }

    public void setBook(List<Book> book) {
        this.books = book;
    }

    @OneToMany(mappedBy = "s", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

}
