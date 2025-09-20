package es.arantxa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/gridpane.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("FlowPane Alignment");
        stage.setMinHeight(300);
        stage.setMinWidth(500);
        stage.setMaxHeight(500);
        stage.setMaxWidth(800);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}