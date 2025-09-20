package es.arantxa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * Clase principal de la aplicación JavaFX.
 * Se encarga de iniciar la interfaz gráfica cargando el archivo FXML
 * y aplicando los estilos CSS definidos.
 * Configura las propiedades de la ventana principal como tamaño mínimo,
 * máximo y título.
 */
public class App extends Application {

    /**
     * Función que se ejecuta al iniciar la aplicación.
     * Carga la interfaz definida en "gridpane.fxml", aplica los estilos CSS
     * y configura la ventana principal.
     *
     * @param stage la ventana principal de la aplicación
     * @throws Exception si ocurre un error al cargar el FXML
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/gridpane.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        String url = Objects.requireNonNull(getClass().getResource("/css/styles.css")).toString();
        scene.getStylesheets().add(url);

        stage.setScene(scene);
        stage.setTitle("Gridpane Alignment");
        stage.setMinHeight(300);
        stage.setMinWidth(500);
        stage.setMaxHeight(500);
        stage.setMaxWidth(800);
        stage.show();
    }

    /**
     * Función principal que arranca la aplicación JavaFX.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        launch();
    }
}
