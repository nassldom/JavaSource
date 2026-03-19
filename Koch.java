import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.*;

public class Koch extends Application {

  @Override
  public void start(Stage stage) {
    double sceneWidth = 400, sceneHeight = 400;

    // Exakt die Koordinaten der Lehrseite
    double x0 = sceneWidth*0.1,  y0 = sceneHeight*0.74;
    double x1 = sceneWidth*0.5,  y1 = sceneHeight*0.04;
    double x2 = sceneWidth*0.9,  y2 = sceneHeight*0.74;

    // Uhrzeigersinn wie auf der Lehrseite
    KLine left   = new KLine( x0, y0, x1, y1 );
    KLine right  = new KLine( x1, y1, x2, y2 );
    KLine bottom = new KLine( x2, y2, x0, y0 );

    Group root = new Group();
    root.getChildren().addAll( left, right, bottom );
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.HONEYDEW);

    stage.setTitle("Koch Snowflake");
    stage.setScene(scene);
    stage.show();
  }
}
