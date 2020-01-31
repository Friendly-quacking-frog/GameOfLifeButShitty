import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class gameScreen{

  private int num_x, num_y;
  private int width, height;
  private int win_x, win_y;

  JPanel panel = new JPanel();
  JFrame frame = new JFrame("Main screen");
  Timer timer = new Timer();
  Tile colorsetter = new Tile();

  Canvas[][] tiles;

  gameScreen(int num_x, int num_y, int width, int height){
    tiles = new Canvas[num_y][num_x];
    panel.setLayout(new GridLayout(num_y, num_x));
    for(int i=0; i<num_y; i++){
      for(int j=0; j<num_x; j++){
        tiles[i][j] = new Tile();
        tiles[i][j].setSize(width, height);
        tiles[i][j].setBackground(colorsetter.randomColor());
        tiles[i][j].addMouseListener(new MouseAdapter(){
          public void mouseEntered(MouseEvent evt){
            System.out.println("over something");
            Canvas c =(Canvas) evt.getSource();
            c.setBackground(Color.BLACK);
          }

          public void mouseExited(MouseEvent evt){
            Canvas c =(Canvas) evt.getSource();
            c.setBackground(colorsetter.randomColor());
          }
        });
        panel.add(tiles[i][j]);
      }
    }
    this.num_x = num_x;
    this.num_y = num_y;
    this.width = width;
    this.height = height;
    win_x = width*num_x+num_x-1;
    win_y = height*num_y+num_y-1;
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
    System.out.println("Opened game screen");
  }
}