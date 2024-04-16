	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Evnt_10 extends Application {
	@Override
	public void start(Stage stage) {
       // StackPane root = new StackPane();
        
    Group root = new Group();    
    Scene scene = new Scene(root,600,600);
    Button Bt = new Button("This Is Aryan PC");
    root.getChildren().add( Bt);

    
    stage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

