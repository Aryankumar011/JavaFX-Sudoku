
import java.util.Optional;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * SK_GAME
 */
public class SK_GAME1 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        
        // GridPane [][] Gp=new GridPane[9][9];
        Character[][] board = new Character[9][9];
        Character[][] M = new Character[9][9];
        TextField[][] tFields = new TextField[9][9];
        // TextField[][] tFields;
        BorderPane bPane = new BorderPane();
        Scene scene = new Scene(bPane, 310, 310);
        stage.setScene(scene);
        GridPane gPane = new GridPane();
        gPane.setHgap(5);
        gPane.setVgap(5);
        gPane.setMaxSize(300, 300);
        gPane.setGridLinesVisible(true);
        Button Bt1 = new Button("Test-1");
        Button Bt2 = new Button("Test-2");
        Button Bt3 = new Button("Soluation");
        Bt3.setOnAction(e -> {
            GridPane gridPane = new GridPane();
            Scene sc = new Scene(gridPane, 300, 300);
            Stage stage1 = new Stage();
            stage1.setScene(sc);
            stage1.setResizable(false);
            Solution sol = new Solution();
            sol.solveSudoku(board);
         
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    gridPane.setHgap(5);
                    gridPane.setVgap(5);
                    gridPane.setMaxSize(300, 300);
                    gridPane.setGridLinesVisible(true);
                    TextField T = new TextField();
                    T.setEditable(false);
                    T.setText(board[i][j].toString());
                    // tFields[i][j].relocate(40, 40);
                    // tFields[i][j].setBackground(Background.fill(Color.WHITESMOKE));
                    gridPane.add(T, i, j);

                }
            }

            stage1.show();

        });
        HBox hBox = new HBox(Bt1, Bt2, Bt3);

        bPane.setTop(hBox);

        try {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    // tFields[i][j].relocate(40, 40);
                    tFields[i][j] = new TextField(".");
                    board[i][j] = '.';
                    tFields[i][j].setBackground(Background.fill(Color.WHITESMOKE));
                    gPane.add(tFields[i][j], i, j);
                    M[i][j] = '.';

                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }

        // TO File Number
       /*  Dialog Dig = new Dialog();
        TextField txt = new TextField();
        Label lab = new Label("Enter Your Level 1 to 9");
        
        VBox vBox = new VBox(lab,txt);
        
        Dig.setGraphic(vBox);
        
        Dig.getDialogPane().getButtonTypes().add(ButtonType.OK);
        Optional <ButtonType> result = Dig.showAndWait();
        if (result.get()==ButtonType.OK) {
        }
            
        
          int N= (int) txt.getText().charAt(0); */
        Random Num = new Random(1);
        try {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    Character A = (char) (Num.nextInt(10) + '0');
                    if (Num.nextInt(10) % 2 == 0 && isSafe(M, i, j, A)) {
                        M[i][j] = A;
                        board[i][j] = A;
                        tFields[i][j].setText(A.toString());
                        tFields[i][j].setEditable(false);
                        tFields[i][j].setBackground(Background.fill(Color.LIGHTBLUE));
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    
        bPane.setCenter(gPane);

        stage.show();
    }

    public boolean isSafe(Character[][] m, int row, int col, int number) {
        // column
        for (int i = 0; i < m.length; i++) {
            if (m[i][col] == number) {
                return false;
            }
        }

        // row
        for (int j = 0; j < m.length; j++) {
            if (m[row][j] == number) {
                return false;
            }
        }

        // grid
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (m[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
class Solution {
    public boolean isSafe(Character[][] board, int row, int col, int number) {
        //column
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == (char)(number+'0')) {
                return false;
            }
        }
       
        //row
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == (char)(number+'0')) {
                return false;
            }
        }
       
        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);
       
        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] == (char)(number+'0')) {
                    return false;
                }
            }
        }
       
        return true;
    }
   
    public boolean helper(Character[][] board, int row, int col) {
        if(row == board.length) {
            return true;
        }
       
        int nrow = 0;
        int ncol = 0;
       
        if(col == board.length-1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
       
        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)) {
                return true;
            }
        } else {
           
            //fill the place
            for(int i=1; i<=9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i+'0');
                    if(helper(board, nrow, ncol))
                        return true;
                    else
                         board[row][col] = '.';
                }
            }
        }
                      
        return false;
    }
   
    public void solveSudoku(Character[][] board) {
        helper(board, 0, 0);
    }
 }
 
 