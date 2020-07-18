import javax.swing.*;
import java.awt.*;

public class Game extends JComponent {

    private int[][] game = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    private int xPos = 450;
    private int yPos = 450;





    @Override
    protected void paintComponent(Graphics pinceau) {

        Graphics secondPinceau = pinceau.create();

        //Zone de jeu
        secondPinceau.setColor(Color.GREEN);
        secondPinceau.fillRect(90,90,780,780);

        this.game[6][6] = 8;
        for (int x = 6; x < 9; ++x){
            this.game[x][6] = 8;
        }

        for (int i = 0; i < 13; ++i)
        {
            for (int j = 0; j < 13; ++j)
            {
                System.out.print(this.game[i][j]);
                System.out.print(" - ");
            }
            System.out.println(" ");
        }


        secondPinceau.setColor(Color.RED);
        secondPinceau.fillRect(xPos,yPos,60,60);





    }


    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }


    public void setxPos(int xPos) {
        this.xPos += xPos;
    }

    public void setyPos(int yPos) {
        this.yPos += yPos;
    }
}
