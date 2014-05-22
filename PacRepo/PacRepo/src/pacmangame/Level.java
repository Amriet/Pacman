package pacmangame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
/**
 *
 * @author Evert
 */
public class Level extends JFrame {
    
    private JPanel menu;
    private Scherm screen;
    private JLabel score, levens;
    private JButton start, herstart, pauze, sluiten;
    
    public Level() {
        initComponents();
    }
    
    private void initComponents() {
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
        this.menu.setBackground(Color.CYAN);
        
        String content = "WWWWWW\nW    W\nW  P W\nW    W\nWWWWWW";
        
        try {
        	this.screen = new Scherm(content);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
