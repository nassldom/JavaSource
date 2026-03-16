import javafx.application.*;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

import java.util.Random;

public class RandomLines extends Application {

    @Override
    public void start(Stage stage) {
        final int NUMLINES = 21;

        double sceneWidth = 400, sceneHeight = sceneWidth * 0.75;
        double startX, startY, endX, endY;
        Random rand = new Random();
        Pane root = new Pane();
        Line line;

        for (int j = 0; j < NUMLINES; j++) {
            startX = rand.nextDouble() * sceneWidth;
            startY = rand.nextDouble() * sceneHeight;
            endX   = rand.nextDouble() * sceneWidth;
            endY   = rand.nextDouble() * sceneHeight;

            line = new Line(startX, startY, endX, endY);
            line.setStrokeWidth(2.0);

            if (j % 7 == 0)
                line.setStroke(Color.RED);
            else if (j % 7 == 1)
                line.setStroke(Color.ORANGE);
            else if (j % 7 == 2)
                line.setStroke(Color.YELLOW.darker());
            else if (j % 7 == 3)
                line.setStroke(Color.GREEN);
            else if (j % 7 == 4)
                line.setStroke(Color.BLUE);
            else if (j % 7 == 5)
                line.setStroke(Color.INDIGO);
            else
                line.setStroke(Color.VIOLET);

            root.getChildren().add(line);
        }

        Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.GHOSTWHITE);
        stage.setTitle("Random Lines");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
