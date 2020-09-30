import javax.swing.JButton;

public class Move {
	public Controller controller;
	static boolean gameover = false;
	public RuleEngine ruleEngine;

	public Move(Controller _controller) {
		this.controller = _controller;
		this.ruleEngine = new RuleEngine(controller);

	}

	public void verifyMove(int _r,int _c){
		JButton button = controller.view.buttons[_r][_c];
		JButton buttonTwo = new JButton();
		if(controller.twoGui == true){
			buttonTwo = controller.view2.buttons[_r][_c];
		}
    
    if(button.getText() != " " || gameover) return;
        		if(Player.player == 0) {
									 button.setText("O");
									if(controller.twoGui == true)
									{
									 buttonTwo.setText("O");
									}
									//  System.out.println("test");
               		if(ruleEngine.checkifP1win()) {
										 controller.view.myLabel.setText("player 1 won!");
										 if(controller.twoGui == true)
										 {
										 controller.view2.myLabel.setText("player 1 won!");
										}
               			gameover = true;
               			return;
               		}
        		 	Player.player = 1;
								controller.view.myLabel.setText("player 2's turn");
								if(controller.twoGui == true){
								controller.view2.myLabel.setText("player 2's turn");
								}
        		}
        		else {
									 button.setText("X");
									 if(controller.twoGui == true){
									 buttonTwo.setText("X");
									 }
               		if(ruleEngine.checkifP2win()) {
										 controller.view.myLabel.setText("player 2 won!");
										 if(controller.twoGui == true){
											 controller.view2.myLabel.setText("player 2's won!");
										 }
               			gameover = true;
               			return;
               		}
        			Player.player = 0;
								controller.view.myLabel.setText("player 1's turn");
								if(controller.twoGui == true){
									controller.view2.myLabel.setText("player 2's turn");
								}
						}
  }
}
