import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventKey extends Application {
    @Override
    public void start(Stage stage) throws Exception{
    BorderPane root = new BorderPane();
    
    Scene scene = new Scene(root,400,400);
    Label lab = new Label("Hello");
    root.setCenter(lab);
    root.requestFocus();
    lab.requestFocus();
    stage.setScene(scene);
    stage.show();

    
    

    }
    public static void main(String []args)
    {
        launch(args);
    }
}
