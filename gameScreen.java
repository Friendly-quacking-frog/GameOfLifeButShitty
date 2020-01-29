import javax.swing.JFrame;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class gameScreen{

  class Screen extends Canvas{
    public void paint(Graphics g){
      int count_i = 0;
      int count_j = 0;
      for(int i=0; i<win_y; i+=height){
        for(int j=0; j<win_x; j+=width){
          tiles[count_i][count_j].setColor();
          g.setColor(tiles[count_i][count_j].getColor());
          g.fillRect(i, j, i+height, j+width);
          g.setColor(Color.BLACK);
          j++;
          g.drawLine(0, j+height, win_x, j+height);
          count_j++;
        }
        count_j=0;
        g.setColor(Color.BLACK);
        i++;
        g.drawLine(i+width, 0, i+width, win_y);
        count_i++;
      }
    }
  }

  private int num_x, num_y;
  private int width, height;
  private int win_x, win_y;

  JFrame frame = new JFrame("Main screen");
  Canvas canvas = new Screen();
  Timer timer = new Timer();

  static Tile[][] tiles = new Tile[20][20];

  gameScreen(int num_x, int num_y, int width, int height){
    this.num_x = num_x;
    this.num_y = num_y;
    this.width = width;
    this.height = height;
    win_x = width*num_x+num_x-1;
    win_y = height*num_y+num_y-1;
    for(int i=0; i<20; i++){
      for(int j=0; j<20; j++){
        tiles[i][j] = new Tile(width, height);
      }
    }
    canvas.setSize(win_x, win_y);
    timer.schedule(new TimerTask(){
      public void run(){
        canvas.repaint();
      }
    }, 1000, 1000);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
    System.out.println("Opened game screen");
  }
}