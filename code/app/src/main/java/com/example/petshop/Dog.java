package com.example.petshop;
import java.util.Date;

public class Dog extends Pet implements Pettable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof";
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public void pet() {

    }
}
