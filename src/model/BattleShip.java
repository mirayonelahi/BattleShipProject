package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleShip {

    String[] shipLocation = new String[3], shipLocation2 = new String[3], shipLocation3 = new String[3];


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
        int randomShip1 = (int) (Math.random() * (108 - 1) + 1);
        int randomShip2 = (int) (Math.random() * (108 - 1) + 1);
        if (randomShip1 == randomShip2 || randomShip1 + 1 == randomShip2 || randomShip1 + 2 == randomShip2) {
            generateShip();
        }
        for (int i = 0; i < 3; i++) {
            shipLocation[i] = String.valueOf(randomShip1);
            shipLocation2[i] = String.valueOf(randomShip2);
            System.out.println(randomShip1);
            System.out.println("---");
            System.out.println(randomShip2);
            randomShip1 = randomShip1 + 1;
            randomShip2 = randomShip2 + 10;

        }
        myList.add(shipLocation);
        myList.add(shipLocation2);

    }
}
