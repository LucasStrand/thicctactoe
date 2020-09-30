import java.util.ResourceBundle.Control;

import javax.swing.JButton;

public class RuleEngine {
	Controller controller;
	// static JButton buttons[][] = new JButton[3][3];

	public RuleEngine(Controller _controller) {
		this.controller = _controller;
	}

	public boolean checkifP1win() {
		// JButton button = controller.view.buttons[_r][_c];
		JButton buttons[][] = controller.view.buttons;
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

	public boolean checkifP2win() {
		boolean win = false;
		JButton buttons[][] = controller.view.buttons;
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
