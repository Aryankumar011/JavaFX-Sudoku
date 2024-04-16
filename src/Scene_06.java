/* 
 * Introduction TO Scene & Stage
 */

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Scene_06
 */
public class Scene_06 extends Application {

    public static void main(String[] args) {
        launch( args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        BorderPane root = new BorderPane();
        // Scene-> Photo
        // Stage -> PhotoFrame
        Scene scene = new Scene(root,400,400,Color.RED);
        stage.setScene(scene);
        scene.setCursor(Cursor.HAND);
        
        stage.show();
    }
}