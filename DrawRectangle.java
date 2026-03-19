import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  

public class DrawRectangle extends Application
{ 
  final double sceneWidth=400, sceneHeight= 300;  
  final double centerX=sceneWidth/2, centerY=sceneHeight/2;
 
  public void start(Stage stage) 
  { 
    double scale = 0.9; // make the rect 0.9 the size of the scene
    Group  root = new Group( );   
    double width=sceneWidth*scale, height=sceneHeight*scale;
    
    Rectangle rect = new Rectangle( centerX-width/2, centerY-height/2, width, height );
    rect.setStrokeWidth( 2.0 );   // the stroke is the border of the rectangle
    rect.setStroke( Color.RED );  //
    rect.setFill( Color.TRANSPARENT );  // the fill is the inside of the rectangle
    
    root.getChildren().add( rect );     // the rect is put into the scene graph
    
    // the scene graph is put into the scene    
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.GHOSTWHITE ); 
    stage.setTitle("One Rectangle"); 
    
    // the scene graph is put into the stage    
    stage.setScene(scene); 
    stage.show(); 
  }      
  
} 