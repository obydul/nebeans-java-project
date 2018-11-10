package com.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Test");
        Button btnExit = new Button("Exit");
        StackPane layout = new StackPane();
//        button.setOnAction(new ButtonAction());
        button.setOnAction(this);
        layout.getChildren().add(button);
        layout.getChildren().add(btnExit);
        Scene myscene = new Scene(layout, 300, 500);
        stage.setScene(myscene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent t) {
        System.out.println("JavaFX");
    }
}

//class ButtonAction implements EventHandler<ActionEvent>{
//
//    @Override
//    public void handle(ActionEvent t) {
//        System.out.println("JavaFX");
//    }
//    
//}
