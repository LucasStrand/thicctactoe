import java.util.ResourceBundle.Control;

import javax.swing.JButton;

public class RuleEngine {
  Move move;
  Controller controller;
  
  public RuleEngine(Controller _controller){
    this.move = new Move(controller);
  }
  public static boolean checkifP1win(int _r,int _c) {
    JButton button= new JButton();
    button = move.button[_r][_c];
    boolean win = false;
		if(button[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
			win = true;
		if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
			win = true;
		if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
			win = true;
		if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
			win = true;

		if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
			win = true;
		if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
			win = true;
		
		return win;
	}

	public static boolean checkifP2win() {
		boolean win = false;
		
		if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
			win = true;
		if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
			win = true;
		if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
			win = true;
		if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
			win = true;

		if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
			win = true;
		if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
			win = true;
		
		return win;	
	}
}
