import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Tab_04 extends Application {

   // private int tabCount = 3; // Initial number of tabs

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tab Menu Example");
//BorderPane borderPane = new BorderPane();

        // Create the TabPane
        TabPane tabPane = new TabPane();

        // Create tabs
        Tab tab1 = new Tab("Tab 1");
        // Tab tab2 = new Tab("Tab 2");
        // Tab tab3 = new Tab("Tab 3");

        // Set the content for each tab
        StackPane Bpane1 = new StackPane();
        TextArea tArea = new TextArea();
        tArea.setMinHeight(500);
        tArea.setMinWidth(500);
        tArea.setWrapText(true);
       // Bpane1.setCenter(tArea);
        Bpane1.getChildren().add( tArea);
        tab1.setContent(Bpane1);
        primaryStage.setResizable(false);
        // tab2.setContent(new BorderPane());
        // tab3.setContent(new BorderPane());

        // Add tabs to the TabPane
        
        // Create a button to add new tabs
        //Button addButton = new Button("Add Tab");//
        Tab newTab = new Tab("+");
        tabPane.getTabs().addAll(tab1,newTab/* , tab2, tab3 */);

        newTab.setOnSelectionChanged(e->{
            //tabCount++;

        Tab newTab1 = new Tab("Tab " + tabPane.getTabs().size());
        StackPane Bpane = new StackPane();
        TextArea tArea2 = new TextArea();
        tArea2.setMinHeight(500);
        tArea2.setMinWidth(500);
       // Bpane1.setCenter(tArea);
       newTab1.setContent(Bpane);
       Bpane.getChildren().add( tArea2);
        tArea2.setWrapText(false);
        tabPane.getTabs().add(newTab1);
        tabPane.getTabs().add(tabPane.getTabs().size() - 1, newTab1);
        tabPane.getSelectionModel().select(tabPane.getTabs().size() - 2);


        });
        // newTab.setOnSelectionChanged(e-> addNewTab());
        //addButton.setOnAction(e -> addNewTab(tabPane));

        // Create a layout for the button
       // HBox buttonBox = new HBox(addButton);
       // buttonBox.setAlignment(Pos.CENTER);

        // Create the root layout
        BorderPane root = new BorderPane();
      //  root.setTop(buttonBox);
        root.setCenter(tabPane);

        // Create the scene
        Scene scene = new Scene(root, 600, 600);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        MenuBar menuBar = new MenuBar();
      Menu Menu1 = new Menu("Test1");
      Menu Menu2 = new Menu("Test2");
      Menu Menu3 = new Menu("Test3");
      Menu Menu4 = new Menu("Test4");
      Menu Menu5 = new Menu("Test5");
      menuBar.getMenus().addAll(Menu1,Menu2,Menu3,Menu4,Menu5);
      root.setTop(menuBar);
    //   menuBar.setBorder();

      MenuItem Mi11 = new MenuItem("MI11");
      MenuItem Mi12 = new MenuItem("MI12");
      Menu Mi13 = new Menu("MI13");
      Menu1.getItems().addAll(Mi11,Mi12,Mi13);

      MenuItem Mi21 = new MenuItem("MI21");
      MenuItem Mi22 = new MenuItem("MI22");
      MenuItem Mi23 = new MenuItem("MI23");
      Mi13.getItems().addAll(Mi21,Mi22,Mi23);
      
      MenuItem Mi51 = new MenuItem("MI11");
      MenuItem Mi52 = new MenuItem("MI12");
      Menu5.getItems().addAll(Mi51,Mi52);
        // Show the stage
        primaryStage.show();
    }

/*     private void addNewTab(TabPane tabPane) {
        tabCount++;
        Tab newTab = new Tab("Tab " + tabCount);
        StackPane Bpane1 = new StackPane();
        TextArea tArea1 = new TextArea();
        tArea1.setMinHeight(500);
        tArea1.setMinWidth(500);
       // Bpane1.setCenter(tArea);
       newTab.setContent(Bpane1);
       Bpane1.getChildren().add( tArea1);
        tArea1.setWrapText(false);
        tabPane.getTabs().add(newTab);
        tabPane.getTabs().add(tabPane.getTabs().size() - 1, newTab);
        tabPane.getSelectionModel().select(tabPane.getTabs().size() - 2);
    }
 */

    public static void main(String[] args) {
        launch(args);
    }
}

