package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.RunApp;


import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginButton;

    private RunApp runApp;

    public RunApp getRunApp() {
        return runApp;
    }

    public void setRunApp(RunApp runApp) {
        this.runApp = runApp;
    }

    @FXML
    void initialize() {

    }

    public void loginClick(ActionEvent actionEvent) {
        runApp.getPrimaryStage().close();
        System.out.println("Successfully close");
        //runApp.showUser();
    }
}
