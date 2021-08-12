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

        startGame(playerOne, playerTwo, mainBoard);
    }

    private static void printBoard(char[][] board) {
        System.out.print("+" + '\t' + "-" +  '\t' + "+" + '\t' + "-" + '\t' + "+" + '\t' + "-" + '\t' + "+");
        System.out.println();
        for(byte row = 0; row < board.length; row++) {
            for(byte column = 0; column < board[0].length; column++) {
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

     private static void startGame(Player p1, Player p2, char[][] board) {
         char position;
         byte i = 1;

         System.out.println("\nReady!!!!!");
         System.out.println("Go\n");
         while(i <=9) {
             if(i % 2 != 0) {
                 System.out.print("put your position " + p1.getPlayerName() + ": ");
                 Scanner scanner = new Scanner(System.in);
                 position = scanner.next().charAt(0);
                 fillBoard(position, p1.getPlayerChar(), board );
             } else {
                 System.out.print("put your position " + p2.getPlayerName() + ": ");
                 Scanner scanner = new Scanner(System.in);
                 position = scanner.next().charAt(0);
                 fillBoard(position, p2.getPlayerChar(), board );
             }
             printBoard(board);
             System.out.println();
             i++;
             position = 0;
         }
     }

    private static void fillBoard(char position, char item, char[][] board){
        switch(position){
            case '1':
            case '2':
            case '3':
                switch(position) {
                    case '1':
                        board[0][0] = item;
                        break;
                    case '2':
                        board[0][1] = item;
                        break;
                    case '3':
                        board[0][2] = item;
                        break;
                }
            case '4':
            case '5':
            case '6':
                switch(position) {
                    case '4':
                        board[1][0] = item;
                        break;
                    case '5':
                        board[1][1] = item;
                        break;
                    case '6':
                        board[1][2] = item;
                        break;
                }
            case '7':
            case '8':
            case '9':
                switch(position) {
                    case '7':
                        board[2][0] = item;
                        break;
                    case '8':
                        board[2][1] = item;
                        break;
                    case '9':
                        board[2][2] = item;
                        break;
                }
        }
    }
}