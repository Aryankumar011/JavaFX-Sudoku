
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxEffect extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    Group root = new Group();
    Scene scene = new Scene(root,600,600,Color.LIGHTPINK);
    stage.setScene(scene);
    stage.setTitle("Aryan's PC");
    Image image = new Image("image\\insta.jpeg");
   stage.getIcons().add( image);

   Image image1 = new Image("image\\insta.jpeg");
   ImageView imageView = new ImageView(image1);
   imageView.setFitHeight(100);
   imageView.setFitWidth(100);

   imageView.setX(400);
   imageView.setY(100);
   root.getChildren().add(imageView);
       Text text = new Text("Hello Welcome....");
    text.setX(10);
    text.setY(100);

    text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
    text.setFill(Color.RED);
    root.getChildren().add(text);

       // Effect-1
   /*  Glow glow = new Glow();
    glow.setLevel(0.2);
    imageView.setEffect(glow); */

    //Effect-2
/*     ColorAdjust colorAdjust = new ColorAdjust();
   // colorAdjust.setContrast(-0.5);
    //  colorAdjust.setHue(0.5);
     colorAdjust.setBrightness(.1);
     colorAdjust.setSaturation(0.9);
    imageView.setEffect(colorAdjust); */
   
    // Effect-3
    ColorInput colorInput = new ColorInput();         
       
    //Setting the coordinates of the color input 
    colorInput.setX(50); 
    colorInput.setY(140); 
    
    //Setting the height of the region of the collor input 
    colorInput.setHeight(50); 
    
    //Setting the width of the region of the color input 
    colorInput.setWidth(400); 
    
    //Setting the color the color input 
    colorInput.setPaint(Color.CHOCOLATE); 
    imageView.setEffect(colorInput);
    
    stage.show();
    
}
public static void main(String[] args) {
    launch( args);
}
}
