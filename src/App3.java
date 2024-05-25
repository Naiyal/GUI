import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class App3 extends Application {

    public static void main(String[] args) throws Exception, FileNotFoundException {
        launch(args);
    }

    static int x;
    static int y = 14700;

    @Override
    public void start(Stage arg0) throws Exception, FileNotFoundException {
        Label label = new Label("Enter Money");
        TextField tf = new TextField();
        Button btn1 = new Button("Transfer");
        TextArea ta = new TextArea();
        Button btn2 = new Button("Save");

        btn2.setMaxWidth(Double.MAX_VALUE);

        btn1.setOnAction(e -> {

            x = Integer.parseInt(tf.getText());
            int s = x * y;
            ta.setText("The amount of conversion of $" + tf.getText() + " into the Syrian pound is " + String.valueOf(s)
                    + "SP");
        });

        btn2.setOnAction(e -> {

            FileChooser file1 = new FileChooser();
            file1.setTitle("File");
            file1.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text files", "*.txt"));
            File f = file1.showSaveDialog(arg0);

            try {
                PrintWriter file = new PrintWriter(f);
                file.println(ta.getText());
                file.close();
            } catch (Exception k) {
                System.out.println(k);
            }

        });

        // label.setPadding(new Insets(50));
        label.setFont(new Font("Arial", 20));

        HBox hbox = new HBox(10, label, tf);
        hbox.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(10, hbox, btn1, ta, btn2);
        vbox.setAlignment(Pos.CENTER);

        Pane pane = new Pane(vbox);

        Scene scene = new Scene(pane, 450, 300);

        arg0.setTitle("Money Transfer App");
        arg0.setScene(scene);
        arg0.show();

    }

}
