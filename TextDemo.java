import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class TextDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 400.0, sceneHeight = 300.0;

        double[] verticesA = {150, 50, 50, 175, 175, 175};
        double[] verticesO = {225, 50, 275, 175, 375, 175};

        Polyline angleA = new Polyline(verticesA);
        angleA.setStrokeWidth(2.0);
        Polyline angleO = new Polyline(verticesO);
        angleO.setStrokeWidth(2.0);

        Text textA = new Text(70, 200, "Acute Angle");
        textA.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Text textO = new Text(230, 200, "Obtuse Angle");
        textO.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Pane pane = new Pane(angleA, angleO, textA, textO);
        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.FLORALWHITE);

        primaryStage.setTitle("Acute Angle Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
