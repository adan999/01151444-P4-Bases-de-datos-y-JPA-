package com.appwbd.practica.practica4.tablas;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "companystatus")
public class CompanyStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public CompanyStatus(String name) {
        super();
        this.name = name;
    }

    public CompanyStatus(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
