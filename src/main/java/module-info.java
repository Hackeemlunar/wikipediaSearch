module me.aceking.wikipediasearch {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.zaxxer.hikari;
    requires java.sql;

    opens me.aceking.wikipediasearch to javafx.fxml;
    exports me.aceking.wikipediasearch;
    exports me.aceking.wikipediasearch.controller;
    opens me.aceking.wikipediasearch.controller to javafx.fxml;
}