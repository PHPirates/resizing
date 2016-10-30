package sample;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    protected void buttonUp(MouseEvent event) {
        if(event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
            System.out.println("Up button pressed.");
        } else { // mouse released
            System.out.println("Up button released.");
        }
    }

    @FXML
    protected void buttonDown(MouseEvent event) {
        if(event.getEventType().equals(MouseEvent.MOUSE_PRESSED)) {
            System.out.println("Down button pressed.");
        } else { // mouse released
            System.out.println("Down button released.");
        }
    }
}
