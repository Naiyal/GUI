import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App2 extends Application {
    @Override
    public void start(Stage arg0) throws Exception {
        ;
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        ;
        btn1.setOnAction(e -> sum(1));
        btn2.setOnAction(e -> sum(2));
        btn3.setOnAction(e -> sum(3));
        btn4.setOnAction(e -> sum(4));
        btn5.setOnAction(e -> sum(5));
        btn6.setOnAction(e -> sum(6));
        btn7.setOnAction(e -> sum(7));
        btn8.setOnAction(e -> sum(8));
        btn9.setOnAction(e -> sum(9));
        ;

        ;
        btn1.setMinSize(75, 70);
        btn2.setMinSize(75, 70);
        btn3.setMinSize(75, 70);
        btn4.setMinSize(75, 70);
        btn5.setMinSize(75, 70);
        btn6.setMinSize(75, 70);
        btn7.setMinSize(75, 70);
        btn8.setMinSize(75, 70);
        btn9.setMinSize(75, 70);
        ;
        Label text = new Label("result");
        text.setMinSize(75, 70);
        Pane pane = new VBox(text);
        ;
        Pane pane1 = new VBox(btn1, btn4, btn7);
        Pane pane2 = new VBox(btn2, btn5, btn8);
        Pane pane3 = new VBox(btn3, btn6, btn9);
        ;
        Pane pane4 = new HBox(pane1, pane2, pane3);
        Pane pane5 = new VBox(pane, pane4);
        pane5.setMinSize(225, 250);
        ;
        Scene scene = new Scene(pane5);
        ;
        btn1.setOnAction(e -> text.setText(String.valueOf(s)));
        btn2.setOnAction(e -> text.setText(String.valueOf(s)));
        btn3.setOnAction(e -> text.setText(String.valueOf(s)));
        btn4.setOnAction(e -> text.setText(String.valueOf(s)));
        btn5.setOnAction(e -> text.setText(String.valueOf(s)));
        btn6.setOnAction(e -> text.setText(String.valueOf(s)));
        btn7.setOnAction(e -> text.setText(String.valueOf(s)));
        btn8.setOnAction(e -> text.setText(String.valueOf(s)));
        btn9.setOnAction(e -> text.setText(String.valueOf(s)));

        ;
        arg0.setTitle("Calculatr Sum");
        arg0.setScene(scene);
        arg0.show();

    }

    public static void main(String[] args) {
        launch(args);
        System.out.println(s);

    }

    static int s = 0;

    public static void sum(int n) {
        s += n;
    }
}
