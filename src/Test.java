import javax.swing.plaf.RootPaneUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test extends Application{
    public static void main(String[] args) {
        launch( args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Button Btn = new Button("Hello World");
        StackPane Sp = new StackPane(Btn);
        Scene Sc = new Scene(Sp,500,500);
        primaryStage.setScene(Sc);
        Btn.setOnAction(new EventHandler<ActionEvent>() {
          
            @Override
            public void handle(ActionEvent arg0)
            {
                System.out.print("HEllo\n");
            }
        });
        
        
        primaryStage.show();
        
    }
}