import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
public class Media extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        VBox rooPane = new VBox();
        Scene scene = new Scene(rooPane,800,500);
      //  String path = "D:\\4TH REF\\Java Book\\Java Full Course for Beginners (Hindi) _ Learn Coding.mp4"; 
      //  Media media = new Media("E:\\IC\\CH-1\\1.mp4");
      File file = new File("E:\\IC\\CH-1\\1.mp4");
      String url =file.toURI().toURL().toString();
     javafx.scene.media.Media media = new javafx.scene.media.Media("http://techslides.com/demos/sample-videos/small.mp4");
     
      
      MediaPlayer mPlayer = new MediaPlayer(media); 
       MediaView mView = new MediaView(mPlayer);
       rooPane.setAlignment(Pos.CENTER);
rooPane.getChildren().add( mView);
    
        mPlayer.setAutoPlay(true);
        
        
        
    stage.setScene(scene);
    stage.show();
    
    }
    public static void main(String[] args) {
        launch(args);

    }
}
