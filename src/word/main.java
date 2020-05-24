package word;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	
        Parent root = FXMLLoader.load(getClass().getResource("w.fxml"));
        
        
        primaryStage.setTitle("Algorithm Project One Birzeit University");
        primaryStage.setScene(new Scene(root, 660, 460));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}