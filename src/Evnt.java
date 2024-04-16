 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;  
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
  
public class Evnt extends Application implements EventHandler<ActionEvent> {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
       // Group root = new Group();
       //  BorderPane root = new BorderPane();
          
       StackPane root = new StackPane();   
        ImageView iView = new ImageView(new Image("https://picsum.photos/50/50"));
        Button btn=new Button("This is a button",iView);  
        Scene scene=new Scene(root,300,300);  

        // btn.setLayoutX(50);
        // btn.setLayoutY(50);
        btn.setOnAction(this);
        root.getChildren().add(btn);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Button Class Example");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    } 
    public void handle(ActionEvent e) 
    {
System.out.println("Save");
    }
}  
