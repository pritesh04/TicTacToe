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

	
}
