package pacmangame;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PacmanGame 
{
    public static void main(String[] args) 
    {
        setLookAndFeel();
        
        final JFrame level = new Level();
        level.setSize(800, 600);
        Thread thread = new Thread() 
        {
            @Override
            public void run() 
            {
                    level.setVisible(true);
            }
        };
        
        thread.start();
    }
    
    private static void setLookAndFeel()
    {
        try 
        { 
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() ); 
        }
        
        catch (UnsupportedLookAndFeelException e) {}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
    }

}
