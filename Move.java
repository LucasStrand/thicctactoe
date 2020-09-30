import javax.swing.JButton;

public class Move {
  // Player player;
  public Controller controller;
  static boolean gameover = false;
  
  public Move(){
    this.controller = controller;
    // this.player= new Player(this);
  }
  public void verifyMove(int _r,int _c){
    JButton button = controller.view.buttons[_r][_c];
    
    if(button.getText() != " " || gameover) return;
        		if(Player.player == 0) {
               		button.setText("O");
               		/*if(checkifP1win()) {
               			controller.view.myLabel.setText("player 1 won!");
               			gameover = true;
               			return;
               		}*/
        		 	Player.player = 1;
            		controller.view.myLabel.setText("player 2's turn");
        		}
        		else {
               		button.setText("X");
               		/*if(checkifP2win()) {
               			controller.view.myLabel.setText("player 2 won!");
               			gameover = true;
               			return;
               		}*/
        			Player.player = 0;
            		controller.view.myLabel.setText("player 1's turn");
        		}
  }
}
