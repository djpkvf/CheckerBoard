/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import gameboards.CheckerBoard;
import javafx.stage.Stage;

/**
 *
 * @author dominicpilla
 */
public class CheckerBoardController implements Initializable {
    private Stage stage;
    
    @FXML
    AnchorPane anchorPane;
    
    public void start(Stage stage) {
        this.stage = stage;
        CheckerBoard checkerBoard = new CheckerBoard(600, 600, 8, 8);
        anchorPane = checkerBoard.build();
        System.out.println(anchorPane.getChildren());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
