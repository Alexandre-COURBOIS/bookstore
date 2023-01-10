package com.nfs.bookstore.models;

import java.time.LocalDateTime;
import java.util.Date;

public class KikBook extends Book{

    private int age;

    public KikBook(int id, String title, Author author, LocalDateTime releaseYear, int age) {
        super(id, title, author, releaseYear);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
