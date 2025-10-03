module com.example.addressapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    requires javafx.base;


    opens com.example.addressapp to javafx.fxml;

    opens com.example.addressapp.view to javafx.fxml;
    exports com.example.addressapp;
}