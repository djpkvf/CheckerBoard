/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameboards;

import javafx.scene.paint.Color;

/**
 *
 * @author dominicpilla
 */
public class CheckerBoard {
    
    protected double boardWidth, boardHeight;
    protected int numRows, numColumns;
    protected Color lightColor, darkColor;
    
    public CheckerBoard( double boardWidth, double boardHeight, int numRows, int numColumns ) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.numRows = numRows;
        this.numColumns = numColumns;
    }
    
    public CheckerBoard( double boardWidth, double boardHeight, int numRows, int numColumns, Color lightColor, Color darkColor ) {
        this(boardWidth, boardHeight, numRows, numColumns);
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
}
