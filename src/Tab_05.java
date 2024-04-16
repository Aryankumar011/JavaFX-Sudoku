import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tab_05 extends Application {

    private int tabCount = 1; // Initial number of tabs

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tab Menu Example");

        // Create the TabPane
        TabPane tabPane = new TabPane();

        // Create tabs
        Tab tab1 = new Tab("Tab 1");
    //     StackPane stackPane = new StackPane();
        
    //     TextArea tArea = new TextArea();
    //     tArea.setMinHeight(500);
    //     tArea.setMinWidth(500);
    //     tArea.setWrapText(true);
    //    // Bpane1.setCenter(tArea);
    //     stackPane.getChildren().add( tArea);
    //     tab1.setContent(stackPane);
    //     primaryStage.setResizable(false);
    StackPane stackPane = new StackPane();
    TextArea textArea = new TextArea();
    textArea.setMinHeight(500);
    textArea.setMinWidth(500);
    textArea.setWrapText(true);
   // Bpane1.setCenter(tArea);
    stackPane.getChildren().add( textArea);
    tab1.setContent(stackPane);
    primaryStage.setResizable(false);


       // Tab tab2 = new Tab("Tab 2");
        Tab tab3 = new Tab("+");

        // Set the content for each tab
      //  tab1.setContent(new BorderPane());
       // tab2.setContent(new BorderPane());

        // Add tabs to the TabPane
        tabPane.getTabs().addAll(tab1, /* tab2, */ tab3);
        tab3.setOnSelectionChanged(e -> {
            tabCount++;
           Tab newTab1 = new Tab("Tab-" + tabPane.getTabs().size());
            StackPane stackPane1 = new StackPane();
            StackPane Bpane1 = new StackPane();
        TextArea tArea1 = new TextArea();
        tArea1.setMinHeight(500);
        tArea1.setMinWidth(500);
       // Bpane1.setCenter(tArea);
       newTab1.setContent(Bpane1);
       Bpane1.getChildren().add( tArea1);
        tArea1.setWrapText(true);
        // tabPane.getTabs().add(newTab1);
            // stackPane1.getChildren().add(new TextArea());
            // newTab1.setContent(stackPane1);
            tabPane.getTabs().add(tabPane.getTabs().size() - 1, newTab1);
            tabPane.getSelectionModel().select(tabPane.getTabs().size() - 2);
        });
        // Create a button to add new tabs
        // Button addButton = new Button("Add Tab");
        // addButton.setOnAction(e -> addNewTab(tabPane));

        // Create a layout for the button
        // HBox buttonBox = new HBox(addButton);
        // buttonBox.setAlignment(Pos.CENTER);

        // Create the root layout
        BorderPane root = new BorderPane();
     //   root.setTop(buttonBox);
        root.setCenter(tabPane);

        // Create the scene
        Scene scene = new Scene(root, 600, 600);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

/*     private void addNewTab(TabPane tabPane) {
        tabCount++;
        Tab newTab = new Tab("Tab " + tabCount);
        newTab.setContent(new BorderPane());
        tabPane.getTabs().add(newTab);
    } */

    public static void main(String[] args) {
        launch(args);
    }
}
