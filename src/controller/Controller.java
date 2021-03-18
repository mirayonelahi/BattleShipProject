package controller;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import model.BattleShip;

import java.util.*;

public class Controller {

    public Label lblMessage;
    public Label lblChances;
    int chancesRemaining=20;
    int shipSunk=0;
    ArrayList<String> testShip = new ArrayList<String>();
    boolean firstTime=true,secondTime=true;
    boolean firstTimeGenerate=true;
    String[] shipLocation = new String[3];
    String[] shipLocation2 = new String[3];
    ArrayList<String[]> myList = new ArrayList<String[]>();
    BattleShip battleShip = new BattleShip();
    public void onBtnClicked(MouseEvent mouseEvent) {
        Button btnSelected=(Button) mouseEvent.getSource();
        btnSelected.setDisable(true);
        btnSelected.getStyleClass().add("miss");

        lblMessage.setText("Miss");
        chancesRemaining--;

        if(firstTimeGenerate) {
            firstTimeGenerate=false;
            battleShip.generateShip();
        }

        for(String[] singleShip : battleShip.getMyList()) {
            for (int i = 0; i < singleShip.length; i++) {
                if(btnSelected.getId().equals(singleShip[i])){
                testShip.add(btnSelected.getId());
                    btnSelected.getStyleClass().add("hit");
                    chancesRemaining++;
                    lblMessage.setText("Hit");
            }
            }
            List singleShipList = Arrays.asList(singleShip);
            int singleHitCount = 0;
            for (int i = 0; i < testShip.size(); i++) {
                if (singleShipList.contains(testShip.get(i))) {

                    singleHitCount++;
                    if(singleHitCount==3 && singleShip.equals(battleShip.getMyList().get(0)) && firstTime) {
                        lblMessage.setText("You sank my first boat");
                        firstTime=false;
                        shipSunk++;

                    }
                    else if(singleHitCount==3 && singleShip.equals(battleShip.getMyList().get(1)) &&secondTime) {
                        lblMessage.setText("You sank my second boat");
                        secondTime=false;
                        shipSunk++;
                    }

                }

            }


        }
        if(chancesRemaining==0){
            chancesRemaining=0;
        lblMessage.setText("You Lost!!  Game over");

            Alert alert = new Alert(Alert.AlertType.WARNING, "You Lost!!  Game over!", ButtonType.OK, ButtonType.CANCEL);
            alert.showAndWait();
            new Timer().schedule(new TimerTask() {
                public void run () { System.exit(0); }
            }, 1000);
        }

        if(chancesRemaining>=0) {
            lblChances.setText(chancesRemaining + " Chances Remaining");
        }
        if(shipSunk==2){
            lblMessage.setText("You Win! You sank my Battleship");
            Alert alert = new Alert(Alert.AlertType.WARNING, "You Win! You sank my Battleship!", ButtonType.OK, ButtonType.CANCEL);
            alert.showAndWait();
            new Timer().schedule(new TimerTask() {
                public void run () { System.exit(0); }
            }, 1000);
        }


    }




}