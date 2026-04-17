import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Calendar;

public class ColorOfDay extends Application {

    @Override
    public void start(Stage stage) {
        double size = 300;

        Pane root = new Pane();

        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);

        int r = (month * 31 + day * 7 + year) % 256;
        int g = (month * 53 + day * 11 + year * 3) % 256;
        int b = (month * 17 + day * 19 + year * 5) % 256;

        Color color = Color.rgb(r, g, b);

        Circle circle = new Circle(size / 2.0, size / 2.0, size / 3.0);
        circle.setFill(color);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        root.getChildren().add(circle);

        Scene scene = new Scene(root, size, size, Color.WHITESMOKE);
        stage.setTitle("Color of the Day");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}