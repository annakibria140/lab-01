package com.example.petshop;
import java.util.Date;

public class Sad extends Mood{

    public Sad(Date birthDate){
        super(birthDate);
    }

    @Override
    public String display() {
        return "sad";
    }
}
