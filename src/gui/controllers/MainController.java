package gui.controllers;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import FileSystem.FileChooser;
import FileSystem.YMLReader;

import ymlComponents.YMLComponent;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    private List<YMLComponent> components = new ArrayList<>();

    @FXML
    public void onOpenClicked() throws Exception {


        // Select file
        File file = FileChooser.getFile();
        if (file == null) {
            throw new Exception("No file selected");
        }

        // Parse YML into components
        components = YMLReader.YmlToComponentList(file);

        System.out.println("Loaded components: " + components.size());

        StringBuilder sb = new StringBuilder();
        for (YMLComponent component : components) {
            component.PrintDebug();
            sb.append(component).append("\n");
        }


        // ⭐ THIS was missing ⭐
        displayComponents(components);

        System.out.println("Done");
    }

    @FXML
    public void onSaveClicked(){
    }

    @FXML
    private VBox container;

   public void displayComponents(List<YMLComponent> components) {
        
        
        ScrollPane scrollPane = new ScrollPane();
        container.getChildren().clear();

        for (YMLComponent c : components) {
            VBox card = new VBox();
            card.setSpacing(4);
            card.setStyle(
                "-fx-margin: 10; "+
                "-fx-background-color: rgb(30, 31, 34); " +
                "-fx-padding: 12; " +
                "-fx-background-radius: 10; " +
                "-fx-border-radius: 10;"
            );

            Label title = new Label(c.getName());
            title.setStyle(
                "-fx-font-size: 16px; " +
                "-fx-font-weight: bold; " +
                "-fx-text-fill: white;"
            );

            Label content = new Label(c.toString());
            content.setWrapText(true);
            content.setStyle("-fx-text-fill: #ff0000ff;");

            // Hover effect
            card.setOnMouseEntered(e ->
                card.setStyle(
                    "-fx-background-color: rgb(30, 31, 34); " +
                    "-fx-padding: 12; " +
                    "-fx-background-radius: 10;"
                )
            );
            card.setOnMouseExited(e ->
                card.setStyle(
                    "-fx-background-color: rgb(30, 31, 34); " +
                    "-fx-padding: 12; " +
                    "-fx-background-radius: 10;"
                )
            );

            // Click event
            card.setOnMouseClicked(e -> {
                System.out.println("Clicked: " + c.getName());
            });

            card.getChildren().addAll(title, content);
            container.getChildren().add(card);

            //STYLE: 
            scrollPane.getStyleClass().add("scrollPane");
            card.getStyleClass().add("card");
            title.getStyleClass().add("card-title");
            content.getStyleClass().add("card-text");
            

            //Hover Animation
            card.setOnMouseEntered(e -> {
                ScaleTransition st = new ScaleTransition(Duration.millis(150), card);
                st.setToX(1.02);
                st.setToY(1.02);
                st.play();
            });
            card.setOnMouseExited(e -> {
                ScaleTransition st = new ScaleTransition(Duration.millis(150), card);
                st.setToX(1.0);
                st.setToY(1.0);
                st.play();
            });


        }
    }

    


}
