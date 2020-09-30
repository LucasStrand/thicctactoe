public class Controller {

  public View view;
  public View view2;
  public Player player;
  
  public Controller(){
    this.view= new View(this);
    this.view2= new View(this);
    this.player=new Player(this);
  }


	public void unitClicked(int _r, int _c) {
    player.moveMade(_r,_c);

	}
  
}
