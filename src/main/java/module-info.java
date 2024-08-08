module me.aceking.wikipediasearch {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens me.aceking.wikipediasearch to javafx.fxml;
    exports me.aceking.wikipediasearch;
}