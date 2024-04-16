 import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class SudokuGame extends Application {
    private static final int BOARD_SIZE = 9;
    private static final int EMPTY_CELL = 0;

    private int[][] board;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sudoku Game");

        // Create the board
        board = new int[BOARD_SIZE][BOARD_SIZE];

        // Generate a random Sudoku board
        generateSudokuBoard();

        // Create the main layout
        BorderPane root = new BorderPane();
        root.setCenter(createBoardPane());
        root.setBottom(createDifficultyPane());

        // Set the scene
        Scene scene = new Scene(root, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private GridPane createBoardPane() {
        GridPane boardPane = new GridPane();
        boardPane.setAlignment(Pos.CENTER);
        boardPane.setHgap(3);
        boardPane.setVgap(3);

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Label cellLabel = new Label();
                cellLabel.setPrefSize(40, 40);
                cellLabel.setStyle("-fx-border-color: #000; -fx-padding: 10px;");
                cellLabel.setAlignment(Pos.CENTER);
                cellLabel.setText(Integer.toString(board[row][col]));

                boardPane.add(cellLabel, col, row);
            }
        }

        return boardPane;
    }

    private GridPane createDifficultyPane() {
        GridPane difficultyPane = new GridPane();
        difficultyPane.setAlignment(Pos.CENTER);
        difficultyPane.setHgap(10);

        Button easyButton = new Button("Easy");
        easyButton.setOnAction(e -> {
            clearBoard();
            generateSudokuBoard(40); // Easy difficulty - fewer clues
            updateBoardPane();
        });

        Button mediumButton = new Button("Medium");
        mediumButton.setOnAction(e -> {
            clearBoard();
            generateSudokuBoard(30); // Medium difficulty - more clues
            updateBoardPane();
        });

        Button hardButton = new Button("Hard");
        hardButton.setOnAction(e -> {
            clearBoard();
            generateSudokuBoard(20); // Hard difficulty - even more clues
            updateBoardPane();
        });

        difficultyPane.addRow(0, easyButton, mediumButton, hardButton);

        return difficultyPane;
    }

    private void generateSudokuBoard() {
        generateSudokuBoard(35); // Default difficulty - moderate clues
    }

    private void generateSudokuBoard(int numClues) {
        // Clear the board
        clearBoard();

        Random random = new Random();

        // Fill the diagonal boxes
        fillDiagonalBoxes();

        // Fill the remaining cells recursively
        if (!fillRemaining(0, BOARD_SIZE))
            generateSudokuBoard(numClues); // Restart if failed to fill the board

        // Remove cells to create clues
        removeCells(numClues);
    }

    private void fillDiagonalBoxes() {
        for (int box = 0; box < BOARD_SIZE; box += 3) {
            fillBox(box, box);
        }
    }

    private void fillBox(int row, int col) {
        Random random = new Random();
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    num = random.nextInt(BOARD_SIZE) + 1;
                } while (!isValid(row, col, num));

                board[row + i][col + j] = num;
            }
        }
    }

    private boolean fillRemaining(int row, int col) {
        if (col >= BOARD_SIZE && row < BOARD_SIZE - 1) {
            row++;
            col = 0;
        }
        if (row >= BOARD_SIZE && col >= BOARD_SIZE) {
            return true;
        }

        if (row < 3) {
            if (col < 3) {
                col = 3;
            }
        } else if (row < BOARD_SIZE - 3) {
            if (col == (int) (row / 3) * 3) {
                col += 3;
            }
        } else {
            if (col == BOARD_SIZE - 3) {
                row++;
                col = 0;
                if (row >= BOARD_SIZE) {
                    return true;
                }
            }
        }

        for (int num = 1; num <= BOARD_SIZE; num++) {
            if (isValid(row, col, num)) {
                board[row][col] = num;
                if (fillRemaining(row, col + 1))
                    return true;

                board[row][col] = EMPTY_CELL;
            }
        }
        return false;
    }

    private boolean isValid(int row, int col, int num) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num)
                return false;
        }

        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRow + i][boxCol + j] == num)
                    return false;
            }
        }

        return true;
    }

    private void removeCells(int numClues) {
        Random random = new Random();

        for (int i = 0; i < numClues; i++) {
            int row = random.nextInt(BOARD_SIZE);
            int col = random.nextInt(BOARD_SIZE);

            if (board[row][col] != EMPTY_CELL) {
                board[row][col] = EMPTY_CELL;
            } else {
                i--;
            }
        }
    }

    private void clearBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = EMPTY_CELL;
            }
        }
    }

    private void updateBoardPane() {
        // BorderPane root = (BorderPane) primaryStage.getScene().getRoot();
        BorderPane root = new BorderPane();
        GridPane boardPane = createBoardPane();
        root.setCenter(boardPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
 