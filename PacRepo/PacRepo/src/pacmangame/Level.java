package pacmangame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level extends JFrame 
{
    private JPanel menu;
    private Scherm screen;
    private JLabel score, levens;
    private JButton start, herstart, pauze, sluiten;
    
    public Level() 
    {
        initComponents();
    }
    
    private void initComponents() 
    {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setUndecorated(true);
        
        this.start = new JButton("Start");
        this.start.setSize(50, 50);
        this.herstart = new JButton("Herstart");
        this.herstart.setSize(50, 50);
        this.pauze = new JButton("Pauze");
        this.pauze.setSize(50, 50);
        this.sluiten = new JButton("Sluiten");
        this.sluiten.setSize(50, 50);
        
        this.score = new JLabel("Score: 0");
        this.levens = new JLabel("Levens: 3");
        
        this.menu = new JPanel();
        menu.setLayout(new GridLayout(10,1));
        this.menu.setBackground(Color.CYAN);
        
        String content = "WWWWWWWWWWWW\nW  P W     W\nW WW W W W W\nW          W\nW W WWW WWWW\nW W        W\nW  W WW WW W\nWW W W   W W\nW      W   W\nW WWWW WWW W\nW          W\nWWWWWWWWWWWW";
        
        try 
        {
            this.screen = new Scherm(content);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
	}
        
        this.screen.setBackground(Color.BLACK);
        
        this.menu.add(start);
        this.menu.add(pauze);
        this.menu.add(herstart);
        this.menu.add(sluiten);
        this.menu.add(levens);
        this.menu.add(score);
        
        this.add(menu, BorderLayout.EAST);
        this.add(screen, BorderLayout.CENTER);
    }
    
}
