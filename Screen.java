import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    public Screen()
    {
        this.setSize(1000,1000);
        this.setLocation(0,0);
        this.setTitle("Snake JAVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);




        Game gme = new Game();
        this.add(gme);


        this.addKeyListener(new Control(gme));





        this.setVisible(true);
    }




}
