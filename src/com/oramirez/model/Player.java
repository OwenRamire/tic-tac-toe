package com.oramirez.model;

public class Player {
    private String playerName;
    private char playerChar;
    private boolean playerWin = false;
    private char[][] playerPosition;

    public Player() {

    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getPlayerChar() {
        return this.playerChar;
    }

    public void setPlayerChar(char playerChar) {
        this.playerChar = playerChar;
    }

    public boolean isPlayerWin() {
        return this.playerWin;
    }

    public void setPlayerWin(boolean playerWin) {
        this.playerWin = playerWin;
    }

    public char[][] getPlayerPosition() {
        return this.playerPosition;
    }

    public void setPlayerPosition(char[][] playerPosition) {
        this.playerPosition = playerPosition;
    }

    public boolean isCharacterValid(char playerCharSelectedCurrent, char playerCharSelectedAux) {
        if(playerCharSelectedCurrent == playerCharSelectedAux) {
            System.out.println("\tThe character " + playerCharSelectedCurrent + " was selected before");
            return false;
        }
        if(playerCharSelectedCurrent == 'x' || playerCharSelectedCurrent == 'o') {
            return true;
        }
        System.out.println("\tinvalid character to play\n\tTry with x/o");
        return false;
    }

}