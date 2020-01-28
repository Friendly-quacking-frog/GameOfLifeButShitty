import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class startScreen {

  JPanel panel = new JPanel();
  JFrame frame = new JFrame();
  JTextField[] label = new JTextField[4];
  PlainDocument[] doc = new PlainDocument[4];
  JButton button = new JButton("Continue");
  startScreen() {
    panel.setLayout(new GridLayout(3, 2));
    for (int i = 0; i < 4; i++) {
      label[i] = new JTextField(5);
      panel.add(label[i]);
      doc[i] = (PlainDocument) label[i].getDocument();
      //doc[i].setDocumentFilter(new MyIntFilter());
    }
    panel.add(button);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
          for (int i = 0; i < 4; i++) {
            System.out.println(label[i].getText());
          }
          System.out.println("-----------");
      }
    });
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
  }

  void addElements() {

  }
}