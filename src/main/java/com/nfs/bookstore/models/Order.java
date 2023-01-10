package com.nfs.bookstore.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idorder")
    private int id;

    private LocalDateTime date;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_book",
            joinColumns = @JoinColumn(name = "idorder"),
            inverseJoinColumns = @JoinColumn(name = "idbook"))
    private List<Book> books;
}
