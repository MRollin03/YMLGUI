package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/main.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);

        //Styles
        //scene.getStylesheets().add(getClass().getResource("styles/main.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource("styles/dark.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("YML GUI");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
