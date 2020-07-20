import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener {
    private Game gameScren;
    private int lastCntrl = 0;//1 = Gauche, 2 = Droite, 3 = Bas, 4 = Haut

    public Control(Game scn)
    {
        this.gameScren = scn;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_LEFT)
            {
                this.lastCntrl = 1;
                System.out.println("Gauche ! ");
            }

            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            {
                this.lastCntrl = 2;
                System.out.println("Droite ! ");
            }

            if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                this.lastCntrl = 4;
                System.out.println("Haut ! ");
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                this.lastCntrl = 3;
                System.out.println("Bas ! ");
            }
        }






    @Override
    public void keyReleased(KeyEvent e) {

    }

    public int getLastCntrl() {
        return lastCntrl;
    }
}
