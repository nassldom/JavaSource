import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
 
public class JumpingJack extends Application
{ 
  
  void addStar( Group root, Color color, double centerX, double centerY, double size )
  { 
    double startX, endX;
    
    // horizontal line
    startX = centerX - size/2;
    endX   = centerX + size/2;
    Line line = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    
    // circles at both ends
    Circle left  = new Circle( centerX-size/2, centerY, size*0.1 );
    Circle right = new Circle( centerX+size/2, centerY, size*0.1 );
    
    // make a Group of all three Shapes
    Group  grp   = new Group( line, left, right ); 
    root.getChildren().add( grp );   // add the group to the scene graph
    
    // upward slanting line
    line  = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );

    // circles at both ends
    left  = new Circle( centerX-size/2, centerY, size*0.1 );
    right = new Circle( centerX+size/2, centerY, size*0.1 );

    // make a Group of all three Shapes
    grp   = new Group( line, left, right );   
    grp.setRotate( -60.0 );
    root.getChildren().add( grp );   // add the group to the scene graph
    
    // downward slanting line
    line  = new Line( startX, centerY, endX, centerY );
    line.setStrokeWidth( 2.0 );
    line.setStroke( color );
    
    // circles at both ends
    left  = new Circle( centerX-size/2, centerY, size*0.1 );
    right = new Circle( centerX+size/2, centerY, size*0.1 );

    // make a Group of all three Shapes
    grp   = new Group( line, left, right );   
    grp.setRotate( +60.0 );
    root.getChildren().add( grp );     // add the group to the scene graph
    
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