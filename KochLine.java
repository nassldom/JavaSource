import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

class KLine extends Group {

  private static final double LINELIMIT = 4.0;

  public KLine(double x0, double y0, double x4, double y4) {

    double dist = Math.sqrt((x4-x0)*(x4-x0) + (y4-y0)*(y4-y0));

    if (dist < LINELIMIT) {
      Line line = new Line(x0, y0, x4, y4);
      line.setStroke(Color.RED);
      getChildren().add(line);
      return;
    }

    double x1 = x0 + (x4-x0) / 3.0;
    double y1 = y0 + (y4-y0) / 3.0;

    double x3 = x0 + 2.0*(x4-x0) / 3.0;
    double y3 = y0 + 2.0*(y4-y0) / 3.0;

    double theta = Math.atan2(y4-y0, x4-x0);
    double triHi = dist / (2.0 * Math.sqrt(3.0));

    double xm = (x0+x4) / 2.0;
    double ym = (y0+y4) / 2.0;

    // Zacke nach links der Laufrichtung
    double x2 = xm + triHi * Math.sin(theta);
    double y2 = ym - triHi * Math.cos(theta);


    KLine lineA = new KLine(x0, y0, x1, y1);
    KLine lineB = new KLine(x1, y1, x2, y2);
    KLine lineC = new KLine(x2, y2, x3, y3);
    KLine lineD = new KLine(x3, y3, x4, y4);
    getChildren().addAll(lineA, lineB, lineC, lineD);
  }
}

public class KochLine extends Application {

  @Override
  public void start(Stage stage) {
    double sceneWidth = 900, sceneHeight = 300;

    double x0 = sceneWidth * 0.05, y0 = sceneHeight * 0.5;
    double x4 = sceneWidth * 0.95, y4 = sceneHeight * 0.5;

    KLine line = new KLine(x0, y0, x4, y4);
    Group root = new Group();
    root.getChildren().add(line);

    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.HONEYDEW);
    stage.setTitle("Koch Line");
    stage.setScene(scene);
    stage.show();
  }
}
