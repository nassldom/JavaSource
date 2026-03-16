import javafx.application.*;  // 1.
import javafx.stage.*;        // 6.
import javafx.scene.Scene;    // 5.
import javafx.scene.shape.*;  // 2. includes Circle class
import javafx.scene.paint.*;  // 3, 5. includes Color
import javafx.scene.layout.*; // 4. includes Pane class

public class CircleScene extends Application  // 1
{
  public void start( Stage primaryStage )  // 1
  {
    Circle circle = new Circle( 100.0, 90.1, 50.5 );  // 2
    circle.setFill( Color.GREEN );  // 3
    circle.setStroke( Color.BLACK );
    
    Pane pane = new Pane( circle );  // 4 
    Scene scene = new Scene( pane, 300.0, 200.0, Color.LIGHTYELLOW ); // 5
    
    primaryStage.setTitle("Circle");
    primaryStage.setScene( scene );  // 6
    primaryStage.show();
  }
}