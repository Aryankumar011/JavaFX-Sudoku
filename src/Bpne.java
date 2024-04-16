import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/* public class Bpne extends Application{

    @Override
    public void start(Stage arg0) throws Exception {


    }
    
} */
/**
 * Bpne
 */
public class Bpne {

    Bpne()
    {
        BorderPane bPane = new BorderPane();
        TextArea tArea = new TextArea();
        tArea.minHeight(300);
        tArea.setMinWidth(300);
        
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
   
}
