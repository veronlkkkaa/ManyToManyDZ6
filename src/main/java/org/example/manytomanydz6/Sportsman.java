package org.example.manytomanydz6;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sportsmen")
public class Sportsman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private int age;

    @ManyToMany(mappedBy = "sportsman")
    List<SportSection> sportSections = new ArrayList<>();

    @OneToMany(mappedBy = "sportsman")
    List<Medal> medals = new ArrayList<>();

}
