import java.awt.*;

import javax.swing.*;
import java.util.Random;

public class Main extends Canvas{
  
  static int height = 20, width = 20;
  static int num_x = 20, num_y = 20;

  static int win_x = width*num_x+num_x-1;
  static int win_y = height*num_y+num_y-1;

  static Tile[][] tiles = new Tile[20][20];

  public static void main(String[] args) {
    for(int i=0; i<20; i++){
      for(int j=0; j<20; j++){
        tiles[i][j] = new Tile(width, height);
      }
    }
    startScreen start = new startScreen();
    System.out.println("Hello world!");
  }

  // public void paint(Graphics g){
  //   int count_i = 0;
  //   int count_j = 0;
  //   for(int i=0; i<win_y; i+=height){
  //     for(int j=0; j<win_x; j+=width){
  //       tiles[count_i][count_j].setColor();
  //       g.setColor(tiles[count_i][count_j].getColor());
  //       g.fillRect(i, j, i+height, j+width);
  //       g.setColor(Color.BLACK);
  //       j++;
  //       g.drawLine(0, j+height, win_x, j+height);
  //       count_j++;
  //     }
  //     count_j=0;
  //     g.setColor(Color.BLACK);
  //     i++;
  //     g.drawLine(i+width, 0, i+width, win_y);
  //     count_i++;
  //   }
  // }

}