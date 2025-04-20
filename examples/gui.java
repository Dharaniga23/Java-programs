package examples;
import javax.swing.JOptionPane;


public class gui {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your username");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"Hoo! "+name+" you are "+age+" years old");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");
    }
}
