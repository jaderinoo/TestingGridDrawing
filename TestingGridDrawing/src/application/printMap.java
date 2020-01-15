package application;
import java.awt.Graphics;
import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class printMap {
	   private static final int RECT_X = 20;
	   private static final int RECT_Y = RECT_X;
	   private static final int RECT_WIDTH = 100;
	   private static final int RECT_HEIGHT = RECT_WIDTH;
	   
	   public static void mapPrinter(GridSpace[][] map, int rows, int cols, ArrayList<Player> playerList,ArrayList<Mob1> mobList) {
	        AnchorPane root = new AnchorPane();
	        Scene scene = new Scene(root);

	        int horizontal = 32, vertical = 32;
	        Rectangle rect = null;
	      
			//Print map
			for (int y=0; y < rows; y++) {
			    for (int x=0; x < cols; x++) {
	                rect = new Rectangle(horizontal * y, vertical * x, horizontal, vertical);
	                rect.setStroke(new Color(1f,1f,1f,.05f));
	                System.out.println("application\\tilesets\\" + map[x][y].getType() + ".png");
		    		Image img = new Image("application\\tilesets\\" + map[x][y].getType() + ".png");
		    		rect.setFill(new ImagePattern(img));
	                root.getChildren().add(rect);
			    }
			    System.out.println();
			}
			//Set the scene
	        Main.window.setScene(scene);
	}
}
