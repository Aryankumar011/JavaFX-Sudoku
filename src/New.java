import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class New extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Group root = new Group();
        Scene scene = new Scene(root,600,600,Color.AQUA);
        stage.setScene(scene);
        stage.setTitle("Aryan's PC");
        Image image = new Image("image\\insta.jpeg");
        Text text = new Text("Hello Welcome....");
        text.setX(10);
        text.setY(100);
        Font font = new Font( "arial",30);
        text.setFont(font);
        root.getChildren().add(text);
        Image image1 = new Image("image\\insta.jpeg");
       ImageView imageView = new ImageView(image1);
    //    imageView.maxHeight(50);
    //    imageView.maxWidth(50);
       imageView.setFitHeight(50);
       imageView.setFitWidth(50);

       imageView.setX(400);
       imageView.setY(100);
       root.getChildren().add(imageView);
       
        stage.getIcons().add(image);
        stage.show();
        
    }
    public static void main(String[] args) {
        launch( args);
    }
}
