package com.leogen.hibernate.chapter03.pojo;

import javax.persistence.*;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;

    public String getName() {
        return name;
    }

    public Skill setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                '}';
    }
}
