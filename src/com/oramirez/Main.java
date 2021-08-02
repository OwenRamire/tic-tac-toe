package com.oramirez;

public class Main {
    public static void main(String[] args) {
        char[][] mainBoard = new char[3][3];
        System.out.println("welcome to tic tac toe".toUpperCase());
        System.out.println("\tby Owen Ramirez\n");
        printBoard(mainBoard);
    }

    public static void printBoard(char[][] board) {
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
}