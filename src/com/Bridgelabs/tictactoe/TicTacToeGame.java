package com.Bridgelabs.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static char player;
	public static char computer;

	public char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	public void makeYourChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter computer player X or O :");
		player = sc.next().charAt(0);

		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';
		System.out.println("player " + player + " computer " + computer);
	}

	public void showBoard(char[] board) {

		for (int i = 1; i < board.length; i = i + 3) {

			System.out.println("|" + board[i] + "|" + "|" + board[i + 1] + "|" + "|" + board[i + 2] + "|");

		}
	}
	
}
