import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
 
public class DrawLine extends Application
{ 
  
  void addLine( Group root, Color color, double startX, double startY, double endX, double endY )
  { 
    Line line = new Line( startX, startY, endX, endY );
    line.setStrokeWidth( 3.0 );
    line.setStroke( color );
    root.getChildren().add( line );  
  }
  
  public void start(Stage stage) 
  { 
    double sceneWidth=400, sceneHeight= 300;  
    double startX = 20.0, startY = 250.0, // left end point
           endX = 380.0, endY = 50.0;     // right end point
    Group  root = new Group( );   
    addLine( root, Color.DARKSEAGREEN, startX, startY, endX, endY );
    
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.BLANCHEDALMOND ); 
    stage.setTitle("One Line"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

} 