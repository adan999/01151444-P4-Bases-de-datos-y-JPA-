package com.appwbd.practica.practica4.tablas;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contactdetail")
public class ContactDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "gender")
    private int gender;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @ManyToOne
    Contact contact;

    public ContactDetail(int gender, Date dateOfBirth) {
        super();
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public ContactDetail(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
