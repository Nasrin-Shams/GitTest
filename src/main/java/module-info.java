module com.shams.gittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shams.gittest to javafx.fxml;
    exports com.shams.gittest;
}