package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Cannon> battery = new LinkedList<>();
        for (int i = 0; i<5; i++)
        {
            battery.add(new Cannon());
        }

        for(Cannon cannon:battery) {
            cannon.fire();
        }
        System.out.println("Let's check if they are loaded...");
        for(Cannon cannon:battery) {
            System.out.println("Is cannon no. " + battery.indexOf(cannon) + " loaded? " + cannon.loaded);
        }

    }
}
