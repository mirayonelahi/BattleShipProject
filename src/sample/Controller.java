package sample;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Controller {


    public void onBtnClicked(MouseEvent mouseEvent) {
        Button txt=(Button) mouseEvent.getSource();
        System.out.println(txt.getId());
        txt.setStyle("-fx-background-color: green");

    }
}