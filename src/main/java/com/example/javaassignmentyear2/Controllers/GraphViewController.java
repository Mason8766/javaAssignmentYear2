package com.example.javaassignmentyear2.Controllers;



import com.example.javaassignmentyear2.Utilities.DBUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphViewController  implements Initializable {

    @FXML
    private BarChart<String, Integer> screenTimGrph;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        screenTimGrph.getData().addAll(DBUtility.getScreenTime());

    }
}
