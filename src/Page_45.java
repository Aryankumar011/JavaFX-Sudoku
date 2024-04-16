import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Page_45
 */
public class Page_45 extends Application{
    

    public static void main(String[] args) {
     launch( args);   
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        stage.setTitle("Aryan's PC");
        // stage.setX(100);
        // stage.setX(100);
        // stage.setHeight(500);
        // stage.setWidth(500);
        Group root = new Group();
        Scene scene = new Scene(root,600,600);
        stage.setScene(scene);
        // scene.setCursor(Cursor.HAND);
        scene.setFill(Color.AQUA);

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(150);
        line.setEndX(400);
        line.setEndY(150);
        // line.setStroke();
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setX(50);
        rectangle.setY(250);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rectangle.setFill(Color.RED);
        root.getChildren().add(rectangle);

        root.getChildren().add(line);
        
        stage.show();
    }
}