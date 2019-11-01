package sample.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ViewUserController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    public Stage getUserStage() {
        return userStage;
    }

    public void setUserStage(Stage userStage) {
        this.userStage = userStage;
    }

    private Stage userStage;

    @FXML
    void initialize() {

    }

}
