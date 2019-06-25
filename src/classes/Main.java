package classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/view/app.fxml"));
        BorderPane borderPane = loader.load();

        Scene scene = new Scene(borderPane);

        primaryStage.setTitle("MidiMachine FX");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
