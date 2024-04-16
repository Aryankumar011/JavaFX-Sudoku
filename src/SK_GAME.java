
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * SK_GAME
 */
public class SK_GAME extends Application {

    

    @Override
    public void start(Stage stage) throws Exception {

        // GridPane [][] Gp=new GridPane[9][9];
        GridPane[][] Gp;
        Integer[][] M = new Integer[9][9];
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
        Button Bt3 = new Button("Test-3");
        HBox hBox = new HBox(Bt1, Bt2, Bt3);

        bPane.setTop(hBox);

        try {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    // tFields[i][j].relocate(40, 40);
                    tFields[i][j] = new TextField();
                    gPane.add(tFields[i][j], i, j);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }

        // TO File Number
        Random Num = new Random(10);
        try {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    if (Num.nextInt(10) % 3 == 0) {
                        Integer A = Num.nextInt(10);
                        M[i][j] = A;
                        tFields[i][j].setText(A.toString());
                        tFields[i][j].setEditable(false);
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
/* *************************************************************************************************** 
public boolean isSafe(char[][] board, int row, int col, int number) {
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

public boolean helper(char[][] board, int row, int col) {
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

public void solveSudoku(char[][] board) {
    helper(board, 0, 0);
}
    }
 *************************************************************************** */


        bPane.setCenter(gPane);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
