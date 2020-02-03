package application;
import java.util.concurrent.ThreadLocalRandom;

import javafx.scene.image.Image;

public class Player {

	    int strength;
		int agility;
		int armor;
		int maxHp;
		int special;
		int level;
		int exp;
		int currentHp;
		int mapX;
		int mapY;
		Image charImg;
		String name;

		public Player(String name) {
	    	
	    	//Use this as a ledger for player.txt 
	    	this.name = name;

	    	setImg(name);
	    	
	   }
		
		public String getName() {
	        return name;
	    }
		
		public void setImg(String name) {
			System.out.println("Im here");
			this.charImg = new Image("application\\tilesets\\" + name + ".png");
		}
		
		public Image getImg() {
			return charImg;
		}

		public int setMapX(int x) {
			this.mapX = x;
			return this.mapX;
		}
		
		public int setMapY(int y) {
			this.mapY = y;
			return this.mapY;
		}
		
		//get map locations
		public int getMapX() {
			return this.mapX;
		}
		
		public int getMapY() {
			return this.mapY;
		}
}

