public class Player {
  Move move;
  static public int player = 0;

  public Player() {

  }

  public Player(Move move) {
    this.move = new Move();
  }

  public void moveMade(int _r, int _c) {
    move.verifyMove(_r, _c);
  }
}
