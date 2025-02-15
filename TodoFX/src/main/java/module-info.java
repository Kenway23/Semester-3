module com.mycompany.todofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.todofx to javafx.fxml;
    exports com.mycompany.todofx;
}
