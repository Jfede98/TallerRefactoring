module com.pooespol.proyectodiscreta {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.pooespol.proyectodiscreta to javafx.fxml;
    exports com.pooespol.proyectodiscreta;
}