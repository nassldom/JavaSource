import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class NestedRectangle extends Application {

    @Override
    public void start(Stage primaryStage) {
        double sceneWidth = 300, sceneHeight = sceneWidth * 0.75,
               sceneCenterX = sceneWidth / 2, sceneCenterY = sceneHeight / 2;

        double rectWidth, rectHeight;
        double x, y;

        Pane pane = new Pane();

        // First rectangle
        rectWidth  = sceneWidth * 0.8;
        rectHeight = sceneHeight * 0.8;
        x = (sceneWidth - rectWidth) / 2;
        y = (sceneHeight - rectHeight) / 2;
        Rectangle rectA = new Rectangle(x, y, rectWidth, rectHeight);
        rectA.setFill(Color.YELLOW);
        rectA.setStroke(Color.GREY);
        pane.getChildren().add(rectA);

        // Second rectangle
        rectWidth  = rectWidth * 0.6;
        rectHeight = rectHeight * 0.6;
        x = (sceneWidth - rectWidth) / 2;
        y = (sceneHeight - rectHeight) / 2;
        Rectangle rectB = new Rectangle(x, y, rectWidth, rectHeight);
        rectB.setFill(Color.GREEN);
        rectB.setStroke(Color.BLACK);
        pane.getChildren().add(rectB);

        // Third rectangle
        rectWidth  = rectWidth * 0.6;
        rectHeight = rectHeight * 0.6;
        x = (sceneWidth - rectWidth) / 2;
        y = (sceneHeight - rectHeight) / 2;
        Rectangle rectC = new Rectangle(x, y, rectWidth, rectHeight);
        rectC.setFill(Color.BLUE);
        rectC.setStroke(Color.DARKGREEN);
        pane.getChildren().add(rectC);

        Scene scene = new Scene(pane, sceneWidth, sceneHeight, Color.GHOSTWHITE);

        primaryStage.setTitle("Nested Rectangles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
