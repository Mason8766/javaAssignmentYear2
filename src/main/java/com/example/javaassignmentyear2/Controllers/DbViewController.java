package com.example.javaassignmentyear2.Controllers;

import com.example.javaassignmentyear2.GameOfThronesData;
import com.example.javaassignmentyear2.Utilities.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.javaassignmentyear2.Models.GotChar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DbViewController implements Initializable {

    @FXML
    private TableView<GotChar> tblGot;

    @FXML
    private TableColumn<GotChar, String> clmName;

    @FXML
    private TableColumn<GotChar, Double> clmScreenTime;

    @FXML
    private TableColumn<GotChar, Integer> clmEpisodes;

    @FXML
    private TableColumn<GotChar, String> clmActor;

    @FXML
    private Button btnScreen;

    @FXML//Loads the new scene
    void btnScreenClicked(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(GameOfThronesData.class.getResource("graph-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Game of Thrones: Bar Graph of Screen Time");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //defines all the table column info
        clmName.setCellValueFactory(new PropertyValueFactory<>("name"));
        clmScreenTime.setCellValueFactory(new PropertyValueFactory<>("screenTime"));
        clmEpisodes.setCellValueFactory(new PropertyValueFactory<>("episodes"));
        clmActor.setCellValueFactory(new PropertyValueFactory<>("Actor"));
        tblGot.getItems().addAll(DBUtility.getGotData());//fetches data from objects made by db query


    }


}
