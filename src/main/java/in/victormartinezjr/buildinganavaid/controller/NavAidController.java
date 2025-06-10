package in.victormartinezjr.buildinganavaid.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class NavAidController implements Initializable {
    @FXML
    private HBox searchbar;

    @FXML
    private HBox toAndFromContainer;

    @FXML
    private TextField TF__currentLocation;

    @FXML
    private TextField TF__destination;

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
    void quickLinkClicked(ActionEvent e) {
        Button btnClicked =  (Button) e.getSource();

        switch (btnClicked.getId()) {
            case "quicklink__bookstore":
                moveMapToQuickLink(btnClicked.getId());
                fillDestinationTF(e);
                break;
            case "quicklink__mainstop":
                moveMapToQuickLink(btnClicked.getId());
                fillDestinationTF(e);
                break;
            case "quicklink__police":
                moveMapToQuickLink(btnClicked.getId());
                fillDestinationTF(e);
                break;
            case "quicklink__studentlounge":
                moveMapToQuickLink(btnClicked.getId());
                fillDestinationTF(e);
                break;
            case "quiklink__library":
                moveMapToQuickLink(btnClicked.getId());
                fillDestinationTF(e);
                break;
        }
    }

    void fillDestinationTF(ActionEvent event){
       Button btnClicked =  (Button) event.getSource();
       Parent parent = btnClicked.getParent();

       VBox hBox = (VBox) parent;

       for (Node node : hBox.getChildren()) {
           if (node instanceof Text) {
               Text destinationText = (Text) node;
               TF__destination.setText(destinationText.getText());
           }
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
