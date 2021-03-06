package br.com.antoniosergius.calculojurosfx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class FxmlMain extends Application {

   public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("Layout.fxml"));

      Scene scene = new Scene(root, 320, 357);
      primaryStage.setTitle("Juros Compostos");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String args[]) {
      launch(args);
   }
}
