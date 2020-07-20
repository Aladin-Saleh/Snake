import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mouv {
private int sec = 0;
private Game gme;
private Control cntrl;

public Mouv(Game gme,Control cntrl)
{
    this.gme = gme;
    this.cntrl = cntrl;



        final Runnable task = new Runnable() {

            @Override
            public void run() {
                System.out.println(cntrl.getLastCntrl());
                if (gme.getyPos() < 90 || gme.getyPos() > 830 || gme.getxPos() < 90 || gme.getxPos() > 830) {
                    gme.setxPos(0);
                    gme.repaint();
                }
                else
                    {

                    if (cntrl.getLastCntrl() == 0 || cntrl.getLastCntrl() == 1) {
                        gme.setxPos(-29);
                        gme.repaint();
                    } else if (cntrl.getLastCntrl() == 2) {
                        gme.setxPos(29);
                        gme.repaint();
                    } else if (cntrl.getLastCntrl() == 3) {
                        gme.setyPos(29);
                        gme.repaint();
                    } else if (cntrl.getLastCntrl() == 4) {
                        gme.setyPos(-29);
                        gme.repaint();
                    }

                }
            }
        };

        final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(task, 0, 150, TimeUnit.MILLISECONDS);
    }



}
