package Game;
import java.awt.Dimension;
import  javax.swing.*;
public class Tetris_first extends JDialog {
  private JTextField tetristext;
  private JPanel test01;
  private JLabel Input;

  public Tetris_first(JFrame parent) {
    super(parent);
    setTitle("JWelcome to Brailletetris !");
    setContentPane(test01);
    tetristext.setToolTipText("hallo");
    setMinimumSize(new Dimension(450, 474));
    setModal(true);
    setLocationRelativeTo(parent);
    setVisible(true);
  }

  public static void main(String[] args) {
    Tetris_first myForm = new Tetris_first(null);

  }

}
