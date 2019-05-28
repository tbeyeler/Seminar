package view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.*;

public class MainWindowController {

    @FXML private Button closeButton;

    @FXML private TextArea textArea;

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
            int character;
            StringBuffer sb = new StringBuffer();
            int count = 0;
            while ((character = reader.read()) != -1) {
                Character letter = (char) character;
                if (count >= 85 && letter.toString().equals(" ")) {
                    sb.append(System.lineSeparator());
                    count = 0;
                } else {
                    sb.append((char) character);
                }
                count++;
            }

            if (sb.length() > 0) {
                textArea.setText(sb.toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}