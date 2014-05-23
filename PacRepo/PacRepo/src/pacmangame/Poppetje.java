package pacmangame;

public abstract class Poppetje extends GameObject 
{
    public Poppetje(String spritename) 
    {
        super(spritename);
    }
    
    public void bewegen(String richting) 
    {
        Vakje targetVakje = this.vakje.buren.get(richting);
        targetVakje.addObject(this);
        this.vakje.removeObject();
        this.vakje = targetVakje;
        this.vakje.repaint();
        System.out.println(richting);
    }
    
    private void verdwijn() {}
    
}
