import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  

public class NestedRectangles extends Application
{ 
  double sceneWidth=400, sceneHeight= 300;  
  double centerX=sceneWidth/2, centerY=sceneHeight/2;

  private void fillGroup( Group gr, double scale )
  {
    double width=sceneWidth*scale, height=sceneHeight*scale;
    
    Rectangle rect = new Rectangle(  centerX-width/2, centerY-height/2, width, height );
    rect.setStrokeWidth( 2.0 );
    rect.setStroke( Color.RED );
    rect.setFill( Color.TRANSPARENT );
    gr.getChildren().add( rect );      
  }

  public void start(Stage stage) 
  { 
    Group  root = new Group( );  
    
    for ( double scale = 0.9; scale>=0.1; scale -= 0.1 )
    {
      fillGroup( root, scale );
    }
 
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.GHOSTWHITE ); 
    stage.setTitle("Nested Rectangles"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

} 