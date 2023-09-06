package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		/*
		Label label = new Label();
		label.setText("Esta é uma label");
		
		FlowPane root = new FlowPane();
		root.getChildren().add(label);
		
		Scene scene = new Scene(root, 600, 500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		*/
		
		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
