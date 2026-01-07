package com.example.petshop;
import java.util.Date;

public class Cat extends Pet implements Pettable { //extends allows us to not have to redefine everything again

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void pet() {

    }
}
