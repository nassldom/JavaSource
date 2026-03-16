import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class EmojiStackPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        double width = 400.0, height = width * 0.75;

        double radiusFace  = width / 3.0;
        double radiusEye   = radiusFace * 0.13;
        double radiusMouth = radiusFace * 0.25;
        double mouthX      = 0.0;
        double mouthY      = radiusFace * 0.35;
        double eyeY        = -radiusFace * 0.26;
        double leftEyeX    = -radiusFace * 0.30;
        double rightEyeX   = -leftEyeX;

        Circle face = new Circle(radiusFace);
        face.setFill(new Color(0.98, 0.82, 0.38, 1.0));

        Circle mouth = new Circle(mouthX, mouthY, radiusMouth);
        mouth.setFill(new Color(0.45, 0.35, 0.15, 1.0));

        Circle leftEye = new Circle(leftEyeX, eyeY, radiusEye);
        leftEye.setFill(new Color(0.45, 0.35, 0.15, 1.0));

        Circle rightEye = new Circle(rightEyeX, eyeY, radiusEye);
        rightEye.setFill(new Color(0.45, 0.35, 0.15, 1.0));

        Group eyes = new Group(leftEye, rightEye);
        Group emoji = new Group(face, mouth, eyes);

        StackPane pane = new StackPane(emoji);

        Scene scene = new Scene(pane, width, height, Color.LIGHTCYAN);

        primaryStage.setTitle("What! A StackPane can do This?!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
