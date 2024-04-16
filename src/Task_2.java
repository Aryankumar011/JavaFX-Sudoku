import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Task 2. Employee management system :
// Build a program that can manage employee data using
// Java classes and objects.
public class Task_2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 400, 400);
        GridPane gPane = new GridPane();
        Label lab1 = new Label("Employee Id");
        Label lab2 = new Label("Employee Name");
        Label lab3 = new Label("City");
        Label lab4 = new Label("Depertment");

        TextField tField1 = new TextField();
        TextField tField2 = new TextField();
        TextField tField3 = new TextField();
        TextField tField4 = new TextField();
        Button Btn = new Button("Summit");

        Btn.setOnAction(e -> {
            try {

                Connection con = CreateCon.getConnection();
                String Q = "insert into Employees (Id,Name,City,Dept) values (?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(Q);

                pstmt.setString(1, tField1.getText());
                pstmt.setString(2, tField2.getText());
                pstmt.setString(3, tField3.getText());
                pstmt.setString(4, tField4.getText());
                pstmt.executeUpdate();
                Dialog Dig = new Dialog();
                Dig.setHeaderText("Data Inserted..");
                Dig.getDialogPane().getButtonTypes().add(ButtonType.OK);
                Dig.show();
                
               // System.out.println("Data Inserted");

                con.close();
            } catch (Exception en) {
                System.out.print("Do not connect to DB - Error:" + en);
            }

        });
        gPane.add(lab1, 0, 0);
        gPane.add(lab2, 0, 1);
        gPane.add(lab3, 0, 2);
        gPane.add(lab4, 0, 3);
        gPane.add(tField1, 01, 0);
        gPane.add(tField2, 1, 1);
        gPane.add(tField3, 01, 2);
        gPane.add(tField4, 01, 3);
        gPane.add(Btn, 1, 4);
        gPane.setHgap(10);
        gPane.setVgap(20);
        // gPane.setLayoutX(20);
        // gPane.setLayoutY(20);
        gPane.setTranslateX(70);
        gPane.setTranslateY(70);
        root.setCenter(gPane);
        stage.setScene(scene);
        stage.setTitle("Employee management system");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

class CreateCon {
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}