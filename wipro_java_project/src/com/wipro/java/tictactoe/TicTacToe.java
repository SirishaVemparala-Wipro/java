package com.wipro.java.tictactoe;

import java.util.Scanner;

class TicTacToe {
	public static void main(String a[]) {
		char[][] board=new char[3][3];
		for(int row =0;row<board.length;row++) {
			for (int col=0;col<board[row].length;col++) {
				board[row][col]=' ';//initialize the 3X3 2D array board with empty spaces
			}
		}
		char player = 'X';// Start with player 'X'
		boolean gameOver=false;//flag to check if game is over
		Scanner scanner=new Scanner(System.in);//take i/p from user
		while(!gameOver) {
			printBoard(board);
			System.out.print("Player "+player+" enter: ");
			int row=scanner.nextInt();
			int col=scanner.nextInt();
			System.out.println();
			if(board[row][col] == ' ') {// Check if the cell is empty
				board[row][col] = player; // Place the player's mark on the board
				gameOver=haveWon(board,player); //Check if the player has won
				if(gameOver) {
					System.out.println("Player "+player+ " has won: ");
				}
				else {
					player=(player=='X') ? 'O' : 'X';				
			}
		}else {
			System.out.println("Invalid move...Please try Again");
		}
	}

	printBoard(board);
}

	public static boolean haveWon(char[][] board, char player) {
		for (int row = 0; row < board.length; row++) {
			if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
				return true;
			}
		}
		for (int col = 0; col < board[0].length; col++) {
			if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
				return true;
			}
		}
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}
		return false;
	}

	public static void printBoard(char[][] board) {
	    System.out.println("-------------");
	    for (int row = 0; row < board.length; row++) {
	        System.out.print("| ");
	        for (int col = 0; col < board[row].length; col++) {
	            System.out.print(board[row][col] + " | ");
	        }
	        System.out.println();
	        System.out.println("-------------");
	    }
	}
}