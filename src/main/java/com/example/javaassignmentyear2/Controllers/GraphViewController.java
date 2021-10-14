package com.example.javaassignmentyear2.Controllers;



import com.example.javaassignmentyear2.HelloApplication;
import com.example.javaassignmentyear2.Utilities.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GraphViewController  implements Initializable {

    @FXML
    private BarChart<String, Integer> screenTimGrph;

    @FXML
    private Button btnTableView;

    @FXML//Loads the new scene
    void btnTableViewClicked(ActionEvent event)  throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("db-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Game of Thrones: Table View");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        screenTimGrph.getData().addAll(DBUtility.getScreenTime());//creates data from database, and displays it

    }
}
