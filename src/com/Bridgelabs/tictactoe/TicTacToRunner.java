package com.Bridgelabs.tictactoe;

public class TicTacToRunner {
	public static void main(String[] args) {
		
		TicTacToeGame tacToeGame = new TicTacToeGame();
		 char board[]=tacToeGame.createBoard();
		 tacToeGame.makeYourChoice();
		 tacToeGame.showBoard(board);
	}
}
