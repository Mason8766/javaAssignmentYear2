module com.example.javaassignmentyear2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaassignmentyear2 to javafx.fxml;
    exports com.example.javaassignmentyear2;
    exports com.example.javaassignmentyear2.Controllers;
    opens com.example.javaassignmentyear2.Controllers to javafx.fxml;
}