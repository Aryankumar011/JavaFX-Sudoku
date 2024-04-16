import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Text_PR_01 extends Application {

    private List<TextArea> cursors = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        TextArea textArea = new TextArea();
        textArea.setOnMouseClicked(this::handleMouseClick);
        textArea.setOnKeyPressed(event -> cursors.forEach(cursor -> cursor.positionCaret(textArea.getCaretPosition())));

        StackPane root = new StackPane(textArea);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleMouseClick(MouseEvent event) {
        TextArea newCursor = createCursor();
        cursors.add(newCursor);
        newCursor.positionCaret(((TextArea) event.getSource()).getCaretPosition());
        ((StackPane) ((TextArea) event.getSource()).getParent()).getChildren().add(newCursor);
    }

    private TextArea createCursor() {
        TextArea cursor = new TextArea();
        cursor.setEditable(false);
        cursor.setMouseTransparent(true);
        cursor.setFocusTraversable(false);
        cursor.setStyle("-fx-background-color: transparent; -fx-border-color: red;");
        return cursor;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
