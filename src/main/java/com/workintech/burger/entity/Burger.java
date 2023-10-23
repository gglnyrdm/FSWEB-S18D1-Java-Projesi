package com.workintech.burger.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "burger", schema = "fsweb")
public class Burger{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "is_vegan")
    private boolean isVegan;
    @Enumerated(EnumType.STRING)
    private BreadType breadType;
    @Column(name = "contents")
    private String contents;
}
