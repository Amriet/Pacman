package pacmangame;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
/**
 *
 * @author Evert
 */
public class Scherm extends JPanel implements KeyListener {

    private Vakje[][] vakjes;
    private Pacman pacman;
    
    GameLevel view;
    
    public Scherm(String level) throws Exception {
    	view = new GameLevel(level);
        initComponents();
        
    }
    
    private void initComponents() {
    	    
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
        
        
//        for(int i=0; i<10; i++) {
//            for(int j=0; j<10; j++) {
//                vakjes[i][j] = new Vakje();
//                this.add(vakjes[i][j]);
//            }
//        }
//        for(int i=0; i<view.getWidth(); i++) {
//            for(int j=0; j<view.getHeight(); j++) {
//                if(i != 0) { vakjes[i][j].buren.put("NOORD", vakjes[i-1][j]); }
//                if(j < 9) { vakjes[i][j].buren.put("OOST", vakjes[i][j+1]); }
//                if(i < 9) { vakjes[i][j].buren.put("ZUID", vakjes[i+1][j]); }
//                if(j != 0) { vakjes[i][j].buren.put("WEST", vakjes[i][j-1]); }
//            }
//        }
        
        
        requestFocus();
        repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {}
    
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released");
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}
    
}
