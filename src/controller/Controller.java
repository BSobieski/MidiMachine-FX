package controller;

import classes.Midi;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;

public class Controller
{
    private Midi midi;

    public Controller()
    {
        midi = new Midi();
    }

    @FXML
    public void initialize()
    {
        tempoLabel.setText("Tempo: " + midi.getTempo());
        tempoScrollBarAddValueListener();
    }

    @FXML
    public void tempoScrollEndOfEditingTempo()
    {
        midi.configureMIDI();
        System.out.println("end");
    }

    @FXML
    private void setTempoLabel()
    {
        tempoLabel.setText("Tempo: " + midi.getTempo());
    }

    private void tempoScrollBarAddValueListener()
    {
        tempoScrollBar.valueProperty().addListener(event ->
        {
            midi.setTempo((int) tempoScrollBar.getValue());
            setTempoLabel();
            //midi.configureMIDI();
        });
    }

    @FXML
    public void playButtonOnAction()
    {
        midi.createAndPlay();
    }

    @FXML
    public void stopButtonOnAction()
    {
        midi.stopPlay();
    }

    @FXML
    public void exitButtonOnAction()
    {
        System.exit(0);
    }


    @FXML
    private Button exitButton;

    @FXML
    private ScrollBar tempoScrollBar;

    @FXML
    private Button playButton;

    @FXML
    private Label tempoLabel;

    @FXML
    private Button stopButton;
}