	
import javax.swing.text.Element;
// import javax.swing.text.html.ImageView;

import javafx.scene.image.ImageView;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class Button_10 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
            Image foo = new Image("image\\fb.png");
            ImageView view = new ImageView(foo);
            view.setFitHeight(40);
            view.setFitWidth(40);
            Button button = new Button("Save",view);
            root.setCenter(button);
            button.setTextFill(Color.RED);
            // Font font = new Font("Arial",);
            
             button.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 40));
			primaryStage.show();
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

