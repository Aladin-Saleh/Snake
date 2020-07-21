import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mouv {
private int sec = 0;
private Game gme;
private Control cntrl;
private int buffCntrl;

public Mouv(Game gme,Control cntrl)
{
    this.gme = gme;
    this.cntrl = cntrl;




        final Runnable task = new Runnable() {

            @Override
            public void run() {
                System.out.println(cntrl.getLastCntrl());
                System.out.println("buff"+buffCntrl);
                if (gme.getyPos() < 90 || gme.getyPos() > 840 || gme.getxPos() < 90 || gme.getxPos() > 840) {
                    gme.setxPos(0);
                    gme.repaint();
                }
                else
                    {

                    if (cntrl.getLastCntrl() == 0 || cntrl.getLastCntrl() == 1) {
                        buffCntrl = cntrl.getLastCntrl();

                       gme.setxHeadPos(-28);
                        gme.repaint();
                        gme.setxPos(-28);

                        if (gme.getxPos()-gme.getxHeadPos() == 30 )
                        {
                            gme.setxPos(+28);

                            System.out.println("DECALAGE ! ");
                            gme.setxPos(0);
                            gme.repaint();
                        }
                        else
                        {
                            gme.setxPos(-28);
                            gme.repaint();

                        }

                    } else if (cntrl.getLastCntrl() == 2) {
                        buffCntrl = cntrl.getLastCntrl();
                        gme.setxPos(28);
                        gme.repaint();
                        gme.setxHeadPos(28);
                        if (gme.getxPos()-gme.getxHeadPos() == 30 )
                        {
                            gme.setxHeadPos(-28);

                            System.out.println("DECALAGE ! ");
                            gme.setxPos(0);
                            gme.repaint();
                        }
                        else
                        {
                            gme.setxHeadPos(28);
                            gme.repaint();

                        }
                    } else if (cntrl.getLastCntrl() == 3) {
                        if (buffCntrl == 1 || buffCntrl == 0 )
                        {
                            gme.setxPos(-29);
                            gme.repaint();
                            buffCntrl = 5;
                        }
                        else if (buffCntrl == 2  )
                        {
                            gme.setxHeadPos(29);
                            gme.repaint();
                            buffCntrl = 5;
                        }
                        gme.setyHeadPos(28);
                        gme.repaint();
                        gme.setyPos(28);
                        if (gme.getyPos()-gme.getyHeadPos() == 0 )
                        {
                            gme.setyPos(+28);

                            System.out.println("DECALAGE ! ");
                            gme.setyPos(0);
                            gme.repaint();
                        }
                        else
                        {
                            gme.setyPos(-28);
                            gme.repaint();

                        }
                    } else if (cntrl.getLastCntrl() == 4) {
                        gme.setyHeadPos(-28);
                        gme.repaint();
                        gme.setyPos(-28);
                        gme.repaint();
                    }

                }
            }
        };

        final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(task, 0, 100, TimeUnit.MILLISECONDS);
    }



}
