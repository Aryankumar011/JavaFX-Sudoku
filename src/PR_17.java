import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PR_17 extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    GridPane pane = new GridPane();
    pane.setHgap(5);
    pane.setVgap(5);
    pane.setGridLinesVisible(true);

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        int n = (int) (Math.random() * 3);
        if (n == 0) {
          Image oimage = new Image("image\\X.png");
          ImageView oView = new ImageView(oimage);
          oView.setFitHeight(100);
          oView.setFitWidth(100);
          pane.add(oView, j, i);

        }
        // pane.add(new ImageView(new Image("image\\X.png")), j, i); //src\image\O.png
        else if (n == 1) {
          Image oimage = new Image("image\\O.png");
          ImageView oView = new ImageView(oimage);
          oView.setFitHeight(100);
          oView.setFitWidth(100);
          pane.add(oView, j, i);
        }
        // pane.add(new ImageView(new Image("image\\O.png")), j, i);
        else
          continue;
      }
    }
    stage.setTitle("Tic-Tac-Toe");
    stage.setScene(new Scene(pane, 315, 315));
    stage.show();
  }
}