
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App_01 extends Application {
    @Override
    public void start(Stage stage) throws Exception 
    {
        // Group root = new Group();
        StackPane root = new StackPane();   

        Scene scene = new Scene(root,400,400,Color.AQUA);
        stage.setScene(scene);
      
        Button button = new Button("Hello My NAme Is Aryan");
        button.setMaxWidth(200);  
        button.setMaxHeight(50);
        Button button1 = new Button("Hello My NAme Is Aryan");
        button1.setMaxWidth(100);  
        button1.setMaxHeight(50);


        EventHandler <ActionEvent> event = new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent e)
            {
                System.out.println("My Name Is Aryan");
            }
        };
  
        // when button is pressed
        button.setOnAction(event);
        // button.setOnAction(null);
        root.getChildren().add(button);
        root.getChildren().add(button1);
        
        stage.show();

    }
    public static void main(String Args[])
    {
    launch(Args);
        
    }
}
