import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class TriangleDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 400.0, sceneHeight = 300.0;
        double sceneCenterX = sceneWidth / 2;
        double sceneCenterY = sceneHeight / 2;

        double triHeight = sceneHeight * 0.75;
        double triWidth  = sceneWidth * 0.5;

        double triBaseY = sceneCenterY + triHeight / 2;

        double triTopX = sceneCenterX;
        double triTopY = triBaseY - triHeight;

        double triLeftX  = sceneCenterX - triWidth / 2;
        double triLeftY  = triBaseY;
        double triRightX = sceneCenterX + triWidth / 2;
        double triRightY = triBaseY;

        double[] vertices = { triRightX, triRightY,
                              triTopX,   triTopY,
                              triLeftX,  triLeftY };
        Polygon triangle = new Polygon(vertices);
        triangle.setFill(new Color(0.8, 0.2, 0.1, 1.0));

        Line lineH = new Line(0, sceneCenterY, sceneWidth, sceneCenterY);
        lineH.setStroke(new Color(0.2, 0.2, 0.2, 0.5));

        Line lineV = new Line(sceneCenterX, 0, sceneCenterX, sceneHeight);
        lineV.setStroke(new Color(0.2, 0.2, 0.2, 0.5));

        Pane pane = new Pane(triangle, lineH, lineV);
        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.FLORALWHITE);

        primaryStage.setTitle("Triangle Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
