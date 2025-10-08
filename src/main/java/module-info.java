module com.example.addressapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    requires javafx.base;
    requires java.prefs;
    requires jakarta.xml.bind;

    exports com.example.addressapp;
    opens com.example.addressapp to javafx.fxml;
    opens com.example.addressapp.model to jakarta.xml.bind;
    opens com.example.addressapp.view to javafx.fxml;
    exports com.example.addressapp.util to org.glassfish.jaxb.core, org.glassfish.jaxb.runtime;
    opens   com.example.addressapp.util to jakarta.xml.bind;
}