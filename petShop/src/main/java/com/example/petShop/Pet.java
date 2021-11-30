package com.example.petShop;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    abstract public void speak();

    List<Listener> listeners = new ArrayList<Listener>();

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    private int energy = 0;

    public int getEnergy() {
        return energy;
    }
}
