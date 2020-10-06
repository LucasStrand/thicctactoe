import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {

  public View[] view;
  public Player[]player;
  public boolean  multipleGui = false;
  public int windowAmmount = 1;
  
  private RuleEngine ruleEngine;

  public Controller(){
    this.ruleEngine = new RuleEngine(this);
    if(multipleGui){
      windowAmmount = ruleEngine.playerAmmount();
    for(int i = 0; i< windowAmmount; i+=1){
      this.player[i]= new Player(this, i);
      this.view[i]= new View(this ,player[i]);
    }
  }else{view =new View[1];}
  }



	public void unitClicked(int _r, int _c) {
    player[ruleEngine.playersTurn()].moveMade(_r,_c);
	}
  
}
