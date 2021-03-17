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
    int shipSunk=0;
    ArrayList<String> testShip = new ArrayList<String>();
    boolean firstTime=true,secondTime=true;

    public void onBtnClicked(MouseEvent mouseEvent) {
        Button btnSelected=(Button) mouseEvent.getSource();
        btnSelected.setDisable(true);
        btnSelected.getStyleClass().add("miss");
        BattleShip battleShip = new BattleShip();
        battleShip.generateShip();
        lblMessage.setText("Miss");

        for(String[] singleShip : battleShip.getMyList()) {

            for (int i = 0; i < singleShip.length; i++) {

                if(btnSelected.getId().equals(singleShip[i])){
                testShip.add(btnSelected.getId());
                    btnSelected.getStyleClass().add("hit");

                    lblMessage.setText("Hit");
            }
            }
            List singleShipList = Arrays.asList(singleShip);
            int singleHitCount = 0;
            for (int i = 0; i < testShip.size(); i++) {
                if (singleShipList.contains(testShip.get(i))) {

                    singleHitCount++;
                    if(singleHitCount==3 && singleShip.equals(battleShip.getMyList().get(0)) && firstTime) {
                        lblMessage.setText("You sunk my first boat");
                        firstTime=false;
                        shipSunk++;

                    }
                    else if(singleHitCount==3 && singleShip.equals(battleShip.getMyList().get(1)) &&secondTime) {
                        lblMessage.setText("You sunk my second boat");
                        secondTime=false;
                        shipSunk++;
                    }

                }

            }


        }



        if(shipSunk==2){
            lblMessage.setText("You sunk my Battleship");
        }

    }


}