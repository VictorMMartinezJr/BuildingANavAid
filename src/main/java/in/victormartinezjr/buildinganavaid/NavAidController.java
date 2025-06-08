package in.victormartinezjr.buildinganavaid;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NavAidController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}