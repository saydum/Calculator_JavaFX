module com.example.calc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calc2 to javafx.fxml;
    exports com.example.calc2;
}