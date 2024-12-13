module org.example.controlle_blanc {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires java.sql;


    opens org.example.controlle_blanc to javafx.fxml;
    exports org.example.controlle_blanc;
}