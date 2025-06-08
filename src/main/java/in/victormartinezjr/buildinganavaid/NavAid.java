package in.victormartinezjr.buildinganavaid;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavAid extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NavAid.class.getResource("NavAid.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 1000);
        stage.setTitle("Nav Aid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}