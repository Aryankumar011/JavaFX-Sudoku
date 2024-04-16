import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Spinner;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Loading extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gPane = new GridPane();
        
        Scene scene = new Scene(gPane,500,500);
        ProgressBar progressBar = new ProgressBar();
         gPane.addRow(1,progressBar); 
         ProgressIndicator PI=new ProgressIndicator(); 
          gPane.addRow(2, PI);
          ScrollBar s = new ScrollBar();  
        s.setMin(0);  
        s.setMax(00);  
        s.setValue(110); 
        s.setOrientation(Orientation.HORIZONTAL);  
        s.setUnitIncrement(200);  
        s.setBlockIncrement(20); 
        gPane.addRow(3, s);
        Spinner spinner = new Spinner();
        gPane.addRow(4, spinner);
        gPane.addRow(5, new ToolBar());
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
