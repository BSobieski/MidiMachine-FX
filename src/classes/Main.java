package classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
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
        //creating grid pane with checkboxes
        Midi midi = new Midi();
        AnchorPane anchorPane = new AnchorPane();
        //gridPane.setHgap(10);
        //gridPane.setVgap(9.8);
        anchorPane.setPrefWidth(460);
        anchorPane.setPrefHeight(364);
        for(int i = 0; i<12; i++)
        {
            for(int j=0; j<16; j++)
            {
                CheckBox checkBox = new CheckBox();
                checkBox.setText("");
                checkBox.setLayoutX(j*27);
                checkBox.setLayoutY(i*29.05);
                midi.checkBoxTab[i][j] = checkBox;
                anchorPane.getChildren().add(checkBox);
            }
        }
        borderPane.setCenter(anchorPane);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
