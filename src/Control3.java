import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Control3 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,600,600);

        ColorPicker colorPicker = new ColorPicker();
        root.setCenter(colorPicker);
        scene.setFill(colorPicker.getValue());
        stage.setScene(scene);
        stage.show();
    }

public static void main(String[] args) {
    launch( args);
}
}
