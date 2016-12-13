package model;

public class LevelParser {
	
	public static Board createBoard(boolean[][] selectedTiles) {
		// every tile is enabled initially
		Board b = new Board();
		// now disable some tiles
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(!selectedTiles[i][j]) {
					b.disableTile(i, j);
				}
			}
		}
		// link the tiles
		b.linkTiles();
		return	b;
	}

}
