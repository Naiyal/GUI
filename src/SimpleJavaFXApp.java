// package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // إنشاء Label وزر
        Label label = new Label("مرحبًا بكم في JavaFX!");
        Button button = new Button("انقر هنا لتغيير النص");

        // إضافة معالج حدث للزر
        button.setOnAction(event -> label.setText("تم النقر على الزر!"));

        // إنشاء حاوية عمودية وإضافة العناصر إليها
        VBox vbox = new VBox(label, button);
        vbox.setSpacing(10);

        // إنشاء مشهد وإضافته إلى المرحلة (Stage)
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("تطبيق JavaFX بسيط");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
