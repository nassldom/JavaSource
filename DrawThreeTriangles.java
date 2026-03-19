import javafx.stage.*;
import javafx.application.Application;
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  

class TriangleThree extends Group
{
  public TriangleThree( Color color, double x0, double y0, double x1, double y1, double x2, double y2 )
  {        
    // Calculate midpoints of the three sides
    
    double xL = (x0+x1)/2.0;
           
; // Left edge X    
    double yL = (y0+y1)/2.0;
           
; // Left edge Y    
    double xR = (x1+x2)/2.0;
           
; // Right edge X    
    double yR = (y1+y2)/2.0;
           
; // Right edge Y    
    double xB = (x0+x2)/2.0;
           
; // Bottom edge X    
    double yB = (y0+y2)/2.0;
           
; // Bottom edge Y    

    Polygon triL = new Polygon( x0, y0, xL, yL, xB, yB );  
    Polygon triR = new Polygon( xB, yB, xR, yR, x2, y2 );  
    Polygon triT = new Polygon( xL, yL, x1, y1, xR, yR );  

    triL.setFill( color );
    triL.setStroke( Color.BLACK );

    triR.setFill( color );
    triR.setStroke( Color.BLACK );

    triT.setFill( color );
    triT.setStroke( Color.BLACK );
    
    getChildren().addAll( triL, triR, triT );
  }
}
  
public class DrawThreeTriangles extends Application
{ 
  
  public void start(Stage stage) 
  { 
    double sceneWidth=400, sceneHeight=400 ;  
  
    double x0=0, y0=sceneHeight, x1=sceneWidth/2, y1=0, x2= sceneWidth, y2=sceneHeight;
    TriangleThree solid = new TriangleThree(  Color.BLUE, x0, y0, x1, y1, x2, y2 );
    
    Scene scene = new Scene( solid, sceneWidth, sceneHeight, Color.SNOW ); 
    stage.setTitle("Three Triangles"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

}