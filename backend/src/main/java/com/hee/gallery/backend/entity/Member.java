package com.hee.gallery.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "members")
@Getter
@Setter
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

}
