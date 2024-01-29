import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1 create a frame
        JFrame frame = new JFrame();
        frame.setSize(200,500);
        // 2 create a panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,255,0));
        panel.setBackground(Color.BLUE);
        //3 create components
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("Hello nobody!");
        JTextField textField = new JTextField(10);
        //4 add components to the panel
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.LINE_START);
        panel.add(button, BorderLayout.CENTER);
        panel.add(textField, BorderLayout.LINE_END);
        // add image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        panel.add(picLabel);
        // adding choice
        Choice chooseSomething = new Choice();
        chooseSomething.add("Banana");
        chooseSomething.add("Potato");
//        JComboBox chooseSomething = new JComboBox();
//        chooseSomething.addItem("Banana");
//        chooseSomething.addItem("Potato");
        panel.add(chooseSomething);
        //5 add the panel to the frame
        frame.add(panel);
        //6 make frame visible
        frame.setVisible(true);
    }
}