package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BattleShip {

    String[] shipLocation,shipLocation2;
    String[] shipX1= new String[]{"x", "x", "x"},shipX2= new String[]{"x", "x", "x"};;



    ArrayList<String[]> myList = new ArrayList<String[]>();
    ArrayList<String> testShip = new ArrayList<String>();


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

//    public void isSunk(String id) {
//
//
//        for (String[] array: myList) {
//            for (int i = 0; i <array.length ; i++) {
//                if(array[i].equals(id)){
//                   testShip.add(id);
//                }
//            }
//            if(Arrays.equals(shipX1,array)){
//                System.out.println("one ship sunk");
//            }
//
//        }
//
//        System.out.println(testShip.toString());
//
//
//    }
}
