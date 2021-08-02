package com.oramirez;

import java.util.Scanner;

import com.oramirez.model.Player;

public class Main {
    public static void main(String[] args) {
        char[][] mainBoard = new char[3][3];
        System.out.println("welcome to tic tac toe".toUpperCase());
        System.out.println("\tby Owen Ramirez\n");
        printBoard(mainBoard);

        Player playerOne = new Player();
        Player playerTwo = new Player();
        byte auxPlayer = 1;

        // Player one data
        setPlayerData(playerOne, playerTwo, auxPlayer);
        auxPlayer++;
        // Player two data
        setPlayerData(playerTwo, playerOne, auxPlayer);

    }

    private static void printBoard(char[][] board) {
        System.out.print("+" + '\t' + "-" +  '\t' + "+" + '\t' + "-" + '\t' + "+" + '\t' + "-" + '\t' + "+");
        System.out.println();
        for(byte row = 0; row < 3; row++) {
            for(byte column = 0; column < 3; column++) {
                System.out.print("|" + '\t' + board[row][column] + '\t');
            }
            System.out.print("|");
            System.out.println();
            System.out.print("+" + '\t' + "-" +  '\t' + "+" + '\t' + "-" + '\t' + "+" + '\t' + "-" + '\t' + "+");
            System.out.println();
        }
    }
     private static void setPlayerData(Player playerOne, Player playerTwo, byte auxPlayer) {

        System.out.print("\nEnter the player " + auxPlayer + " name: ");
        Scanner scannerPlayerOneName = new Scanner(System.in);
        playerOne.setPlayerName(scannerPlayerOneName.nextLine());
        do {
            System.out.print("Enter the player " + auxPlayer + " character: ");
            Scanner scannerPlayerOneChar = new Scanner(System.in);
            playerOne.setPlayerChar(scannerPlayerOneChar.next().charAt(0));
        } while(!playerOne.isCharacterValid(playerOne.getPlayerChar(), playerTwo.getPlayerChar()));
     }
}