package pacmangame;

import java.awt.Image;
import javax.swing.ImageIcon;

public abstract class GameObject
{ 
    private Image sprite;
    public Vakje vakje;
    
    public GameObject(String spritename) 
    {
        setSprite(spritename);
    }
    
    public void setSprite(String spritename) 
    {
        this.sprite = new ImageIcon(this.getClass().getResource("/assets/" + spritename)).getImage();
    }
    
    public Image getSprite() 
    {
        return this.sprite;
    }
    
    private void verdwijn() {}
}
