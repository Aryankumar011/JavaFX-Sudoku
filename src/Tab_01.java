import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tab_01 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane bpPane = new BorderPane();
        Scene scene = new Scene(bpPane, 600, 600);
        TabPane tabPane = new TabPane();
        javafx.scene.control.Tab Tab1 = new javafx.scene.control.Tab("Tab-1");
        tabPane.getTabs().addAll(Tab1);
        bpPane.setTop(tabPane);
      StackPane stackPane = new StackPane();
    stackPane.getChildren().add(new TextArea());
   bpPane.setTop(tabPane);
  Tab1.setContent(stackPane);
       javafx.scene.control.Tab newTab = new javafx.scene.control.Tab("+");
       tabPane.getTabs().add(newTab);
       newTab.setOnSelectionChanged(e -> {
           javafx.scene.control.Tab newTab1 = new javafx.scene.control.Tab("Tab-" + tabPane.getTabs().size());
           StackPane stackPane1 = new StackPane();
           stackPane1.getChildren().add(new TextArea());
           newTab1.setContent(stackPane1);
           tabPane.getTabs().add(tabPane.getTabs().size() - 1, newTab1);
           tabPane.getSelectionModel().select(tabPane.getTabs().size() - 2);
       });

       stage.setScene(scene);
       stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
