module in.victormartinezjr.buildinganavaid {
    requires javafx.controls;
    requires javafx.fxml;


    opens in.victormartinezjr.buildinganavaid to javafx.fxml;
    exports in.victormartinezjr.buildinganavaid;
    exports in.victormartinezjr.buildinganavaid.controller;
    opens in.victormartinezjr.buildinganavaid.controller to javafx.fxml;
}