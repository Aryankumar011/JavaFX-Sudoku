import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileDig extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane bPane = new BorderPane();
        FileChooser fChooser = new FileChooser();
        HBox hBox = new HBox();
        
        Button Bt1 = new Button("Open");
        Bt1.setOnAction(e->{
            // File file1 = new File();
            Stage foo = new Stage();
            fChooser.showOpenDialog(foo);
        });
        Button Bt2 = new Button("Save");
        Bt2.setOnAction(e->{
            // File file1 = new File();
            Stage foo = new Stage();
            File file = new File("D:/");
            
             fChooser.showSaveDialog(foo);
         //   fChooser.showOpenMultipleDialog(stage);
        });
        hBox.getChildren().addAll(Bt1,Bt2);
        // bPane.getChildren().addAll(Bt1,Bt2);
        bPane.setCenter(hBox);
        
        Scene scene = new Scene(bPane,600,600);
        stage.setScene(scene);
        stage.show();
        


        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
