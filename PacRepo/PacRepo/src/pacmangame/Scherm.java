package pacmangame;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Scherm extends JPanel implements KeyListener 
{

    private Vakje[][] vakjes;
    private Pacman pacman;
    
    GameLevel view;
    
    public Scherm(String level) throws Exception 
    {
    	view = new GameLevel(level);
        initComponents();
        
    }
    
    private void initComponents() 
    {
    	    
    	this.setLayout(new GridLayout(view.getHeight(), view.getWidth()));
    	this.vakjes = new Vakje[view.getHeight()][view.getWidth()];
    	
    	for (Tile t : view.getTiles())
    	{
    		vakjes[t.getY()][t.getX()] = new Vakje();
			this.add(vakjes[t.getY()][t.getX()]);
			
    		if (t instanceof TileWall)
    		{
    			vakjes[t.getY()][t.getX()].addObject(new Muur());
    		}
    		
			
    	}
    	
    	for (Entity e : view.getEntities())
    	{
    		if (e instanceof EntityPacman)
    		{
    			this.pacman = new Pacman("pacman.png");
    			vakjes[e.y][e.x].addObject(pacman);
    		}
    	}

        addKeyListener(this);
        
        requestFocus();
        repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {}
    
    @Override
    public void keyReleased(KeyEvent e) 
    {
        System.out.println("Released1");
    }
    
    @Override
    public void keyTyped(KeyEvent e) {} 
}
