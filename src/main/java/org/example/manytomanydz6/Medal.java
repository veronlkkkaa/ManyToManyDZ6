package org.example.manytomanydz6;


import jakarta.persistence.*;

@Entity
@Table(name = "medals")
public class Medal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String colour;

    @ManyToOne
    @JoinColumn(name = "sportsman_id")
    private Sportsman sportsman;

}
