import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Controls1 extends Application {

    @Override
    public void start(Stage stage) throws Exception
    {
        
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,600,600);
        Button button1 = new Button("Click Here 1");
        scene.setFill(Color.RED);
        root.setCenter(button1);
        stage.setScene(scene);
        stage.setTitle("Aryan");
        // root.getChildren().add(button1);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                
                stage.setTitle("Panchal");
        BorderPane root1 = new BorderPane();
        Scene scene1 = new Scene(root1,500,500);
        stage.setScene(scene1); 
        Button button2 = new Button("Click Here 2");
        root1.setCenter(button2);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
        
                BorderPane root1 = new BorderPane();
                Scene scene1 = new Scene(root1,500,500);
                Button button2 = new Button("Click Here 3");
                root.setCenter(button1);
                stage.setScene(scene); 
                stage.show();

            }

        });


    }
});
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
