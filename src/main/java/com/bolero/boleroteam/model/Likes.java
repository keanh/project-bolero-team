package com.bolero.boleroteam.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<User> users;


}
