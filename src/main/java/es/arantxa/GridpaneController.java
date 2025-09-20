package es.arantxa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Controlador para manejar las interacciones del GridPane en la interfaz de usuario.
 * Permite añadir texto del campo de nombre al área de descripción y limpiar la descripción.
 */
public class GridpaneController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnOk;

    @FXML
    private TextArea txtDescription;

    @FXML
    private TextField txtName;

    /**
     * Evento que se dispara al pulsar el botón "Cancel".
     * Borra el texto contenido en el TextArea de descripción.
     *
     * @param event el evento de acción generado al pulsar el botón
     */
    @FXML
    void btnCancelClick(ActionEvent event) {
        txtDescription.clear();
    }

    /**
     * Evento que se dispara al pulsar el botón "OK".
     * Añade el texto del TextField de nombre al final del TextArea de descripción.
     * Si ya hay contenido, se añade detrás.
     *
     * @param event el evento de acción generado al pulsar el botón
     */
    @FXML
    void btnOkClick(ActionEvent event) {
        String nameText = txtName.getText().trim();
        if (!nameText.isEmpty()) {
            txtDescription.appendText(nameText);
            txtName.clear();
        }
    }

}
