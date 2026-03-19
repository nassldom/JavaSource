import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  
import java.lang.Math;
 
class KLine extends Group
{
  
  // Construct a Koch line between (x0, y0) and (x4, y4)
  public KLine( double x0, double y0, double x4, double y4 )
  { 
    double x1=0, y1=0; // end of the first third
    double x2=0, y2=0; // peak of the bump in the middle
    double x3=0, y3=0; // start of the last third
    double xm=0, ym=0; // middle of the straight line
    double dist=0;     // length of this line
    
    double theta=0;    // angle between line and x axis
    double triHi=0;    // height of the bump
 
    dist = Math.sqrt( (x4-x0)*(x4-x0) + (y4-y0)*(y4-y0) );
 
    // construct a line with a bump in the middle
    // The end of the first third is the start plus
    // one third  of the displacement from start to end
    x1 = x0 + (x4-x0)/3;
    y1 = y0 - (y0-y4)/3;

    // The start of the last third is the end minus
    // one third of the displacement from start to end
    x3 = x0 + 2*(x4-x0)/3;
    y3 = y0 - 2*(y0-y4)/3;
    
    // The angle between this line if it were straight
    // and the x axis.
    theta = Math.atan2( (y0-y4),(x4-x0) ) ;
    
    // The length of the bisector of the triangle bump
    triHi = dist/(2*Math.sqrt(3));
    
    // Find (X2, Y2) of the vertex of the triangle
    xm = (x0+x4)/2;
    ym = (y0+y4)/2;
    double S = triHi*Math.sin( theta );
    double B = triHi*Math.cos( theta );
    x2 = xm - S;
    y2 = ym - B;

    // Construct this line out of four smaller lines
    Line lineA = new Line( x0, y0, x1, y1 );
    Line lineB = new Line( x1, y1, x2, y2 );
    Line lineC = new Line( x2, y2, x3, y3 );
    Line lineD = new Line( x3, y3, x4, y4 );  
    getChildren().addAll( lineA, lineB, lineC, lineD ); 
  }    
}

public class LineWithBump extends Application
{ 

  public void start(Stage stage) 
  { 
    double sceneWidth=700, sceneHeight=400;
    
    // Ends of the straight line
    double x0 = sceneWidth*0.1, y0=sceneHeight/2 + 85;
    double x4 = sceneWidth*0.9, y4=sceneHeight/2 - 50;
    
    // Construct a KLine  
    KLine line = new KLine( x0, y0, x4, y4 );
  
    // Add the line to the scene
    Group  root = new Group( );   
    root.getChildren().addAll( line );        
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.HONEYDEW ); 
    
    // Set the scene
    stage.setTitle("Line with a Bump"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

}