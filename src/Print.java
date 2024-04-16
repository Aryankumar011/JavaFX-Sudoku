import java.io.File;

import javafx.application.Application;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Print extends Application{
    @Override
    public void start(Stage stage) throws Exception
    {

        BorderPane Bpane  = new BorderPane();
        Scene scene = new Scene(Bpane,600,600);
        stage.setScene(scene);
        TextArea tArea = new TextArea();
        tArea.relocate(600, 600);
        tArea.setWrapText(false);
        Bpane.setCenter(tArea);
        Button Bt1 = new Button("Open");
        Bt1.setOnAction(e->{
FileChooser fChooser = new FileChooser();

File file  =  fChooser.showOpenDialog(stage);

System.out.println(file.getAbsolutePath()); //fChooser.getInitialFileName();


        });
        Button Bt2 = new Button("Save");
        Bt2.setOnAction(e->{
FileChooser fChooser = new FileChooser();
File file = fChooser.showSaveDialog(stage);


        });
        Button Bt3 = new Button("Save As PDF");
        Bt3.setOnAction(e->{
            
            //Node node = new Circle(100, 200, 200);
            PrinterJob job = PrinterJob.createPrinterJob();
            // if (job != null) {
                // boolean success = job.printPage(node);
                // if (success) {
                    //     job.endJob();
            // }
            // }
            job.printPage(tArea);
            
            
        });
        Button Bt4 = new Button("Print"); 
        Bt4.setOnAction(e->{

            PrinterJob job = PrinterJob.createPrinterJob();
            job.showPrintDialog(stage);
            // if (job != null && job.showPrintDialog(tArea.getScene().getWindow())){
            //     boolean success = job.printPage(tArea);
            //     if (success) {
            //         job.endJob();
            //     }
            // }
        });               
        HBox hBox = new HBox();
        hBox.getChildren().addAll(Bt1,Bt2,Bt3,Bt4);
        
        Bpane.setTop(hBox);


        
        
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
