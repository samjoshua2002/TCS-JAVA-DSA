package youtube;

import javax.swing.JOptionPane;

public class panel {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("how are you");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age =Integer.parseInt(JOptionPane.showInputDialog("enter your age")); // use wrapper class for interger it only support string
        JOptionPane.showMessageDialog(null,"You are "+ age+" Years old");
        double height =Double.parseDouble(JOptionPane.showInputDialog("enter your height")); // use wrapper class for double it only support string
        JOptionPane.showMessageDialog(null,"You are "+ height+" cms");
    }
    
}
