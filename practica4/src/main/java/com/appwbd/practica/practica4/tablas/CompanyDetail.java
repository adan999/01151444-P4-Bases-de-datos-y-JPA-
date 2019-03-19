package com.appwbd.practica.practica4.tablas;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "companydetail")
public class CompanyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "employeeStrength")
    private int employeeStrength;

    @Column(name = "notes")
    private String notes;

    public CompanyDetail(int employeeStrength, String notes) {
        super();
        this.employeeStrength = employeeStrength;
        this.notes = notes;
    }

    public  CompanyDetail(){
        super();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeStrength() {
        return employeeStrength;
    }

    public void setEmployeeStrength(int employeeStrength) {
        this.employeeStrength = employeeStrength;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
