package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToRunner {
	public static void main(String[] args) {

		TicTacToeGame tacToeGame = new TicTacToeGame();
		char board[] = tacToeGame.createBoard();
		tacToeGame.makeYourChoice();
		// tacToeGame.showBoard(board);
		int result;
		result = (int) Math.floor(Math.random() * 10) % 2;
		if (result == 1) {
			System.out.println("Computer will play first");
//			tacToeGame.setComputerIndex(board);
//
			
//			tacToeGame.showBoard(board);

		} else {
			System.out.println("Player will play first");

		}
		
		while (true) {

			switch (1) {

			case 1:
				int index = tacToeGame.playerMove();
				tacToeGame.setIndex(index, board);
				tacToeGame.showBoard(board);
			case 2:
				tacToeGame.setComputerIndex(board);

				tacToeGame.showBoard(board);

				if (tacToeGame.checkWin(board)) {
					System.out.println("Wins");
					break;
				}

				else if (tacToeGame.checkTie(board)) {
					break;
				} else if (tacToeGame.checkOpponent(board)) {
					break;
				} else if (tacToeGame.takeCorners(board) || tacToeGame.addCenter(board)) {
					break;
				} else if (tacToeGame.checkBoard(board))
					break;

			}

		}
		System.out.println("Do you want to play another game");
		Scanner sc= new Scanner(System.in);
		String choiceToPlay = sc.nextLine();
		if(choiceToPlay.equals("yes")) {
			main(args);
		}

	}
}
