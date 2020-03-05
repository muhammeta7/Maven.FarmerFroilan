package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Tomato implements Edible {

    @Override
    public Edible clone() {
        return new Tomato();
    }

    @Override
    public String toString() {
        return "Tomato";
    }
}