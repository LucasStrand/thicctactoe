public class Player {
  Move move;
  Controller controller;
  private int playerID;
  
  public Player(Controller _controller, int playerID) {
    this.playerID = playerID;
    this.controller = _controller;
    this.move = new Move(controller);

  }

  public void moveMade(int _r, int _c) {
    move.verifyMove(_r, _c);
  }
}
