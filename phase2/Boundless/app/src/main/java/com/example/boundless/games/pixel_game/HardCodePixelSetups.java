package com.example.boundless.games.pixel_game;

import android.graphics.Color;

/**
 * Holds the hardcoded levels for the pixel game
 */
final class HardCodePixelSetups {

    private HardCodePixelSetups() {
    }

    /**
     * Get the given level from the game
     *
     * @param level The level to get
     * @return The level
     */
    static PixelLevel getLevel(int level) {
        switch (level) {
            case 1:
                return hardCodeLevel2();
            case 2:
                return hardCodeLevel3();
            case 3:
                return hardCodeLevel4();
            default:
                return hardCodeLevel1();
        }
    }

    /**
     * The first level
     *
     * @return the picture of the first level
     */
    private static PixelLevel hardCodeLevel1() {
        int[][] heart = new int[10][10]; //The first level is a heart
        heart[1][2] = 1;
        heart[1][7] = 1;
        for (int i = 0; i < 3; i++) {
            heart[2][1 + i] = 1;
            heart[2][6 + i] = 1;
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 10; j++)
                heart[3 + i][j] = 1;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 8 - 2 * i; j++)
                heart[6 + i][1 + i + j] = 1;
        PixelLevel level = new PixelLevel();
        level.setPixels(heart);
        level.setColor(Color.rgb(226, 60, 121));
        return level;
    }

    /**
     * The second one
     *
     * @return the picture of second level
     */
    private static PixelLevel hardCodeLevel2() {
        int[][] android = new int[10][10];//the second level is android
        //The head
        android[0][4] = 1;
        android[0][5] = 1;
        //The body and the arm
        for (int i = 0; i < 4; i++)
            android[1][3 + i] = 1;
        for (int i = 0; i < 3; i++) {
            android[4 + i][0] = 1;
            android[4 + i][9] = 1;
        }
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                android[2 + i][2 + j] = 1;
        android[3][1] = 1;
        android[3][8] = 1;
        android[2][3] = 0;
        android[2][6] = 0;

        //The leg
        android[8][3] = 1;
        android[8][6] = 1;

        PixelLevel level = new PixelLevel();
        level.setPixels(android);
        level.setColor(Color.GREEN);
        return level;
    }

    private static PixelLevel hardCodeLevel3() {
        int[][] panda = new int[10][10]; // the third one is panda
        for (int i = 0; i < 2; i++) {
            panda[0][i] = 1;
            panda[1][i] = 1;
            panda[0][8 + i] = 1;
            panda[1][8 + i] = 1;
            panda[4][2 + i] = 1;
            panda[4][6 + i] = 1;
            panda[5][1 + i] = 1;
            panda[5][4 + i] = 1;
            panda[5][7 + i] = 1;
            panda[6][2 + i] = 1;
            panda[6][6 + i] = 1;
            panda[7][4 + i] = 1;
        }
        panda[1][2] = 1;
        panda[9][2] = 1;
        for (int j = 0; j < 5; j++) {
            panda[1][3 + j] = 1;
            panda[9][3 + j] = 1;
            panda[3 + j][0] = 1;
            panda[3 + j][9] = 1;
        }
        panda[2][1] = 1;
        panda[2][8] = 1;
        panda[8][1] = 1;
        panda[8][8] = 1;

        PixelLevel level = new PixelLevel();
        level.setPixels(panda);
        level.setColor(Color.WHITE);
        return level;
    }

    /**
     * The hardest level
     *
     * @return the picture of the hardest level
     */
    private static PixelLevel hardCodeLevel4() {
        int[][] taiji = new int[10][10]; // The third one is taiji
        for (int i = 0; i < 4; i++) {
            taiji[0][3 + i] = 1;
            taiji[9][3 + i] = 1;
            taiji[3 + i][0] = 1;
            taiji[3 + i][9] = 1;
            taiji[5][1 + i] = 1;
        }
        for (int i = 0; i < 6; i++)
            taiji[1][2 + i] = 1;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 6; j++)
                taiji[i + 2][1 + j] = 1;
        for (int i = 0; i < 2; i++) {
            taiji[6 + i][1] = 1;
            taiji[2 + i][8] = 1;
        }
        taiji[8][2] = 1;
        taiji[8][7] = 1;
        taiji[7][6] = 1;
        taiji[7][8] = 1;
        taiji[2][3] = 0;

        PixelLevel level = new PixelLevel();
        level.setPixels(taiji);
        level.setColor(Color.WHITE);
        return level;
    }
}
