
import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

public class View {
  int rows = 3;
  int cols = 3;
  JButton buttons[][] = new JButton[rows][cols];
  private static Controller controller;

  static public int player = 0;

  static boolean gameover = false;

  public View(Controller _controller) {
    this.controller = _controller;
    JFrame frame = new JFrame("TerribleTicTacToe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel myButtonPanel = new JPanel();

    myButtonPanel.setLayout(new GridLayout(3, 3));

    for (int r = 0; r < rows; r += 1) {
      for (int c = 0; c < cols; c += 1) {
        final int _r = r;
        final int _c = c;
        JButton button = buttons[r][c] = new JButton();
        myButtonPanel.add(button);
        button.setPreferredSize(new Dimension(50, 50));
        button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            controller.unitClicked(_r, _c);
          }
        });
        myButtonPanel.add(button);
      }
    }

    JPanel myTextPanel = new JPanel();
    myTextPanel.setLayout(new GridLayout(1, 1));
    myTextPanel.setPreferredSize(new Dimension(150, 50));
    JLabel myLabel = new JLabel("player 1's turn", SwingConstants.CENTER);
    myTextPanel.add(myLabel);

    JPanel myMainPanel = new JPanel();
    myMainPanel.setLayout(new BoxLayout(myMainPanel, BoxLayout.Y_AXIS));
    myMainPanel.add(myButtonPanel);
    myMainPanel.add(myTextPanel);

    frame.getContentPane().add(myMainPanel);

    frame.pack();
    frame.setVisible(true);
  }

}
