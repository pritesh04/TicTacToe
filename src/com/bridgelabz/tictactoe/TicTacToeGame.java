package com.bridgelabz.tictactoe;

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

	public void setPlayerIndex(char[] board) {
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
		else if (board[7] == board[8] && board[8] == board[9] && board[9] != ' ')
			return true;
		else if (board[1] == board[4] && board[4] == board[7] && board[7] != ' ')
			return true;
		else if (board[3] == board[5] && board[5] == board[7] && board[7] != ' ')
			return true;
		else if (board[2] == board[5] && board[5] == board[8] && board[8] != ' ')
			return true;
		else if (board[3] == board[6] && board[6] == board[9] && board[9] != ' ')
			return true;
		else if (board[4] == board[5] && board[5] == board[6] && board[6] != ' ')
			return true;
		else if (board[1] == board[5] && board[5] == board[9] && board[9] != ' ')
			return true;

		return false;
	}

	public boolean checkTie(char[] board) {
		for (int i = 1; i <= 9; i++) {
			if (board[i] == ' ') {
				return false;
			}
		}
		System.out.println("game has been tied");
		return true;
	}

	public int playerMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the index Number ");
		int index = sc.nextInt();
		return index;
	}

	public boolean checkOpponent(char[] board) {
		for (int i = 1; i < board.length; i++) {
			if (board[i] == ' ') {
				board[i] = player;
				if (checkWin(board)) {
					int index = playerMove();
					this.setIndex(index, board);
					return true;
				} else {
					board[i] = ' ';
				}
			}
		}
		return false;
	}

	public boolean takeCorners(char[] board) {

		if (board[1] == ' ') {
			board[1] = player;
			return true;
		}
		if (board[3] == ' ') {
			board[3] = player;
			return true;
		}
		if (board[7] == ' ') {
			board[7] = player;
			return true;
		}
		if (board[9] == ' ') {
			board[9] = player;
			return true;
		}

		return false;
	}

	public boolean addCenter(char[] board) {
		int position = 5;
		if (board[position] == ' ') {
			board[position] = player;
			return true;
		}
		return false;
	}
	
	

}
