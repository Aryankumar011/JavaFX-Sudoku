import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PR_20 extends Application {

    private Text messageText;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Message Mover");

        // Create the message text
        messageText = new Text("Hello, World!");
        messageText.relocate(0, 0);
        messageText.setFont(Font.font(20));

        // Create the buttons
        Button leftButton = new Button("Move Left");
        leftButton.setOnAction(e -> { 
            messageText.setX(messageText.getX() - 10);
        });
        Button rightButton = new Button("Move Right");
        rightButton.setOnAction(e -> moveMessageRight());

        // Create the radio buttons
        RadioButton redButton = new RadioButton("Red");
        redButton.setOnAction(e -> changeMessageColor(Color.RED));
        RadioButton greenButton = new RadioButton("Green");
        greenButton.setOnAction(e -> changeMessageColor(Color.GREEN));
        RadioButton blueButton = new RadioButton("Blue");
        blueButton.setOnAction(e -> changeMessageColor(Color.BLUE));

        // Group the radio buttons together
        ToggleGroup colorGroup = new ToggleGroup();
        redButton.setToggleGroup(colorGroup);
        greenButton.setToggleGroup(colorGroup);
        blueButton.setToggleGroup(colorGroup);

        // Create a layout for the buttons
        HBox buttonBox = new HBox(10, leftButton, rightButton);
        buttonBox.setPadding(new Insets(10));
        
        // Create a layout for the radio buttons
        HBox colorBox = new HBox(10,redButton, greenButton, blueButton);
        
        colorBox.setPadding(new Insets(10));
        
        // Create a layout for the message and buttons

        
        Pane  pane = new Pane ();
        VBox root = new VBox(10, pane,buttonBox, colorBox);
        root.setPadding(new Insets(20));
        pane.getChildren().add(messageText);
        
        // Create the scene
        Scene scene = new Scene(root,300,300);
        
        // Set the scene to the stage
        primaryStage.setScene(scene);
        
        // Show the stage
        primaryStage.show();
        root.requestFocus();

    }

    private void moveMessageLeft() {
        messageText.setX(messageText.getX() - 10);
    }

    private void moveMessageRight() {
        messageText.setX(messageText.getX() + 10);
    }

    private void changeMessageColor(Color color) {
        messageText.setFill(color);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
