import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener {
    private Game gameScren;

    public Control(Game scn)
    {
        this.gameScren = scn;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (gameScren.getyPos() == 810 || gameScren.getyPos() == 90 || gameScren.getxPos() == 810 || gameScren.getxPos() == 90)
        {
            gameScren.setyPos(0);
            gameScren.repaint();
            System.out.println("Bord ! ");
        }else
        {
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
            {
                gameScren.setxPos(-60);
                gameScren.repaint();
                System.out.println("Gauche ! ");
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            {
                gameScren.setxPos(60);
                gameScren.repaint();
                System.out.println("Droite ! ");
            }

            if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                gameScren.setyPos(-60);
                gameScren.repaint();
                System.out.println("Haut ! ");
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                gameScren.setyPos(60);
                gameScren.repaint();
                System.out.println("Bas ! ");
            }
        }




    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
