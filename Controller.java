public class Controller {

  public View view;
  public Player player;
  
  public Controller(){
    this.view= new View(this);
  }

	public void unitClicked(int _r, int _c) {
    player.moveMade(_r,_c);

	}
  
}
