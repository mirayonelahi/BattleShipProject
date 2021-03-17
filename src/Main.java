import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.BattleShip;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("./view/sample.fxml"));
        primaryStage.setScene(new Scene(root, 900, 800));
        primaryStage.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
