import javax.swing.JButton;

public class Move {
	public Controller controller;
	static boolean gameover = false;
	public RuleEngine ruleEngine;

	public Move(Controller _controller) {
		this.controller = _controller;
		this.ruleEngine = new RuleEngine(controller);

	}

	public void verifyMove(int _r,int _c, int playersTurn){
		JButton button = controller.view[0].buttons[_r][_c];
    
		if(button.getText() != " " || gameover) return;
		controller.changeText(_r, _c,ruleEngine.getPlayerSymbol(playersTurn)
	}
}
