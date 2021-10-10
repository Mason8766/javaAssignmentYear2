package com.example.javaassignmentyear2;

import com.example.javaassignmentyear2.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

class DbView implements Initializable {

    @FXML
    private TableView<Character> tblGot;

    @FXML
    private TableColumn<Character, String> clmName;

    @FXML
    private TableColumn<Character, Double> clmScreentime;

    @FXML
    private TableColumn<Character, Integer> clmEpisodes;

    @FXML
    private TableColumn<Character, String> clmActor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clmName.setCellValueFactory(new PropertyValueFactory<>("name"));
        clmScreentime.setCellValueFactory(new PropertyValueFactory<>("screenTime"));
        clmEpisodes.setCellValueFactory(new PropertyValueFactory<>("episodes"));
        clmActor.setCellValueFactory(new PropertyValueFactory<>("Actor"));
        tblGot.getItems().addAll(DBUtility.getGotData());


    }
}
