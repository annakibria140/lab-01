package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    public Happy(Date birthDate){
        super(birthDate);
    }

    @Override
    public String display() {
        return "happy";
    }
}
