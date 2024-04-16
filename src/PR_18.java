
// Refrence : https://gtunewooppracticals.blogspot.com/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * PR_18
 */
public class PR_18 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Pane pane = new Pane();

        // Circle circle = new Circle(30);
        // pane.getChildren().add(circle);
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 600);
        // pane.setPadding(new Insets(30, 30, 30, 30));
        Circle circle = new Circle(50);
        circle.setCenterX(300);
        circle.setCenterY(300);
        pane.getChildren().add(circle);
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    circle.setCenterY(
                            circle.getCenterY() > circle.getRadius() ? circle.getCenterY() - 15 : circle.getCenterY());
                    break;
                case DOWN:
                    circle.setCenterY(
                            circle.getCenterY() < pane.getHeight() - circle.getRadius() ? circle.getCenterY() + 15
                                    : circle.getCenterY());
                    break;
                case LEFT:
                    circle.setCenterX(
                            circle.getCenterX() > circle.getRadius() ? circle.getCenterX() - 15 : circle.getCenterX());
                    break;
                case RIGHT:
                    circle.setCenterX(
                            circle.getCenterX() < pane.getWidth() - circle.getRadius() ? circle.getCenterX() + 15
                                    : circle.getCenterX());
            }
        });
        stage.setScene(scene);
        stage.show();
        pane.requestFocus();

    }

    public static void main(String[] args) {
        launch(args);
    }

}