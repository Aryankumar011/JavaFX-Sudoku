import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Layout extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Pane root = new Pane();
        
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.setTitle("Aryan's Laptop");
        Image image = new Image("image\\fb.png");
        ImageView iView = new ImageView(image);
        iView.setFitHeight(50);
        iView.setFitWidth(50);
        iView.setLayoutX(200);
        iView.setLayoutY(200);
        Label label1 = new Label("Username");
        Label label2 = new Label("PassWord");
        // label1.relocate(20, 20);
        // label2.relocate(40, 20);
        label1.setLayoutX(10);
        label2.setLayoutX(10);
        label1.setLayoutY(20);
        label2.setLayoutY(40);
        TextField text = new TextField();
        PasswordField pass = new PasswordField();
        text.setLayoutX(100);
        text.setLayoutY(10);
        pass.setLayoutX(100);
        pass.setLayoutY(40);
        
        root.getStylesheets().add("Style.css");
        stage.getIcons().add(image);
        root.getChildren().add(iView);
        // pass.setOnAction();
        Button Btn = new Button("Summit");
        Btn.relocate(110, 180);
        Button btn1 = new Button("Open File");
        btn1.relocate(260, 180);
        
      /*   btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                stage.close();
            }
        }); */
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                FileChooser fChooser = new FileChooser();
            fChooser.setTitle("Select File");
                // fChooser.setInitialDirectory(null);
            fChooser.showOpenDialog(stage);
            System.out.println( fChooser.getInitialFileName());
            }
        });
        iView.setVisible(false);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                System.out.println("Username :"+text.getText());
                System.out.println("Password :"+pass.getText());
            }
        };
        
        root.getChildren().addAll(label1,label2,text,pass,Btn,btn1);
        Btn.setOnAction(event);
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
