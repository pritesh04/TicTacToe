package com.Bridgelabs.tictactoe;

import java.util.Scanner;

public class TicTacToRunner {
	public static void main(String[] args) {
		
		TicTacToeGame tacToeGame = new TicTacToeGame();
		 char board[]=tacToeGame.createBoard();
		 tacToeGame.makeYourChoice();
		 tacToeGame.showBoard(board);
		 Scanner sc= new Scanner(System.in);
		 System.out.println("ENter the index Number ");
		 int index= sc.nextInt();
		 tacToeGame.setIndex(index, board);
		 tacToeGame.showBoard(board);
	}
}
