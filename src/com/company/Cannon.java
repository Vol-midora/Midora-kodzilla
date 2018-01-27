package com.company;

public class Cannon {
    public boolean loaded;

    public Cannon() {
        this.loaded = false;
    }

    public void fire(){
        if (this.loaded) {
            System.out.println("Fire!");
            loaded = false;
        } else {
            System.out.println("Missing ammo! Need to load!");
            loaded = true;
        }
    }

}
