module com.example.javaassignmentyear2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javaassignmentyear2 to javafx.fxml;
    exports com.example.javaassignmentyear2;
    exports com.example.javaassignmentyear2.Controllers;
    opens com.example.javaassignmentyear2.Controllers to javafx.fxml;

    exports  com.example.javaassignmentyear2.Models;
    opens  com.example.javaassignmentyear2.Models to javafx.fxml;
    exports com.example.javaassignmentyear2.Utilities;
    opens com.example.javaassignmentyear2.Utilities to javafx.fxml;
}