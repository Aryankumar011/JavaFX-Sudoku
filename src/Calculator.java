import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.*;
public class Calculator extends Application{

    @Override
    public void start(Stage stage) throws Exception
    {    BorderPane root = new BorderPane();
        Scene scene = new Scene(root,600,600);
        GridPane gPane = new GridPane();


        Label lab1 = new Label("1ST NUMBER");
        Label lab2 = new Label("2ND NUMBER");
        TextField tField1 = new TextField();
        TextField tField2 = new TextField();
        Button Ans = new Button("Answer");
        TextField ans = new TextField();
        Label opr = new Label("Operation");
        Object foo = new Object();
        
        
        gPane.add(lab1, 0, 0);
        gPane.add(lab2, 0, 1);
        gPane.add(Ans, 0, 2);
        gPane.add(tField1, 1, 0);
        gPane.add(tField2, 1, 1);
        gPane.add(ans, 1, 2);
        gPane.setHgap(10);
        gPane.setVgap(10);
        Ans.setOnAction(e->{
              String a = tField1.getText();
            //   Integer aa =new Integer(a);
            int aa = Integer.parseInt(a);
              String b = tField1.getText();
              Integer bb =Integer.parseInt(b);
              Integer Answ = aa+bb;
              String s = new String(Answ.toString());

            ans.setText(s);
          });

        
        
        
        root.setCenter(gPane);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String []args)
    {
        launch(args);
    }
    
}
