package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewReportController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addreportButton;

    @FXML
    private Button goviewUserButton;

    @FXML
    private Button logoutButton;

    @FXML
    void initialize() {
        assert addreportButton != null : "fx:id=\"addreportButton\" was not injected: check your FXML file 'viewreport.fxml'.";
        assert goviewUserButton != null : "fx:id=\"goviewUserButton\" was not injected: check your FXML file 'viewreport.fxml'.";
        assert logoutButton != null : "fx:id=\"logoutButton\" was not injected: check your FXML file 'viewreport.fxml'.";

    }
}
