import javax.swing.JFrame;
import java.awt.*;

public class gameScreen extends Canvas{

  private int num_x, num_y;
  private int width, height;
  private int win_x, win_y;

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
  }

}