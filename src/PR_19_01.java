import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

class PR_19_01 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        // Circle circle = new Circle(50,Color.BLUE);
        // circle.setCenterX(300);
        // circle.setCenterY(300);
        // circle.setStroke(Color.WHITE);
         Scene scene = new Scene(pane,600,600);
        stage.setScene(scene);
       // pane.setCenter(circle);
        // double width = 450;
        // double height = 450;
       // Circle c = new Circle(50, Color.BLUE);
    //pane.getChildren().add(circle);
        // Circle circle = new Circle(50);
        // circle.setCenterX(300);
        // circle.setCenterY(300);

        // pane.getChildren().add(circle);
        // pane.setOnMousePressed(e -> circle.setFill(Color.RED));
        // pane.setOnMouseReleased(e -> circle.setFill(Color.BLUE));
        stage.setTitle("Click circle..");
        stage.show();
      //  pane.requestFocus();
    }
    public static void main(String[] args) {
     launch(args);

    }
}
