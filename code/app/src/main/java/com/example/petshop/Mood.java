package com.example.petshop;
import java.util.Date;

public abstract class Mood {
    private Date birthDate;

    public Mood() {
        this.birthDate = new Date();
    }

    public Mood(Date birthDate) {
        this.birthDate = new Date();
    }

    public Date getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String display();
}
