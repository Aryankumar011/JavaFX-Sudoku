	
import java.awt.Color;

import javax.swing.text.View;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Lable_09 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);

            // Label label = new Label();
            // label.setText("Aryan PC");
            
            Image image = new Image(getClass().getResourceAsStream("image\\fb.png"));
            
            ImageView view = new ImageView(image);
            Label label = new Label("Aryan Panchal",view);
            root.setCenter(label);
            view.setFitWidth(80);
            view.setFitHeight(80);
            label.setGraphic(view);
            label.setGraphicTextGap(30);
            label.setFont(Font.font("Magneto", FontWeight.BOLD, 40));
            label.setRotate(90);


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

