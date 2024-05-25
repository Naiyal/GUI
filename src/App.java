import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(sum(4, 50, 70, 5));
        launch(args);
    }

    @Override
    public void start(Stage args) throws Exception {
        Button a = new Button("click on button");// this node
        Label text = new Label("this application");

        Pane p = new VBox(a, text);// node inside pane

        // p.getChildren().addAll(a, text);
        p.setMinSize(400, 400);
        // a.relocate(150, 150);
        // a.setOnAction(event -> text.setText("please do not click button"));
        a.setOnAction(event -> System.out.println("Button clicked"));

        Scene s = new Scene(p);// pane inside scene

        args.setScene(s); // scene inside stage
        args.setTitle("Title");
        args.show();
    }

    public static int sum(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }

}
