/*
 * 6. JavaFX – Text Tutiorials point
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxText_06 extends Application{


    @Override
    public void start(Stage stage) throws Exception {
    Group root = new Group();
    Scene scene = new Scene(root,600,600,Color.DEEPSKYBLUE);
    stage.setScene(scene);
    stage.setTitle("Aryan's PC");
    Image image = new Image("image\\insta.jpeg");
    stage.getIcons().add(image);
    Text text = new Text("Hello Welcome....");
    text.setX(10);
    text.setY(100);
    // Font font = new Font( "arial",30);
    // text.setFont(font);
    text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
    text.setFill(Color.CHOCOLATE);
    root.getChildren().add(text);
    //Image image1 = new Image("image\\insta.jpeg");
   //ImageView imageView = new ImageView(image1);
//    imageView.maxHeight(50);
//    imageView.maxWidth(50);
//    imageView.setFitHeight(50);
//    imageView.setFitWidth(50);

//    imageView.setX(400);
//    imageView.setY(100);
//    root.getChildren().add(imageView);
   
    stage.show();
    
}
public static void main(String[] args) {
    launch( args);
}

    
}
