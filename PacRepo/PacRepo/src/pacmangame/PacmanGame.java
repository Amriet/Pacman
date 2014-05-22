package pacmangame;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Evert
 */
public class PacmanGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        setLookAndFeel();
        
        final JFrame level = new Level();
        level.setSize(800, 600);
        Thread thread = new Thread() {
            @Override
            public void run() {
               
                    level.setVisible(true);
                    
                    //Thread.sleep(100); 
                    //GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(level);
                    
                    
                
                
            }
        };
        thread.start();
    }
    
    private static void setLookAndFeel()
    {
        try { UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() ); }
        catch (UnsupportedLookAndFeelException e) {}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
    }

}
