import java.security.SecureRandom;
import java.awt.Color;

public class Tile{

  private int width;
  private int height;
  private Color color;

  private SecureRandom random = new SecureRandom();

  private Color randomColor(){
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

  Tile(int width, int height){
    this.width = width;
    this.height = height;
    color = Color.gray;
  }

}