import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Tic_3 extends Application {

    static int a = 0;
    //  Integer [] A=new Integer[9];
    static GridPane gPane = new GridPane();
    static String []S=new String[9];
    
    static Button[][] Btn = new Button[3][3];
   static Label lab1 = new Label("Enter Player 1 Name (O)");
   static Label lab2 = new Label("Enter Player 2 Name (X)");
   static TextField txt1 = new TextField("---O---");
   static TextField txt2 = new TextField("---X---");
    @Override
    public void start(Stage stage) throws Exception {
             for (int i = 0; i < 9; i++) {
                S[i]=String.valueOf(i);
            }
        BorderPane root = new BorderPane();
        GridPane gPane1 = new GridPane();
        // Button Status = new Button("---------");
      
       
        
        Button Bt1 = new Button("Reset");
       
        Bt1.setOnAction(e->{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Btn[i][j].setText(null);
                    Btn[i][j].setDisable(false);
                }
            }
        
            gPane.requestFocus();
            a=0;
            for (int i = 0; i < 9; i++) {
                S[i]=String.valueOf(i);
            }
        });
         root.setBottom(Bt1);
        root.setAlignment(Bt1, Pos.BOTTOM_CENTER);
        // gPane1.setAlignment(Pos.CENTER);
        // gPane1.setHalignment(Bt1, HPos.CENTER);
      //  gPane1.addRow(0,Bt1);
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
        // root.setDisable(true);
        stage.setResizable(false);
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
            Set(0,0,0);
            });
            Btn[0][1].setOnAction(e -> {
                Set(0,1,1);
            });
            Btn[0][2].setOnAction(e -> {
               Set(0,2,2);
            });
            Btn[1][0].setOnAction(e -> {
                Set(1,0,3);
            });
            Btn[1][1].setOnAction(e -> {
                Set(1,1,4);
            });
            Btn[1][2].setOnAction(e -> {
                Set(1,2,5);
            });
            Btn[2][0].setOnAction(e -> {
                Set(2,0,6);
            });
            Btn[2][1].setOnAction(e -> {
                Set(2,1,7);
            });
            Btn[2][2].setOnAction(e -> {
                Set(2,2,8);
           // CheckResult();
        });
        gPane.requestFocus();
        root.requestFocus();
        root.setCenter(gPane);
        stage.setScene(scene);
        stage.show();

    }
    public static void Set(int i,int j,int k)
    { 
           int x = a%2;
            if (x == 0)
                Btn[i][j].setText("O");
            else
                Btn[i][j].setText("X");
                S[k]=Btn[i][j].getText();
                a++;
                Btn[i][j].setDisable(true);
                if(Check())
                CheckResult(x,a);
            
    }
 public static void CheckResult(int x,int k)
 {
    String A;
    Dialog   Dg = new Dialog ();
    Dg.setHeaderText("Result");
    if(k==9){
        A="Match Draw...!";
    }
   else if(x==0)
    {
      A = "Player 1 :" + txt1.getText() + " Win...!";
    }
    else
    {
 A = "Player 2 : " + txt2.getText() + " Win ...!";
    }
    Dg.setContentText(A);
    Dg.getDialogPane().getButtonTypes().add(ButtonType.OK);
   Optional<ButtonType> result = Dg.showAndWait();
   if (result.get()==ButtonType.OK) {
    for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Btn[i][j].setText(null);
                    Btn[i][j].setDisable(false);
                }
            }
            gPane.requestFocus();
            a=0;
               for (int i = 0; i < 9; i++) {
                S[i]=String.valueOf(i);
            }
    
   }


 }
 public static boolean Check()
 {
      if(S[0].equals(S[4]) && S[4].equals(S[8]))
    return true;
    if(S[2].equals(S[4]) && S[4].equals(S[6]))
    return true;

    for (int i = 0; i < 3; i++) {
        if(S[i+0].equals(S[i+3]) && S[i+3].equals(S[i+6]))
        return true;
        else  if(S[3*i+0].equals(S[3*i+1]) && S[3*i+3].equals(S[3*i+2]))
        return true;

    }
    //  for (int i = 0; i < 3; i++) {
    //     if(S[3*i+0]==S[3*i+1] && S[3*i+3]==S[3*i+2])
    //     return true;
    // }
  
    return false;
 }

    public static void main(String[] args) {
        launch(args);
    }
}
