/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameboards;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author dominicpilla
 */
public class CheckerBoard {
    
    private double boardWidth, boardHeight;
    private int numRows, numColumns;
    private Color lightColor = Color.RED, darkColor = Color.BLACK;
    
    private double rectangleWidth;
    private double rectangleHeight;
    
    private AnchorPane anchorPane;
    
    public CheckerBoard( double boardWidth, double boardHeight, int numRows, int numColumns ) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.numRows = numRows;
        this.numColumns = numColumns;
        
        rectangleWidth = boardWidth / numRows;
        rectangleHeight = boardHeight / numColumns;
    }
    
    public CheckerBoard( double boardWidth, double boardHeight, int numRows, int numColumns, Color lightColor, Color darkColor ) {
        this(boardWidth, boardHeight, numRows, numColumns);
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public AnchorPane build() {
        
        anchorPane = new AnchorPane();
        
        rectangleWidth = boardWidth / numColumns;
        rectangleHeight = boardHeight / numRows;
        
        for( int row = 0; row < numRows; row++ ) {
            for( int column = 0; column < numColumns; column++ ) {

                Color color;
                if( (row % 2) == (column % 2) )
                    color = lightColor;
                else
                    color = darkColor;
                
                Rectangle boardTile = new Rectangle(rectangleWidth, rectangleHeight, color);
                
                AnchorPane.setTopAnchor(boardTile, column * rectangleHeight);
                AnchorPane.setLeftAnchor(boardTile, row * rectangleWidth);
                
                anchorPane.getChildren().add(boardTile);
            }
        }
        return anchorPane;
    }
    
    public AnchorPane getBoard() {
        return anchorPane;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardHeight() {
        return boardHeight;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public Color getLightColor() {
        return lightColor;
    }

    public Color getDarkColor() {
        return darkColor;
    }

    public double getRectangleWidth() {
        return rectangleWidth;
    }

    public double getRectangleHeight() {
        return rectangleHeight;
    }
}
