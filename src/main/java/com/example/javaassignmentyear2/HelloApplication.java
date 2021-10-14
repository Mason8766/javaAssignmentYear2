package com.example.javaassignmentyear2;

import com.example.javaassignmentyear2.Utilities.DBUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("db-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Game of Thrones: Table View");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) throws SQLException {

        launch();
    }


}