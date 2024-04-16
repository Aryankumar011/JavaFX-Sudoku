import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controll extends Application {

    @Override
    public void start(Stage stage)
    {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane,500,500);
        stage.setScene(scene);
        Label label1 = new Label("Username");
        Label label2 = new Label("PassWord");
        TextField text = new TextField();
        PasswordField pass = new PasswordField();

    gridPane.addRow(0,label1);
    gridPane.addRow(1,label2);
    gridPane.addColumn(2, text);
    gridPane.addColumn(2,pass);
  gridPane.setLayoutX(20);
  gridPane.setLayoutY(10);
gridPane.setVgap(30);
gridPane.setHgap(30);

CheckBox checkBox1 = new CheckBox("Hello1");
CheckBox checkBox2 = new CheckBox("Hello2");
CheckBox checkBox3 = new CheckBox("Hello3");
CheckBox checkBox4 = new CheckBox("Hello4");
CheckBox checkBox5 = new CheckBox("Hello5");
// gridPane.addRow(3, checkBox1);
// gridPane.addRow(4, checkBox2);
// gridPane.addRow(5, checkBox3);
// gridPane.addRow(6, checkBox4);
// gridPane.addRow(7, checkBox5);
VBox foo = new VBox();
// foo.setLayoutX(30);
// foo.setLayoutY(30);
foo.setSpacing(20);
foo.getChildren().addAll(checkBox1,checkBox2,checkBox3,checkBox4,checkBox5);
gridPane.addRow(3, foo);

RadioButton Box1 = new RadioButton("Hello1");
RadioButton Box2 = new RadioButton("Hello2");
RadioButton Box3 = new RadioButton("Hello3");
RadioButton Box4 = new RadioButton("Hello4");
RadioButton Box5 = new RadioButton("Hello5");
ToggleGroup tGroup = new ToggleGroup();


//Group foo1 = new Group();
Box1.setToggleGroup(tGroup);
Box2.setToggleGroup(tGroup);
Box3.setToggleGroup(tGroup);
Box4.setToggleGroup(tGroup);
Box5.setToggleGroup(tGroup);
VBox foo1 = new VBox();
foo1.getChildren().addAll(Box1,Box2,Box3,Box4,Box5);
foo1.setSpacing(20);

gridPane.addColumn(2,foo1);
// ProgressIndicator pIndicator = new ProgressIndicator();
// gridPane.addRow(5, pIndicator);

// FileChooser fChooser = new FileChooser();
// fChooser.setTitle("Select File");
// fChooser.showOpenDialog(stage);





        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
