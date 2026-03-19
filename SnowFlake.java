import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
 
public class SnowFlake extends Application
{ 
  final double SIZELIMIT = 10;
  
  void addStar( Group root, Color color, double centerX, double centerY, double size )
  { 
    double startX, endX;
    
    // horizontal line
    startX = centerX - size/2;
    endX = centerX + size/2;
    Line line = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    Group grp = new Group( line );
    if ( size>SIZELIMIT )
    {
      addStar( grp, color, centerX-size/2, centerY, size*0.3);
      addStar( grp, color, centerX+size/2, centerY, size*0.3);
    }
    root.getChildren().add( grp );  
    
    // upward slanting line
    line = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    grp = new Group( line );
    if ( size>SIZELIMIT )
    {
      addStar( grp, color, centerX-size/2, centerY, size*0.3);
      addStar( grp, color, centerX+size/2, centerY, size*0.3);
    }
    grp.setRotate( +60.0 );
    root.getChildren().add( grp );  
    
    // downward slanting line
    line = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    grp = new Group( line );
    if ( size>SIZELIMIT )
    {
      addStar( grp, color, centerX-size/2, centerY, size*0.3);
      addStar( grp, color, centerX+size/2, centerY, size*0.3);
    }
    grp.setRotate( -60.0 );
    root.getChildren().add( grp );   
  }
  
  public void start(Stage stage) 
  { 
    double sceneWidth=400, sceneHeight= 300;  
    Group  root = new Group( );   
  
    addStar( root, Color.BLUE, sceneWidth/2, sceneHeight/2, sceneWidth*0.6 );
    
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.SNOW ); 
    stage.setTitle("Snowflake"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

}