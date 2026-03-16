import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.Scene;  
import javafx.scene.Group;  
import javafx.scene.layout.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  

public class CircleDarker extends Application  
{
  public void start( Stage primaryStage ) 
  {
    Color  myFill    = new Color( 0.9, 0.7, 0.9, 1.0 );
    
    double rad = 50.0, yCenter = rad*3/2, xCenter = rad*3/2, shift = rad ;
    Circle circleA = new Circle( xCenter, yCenter, rad); 
    circleA.setFill( myFill );   
    circleA.setStroke( Color.PURPLE );
 
    xCenter += shift;
    myFill = myFill.darker();
    Circle circleB = new Circle( xCenter, yCenter, rad); 
    circleB.setFill( myFill );   
    circleB.setStroke( Color.PURPLE );
 
    xCenter += shift;
    myFill = myFill.darker();
    Circle circleC = new Circle( xCenter, yCenter, rad); 
    circleC.setFill( myFill );   
    circleC.setStroke( Color.PURPLE );
    
    Pane pane =   new Pane( circleA, circleB, circleC );   
    Scene scene = new Scene( pane, rad*5, rad*3, Color.AQUA.brighter() ); 
    
    primaryStage.setTitle("Darker Circles");
    primaryStage.setScene( scene );   
    primaryStage.show();
  }
}