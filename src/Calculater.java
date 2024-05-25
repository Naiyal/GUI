import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Calculater extends Application {

    @Override
    public void start(Stage arg0) throws Exception {
        Label text1 = new Label("Number1:");
        Label text2 = new Label("Number2:");
        Label text3 = new Label("sum:");
        Button btn = new Button("Get Sum");
        TextField field1 = new TextField();
        TextField field2 = new TextField();

        btn.setOnAction(e -> text3
                .setText("sum: " + sum(Integer.parseInt(field1.getText()), Integer.parseInt(field2.getText()))));

        BackgroundFill background = new BackgroundFill(
                Color.LIGHTSKYBLUE,
                CornerRadii.EMPTY,
                Insets.EMPTY);

        HBox hbox1 = new HBox(text1, field1);
        HBox hbox2 = new HBox(text2, field2);
        VBox vbox = new VBox(hbox1, hbox2, text3, btn);
        vbox.setSpacing(10);
        vbox.setBackground(new Background(background));
        vbox.setAlignment(Pos.BASELINE_CENTER);

        Pane pane = new Pane(vbox);
        // pane.setMinSize(300, 400);

        Scene scene = new Scene(pane, 250, 300);

        arg0.setTitle("Calculator");
        arg0.setScene(scene);
        arg0.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    static int s = 0;

    public static int sum(int n1, int n2) {
        s = n1 + n2;
        return s;
    }

}
