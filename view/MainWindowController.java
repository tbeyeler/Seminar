package view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.*;

public class MainWindowController {

  @FXML private Button closeButton;

  @FXML private Label textLabel;

  @FXML
  void handleCloseButton() {
    Platform.exit();
  }

  @FXML
  void initialize() {
    File file =
        new File("C:\\Users\\tobia\\Google Drive\\Seminar\\resources\\wagesforhousework.txt");
    try {
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String text;
      StringBuffer sb = new StringBuffer();
      while ((text = reader.readLine()) != null) {
        sb.append(text);
      }
      textLabel.setText(sb.toString());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }
}
