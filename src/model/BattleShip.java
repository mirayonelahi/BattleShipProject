package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleShip {

    String[] shipLocation = new String[3],shipLocation2;
    String[] shipX1= new String[]{"x", "x", "x"},shipX2= new String[]{"x", "x", "x"};;



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
//        int random=(int)(Math.random() * (108 - 1) + 1);
//        for (int i = 0; i <3 ; i++) {
//            shipLocation[i]=String.valueOf(random);
//            System.out.println(random);
//            random=random+1;
//
//        }
         shipLocation = new String[]{"1", "2", "3"};
        shipLocation2 = new String[]{"15","16","17"};
//        shipLocation3 = new String[]{"1", "2", "3"};
         myList.add(shipLocation);
         myList.add(shipLocation2);
         setMyList(myList);
    }

}
