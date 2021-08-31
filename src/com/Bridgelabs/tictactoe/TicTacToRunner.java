package com.Bridgelabs.tictactoe;

import java.util.Scanner;

public class TicTacToRunner {
	public static void main(String[] args) {

		TicTacToeGame tacToeGame = new TicTacToeGame();
		char board[] = tacToeGame.createBoard();
		tacToeGame.makeYourChoice();
		// tacToeGame.showBoard(board);

		while (true) {

			int result;
			result = (int) Math.floor(Math.random() * 10) % 2;
			if (result == 1) {
				System.out.println("Computer will play first");
				tacToeGame.setComputerIndex(board);

				tacToeGame.showBoard(board);

			} else {
				System.out.println("Player will play first");

			}
			int i = 1;
			while (i <= 9) {
				Scanner sc = new Scanner(System.in);
				System.out.println("ENter the index Number ");
				int index = sc.nextInt();
				tacToeGame.setIndex(index, board);
				tacToeGame.showBoard(board);
			}

		}
	}
}
