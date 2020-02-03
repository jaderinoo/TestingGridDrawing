package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	static ArrayList<Player> playerList = new ArrayList<Player>();
	
	public static Stage window;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			window = primaryStage;
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
			
	    	
	    	playerList.add(new Player("MainCharacter"));
	    	playerList.add(new Player("Karl"));
	    	
	    	
	    	mapInitialization.init(playerList, "test");
	    	
	    	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		launch(args);

    	
    }
    
	public static void addPlayerLocation(int x, int y, int occupantInt) {
		playerList.get(occupantInt).setMapX(x);
		playerList.get(occupantInt).setMapY(y);
	}
	
	
	
}
