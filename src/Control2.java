import java.text.DateFormat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Control2 extends Application{


    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,600,600);
        DatePicker datePicker = new DatePicker();
        MenuBar manuBar = new MenuBar();
        Menu Manu1 = new Menu("New1");
        Menu Manu2 = new Menu("New2");
        Menu Manu3 = new Menu("New3");
        Menu Manu4 = new Menu("New4");
        manuBar.getMenus().addAll(Manu1,Manu2,Manu3,Manu4);
        root.setTop(manuBar);
        
        MenuItem item1 = new MenuItem("Aryan1");
        Menu item2 = new Menu("Aryan3");
        MenuItem item3 = new MenuItem("Aryan2");
        Manu1.getItems().addAll(item1,item2,item3);
        root.setCenter(datePicker);
        MenuItem item11 = new MenuItem("PAnchal1");
        MenuItem item22 = new MenuItem("PAnchal2");
        MenuItem item33 = new MenuItem("PAnchal3");
        item2.getItems().addAll(item11,item22,item33);
        root.setCenter(datePicker);
        scene.setFill(Color.GOLD);
        stage.setScene(scene);
        stage.show();
        
        
      
    }

    public static void main(String[] args) {
        launch(args);
    }

}
