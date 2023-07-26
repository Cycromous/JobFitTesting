module com.example.jobfitgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens com.example.jobfitgui to javafx.fxml;
    exports com.example.jobfitgui;
}