package javagui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class JavaFXMain extends Application {

    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("Coba Tugas OOP");
        btn.setLayoutX(200);
        btn.setLayoutY(100);
        btn.setOnAction ((ActionEvent event) -> {
            System.out.println("Hello Object Oriented!");
        });
        
        Button btn2 = new Button ();
        btn2.setText("Halo, Yuk Mulai!");
        btn2.setLayoutX(500);
        btn2.setLayoutY(400);
        
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        HBox root2 = new HBox();
        
        for(int i=0; i<6; i++){
            Button b = new Button (" Menu " + i);
            root2.getChildren().add(b);
        }
        root2.setLayoutX(0);
        root2.setLayoutY(400);
        root.getChildren().add(root2);
        
        Scene scene = new Scene (root, 640, 480);
        
        primaryStage.setTitle("Coba Tugas OOP");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
}
