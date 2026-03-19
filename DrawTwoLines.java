import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
 
public class DrawTwoLines extends Application
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
    double startX = 20.0, startY= 250.0, endX = 380.0, endY = 50.0;
    Group  root = new Group( );   
    
    double midX = startX + (endX-startX)/2;
    double midY = startY + (endY-startY)/2;
    
    addLine( root, Color.RED, startX, startY, midX, midY );
    addLine( root, Color.BLUE, midX, midY, endX, endY );
    
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.BLANCHEDALMOND ); 
    stage.setTitle("Two Connected Lines"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

} 