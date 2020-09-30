public class Player {
  Move move;
  Controller controller;
  static public int player = 0;
  
  public Player(Controller _controller) {
    this.controller = _controller;
    this.move = new Move(controller);
  }

  public void moveMade(int _r, int _c) {
    move.verifyMove(_r, _c);
  }
}
