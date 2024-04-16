/* 
 * Stages of JavaFX
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Stages of JavaFX
public class Stages_04 extends Application {

  public static void main(String [] args)
  {
	  launch(args);
  }

@Override
public void start(Stage stage) throws Exception {

	Group root = new Group();
	Scene Sc = new Scene(root,Color.CYAN);
	stage.setScene(Sc);
	stage.setTitle("Aryan's PC");
	//Image image = new Image("image\\fb.png"); 
	Image img = new Image("image\\fb.png");
    stage.getIcons().add(img);
	stage.setHeight(500);
	stage.setWidth(400);
	stage.setX(100);
	stage.setX(100);
	stage.setFullScreen(true);
	stage.setResizable(false);
	stage.setFullScreenExitHint("Press Q For Exit");
	stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
	stage.show();
}
}