import java.util.ResourceBundle.Control;

import javax.swing.JButton;

public class RuleEngine {
  Move move;
	Controller controller;
	static JButton buttons[][];

	public RuleEngine(Controller _controller) {
		this.move = new Move(controller);
	}

	public static boolean checkifP1win(int _r, int _c) {
		buttons[_r][_c] = new JButton();
    boolean win = false;
		if(buttons[0][0].getText() == "O" && buttons[0][1].getText() == "O" && buttons[0][2].getText() == "O")
			win = true;
		if(buttons[1][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[1][2].getText() == "O")
			win = true;
		if(buttons[2][0].getText() == "O" && buttons[2][1].getText() == "O" && buttons[2][2].getText() == "O")
			win = true;

		if(buttons[0][0].getText() == "O" && buttons[1][0].getText() == "O" && buttons[2][0].getText() == "O")
			win = true;
		if(buttons[0][1].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][1].getText() == "O")
			win = true;
		if(buttons[0][2].getText() == "O" && buttons[1][2].getText() == "O" && buttons[2][2].getText() == "O")
			win = true;

		if(buttons[0][0].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][2].getText() == "O")
			win = true;
		if(buttons[0][2].getText() == "O" && buttons[1][1].getText() == "O" && buttons[2][0].getText() == "O")
			win = true;
		
		return win;
	}

	public static boolean checkifP2win(int _r, int _c) {
		boolean win = false;
		buttons[_r][_c] = new JButton();
		if(buttons[0][0].getText() == "X" && buttons[0][1].getText() == "X" && buttons[0][2].getText() == "X")
			win = true;
		if(buttons[1][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[1][2].getText() == "X")
			win = true;
		if(buttons[2][0].getText() == "X" && buttons[2][1].getText() == "X" && buttons[2][2].getText() == "X")
			win = true;

		if(buttons[0][0].getText() == "X" && buttons[1][0].getText() == "X" && buttons[2][0].getText() == "X")
			win = true;
		if(buttons[0][1].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][1].getText() == "X")
			win = true;
		if(buttons[0][2].getText() == "X" && buttons[1][2].getText() == "X" && buttons[2][2].getText() == "X")
			win = true;

		if(buttons[0][0].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][2].getText() == "X")
			win = true;
		if(buttons[0][2].getText() == "X" && buttons[1][1].getText() == "X" && buttons[2][0].getText() == "X")
			win = true;
		
		return win;	
	}
}
