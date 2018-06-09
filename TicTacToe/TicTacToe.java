
import java.util.Scanner;

public class TicTacToe
{
    private static Scanner in = new Scanner(System.in);
	private static boolean isX = false;
	
	public static void main(String[] args)
	{
		char[][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		
		do
		{
			//TODO: switch the player's turn 
			//      (if isX is true, make it false, and vice versa)
			isX = !isX;

			print(board);
			board = playerTurn(board);
			
		} while( !checkWin(board) );
	}
	
	public static void print(char[][] board)
	{
		//TODO: print the board
		for (int i = 0; i < board.length; i++){
		    System.out.println(board[i]);
		}
	}
	
	public static char[][] playerTurn(char[][] board)
	{
		//set player to the person's turn
		char player = isX ? 'X' : 'O';
		if (isX == true){
		    player = 'X';
		} else {
		    player = 'O';
		}
		
		//ask the user for the spot they want
		System.out.print("Player " + player + ", where would you like to go? > ");
		int spot = in.nextInt();
		
		//TODO: set that spot to the player's letter (char player)
		for (int a = 0; a < 3; a++){
		    for (int b = 0; b<3; b++){
		        int num = Character.getNumericValue(board[a][b]);
		        if (spot == num){
		            board[a][b] = player;		        
		        }
		    }
		}
		
		return board;               
	}
	
	public static boolean checkWin(char[][] board)
	{
		//TODO: check for win
		boolean winOrNaw = false;
		for (int x = 0; x<3; x++){
		    if (board[x][0] == board[x][1] && board[x][1] == board[x][2]){
		        winOrNaw = true;		    
		    } else if (board[0][x] == board[1][x] && board[1][x] == board[2][x]){
		        winOrNaw = true;		    
		    }
		 }
                
		 if (board[0][2] == board[1][1] && board[1][1] == board[2][0]){
		    winOrNaw = true;
		}
		
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2]){
		    winOrNaw = true;
		}
		
		if (winOrNaw){
		    print(board);
		}
		
		return winOrNaw;
	}
}
