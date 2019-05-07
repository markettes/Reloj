/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.net.URL;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author marferp2
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label labelTime;

    LocalTime actualTime;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void mostrarAct(ActionEvent event) {
        actualTime = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
        labelTime.setText(actualTime.toString());
        
        /*labelTime.addListener(new ChangeListener<Number>() {
        public void changed(ObservableValue ov, Number value, Number new_value) {
        barraBusqueda.setPromptText("Introduce aquí el " + (options[new_value.intValue()]).toLowerCase());
        }
        });*/
    }

    @FXML
    private void pausarAct(ActionEvent event) {
    }

}
