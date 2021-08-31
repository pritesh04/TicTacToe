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

	public boolean checkIndex(int index, char[] board) {
		if (board[index] == ' ') {
			return true;
		}
		return false;
	}

	public void setIndex(int index, char[] board) {
		if (index > 0 && index < 10) {

			if (checkIndex(index, board)) {
				board[index] = player;
			} else {
				System.out.println("Entered Index is not Free ");
			}

		} else
			System.out.println("Invalid Index");

	}

	public void setComputerIndex(char[] board) {
		int min = 1, max = 9;
		int index = (int) (Math.random() * (max - min + 1) + min);
		if (index > 0 && index < 10) {

			if (checkIndex(index, board)) {
				board[index] = computer;
			} else {
				System.out.println("Entered Index is not Free ");
			}
		}

		else {
			System.out.println("Invalid Index");
		}

	}

	public boolean checkWin(char[] board) {
		if (board[1] == board[2] && board[2] == board[3])
			return true;
		else if (board[1] == board[5] && board[5] == board[9])
			return true;
		else if (board[1] == board[4] && board[4] == board[7])
			return true;
		else if (board[2] == board[5] && board[5] == board[8])
			return true;
		else if (board[3] == board[5] && board[5] == board[7])
			return true;
		else if (board[3] == board[6] && board[6] == board[9])
			return true;
		else if (board[4] == board[5] && board[5] == board[6])
			return true;
		else if (board[7] == board[8] && board[8] == board[9])
			return true;
		else
			return false;
	}

}
