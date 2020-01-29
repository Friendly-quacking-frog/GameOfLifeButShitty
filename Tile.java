import java.security.SecureRandom;
import java.awt.*;

public class Tile extends Canvas{

  public void paint(Graphics g){

  }

  private int width;
  private int height;
  private Color color;

  private SecureRandom random = new SecureRandom();

  public Color randomColor(){
    int R = random.nextInt(256);
    int G = random.nextInt(256);
    int B = random.nextInt(256);
    return new Color(R, G, B);
  }

  public int getHeight(){
    return height;
  }

  public int getWidth(){
    return width;
  }

  public void setColor(){
    color = randomColor();
  }

  public Color getColor(){
    return color;
  }

  Tile(){
  }

}