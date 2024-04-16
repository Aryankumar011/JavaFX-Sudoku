import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Scene01 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane pane1 = new Pane();
        Scene scene1 = new Scene(pane1, 400, 400);
        stage.setScene(scene1);
        Pane pane2 = new Pane();
        stage.show();

        Stage stage2 = new Stage();

        Scene scene2 = new Scene(pane2, 400, 400);
        stage2.setScene(scene2);
        stage2.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
