package pacmangame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman extends Poppetje implements KeyListener 
{
    private int levens, score;
    private boolean isOnverslaanbaar;
    
    public Pacman(String spritename) 
    {
        super(spritename);
        initComponents();
    }
    
    private void initComponents() 
    {
        this.levens = 3;
        this.score = 0;
        this.isOnverslaanbaar = false;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {}
    
    @Override
    public void keyReleased(KeyEvent e) 
    {
        
        switch	(e.getKeyCode())
        {	
            case KeyEvent.VK_KP_UP: bewegen("NOORD"); break;
            case KeyEvent.VK_KP_RIGHT: bewegen("OOST"); break;
            case KeyEvent.VK_KP_DOWN: bewegen("ZUID"); break;
            case KeyEvent.VK_KP_LEFT: bewegen("WEST"); break;
	}
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
    
}
