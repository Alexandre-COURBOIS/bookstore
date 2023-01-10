package com.nfs.bookstore.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="citys")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcity")
    private int id;
    private String name;
    @CreationTimestamp
    private LocalDateTime createdAt;



}
