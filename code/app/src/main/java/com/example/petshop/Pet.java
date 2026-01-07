package com.example.petshop;
import java.util.Date;

public  abstract class Pet {
    private String name; //these are all private and can only be read with getters and set with setters
    private Date birthDate;

    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    //to get getters and setters, RC, generate, getter+setter, highlight all needed
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();
}
