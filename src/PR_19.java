import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PR_19 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bPane = new BorderPane();
        Scene scene = new Scene(bPane,600,600);

        Circle circle = new Circle(50,Color.BLUE);
        circle.setCenterX(300);
        circle.setCenterY(300);
        circle.setStroke(Color.WHITE);
        bPane.setCenter(circle);

        //  bPane.getChildren().add(circle);
        bPane.setOnMousePressed(e -> circle.setFill(Color.RED));
        bPane.setOnMouseReleased(e -> circle.setFill(Color.BLUE));

        stage.setScene(scene);
        stage.show();
        
        
    }
public static void main(String[] args) {
    launch(args);
}
    
}
