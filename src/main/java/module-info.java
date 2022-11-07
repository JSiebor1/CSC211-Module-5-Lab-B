module com.mycompany.issuetrackinglite {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.issuetrackinglite to javafx.fxml;
    exports com.mycompany.issuetrackinglite;
}
