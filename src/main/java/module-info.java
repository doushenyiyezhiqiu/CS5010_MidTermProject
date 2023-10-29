module cs5010.nbadatamanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens cs5010.nbadatamanagementsystem to javafx.fxml;
    exports cs5010.nbadatamanagementsystem;
}