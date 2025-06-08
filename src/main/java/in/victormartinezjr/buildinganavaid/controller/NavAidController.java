package in.victormartinezjr.buildinganavaid.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NavAidController implements Initializable {
    @FXML
    private HBox searchbar;

    @FXML
    private HBox toAndFromContainer;

    @FXML
    private Button quicklink__bookstore;

    @FXML
    private Button quicklink__mainstop;

    @FXML
    private Button quicklink__police;

    @FXML
    private Button quicklink__studentlounge;

    @FXML
    private Button quiklink__library;

    @FXML
    void quickLinkClicked(ActionEvent event) {
        Button btnClicked =  (Button) event.getSource();

        switch (btnClicked.getId()) {
            case "quicklink__bookstore":
                moveMapToQuickLink(btnClicked.getId());
                System.out.println("Bookstore clicked");
                break;
            case "quicklink__mainstop":
                moveMapToQuickLink(btnClicked.getId());
                System.out.println("Mainstop clicked");
                break;
            case "quicklink__police":
                moveMapToQuickLink(btnClicked.getId());
                System.out.println("Police clicked");
                break;
            case "quicklink__studentlounge":
                moveMapToQuickLink(btnClicked.getId());
                System.out.println("Studentlounge clicked");
                break;
            case "quiklink__library":
                moveMapToQuickLink(btnClicked.getId());
                System.out.println("Library clicked");
                break;
        }
    }

    void moveMapToQuickLink(String btnID) {
        searchbar.setVisible(false);
        searchbar.setManaged(false);

        toAndFromContainer.setVisible(true);
        toAndFromContainer.setManaged(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        toAndFromContainer.setVisible(false);
        toAndFromContainer.setManaged(false);
    }
}
