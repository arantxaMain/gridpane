package es.arantxa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controlador para manejar las interacciones del GridPane en la interfaz de usuario.
 * Permite añadir texto del campo de nombre al área de descripción y limpiar la descripción.
 */
public class GridpaneController {

    private static final Logger logger = LoggerFactory.getLogger(GridpaneController.class);

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnOk;

    @FXML
    private TextArea txtDescription;

    @FXML
    private TextField txtName;


    /**
     * Evento que se dispara al pulsar el botón "OK".
     * Añade el texto del TextField de nombre al final del TextArea de descripción.
     * Si ya hay contenido, se añade en la siguiente línea.
     *
     * @param event el evento de acción generado al pulsar el botón
     */
    @FXML
    void btnOkClick(ActionEvent event) {
        String nameText = txtName.getText().trim();
        if (!nameText.isEmpty()) {
            if (!txtDescription.getText().isEmpty()) {
                txtDescription.appendText("\n");
            }
            txtDescription.appendText(nameText);
            txtName.clear();
            logger.info("Texto añadido: {}", nameText);
        } else {
            logger.warn("Se intentó añadir un texto vacío");
        }
    }

    /**
     * Evento que se dispara al pulsar el botón "Cancel".
     * Borra el texto contenido en el TextArea de descripción.
     *
     * @param event el evento de acción generado al pulsar el botón
     */
    @FXML
    void btnCancelClick(ActionEvent event) {
        txtDescription.clear();
        logger.info("Texto borrado");
    }

}
