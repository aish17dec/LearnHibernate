package com.example.hibernatedemo.entities;

import jakarta.persistence.*;

@Entity
public class Book {

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String name;

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    @ManyToOne
    private Student s;

}
