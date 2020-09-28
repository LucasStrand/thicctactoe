public class Player {
Move move;
 
public Player(){

}
public Player(Move move) {
  this.move = new Move();
}
static private Player player;

public void moveMade (int _r, int _c){
  move.verifyMove(_r,_c);
}
}
