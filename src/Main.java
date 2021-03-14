import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.BattleShip;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("./view/sample.fxml"));
        primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.show();

        BattleShip battleShip = new BattleShip();
        battleShip.generateShip();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
