package com.example.boundless.RotateTileGame;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

/**
 * An individual tile that can be rotated.
 */
public abstract class Tile {

    //TODO: figure out how to add an image as a variable
    /**
     * The pipe exits of the tile type.
     */
    private int[] exits;
    /**
     * Used in checking if the game is over.
     */
    boolean visited = true;

    Bitmap image;
    /**
     * The current rotation on this tile.
     */
    private Rotation rotation;


    public void resize(int newDimension){
        image = Bitmap.createScaledBitmap(image, newDimension, newDimension, true);
    }

    Tile(int[] exits) {
        this.exits = exits;
        rotation = Rotation.getRandom();

    }

    /**
     * Get the exits of the tile.
     */
    int[] getExits() {
        switch (rotation) {
            case EAST:
                return rotatedExit(3);
            case SOUTH:
                return rotatedExit(2);
            case WEST:
                return rotatedExit(1);
            default:
                return exits;
        }
    }

    /**
     * Rotate the exits by the specified amount.
     *
     * @param newNorth the new north of the tile.
     * @return The exits in the correct rotation.
     */
    private int[] rotatedExit(int newNorth) {
        int[] newExits = new int[4];
        int count = 0;
        for (int i = newNorth; i < newNorth + 4; i++) {
            newExits[count] = exits[i % 4];
            count++;
        }
        return newExits;
    }

    /**
     * Get the rotation of the tile.
     */
    Rotation getRotation() {
        return rotation;
    }

    /**
     * Set the tile rotation.
     *
     * @param rotation the rotation to set the tile to.
     */
    public void setTile(Rotation rotation) {
        this.rotation = rotation;
    }

    /**
     * Rotates the tile.
     */
    void rotateTile() {
        rotateBitmap(90);
        switch (rotation) {
            case NORTH:
                rotation = Rotation.EAST;
                break;
            case EAST:
                rotation = Rotation.SOUTH;
                break;
            case SOUTH:
                rotation = Rotation.WEST;
                break;
            case WEST:
                rotation = Rotation.NORTH;
                break;
            default:
                break;
        }
    }

    private void rotateBitmap(float angle)
    {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        image =  Bitmap.createBitmap(image, 0, 0, image.getWidth(), image.getHeight(), matrix, true);
    }

    /**
     * Draw the Tile
     */
    public void draw() {
        //TODO
    }

}
