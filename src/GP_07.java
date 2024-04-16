/*  Text
    CubicCurve
    Image View
    Arc
    Elipse
    CubicCurve
    Circle 
    ETC....

 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GP_07 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Group root = new Group();
        
    Scene scene = new Scene(root,Color.AQUA);
    stage.setScene(scene);
    stage.setTitle("Aryan's PC");
    Image imag = new Image("image\\insta.jpeg");
    stage.getIcons().add(imag);
    stage.setWidth(400);
    stage.setHeight(400);
        // 1. Text 
       Text Txt = new Text();
        Txt.setText("Hello Java...");
        root.getChildren().add(Txt);
        Txt.setX(60);
        Txt.setY(60);
        Font font = new Font("arial",30);
        Txt.setFont(font);
        Txt.setFill(Color.RED);
        Txt.setStroke(Color.BLACK); //Boarder BAnavava
        Txt.setStrokeWidth(2);
        // Txt.setStrikethrough(true);  // Line Chekva

        //2. TO Draw Line
    
    /*     Line line = new Line();
        line.setStartX(10);
        line.setStartX(100);
        line.setEndX(200);
        line.setEndY(200);
        root.getChildren().add(line);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(.3); */
   
    // 3. Rectangle
    /*
    Rectangle Rec = new Rectangle();
    Rec.setX(100);
    Rec.setY(100);
    Rec.setWidth(200);
    Rec.setHeight(200);
    root.getChildren().add(Rec);
    Rec.setFill(Color.YELLOW);
    Rec.setStroke(Color.RED);
    Rec.setStrokeWidth(5);
    Rec.setArcHeight(30);
    Rec.setArcWidth(30);
        */


        // 4. Polygon   Poline-> Open Aera
   /*     Polygon Pol = new Polygon(100,100,100,200,200,200);
   Polyline Pol = new Polyline(100,100,100,200,200,100);
        root.getChildren().add(Pol);
        Pol.setFill(Color.YELLOW);
        Pol.setStroke(Color.PINK);
        Pol.setStrokeWidth(6);
        */
   // 5 Circle 
   /* Circle Cir = new Circle();
   Cir.setCenterX(100);
   Cir.setCenterY(100);
   Cir.setRadius(80);
   Cir.setFill(Color.RED);
   Cir.setStroke(Color.WHITE);
   Cir.setStrokeWidth(5);
   root.getChildren().add(Cir); */


       // 6. Elipse
    /*     Ellipse El = new Ellipse();
        El.setCenterX(200);
        El.setCenterY(200);
        El.setRadiusX(100);
        El.setRadiusY(50);
        El.setFill(Color.RED);
        root.getChildren().add(El); */
        
       // 7. Arc
/* 
       Arc Ar = new Arc();
       Ar.setCenterX(100);
       Ar.setCenterY(100);
       Ar.setRadiusX(100);
       Ar.setRadiusY(100);
       Ar.setStartAngle(0);
       Ar.setLength(50);
       Ar.setFill(Color.RED);
       root.getChildren().add(Ar);
        Ar.setType(ArcType.ROUND);
        Ar.setStroke(Color.BLACK); */

        // 8. Image View
       /*  Image image = new Image("image\\whattapp.png");
        ImageView Iw = new ImageView(image);

        Iw.setX(100);
        Iw.setY(100);
        // Iw.setScaleX(100);
        // Iw.setScaleY(100);

        root.getChildren().add(Iw); */

        // Cubic Curve & Quard Curve
    //    QuadCurve Qc = new QuadCurve(100,220,250,0,500,220);
    //    CubicCurve Qc = new CubicCurve();
        
/*         Qc.setStartX(100);
        Qc.setStartY(100);
        Qc.setControlX1(200);
        Qc.setControlY1(100);
        Qc.setControlX2(200);
        Qc.setControlX2(200);
        Qc.setEndX(300);
        Qc.setEndY(300);
         root.getChildren().add(Qc);
         */
        
        stage.show();
    }
}
