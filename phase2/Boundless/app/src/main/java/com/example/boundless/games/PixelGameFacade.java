package com.example.boundless.games;

import android.view.MotionEvent;

import com.example.boundless.games.game_utilities.*;
import com.example.boundless.games.pixel_game.PixelDrawer;

/**
 * A game where you use pixels to recreate an image.
 */
public class PixelGameFacade extends Game {

    private int currentLevel;
    private IGridManager pixelManager;
    private ITouchHandler pixelTouchHandler;
    private IGridDrawer pixelDrawer;

    /**
     * A new pixel game
     *
     * @param builder The builder building the pixel game
     */
    PixelGameFacade(GameBuilder builder) {
        currentLevel = builder.getLevel();
        this.pixelDrawer = builder.getDrawer();
        this.pixelTouchHandler = builder.getTouchHandler();
        this.pixelManager = builder.getManager();
    }

    @Override
    boolean gameOver() {
        return pixelManager.checkAnswer();
    }

    @Override
    public void setHint() {
        PixelDrawer.showHint();
    }

    @Override
    public void screenTouched(MotionEvent event) {
        pixelTouchHandler.screenTouched(event);
    }

    @Override
    public void screenTouched(int x, int y) {
        //not implemented here
    }

    @Override
    String getInstructions() {
        return GameResources.getPixelInstructions();
    }

    @Override
    String getGameOverText() {//[][][]
        return GameResources.getPixelGameOver(currentLevel + 1);
    }

    /**
     * Draw the grid with the pixels, and the labels on the row/column.
     */
    @Override
    public void draw() {
        pixelDrawer.draw();
    }
}