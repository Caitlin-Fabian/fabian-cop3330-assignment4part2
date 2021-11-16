module ucf.assignements {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.junit.jupiter.api;

    opens ucf.assignements to javafx.fxml;
    exports ucf.assignements;
}