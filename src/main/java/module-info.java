module com.example.demojavafxanimation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demojavafxanimation to javafx.fxml;
    exports com.example.demojavafxanimation;
}