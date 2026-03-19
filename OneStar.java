import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
 
public class OneStar extends Application
{ 
  
  void addStar( Group root, Color color, double centerX, double centerY, double size )
  { 
    double startX, endX;
    
    // horizontal line
    startX = centerX - size/2;
    endX = centerX + size/2;
    Line line = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    root.getChildren().add( line );  
    
    // upward slanting line
    startX = centerX - size/2;
    endX = centerX + size/2;
    line = new Line( startX, centerY, endX, centerY );
    line.setRotate( -60.0 );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    root.getChildren().add( line );  
    
    // downward slanting line
    startX = centerX - size/2;
    endX = centerX + size/2;
    line = new Line( startX, centerY, endX, centerY );
    line.setRotate( +60.0 );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    root.getChildren().add( line );  

  }
  
  public void start(Stage stage) 
  { 
    double sceneWidth=400, sceneHeight= 300;  
    Group  root = new Group( );   
  
    addStar( root, Color.BLUE, sceneWidth/2, sceneHeight/2, sceneWidth*0.6 );
    
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.SNOW ); 
    stage.setTitle("One Star"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

}   