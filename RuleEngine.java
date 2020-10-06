import java.util.ResourceBundle.Control;

import javax.swing.JButton;

public class RuleEngine {
	Controller controller;
	private int winCondition = 3;
	int count = 1;
	int playersTurn;
	private int players = 2;
	private char[] playerSymbol = new char[players];
	// static JButton buttons[][] = new JButton[3][3];

	public RuleEngine(Controller _controller) {
		this.controller = _controller;
		for(int i = 0; i < players; i+=1){
			playerSymbol[i]=(char)(65+i);
		}
	}

	public char getPlayerSymbol(int playerID){
		return playerSymbol[playerID];
	}
	public int playersTurn(){
		return playersTurn;
	}

	public void nextPlayer(){
		playersTurn = playersTurn + 1 % players;
	}
	public int playerAmmount(){
		return players;
	}
	public boolean checkIfWin(int _r, int _c) {
		// JButton button = controller.view.buttons[_r][_c];
		boolean win = false;
		JButton buttons[][] = controller.view[0].buttons;
		String theButton = buttons[_r][_c].getText();
		boolean firstBlock = false;
		boolean secondBlock = false;

		//horizontal
		for(int i = 1; i< winCondition; i+=1)	{
			if(_c + i >= 0 && _c + i < buttons.length && firstBlock == false){
				if(buttons[_r][_c+i].getText() == theButton){
					count += 1;
				}else{
					firstBlock = true;}
			}
			if(_c - i >= 0 && _c - i < buttons.length && secondBlock == false){
				if(buttons[_r][_c-i].getText() == theButton){
					count += 1;
				}else{
					secondBlock = true;
				}
			}
		}
		if(count >= winCondition){
			win = true;
			return win;
		}
		
		//set the values back
		count = 1;
		firstBlock = false;
		secondBlock = false;

		//vertical
		for(int i = 1; i< winCondition; i+=1)	{
			if(_r + i >= 0 && _r + i < buttons.length && firstBlock == false){
				if(buttons[_r+i][_c].getText() == theButton){
					count += 1;
				}else{
					firstBlock = true;
				}
			}
			if(_r - i >= 0 && _r - i < buttons.length && secondBlock == false){
				if(buttons[_r-i][_c].getText() == theButton){
					count += 1;
				}else{
					secondBlock = true;
				}
			}
		}
		if(count >= winCondition){
			win = true;
			return win;
		}

		//set the values back
		count = 1;
		firstBlock = false;
		secondBlock = false;
		
		//diagonal 1
		for(int i = 1; i<winCondition; i+=1){
			if(_r - i >= 0 && _c- i >= 0 && _r - i + _c- i < buttons.length && firstBlock == false){
				if(buttons[_r-i][_c-i].getText() == theButton){
					count +=1;
				}else{
					firstBlock = true;
				}
			}
			
			if(_r + i >=0 && _c + i>=0 && _r + i + _c + i < buttons.length && secondBlock == false){
				if(buttons[_r+i][_c+i].getText() == theButton){
					count +=1;
				}else{
				secondBlock = true;
				}
			}
		}
		if(count >= winCondition){
			win = true;
			return win;
		}
		//set the values back
		count = 1;
		firstBlock = false;
		secondBlock = false;

		//diagonal 2
		for( int i = 1; i < winCondition; i +=1){
			if(_r - i >=0 && _c + i >= 0 && _r - i + _c + i < buttons.length && firstBlock == false){
				if( buttons[_r-i][_c+i].getText() == theButton){
					count += 1;
				}else{
					firstBlock = true;
				}
			}
			if(_r + i >=0 && _c - i >= 0 && _r + i + _c - i < buttons.length && secondBlock == false){
				if(buttons[_r+i][_c-i].getText() == theButton){
					count += 1;
				}else{
					secondBlock = true;
				}
			}
		}
		if ( count >= winCondition){
			win = true;
			return win;
		}
		//set the values back
		count = 1;
		firstBlock = false;
		secondBlock = false;

		win = false;
		return win;
	}
}