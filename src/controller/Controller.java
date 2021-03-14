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
    public void onBtnClicked(MouseEvent mouseEvent) {
        Button btnSelected=(Button) mouseEvent.getSource();

        btnSelected.setDisable(true);
//        System.out.println(btnSelected.getId());
        btnSelected.setStyle("-fx-background-color: red");
        btnSelected.setText("Miss");
        BattleShip battleShip = new BattleShip();
        battleShip.generateShip();
        lblMessage.setText("Miss");

        for(String[] array : battleShip.getMyList()) {

            for (int i = 0; i < array.length; i++) {
                if(btnSelected.getId().equals(array[i])){

              test[i] = battleShip.getShipLocation()[i];
//
                btnSelected.setStyle("-fx-background-color: green");
                    btnSelected.setText("Hit");
                    lblMessage.setText("Hit");
            }
            }

//            System.out.println(Arrays.toString(array));
        }



        for (String[] v :battleShip.getMyList()) {
            for (int i = 0; i <v.length ; i++) {
                if (Arrays.equals(v, test)){
                    lblMessage.setText("You sunk my boat");
                    test= new String[3];
                    shipSunk=shipSunk+1;
                    }
            }

        }
        System.out.println(shipSunk);
        if(shipSunk==2){
            lblMessage.setText("You sunk my Battleship");
        }

    }
}