package com.example.demo;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static com.example.demo.FileFinder.fileFinder;

public class Controller {


    @FXML
    private TextField SearchTextField;

    @FXML
    private Button findButton;

    @FXML
    private TextArea resultTextArea;

    @FXML
    void initialize() {






        findButton.setOnAction(event -> {
            String searchingtext = SearchTextField.getText();
            ArrayList<File> fileList = new ArrayList<File>();
            FileFinder fileFinder = new FileFinder();
            fileFinder(new File("D:\\testt"), fileList, searchingtext);
            for(File file: fileList){
                resultTextArea.setText(file.getAbsolutePath());
            }


        });

    }

}
