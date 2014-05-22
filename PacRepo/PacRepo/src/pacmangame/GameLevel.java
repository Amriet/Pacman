package pacmangame;

import java.util.ArrayList;

public class GameLevel {

	private int width = 0;
	private int height = 0;
	
	private ArrayList<Entity> entities;
	private ArrayList<Tile> tiles;
	
	public GameLevel(String levelConfig) throws Exception
	{
		//EXAMPLE LEVEL FORMATTING
		//WWWWWW
		//W    W
		//WWWWWW
		
		System.out.println("Loading level:");
		System.out.println(levelConfig);
		
		if (levelConfig == null)
			return;
		
		entities = new ArrayList();
		tiles = new ArrayList();
		
		int currentY = 0;
		
		boolean hasPacman = false;
		
		String[] lines = levelConfig.split("\n");
				
		for (int y = 0; y < lines.length ; y++)
		{
			String line = lines[y];
			//System.out.println(line);
			
			if (width == 0)
				width = line.length();
			else if (width != line.length())
				throw new Exception("Level line length is not consistent.");
			
			for (int x = 0; x < line.length(); x++)
			{
				if (String.valueOf(line.charAt(x)).equals(" "))
				{
					tiles.add(new TileAir(x, currentY));
				} else if (String.valueOf(line.charAt(x)).equals("W"))
				{
					tiles.add(new TileWall(x, currentY));
					System.out.println("W at " + x + " " + currentY);
				} else if (String.valueOf(line.charAt(x)).equals("P"))
				{
					if (hasPacman)
						throw new Exception("Pacman has multiple locations.");
					else
						hasPacman = true;
					
					tiles.add(new TileAir(x, currentY));
					entities.add(new EntityPacman(x, currentY));
				} else
				{
					throw new Exception("Unknown character '" + String.valueOf(line.charAt(x)) + "' used in level makeup.");
				}
			}
			
		
			height++;
			currentY++;
		}
		
		System.out.println("Load successful.");
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public void setTiles(ArrayList<Tile> tiles) {
		this.tiles = tiles;
	}
	
}
