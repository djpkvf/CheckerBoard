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
import gameboards.CheckerBoard;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author dominicpilla
 */
public class CheckerBoardController implements Initializable {
    private Stage stage;
    
    private CheckerBoard checkerBoard;
        
    @FXML
    VBox vBox;
    
    public void start(Stage stage) {
        this.stage = stage;
        checkerBoard = new CheckerBoard(600, 600, 8, 8);
        
        vBox.getChildren().add(checkerBoard.build());
    }
    
    private void clearGameBoard() {
        if( checkerBoard.getBoard() != null ) {
            vBox.getChildren().remove(checkerBoard.getBoard());
        }
    }
    
    @FXML
    public void handleDefaultColorChange(ActionEvent event) {
        clearGameBoard();
        checkerBoard = new gameboards.CheckerBoard(checkerBoard.getBoardWidth(),
                checkerBoard.getBoardHeight(), checkerBoard.getNumRows(),
                checkerBoard.getNumColumns());
        vBox.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    public void handleBlueColorChange(ActionEvent event) {
        clearGameBoard();
        checkerBoard = new gameboards.CheckerBoard(checkerBoard.getBoardWidth(),
                checkerBoard.getBoardHeight(), checkerBoard.getNumRows(), checkerBoard.getNumColumns(),
                Color.LIGHTBLUE, Color.BLUE);
        vBox.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    public void handleGridResize16x16(ActionEvent event) {
        
    }
    
    @FXML
    public void handleGridResize10x10(ActionEvent event) {
        
    }
    
    @FXML
    public void handleGridResize8x8(ActionEvent event) {
        
    }
    
    @FXML
    public void handleGridResize3x3(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
