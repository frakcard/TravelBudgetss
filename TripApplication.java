package TravelBudget;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TripApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TripApplication.class.getResource("trip-view.fxml"));
        Scene s1 = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setScene(s1);
        primaryStage.setTitle("Travel Budget");
        primaryStage.show();
    }
}
