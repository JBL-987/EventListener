import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) {
        new EventListener(); 
    }
}

class EventListener implements ActionListener, KeyListener {

    EventListener() {
        Frame f = new Frame("EventListener");        
        Button b = new Button("Enter");
        TextField textField = new TextField();
        textField.setBounds(50, 50, 200, 20);
        textField.addKeyListener(this);
        f.add(textField);
        b.setBounds(150, 100, 180, 30);
        b.setBackground(Color.lightGray);
        b.addActionListener(this);
        f.add(b);
        f.setSize(200, 200);
        f.setBackground(Color.RED);
        f.setLayout(null);
        f.setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
    }

    public void keyPressed(KeyEvent e) { 
        int keyCode = e.getKeyCode(); 
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode)); 
    } 
  
    public void keyReleased(KeyEvent e) { 
        int keyCode = e.getKeyCode(); 
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode)); 
    } 

    public void keyTyped(KeyEvent e) {
        char keyTyped = e.getKeyChar();
        System.out.println("Key Typed: " + keyTyped);
    }
}

