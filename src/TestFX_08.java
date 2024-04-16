import java.awt.Font;

// import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
// import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
// import javafx.scene.text.Font.*;

/* 
 * Java Text Class
 * it is a child class of javafx.scene.shape.Shape Class.
 * Indirect Child of node class
 * 
 * Method
 * set Fill   // For Color
 * Ser Stroke // Boarder
 * Set Stroke Widdth
 * 
 * Apply CSS
 * 
 * Test Font 
 * Text Alignent
 * Apply Effects
 */

public class TestFX_08 extends Application {

	private Text text;
  private Font font;


    @Override
	public void start(Stage stage) {
		try {

            BorderPane root = new BorderPane();
        
            Scene Sc = new Scene(root,600,600);
            stage.setScene(Sc);
            
            text = new Text("Panchal Aryankumar Kamleshbhai");
          //  text.setFont(Font.font("Magneto",FontWeight.BOLD,FontPosture.ITALIC,36));
           text.setFont(javafx.scene.text.Font.font("Magneto",FontWeight.BOLD,FontPosture.ITALIC,35));
          text.setFill(Color.RED);
          root.setCenter(text);
           // root.getChildren().add(text);
            // text.setX(100);
            // text.setY(0100);
          //  text.setFont(Font.font(A));

         /*    text.setStroke(Color.BLACK);
          
          text.setUnderline(true);
          DropShadow Show = new DropShadow();
          text.setEffect(Show);
          
          text.setEffect(new Reflection());
          text.setEffect(new BoxBlur()); */
          text.setWrappingWidth(400);
          text.setTextAlignment(TextAlignment.CENTER);
            stage.show();
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}
