package FileSystem;

import javax.swing.*;
import java.io.File;

public class FileChooser {

	public static File getFile() {
		JFileChooser chooser = new JFileChooser();

		// HARD CODED EXAMPLE PATH FOR TESTING:
		// /home/aras/Git-Repos/untitled/test/test.yml

		chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
				"YAML files", "yml", "yaml"
		));

		int result = chooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			System.out.println("Selected file: " + file.getAbsolutePath());
			return file;
		}

		return null;
	}
}

