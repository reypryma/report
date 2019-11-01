package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.controller.LoginController;
import sample.controller.ViewUserController;

import java.io.IOException;

public class RunApp extends Application {
    private Stage primaryStage;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        loginWindows();
    }

    private void loginWindows() {
        try {
            FXMLLoader loader = new FXMLLoader(RunApp.class.getResource("view/sample.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            primaryStage.setTitle("Sign In");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

            LoginController controller = loader.getController();
            controller.setRunApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showUser(){
        try {
            FXMLLoader loader = new FXMLLoader(RunApp.class.getResource("view/viewuser.fxml"));
            AnchorPane pageViewUser = loader.load();
            Stage viewUserStage = new Stage();
            viewUserStage.setTitle("View User");
            Scene scene = new Scene(pageViewUser);
            this.primaryStage.close();
            viewUserStage.setScene(scene);

            ViewUserController controller = loader.getController();
            controller.setUserStage(viewUserStage);
            viewUserStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
