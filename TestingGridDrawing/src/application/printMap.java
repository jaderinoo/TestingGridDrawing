package application;
import java.awt.Graphics;
import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class printMap {
	   private static final int RECT_X = 20;
	   private static final int RECT_Y = RECT_X;
	   private static final int RECT_WIDTH = 100;
	   private static final int RECT_HEIGHT = RECT_WIDTH;
	   
	   public static void printMap(GridSpace[][] map, int rows, int cols, ArrayList<Player> playerList,ArrayList<Mob1> mobList) {
	        AnchorPane root = new AnchorPane();
	        Scene scene = new Scene(root);
	        Main.window.setScene(scene);

	        scene.setRoot(root);
		      
		      //Setting title to the Stage 
		      Main.window.setTitle("Drawing a Rectangle"); 
		      
		      int horizontal = 20, vertical = 20;
		      Rectangle rect = null;
		      
				   //Print map
				for (int y=0; y < rows; y++) {
				    for (int x=0; x < cols; x++) {

				    	if(map[x][y].getType() == 'n') {
				    		rect = new Rectangle(horizontal * y, vertical * x, horizontal, vertical);
				    		rect.setStroke(Color.WHITE);
				    		root.getChildren().add(rect);
				    	}else if(map[x][y].getType() == 'p' ) {
			                rect = new Rectangle(horizontal * y, vertical * x, horizontal, vertical);
			                rect.setStroke(Color.BLUE);
			                root.getChildren().add(rect);
			        	}else if(map[x][y].getType() == 'h') {
			                rect = new Rectangle(horizontal * y, vertical * x, horizontal, vertical);
			                rect.setStroke(Color.RED);
			                root.getChildren().add(rect);
				        }
				    }
					System.out.println();
				}

		        scene.setRoot(root);
			      
			      //Setting title to the Stage 
			      Main.window.setTitle("Drawing a Rectangle"); 
			         
			      //Adding scene to the stage 
			      Main.window.setScene(scene); 
			      
			      Main.window.show(); 
	}
}
