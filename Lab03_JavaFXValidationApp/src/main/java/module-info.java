module org.example.lab03_javafxvalidationapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab03_javafxvalidationapp to javafx.fxml;
    exports org.example.lab03_javafxvalidationapp;
}