package com.example.javaassignmentyear2.Controllers;

import com.example.javaassignmentyear2.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.javaassignmentyear2.Models.GotChar;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clmName.setCellValueFactory(new PropertyValueFactory<>("name"));
        clmScreenTime.setCellValueFactory(new PropertyValueFactory<>("screenTime"));
        clmEpisodes.setCellValueFactory(new PropertyValueFactory<>("episodes"));
        clmActor.setCellValueFactory(new PropertyValueFactory<>("Actor"));
        tblGot.getItems().addAll(DBUtility.getGotData());


    }
}
