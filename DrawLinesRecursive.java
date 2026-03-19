import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
 
public class DrawLinesRecursive extends Application
{ 
  
  void addLine( Group root, Color color, double startX, double startY, double endX, double endY )
  { 
    // Calculate the length of the complete line
    double length = Math.sqrt( (endX-startX)*(endX-startX) + (endY-startY)*(endY-startY));
    
    // If length is small enough, immediately draw the line
    if ( length < 10.0 )
    {
      Line line = new Line( startX, startY, endX, endY );
      line.setStrokeWidth( 3.0 );
      line.setStroke( color );
      root.getChildren().add( line );  
    }
    
    // Otherwise, draw each half of the line (in different colors)
    else
    {    
      double midX = startX + (endX-startX)/2;
      double midY = startY + (endY-startY)/2;
    
      addLine( root, Color.RED, startX, startY, midX, midY );
      addLine( root, Color.GREEN, midX, midY, endX, endY );
    }
  }
  
  public void start(Stage stage) 
  { 
    double sceneWidth=400, sceneHeight= 300;  
    double startX = 20.0, startY= 250.0, endX = 380.0, endY = 50.0;
    Group  root = new Group( );   
    addLine( root, Color.BLUE, startX, startY, endX, endY );
   
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.BLANCHEDALMOND ); 
    stage.setTitle("Many Connected Lines"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

} 