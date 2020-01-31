import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class startScreen {

  JPanel panel = new JPanel();
  JFrame frame = new JFrame();
  JTextField[] label = new JTextField[4];

  String[] text = new String[4];

  int num_x, num_y;
  int width, height;

  JButton button = new JButton("Continue");

  startScreen() {

    panel.setLayout(new GridLayout(3, 2));
    for (int i = 0; i < 4; i++) {
      label[i] = new JTextField(5);
      panel.add(label[i]);
    }
    panel.add(button);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        for(int i=0; i<4; i++){
          if(label[i].getText().equals("")){
            label[i].setText("1");
          }
        }
        num_x = Integer.parseInt(label[0].getText());
        num_y = Integer.parseInt(label[1].getText());
        width = Integer.parseInt(label[2].getText());
        height = Integer.parseInt(label[3].getText());
        frame.dispose();
        gameScreen game = new gameScreen(num_x, num_y, width, height);
      }
    });
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
  }

  public gameScreen end(){
    frame.dispose();
    return new gameScreen(num_x, num_y, width, height);
  }

}