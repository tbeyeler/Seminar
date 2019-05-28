package view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainWindowController {

    @FXML
    private Button closeButton;

    @FXML
    void handleCloseButton() {
        Platform.exit();
    }

  @FXML
  void initialize() {}


}
