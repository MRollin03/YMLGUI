package gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import ymlComponents.YMLBoolean;
import ymlComponents.YMLComponent;

import java.util.ArrayList;

import FileSystem.*;


public class MainController {

    Main main;
    ArrayList<YMLComponent> ComponentsList;

    @FXML
    private TextArea textArea;

    @FXML
    public void onOpenClicked() throws Exception {
        //FILE TO CONVERT:
		java.io.File file = FileSystem.FileChooser.getFile();
		if (file == null){throw new Exception("NO FILE");}

		//CONVERT YML TO LIST OF COMPONENTS
		ComponentsList = new java.util.ArrayList<ymlComponents.YMLComponent>();
		ComponentsList = YMLReader.YmlToComponentList(file);

		System.out.println(ComponentsList.size());

		int i = 0;
		for(YMLComponent cur: ComponentsList){

			cur.PrintDebug();
            textArea.appendText(cur.toString() + "\n");
			i++;
		}

		System.out.println("DONE");
        textArea.appendText(null);
    }
}
