package model;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJsonLevel {

	public static Level parseLevel(int lvl) {
		Level level = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			switch(lvl%3) {
				case 1: 
					level = mapper.readValue(new File("level" + lvl + ".json"), Puzzle.class);
					break;
				case 2: 
					level = mapper.readValue(new File("level" + lvl + ".json"), Lightning.class);
					break;
				case 0: 
					level = mapper.readValue(new File("level" + lvl + ".json"), Theme.class);
					break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return level;
	}

}
