package model;

import java.util.ArrayList;
import java.util.List;

public class BattleShip {

    String[] shipLocation,shipLocation2,shipLocation3;



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
         shipLocation = new String[]{"1", "2", "3"};
        shipLocation2 = new String[]{"15","16","17"};
//        shipLocation3 = new String[]{"1", "2", "3"};
         myList.add(shipLocation);
         myList.add(shipLocation2);
         setMyList(myList);
    }
}
