package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is the Battleship model where generate ship and those data will be handled
 */
public class BattleShip {

    /**
     * we create 2 array for 2 ships.
     */

    String[] shipLocation = new String[3], shipLocation2 = new String[3];

//all the ships  will be saved in a arraylist called myList
    ArrayList<String[]> myList = new ArrayList<String[]>();
    /**
     *
     * @return  all the ships in an arraylist
     */
    public ArrayList<String[]> getMyList() {
        return myList;
    }

    /**
     *
     * @param myList all the ships in an arraylist
     */
    public void setMyList(ArrayList<String[]> myList) {
        this.myList = myList;
    }


    /**
     * This function will be called once the begining of the program
     * create 2 random numbers from 1-108
     * with those random numbers 2 ships will be created
     * one horizontal and one vertical ship
     * finally those ships will be added in myList
     *
     */
    public void generateShip() {
        //2 random numbers are creatd
        int randomShip1 = (int) (Math.random() * (108 - 1) + 1);
        int randomShip2 = (int) (Math.random() * (108 - 1) + 1);

        //make sure both 2 random numbers are not same and those are not collided in horizontal and vertical
        //if happens we use a reccursive method to handle that
        if (randomShip1 == randomShip2 || randomShip1 + 1 == randomShip2 || randomShip1 + 2 == randomShip2 ||randomShip2>=91) {
            generateShip();
        }

        //here we create 1 ship as horizontal and 1 as vertical then added to an arraylist
        //System.out.println("")  is used to see the horizontal and vertical created ship location for tested purpose
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
