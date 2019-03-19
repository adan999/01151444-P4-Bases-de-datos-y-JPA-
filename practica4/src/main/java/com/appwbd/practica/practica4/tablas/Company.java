package com.appwbd.practica.practica4.tablas;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "version")
    private Date version;

    @ManyToOne
    private CompanyStatus companyStatus;

    public Company(String name, Date version) {
        super();
        this.name = name;
        this.setVersion(version);
    }

    public Company(){
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

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }
}
