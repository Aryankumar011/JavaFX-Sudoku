import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Tic1 extends Application {

    int a = 0;
    Integer [] A=new Integer[9];
    @Override
    public void start(Stage stage) throws Exception {
        for (int i = 0; i < A.length; i++) {
          A[i]=2;
        }
        BorderPane root = new BorderPane();
        Button[][] Btn = new Button[3][3];
        GridPane gPane = new GridPane();
        GridPane gPane1 = new GridPane();

        Button Bt1 = new Button("Reset");
        Bt1.setOnAction(e->{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Btn[i][j].setText(null);
                    Btn[i][j].setDisable(false);
                }
            }
            for (int i = 0; i < 9; i++) {
                A[i]=2;
            }
            a=0;
          gPane.requestFocus();
        });
        Label lab1 = new Label("Enter Player 0 Name (O)");
        Label lab2 = new Label("Enter Player 1 Name (X)");
        TextField txt1 = new TextField();
        TextField txt2 = new TextField();
        
        gPane1.add(Bt1, 0, 0);
        gPane1.add(lab1, 0, 1);
        gPane1.add(lab2, 0, 2);
        gPane1.add(txt1, 2, 1);
        gPane1.add(txt2, 2, 2);

        // Button Bt2 = new Button();
        root.setTop(gPane1);
        
        gPane.setHgap(5);
        gPane.setVgap(5);
        gPane.setGridLinesVisible(true);
        // Font font1 = new Font ();

        Scene scene = new Scene(root, 320, 400);
        // Button Btn1 = new Button();
        // gPane.add(Btn1, 0, 0);

        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Btn[i][j] = new Button(" ");
                    Btn[i][j].setPrefSize(100, 100);
                    // Btn[i][j].setFont(Font.font("Arial",FontWeight.EXTRA_BOLD,FontPosture.REGULAR,40));
                    // Btn[i][j].setFont(font1);
                    Btn[i][j].setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 40));
                    gPane.add(Btn[i][j], i, j);
                }
            }
        }

        catch (Exception e) {

        }
        Btn[0][0].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[0][0].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[0][0].setText("X");
                A[a]=x;
            }
            a++;
            Btn[0][0].setDisable(true);
            Soluation();
        });
        Btn[0][1].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[0][1].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[0][1].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[0][1].setDisable(true);
        });
        Btn[0][2].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[0][2].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[0][2].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[0][2].setDisable(true);
        });
        Btn[1][0].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[1][0].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[1][0].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[1][0].setDisable(true);
        });
        Btn[1][1].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[1][1].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[1][1].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[1][1].setDisable(true);
        });
        Btn[1][2].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[1][2].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[1][2].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[1][2].setDisable(true);
        });
        Btn[2][0].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[2][0].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[2][0].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[2][0].setDisable(true);
        });
        Btn[2][1].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[2][1].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[2][1].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[2][1].setDisable(true);
        });
        Btn[2][2].setOnAction(e -> {
            int x = a%2;
            if (x == 0)
            {
                Btn[2][2].setText("O");
                A[a]=x;
            }
            else
            {
                Btn[2][2].setText("X");
                A[a]=x;
            }
            a++;
            Soluation();
            Btn[2][2].setDisable(true);
        });
        gPane.requestFocus();
        root.requestFocus();
        root.setCenter(gPane);
        stage.setScene(scene);
        stage.show();

    }
    public void Soluation()
    { 
        for (int i = 0; i < 9; i++) {

        if (A[0+(i*3)]==A[1+(i*3)] && A[1+(i*3)]==A[2+(i*3)] && A[i*3]!=2) {
            if(A[i*3]==1)
            System.out.println("Player 1 Win");
            else
            System.out.println("Player 0 Win");
            
        } 
        else if(A[0+i]==A[3+i] && A[3+i]==A[6+i] && A[i]!=2)
        {
            if(A[i+3]==1)
            System.out.println("Player 1 Win");
            else
            System.out.println("Player 0 Win");
            System.exit(0);
        }
        else if(A[0]==A[4] && A[4]==A[8] && A[4]!=2)
        {

            if(A[4]==1)
            System.out.println("Player 1 Win");
            else
            System.out.println("Player 0 Win");
            System.exit(0);
        }
        else if(A[2]==A[4] && A[4]==A[6] && A[4]!=2)
        {
            if(A[4]==1)
            System.out.println("Player 1 Win");
            else
            System.out.println("Player 0 Win");
            System.exit(0);
        }
        else
        {
            if(a==9)
            {
            System.out.println("Macth Draw");
            System.exit(0);
            }
        }
    }
        
      
    }

    public static void main(String[] args) {
        launch(args);
    }
}
