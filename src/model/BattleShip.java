package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleShip {

    String[] shipLocation = new String[3], shipLocation2 = new String[3];


    ArrayList<String[]> myList = new ArrayList<String[]>();


    public ArrayList<String[]> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<String[]> myList) {
        this.myList = myList;
    }

    public String[] getShipLocation() {
        return shipLocation;
    }

    public void setShipLocation(String[] shipLocation) {
        this.shipLocation = shipLocation;
    }

    public void generateShip() {
        int random = (int) (Math.random() * (108 - 1) + 1);
        int random2 = (int) (Math.random() * (108 - 1) + 1);
        if (random == random2 || random + 1 == random2 || random + 2 == random2) {
            generateShip();
        }
        for (int i = 0; i < 3; i++) {
            shipLocation[i] = String.valueOf(random);
            shipLocation2[i] = String.valueOf(random2);
            System.out.println(random);
            System.out.println("---");
            System.out.println(random2);
            random = random + 1;
            random2 = random2 + 1;

        }
        myList.add(shipLocation);
        myList.add(shipLocation2);

    }
}
