package evm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application
{
	//Inside the main() method, we can launch our application using Application.launch().
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	public void start(Stage primaryStage) 
	{
		try 
		{
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Electronic Voting Management System");
			primaryStage.show();
			//primaryStage.setMaximized(true);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}