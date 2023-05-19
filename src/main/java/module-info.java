module com.example.dungeons_and_choices {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.dungeons_and_choices to javafx.fxml;
    exports com.example.dungeons_and_choices;
}