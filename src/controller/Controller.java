package controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import model.BattleShip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public Label lblMessage;
    String[] test  = new String[3];
    int shipSunk=0;
    ArrayList<String> testShip = new ArrayList<String>();
    boolean firstTime=true,secondTime=true;

    ArrayList<String> gg = new ArrayList<String>();
    public void onBtnClicked(MouseEvent mouseEvent) {
        Button btnSelected=(Button) mouseEvent.getSource();
        btnSelected.setDisable(true);


//        System.out.println(btnSelected.getId());
//        btnSelected.setStyle("-fx-background-image: url('/resources/miss.png') no-repeat center center");
        btnSelected.getStyleClass().add("miss");
//        btnSelected.setStyle("-fx-background-color: red");
//        btnSelected.setText("Miss");
        BattleShip battleShip = new BattleShip();
        battleShip.generateShip();
        lblMessage.setText("Miss");

        for(String[] array : battleShip.getMyList()) {

            for (int i = 0; i < array.length; i++) {
                if(btnSelected.getId().equals(array[i])){
                testShip.add(btnSelected.getId());
//              test[i] = battleShip.getShipLocation()[i];
                    btnSelected.getStyleClass().add("hit");
//                    battleShip.isSunk(btnSelected.getId());
//                btnSelected.setStyle("-fx-background-color: green");
//                    btnSelected.setStyle("-fx-background-image: url('/resources/ship.png')");
//                    btnSelected.setText("Hit");
                    lblMessage.setText("Hit");
            }
            }

//            System.out.println(Arrays.toString(array));
        }
//        String[]  aa =  new String[]{"1","2","3"};
//        List actList = Arrays.asList(aa);

        System.out.println(testShip.toString());
        System.out.println("---");
//        System.out.println(actList.toString());
        System.out.println("+++");
//        System.out.println(gg.toString());
        for(String[] array : battleShip.getMyList()) {
            List actList = Arrays.asList(array);
            int singleHitCount = 0;
            for (int i = 0; i < testShip.size(); i++) {
                if (actList.contains(testShip.get(i))) {
//                gg.add(testShip.get(i));

                    singleHitCount++;
                    if(singleHitCount==3 && array.equals(battleShip.getMyList().get(0)) && firstTime) {
//                        System.out.println("ship of  "+Arrays.toString(array) +"is sunk ");
                        lblMessage.setText("You sunk my first boat");
//                        shipSunk=true;
                        firstTime=false;
                        shipSunk++;


//                        break;
                    }
                    else if(singleHitCount==3 && array.equals(battleShip.getMyList().get(1)) &&secondTime) {
                        System.out.println("zxzzzzzzzzzz");
                        lblMessage.setText("You sunk my second boat");
                        secondTime=false;
                        shipSunk++;
                    }


//                    System.out.println("yes");
                } else {
//                    System.out.println("No");
//                    lblMessage.setText("miss");
                }

            }

            System.out.println("single hit co of  "+Arrays.toString(array) +"is " +singleHitCount);


        }

//        for (String[] v :battleShip.getMyList()) {
//            for (int i = 0; i <v.length ; i++) {
//                if (Arrays.equals(v, test)){
//                    lblMessage.setText("You sunk my boat");
//                    test= new String[3];
//                    shipSunk=shipSunk+1;
//                    }
//            }
//
//        }
////        System.out.println(shipSunk);
        if(shipSunk==2){
            lblMessage.setText("You sunk Battleship");
        }

    }


}