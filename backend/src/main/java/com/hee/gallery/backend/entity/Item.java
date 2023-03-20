package com.hee.gallery.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "items")
@Getter
@Setter
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100)
    private String imgPath;

    @Column
    private int price;

    @Column
    private int discountPer;
}
