package controller;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import model.BattleShip;

import java.util.*;

/**
 * This is the main controller for Battleship Game.
 * All the data is accessed from user or model and logics are generated here
 */
public class BattleshipController {

    // variable for labels - one for message displaying in top and other is for chances remaining bottom
    public Label lblMessage;
    public Label lblChances;

    // counter for chances remaining and ship sunk
    int chancesRemaining=20;
    int shipSunk=0;

    //variable for handling first time execution only situations
    boolean firstTime=true,secondTime=true;
    boolean firstTimeGenerate=true;

    //variable for entering all the  hit location from the user in the board
    ArrayList<String> testShip = new ArrayList<String>();

    // creating an object for battleship model
    BattleShip battleShip = new BattleShip();


    /**
     * all the cell selected and hit or miss , win of loss will be calculated here
     * @param mouseEvent this is the info of selected button by user
     */
    public void onBtnClicked(MouseEvent mouseEvent) {
        //from the mouseevent we got the specific selected button or cell info
        Button btnSelected=(Button) mouseEvent.getSource();

        // after clicking any cell in the board. that cell will be disable. So the first time input in a cell is accepted.
        btnSelected.setDisable(true);

        //we initialized any selected cell as miss first and if its hit it will be showed as hit
        btnSelected.getStyleClass().add("miss");
        lblMessage.setText("Miss");
        // if miss chances remaining counter will be decreased by 1
        chancesRemaining--;

        //the ships will be generated on the board and its first time only
        if(firstTimeGenerate) {
            firstTimeGenerate=false;
            battleShip.generateShip();
        }

        //if the generated ship and selected cell is matched it is a hit
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
            //here we hanle if whole ship is sunk or not
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

        //if chances remaining become 0. So the game is over and lost. and it will show a warning panel then after clicking that the board will exit after 1 second.
        if(chancesRemaining==0){
            chancesRemaining=0;
        lblMessage.setText("You Lost!!  Game over");

            Alert alert = new Alert(Alert.AlertType.WARNING, "You Lost!!  Game over!", ButtonType.OK, ButtonType.CANCEL);
            alert.showAndWait();
            new Timer().schedule(new TimerTask() {
                public void run () { System.exit(0); }
            }, 1000);
        }

        //show the chances remaining in bottom
        if(chancesRemaining>=0) {
            lblChances.setText(chancesRemaining + " Chances Remaining");
        }

        //if both 2 generated ships are sunk and before finishing remaining chances then gave over and won.
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