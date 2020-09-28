
import javax.swing.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class View {
  static int rows;
  static int cols;
  static JButton buttons[][];
  private static Controller controller;

  static public int player = 0;
  // static public char[][] board = new char[3][3];

  static boolean gameover = false;

  /* public static boolean checkifP1win() {
    boolean win = false;

   if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
      win = true;
    if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
      win = true;
    if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
      win = true;

    if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
      win = true;
    if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
      win = true;
    if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
      win = true;

    if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
      win = true;
    if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
      win = true;

    return win;
  }

  public static boolean checkifP2win() {
    boolean win = false;

    if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
      win = true;
    if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
      win = true;
    if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
      win = true;

    if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
      win = true;
    if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
      win = true;
    if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
      win = true;

    if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
      win = true;
    if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
      win = true;

    return win;
  }

  public static void main(String[] args) {

    for (int x = 0; x < 3; x++)
      for (int y = 0; y < 3; y++) {
        board[x][y] = ' ';
      }*/

      public View(Controller _controller){
        this.controller = _controller;
    JFrame frame = new JFrame("TerribleTicTacToe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel myButtonPanel = new JPanel();

    myButtonPanel.setLayout(new GridLayout(3, 3));

    /*
     * JButton button1 = new JButton(" "); button1.setPreferredSize(new
     * Dimension(50, 50)); myButtonPanel.add(button1); JButton button2 = new
     * JButton(" "); myButtonPanel.add(button2); JButton button3 = new JButton(" ");
     * myButtonPanel.add(button3); JButton button4 = new JButton(" ");
     * myButtonPanel.add(button4); JButton button5 = new JButton(" ");
     * myButtonPanel.add(button5); JButton button6 = new JButton(" ");
     * myButtonPanel.add(button6); JButton button7 = new JButton(" ");
     * myButtonPanel.add(button7); JButton button8 = new JButton(" ");
     * myButtonPanel.add(button8); JButton button9 = new JButton(" ");
     * myButtonPanel.add(button9);
     */

    rows = 3;
    cols = 3;

    for (int r = 0; r < rows; r += 1) {
      for (int c = 0; c < cols; c += 1) {
        final int _r = r;
        final int _c = c;
        JButton button = buttons[r][c] = new JButton();
        myButtonPanel.add(button);
        button.setPreferredSize(new Dimension(50, 50));
        button.addActionListener(new ActionListener() {
          @Override
          public void actionPreformed(ActionEvent e) {
            controller.unitClicked(_r, _c);
              }
          });
          myButtonPanel.add(button);
      }
  }

        JPanel myTextPanel = new JPanel();
        myTextPanel.setLayout(new GridLayout(1,1));
        myTextPanel.setPreferredSize(new Dimension(150,50));
        JLabel myLabel = new JLabel("player 1's turn", SwingConstants.CENTER);
        myTextPanel.add(myLabel);
        
        JPanel myMainPanel = new JPanel();
        myMainPanel.setLayout(new BoxLayout(myMainPanel, BoxLayout.Y_AXIS));
        myMainPanel.add(myButtonPanel);
        myMainPanel.add(myTextPanel);
       
        frame.getContentPane().add(myMainPanel);
        
        /*
        button1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		

        	}
        });
        button2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		

        	}
        });
        button3.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {

        	}
        });

        
        button4.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		

        	}
        });
        button5.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        button6.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		

        	}
        });

        
        button7.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		

        	}
        });
        button8.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        button9.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {


        	}
        });*/
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
      }
        
	}

}
