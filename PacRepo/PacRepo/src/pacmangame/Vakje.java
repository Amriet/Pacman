package pacmangame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class Vakje extends JPanel 
{
    public GameObject object;
    public Map<String, Vakje> buren;
    
    public Vakje() 
    {
        initComponents();
    }
    
    public void addObject(GameObject object) 
    {
        this.object = object;
    }
    
    public GameObject getObject() 
    {
        return this.object;
    }
    
    public void removeObject() 
    {
        this.object = null;
    }
    
    private void initComponents() 
    
    {
        this.buren = new HashMap<String, Vakje>();
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
        try 
        { 
            g.drawImage(object.getSprite(), 5, 5, null); 
        }
        
        catch(NullPointerException e) {}
    }
}
