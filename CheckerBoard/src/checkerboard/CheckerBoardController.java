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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuBar;
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
    
    @FXML
    MenuBar menuBar;
    
    public void start(Stage stage) {
        this.stage = stage;
        checkerBoard = new CheckerBoard(vBox.getWidth(), vBox.getHeight() - menuBar.getHeight(), 8, 8);
        
        vBox.getChildren().add(checkerBoard.build());
        
        ChangeListener<Number> checkerBoardSizeChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            clearGameBoard();
            checkerBoard = new gameboards.CheckerBoard(vBox.getWidth(),
                    vBox.getHeight() - menuBar.getHeight(), checkerBoard.getNumRows(),
                    checkerBoard.getNumColumns(), checkerBoard.getLightColor(),
                    checkerBoard.getDarkColor());
            vBox.getChildren().add(checkerBoard.build());
            
        };
        
        this.stage.widthProperty().addListener(checkerBoardSizeChangeListener);
        this.stage.heightProperty().addListener(checkerBoardSizeChangeListener);
        
    }
    
    private void clearGameBoard() {
        if( checkerBoard.getBoard() != null ) {
            vBox.getChildren().remove(checkerBoard.getBoard());
        }
    }
    
    private void changeGridSize(int size) {
        clearGameBoard();
        checkerBoard = new gameboards.CheckerBoard(checkerBoard.getBoardWidth(),
                checkerBoard.getBoardHeight(), size, size, checkerBoard.getLightColor(),
                checkerBoard.getDarkColor());
        vBox.getChildren().add(checkerBoard.build());
    }
    
    private void changeGridColor(Color lightColor, Color darkColor) {
        clearGameBoard();
        checkerBoard = new gameboards.CheckerBoard(checkerBoard.getBoardWidth(),
                checkerBoard.getBoardHeight(), checkerBoard.getNumRows(),
                checkerBoard.getNumColumns(), lightColor, darkColor);
        vBox.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    public void handleDefaultColorChange(ActionEvent event) {
        changeGridColor(Color.RED, Color.BLACK);
    }
    
    @FXML
    public void handleBlueColorChange(ActionEvent event) {
        changeGridColor(Color.LIGHTBLUE, Color.BLUE);
    }
    
    @FXML
    public void handleGridResize16x16(ActionEvent event) {
        changeGridSize(16);
    }
    
    @FXML
    public void handleGridResize10x10(ActionEvent event) {
        changeGridSize(10);
    }
    
    @FXML
    public void handleGridResize8x8(ActionEvent event) {
        changeGridSize(8);
    }
    
    @FXML
    public void handleGridResize3x3(ActionEvent event) {
        changeGridSize(3);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
