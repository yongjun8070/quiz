module com.example.quiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.quiz to javafx.fxml;
    exports com.example.quiz;
}