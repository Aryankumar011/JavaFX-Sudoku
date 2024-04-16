import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class CalendarApp extends Application {
    private ListView<String> eventListView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Calendar App");

        // Create UI components
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label titleLabel = new Label("Title:");
        TextField titleTextField = new TextField();
        Label dateLabel = new Label("Date:");
        DatePicker datePicker = new DatePicker();
        Button createButton = new Button("Create");
        Button updateButton = new Button("Update");
        Button deleteButton = new Button("Delete");

        eventListView = new ListView<>();

        // Handle create button click event
        createButton.setOnAction(event -> {
            String title = titleTextField.getText();
            LocalDate date = datePicker.getValue();
            if (title.isEmpty() || date == null) {
                showAlert("Please enter a title and select a date.");
            } else {
                String eventText = title + " - " + date.toString();
                eventListView.getItems().add(eventText);
                clearFields();
            }
        });

        // Handle update button click event
        updateButton.setOnAction(event -> {
            int selectedIndex = eventListView.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                String title = titleTextField.getText();
                LocalDate date = datePicker.getValue();
                if (title.isEmpty() || date == null) {
                    showAlert("Please enter a title and select a date.");
                } else {
                    String eventText = title + " - " + date.toString();
                    eventListView.getItems().set(selectedIndex, eventText);
                    clearFields();
                }
            } else {
                showAlert("Please select an event to update.");
            }
        });

        // Handle delete button click event
        deleteButton.setOnAction(event -> {
            int selectedIndex = eventListView.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                eventListView.getItems().remove(selectedIndex);
                clearFields();
            } else {
                showAlert("Please select an event to delete.");
            }
        });

        // Set up the grid layout
        gridPane.add(titleLabel, 0, 0);
        gridPane.add(titleTextField, 1, 0);
        gridPane.add(dateLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);
        gridPane.add(createButton, 0, 2);
        gridPane.add(updateButton, 1, 2);
        gridPane.add(deleteButton, 2, 2);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(eventListView);
        borderPane.setBottom(gridPane);

        // Display the scene
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        titleTextField.clear();
        datePicker.setValue(null);
        eventListView.getSelectionModel().clearSelection();
    }
}
