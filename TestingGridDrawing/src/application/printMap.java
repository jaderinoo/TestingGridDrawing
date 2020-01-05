package application;
import java.awt.Graphics;
import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;

public class printMap {
	   private static final int RECT_X = 20;
	   private static final int RECT_Y = RECT_X;
	   private static final int RECT_WIDTH = 100;
	   private static final int RECT_HEIGHT = RECT_WIDTH;
	   
	   public static void printMap(GridSpace[][] map, int rows, int cols, ArrayList<Player> playerList,ArrayList<Mob1> mobList) {
		      Rectangle rectangle = new Rectangle();  
		      
		      //Setting the properties of the rectangle 
		      rectangle.setX(RECT_X ); 
		      rectangle.setY(RECT_Y); 
		      rectangle.setWidth(16); 
		      rectangle.setHeight(16);      
		      
		      //Creating a Group object  
		      Group root = new Group(rectangle); 
		      
		      //Creating a scene object 
		      Scene scene = new Scene(root, 600, 300);  
		      
		      //Setting title to the Stage 
		      Main.window.setTitle("Drawing a Rectangle"); 
		         
		      //Adding scene to the stage 
		      Main.window.setScene(scene); 
		      
		      Main.window.show(); 
		      
				   //Print map
				for (int y=0; y < rows; y++) {
				    for (int x=0; x < cols; x++) {
				        System.out.print("[");
				        for(int i = 0; i != playerList.size(); i++) {
				        	if(playerList.get(i).getMapX() == x && playerList.get(i).getMapY() == y) {
				        		System.out.print(playerList.get(i).getImage());
				        	}
				        }
				        for(int i = 0; i != mobList.size(); i++) {
				        	if(mobList.get(i).getMapX() == x && mobList.get(i).getMapY() == y) {
				        		System.out.print(mobList.get(i).getType());
				        	}
				        	
				        }
				        System.out.print("]");
				    }
					System.out.println();
				}
	}
}
