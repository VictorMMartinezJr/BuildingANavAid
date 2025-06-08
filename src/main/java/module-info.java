module in.victormartinezjr.buildinganavaid {
    requires javafx.controls;
    requires javafx.fxml;


    opens in.victormartinezjr.buildinganavaid to javafx.fxml;
    exports in.victormartinezjr.buildinganavaid;
}