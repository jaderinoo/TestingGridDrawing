package application;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class printMap {
	static AnchorPane root = new AnchorPane();
	   public static void mapPrinter(GridSpace[][] map, int rows, int cols) {
	        
	        Scene scene = new Scene(root, Main.window.getWidth(), Main.window.getHeight());
	        double horizontalSetter = (Main.window.getWidth()/cols);
	        double verticalSetter = (Main.window.getHeight()/rows);
	        
	        double horizontal = 32*(horizontalSetter/32), vertical = 32*(verticalSetter/32);
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
	   
	   static int seconds = 0;
	   static Timer timer = new Timer();
	   public static void spriteLayer(GridSpace[][] map, int rows, int cols) throws InterruptedException {

		   Pane spriteLayer = new Pane(); 
	       double horizontalSetter = (Main.window.getWidth()/cols);
	       double verticalSetter = (Main.window.getHeight()/rows);
	       Rectangle sprite = null;
	       double horizontal = 32*(horizontalSetter/32), vertical = 32*(verticalSetter/32);
	       
	       Image img = new Image("application\\tilesets\\u.png");
	       for (int y=0; y < rows; y++) {
			    for (int x=0; x < cols; x++) {
			    	int i = 0;
			    	if(x == mapInitialization.playerListCurrent.get(i).getMapX() && y == mapInitialization.playerListCurrent.get(i).getMapY()) {
			    		sprite = new Rectangle(horizontal * y, vertical * x, horizontal, vertical);
			    		sprite.setFill(new ImagePattern(img));
			    		spriteLayer.getChildren().add(sprite);
			    	}
			    }
	       }

		   root.getChildren().add(spriteLayer);
	   }
	   
	   public static void moveSprite() {
		   TimerTask task;
		   
		   task = new TimerTask() {
		        private final int MAX_SECONDS = 3;

		        @Override
		        public void run() { 
		            if (seconds < MAX_SECONDS) {
		                System.out.println("Seconds = " + seconds);
		                seconds++;
		                //x += 10;
		                //y += 10;
		                //rect1.relocate(x,y);
		            } else {
		                // stop the timer
		                cancel();
		            }
		        }
		    };
		    timer.schedule(task, 0, 100);
	   }
}
