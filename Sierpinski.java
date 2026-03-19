import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  

class STriangle extends Group
{
  STriangle( Color color, int order, int limit, double x0, double y0, double x1, double y1, double x2, double y2 )
  {    
    // Calculate midpoints of the three sides
    double xL = (x0+x1)/2.0; double yL = (y0+y1)/2.0;
    double xR = (x1+x2)/2.0; double yR = (y1+y2)/2.0;
    double xB = (x0+x2)/2.0; double yB = (y0+y2)/2.0;
    
    // If the depth limit has not been reached,
    // construct the current triangle as three hollow little triangles
    // recursively using this very method.
    if ( order < limit )
    {
      order++ ;
      STriangle triL = new STriangle( color, order, limit, x0, y0, xL, yL, xB, yB ); // lower left
      STriangle triR = new STriangle( color, order, limit, xB, yB, xR, yR, x2, y2 ); // lower right
      STriangle triT = new STriangle( color, order, limit, xL, yL, x1, y1, xR, yR ); // top
      getChildren().addAll( triL, triR, triT );  
    }
    
    // If the depth limit has been reached,
    // construct the current triangle as three solid little triangles
    else
    {
      Polygon triL = new Polygon( x0, y0, xL, yL, xB, yB ); // lower left
      triL.setFill( color );
      Polygon triR = new Polygon( xB, yB, xR, yR, x2, y2 ); // lower right
      triR.setFill( color );
      Polygon triT = new Polygon( xL, yL, x1, y1, xR, yR ); // top
      triT.setFill( color );
      getChildren().addAll( triL, triR, triT );  
    }
  
  }
}
  
public class Sierpinski extends Application
{ 
  
  public void start(Stage stage) 
  { 
    double sceneWidth=400, sceneHeight=400 ;  
  
    double x0 = 0, y0 = sceneHeight, x1= sceneWidth/2, y1=0, x2= sceneWidth, y2= sceneHeight;
    STriangle tri = new STriangle(  Color.BLUE, 1, 6, x0, y0, x1, y1, x2, y2 );
    
    Scene scene = new Scene( tri, sceneWidth, sceneHeight, Color.SNOW ); 
    stage.setTitle("Sierpinski Gasket"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

}