package controller;

import classes.Midi;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
    public void playButtonOnAction()
    {
        System.out.println();
    }

    @FXML
    public void stopButtonOnAction()
    {
        System.out.println("Stop");
    }

    @FXML
    public void exitButtonOnAction()
    {
        System.exit(0);
    }

    @FXML
    public void checkbox0_0OnAction()
    {
        System.out.println("0_0");
    }

    @FXML
    private Button exitButton;

    @FXML
    private CheckBox checkbox7_11;

    @FXML
    private CheckBox checkbox7_10;

    @FXML
    private CheckBox checkbox7_15;

    @FXML
    private CheckBox checkbox7_14;

    @FXML
    private CheckBox checkbox7_13;

    @FXML
    private CheckBox checkbox7_12;

    @FXML
    private CheckBox checkbox0_0;

    @FXML
    private CheckBox checkbox0_1;

    @FXML
    private CheckBox checkbox1_5;

    @FXML
    private CheckBox checkbox1_6;

    @FXML
    private CheckBox checkbox1_7;

    @FXML
    private CheckBox checkbox1_8;

    @FXML
    private CheckBox checkbox9_0;

    @FXML
    private CheckBox checkbox1_1;

    @FXML
    private CheckBox checkbox1_2;

    @FXML
    private CheckBox checkbox1_3;

    @FXML
    private CheckBox checkbox1_4;

    @FXML
    private CheckBox checkbox9_5;

    @FXML
    private CheckBox checkbox9_6;

    @FXML
    private CheckBox checkbox9_7;

    @FXML
    private CheckBox checkbox9_8;

    @FXML
    private CheckBox checkbox1_9;

    @FXML
    private CheckBox checkbox9_1;

    @FXML
    private CheckBox checkbox9_2;

    @FXML
    private CheckBox checkbox9_3;

    @FXML
    private CheckBox checkbox9_4;

    @FXML
    private CheckBox checkbox9_9;

    @FXML
    private ScrollBar tempoScrollBar;

    @FXML
    private CheckBox checkbox1_11;

    @FXML
    private CheckBox checkbox1_10;

    @FXML
    private CheckBox checkbox1_13;

    @FXML
    private CheckBox checkbox1_12;

    @FXML
    private CheckBox checkbox1_15;

    @FXML
    private CheckBox checkbox1_14;

    @FXML
    private CheckBox checkbox0_6;

    @FXML
    private CheckBox checkbox6_10;

    @FXML
    private CheckBox checkbox0_7;

    @FXML
    private CheckBox checkbox0_8;

    @FXML
    private CheckBox checkbox8_0;

    @FXML
    private CheckBox checkbox0_9;

    @FXML
    private CheckBox checkbox8_1;

    @FXML
    private CheckBox checkbox0_2;

    @FXML
    private CheckBox checkbox6_14;

    @FXML
    private CheckBox checkbox0_3;

    @FXML
    private CheckBox checkbox6_13;

    @FXML
    private CheckBox checkbox0_4;

    @FXML
    private CheckBox checkbox6_12;

    @FXML
    private CheckBox checkbox0_5;

    @FXML
    private CheckBox checkbox6_11;

    @FXML
    private CheckBox checkbox8_6;

    @FXML
    private CheckBox checkbox8_7;

    @FXML
    private CheckBox checkbox8_8;

    @FXML
    private CheckBox checkbox8_9;

    @FXML
    private CheckBox checkbox8_2;

    @FXML
    private CheckBox checkbox8_3;

    @FXML
    private CheckBox checkbox8_4;

    @FXML
    private CheckBox checkbox8_5;

    @FXML
    private CheckBox checkbox6_15;

    @FXML
    private CheckBox checkbox3_10;

    @FXML
    private CheckBox checkbox3_11;

    @FXML
    private CheckBox checkbox3_14;

    @FXML
    private CheckBox checkbox3_15;

    @FXML
    private CheckBox checkbox3_12;

    @FXML
    private CheckBox checkbox3_13;

    @FXML
    private CheckBox checkbox8_13;

    @FXML
    private CheckBox checkbox7_0;

    @FXML
    private CheckBox checkbox8_14;

    @FXML
    private CheckBox checkbox7_1;

    @FXML
    private CheckBox checkbox8_15;

    @FXML
    private CheckBox checkbox7_2;

    @FXML
    private CheckBox checkbox8_10;

    @FXML
    private CheckBox checkbox8_11;

    @FXML
    private CheckBox checkbox8_12;

    @FXML
    private CheckBox checkbox7_7;

    @FXML
    private CheckBox checkbox7_8;

    @FXML
    private CheckBox checkbox7_9;

    @FXML
    private CheckBox checkbox7_3;

    @FXML
    private CheckBox checkbox7_4;

    @FXML
    private CheckBox checkbox7_5;

    @FXML
    private CheckBox checkbox7_6;

    @FXML
    private CheckBox checkbox6_0;

    @FXML
    private CheckBox checkbox6_1;

    @FXML
    private CheckBox checkbox6_2;

    @FXML
    private CheckBox checkbox6_3;

    @FXML
    private CheckBox checkbox2_10;

    @FXML
    private CheckBox checkbox6_8;

    @FXML
    private CheckBox checkbox6_9;

    @FXML
    private CheckBox checkbox6_4;

    @FXML
    private CheckBox checkbox6_5;

    @FXML
    private Button playButton;

    @FXML
    private CheckBox checkbox6_6;

    @FXML
    private CheckBox checkbox6_7;

    @FXML
    private CheckBox checkbox2_12;

    @FXML
    private CheckBox checkbox2_11;

    @FXML
    private CheckBox checkbox2_14;

    @FXML
    private CheckBox checkbox2_13;

    @FXML
    private CheckBox checkbox2_15;

    @FXML
    private CheckBox checkbox11_10;

    @FXML
    private CheckBox checkbox11_11;

    @FXML
    private CheckBox checkbox11_12;

    @FXML
    private CheckBox checkbox11_13;

    @FXML
    private CheckBox checkbox11_14;

    @FXML
    private CheckBox checkbox5_1;

    @FXML
    private CheckBox checkbox5_2;

    @FXML
    private CheckBox checkbox5_3;

    @FXML
    private CheckBox checkbox5_4;

    @FXML
    private CheckBox checkbox4_11;

    @FXML
    private CheckBox checkbox4_12;

    @FXML
    private CheckBox checkbox4_10;

    @FXML
    private CheckBox checkbox5_0;

    @FXML
    private CheckBox checkbox5_9;

    @FXML
    private CheckBox checkbox5_5;

    @FXML
    private CheckBox checkbox5_6;

    @FXML
    private CheckBox checkbox5_7;

    @FXML
    private CheckBox checkbox5_8;

    @FXML
    private CheckBox checkbox10_5;

    @FXML
    private CheckBox checkbox10_6;

    @FXML
    private CheckBox checkbox10_7;

    @FXML
    private CheckBox checkbox10_8;

    @FXML
    private CheckBox checkbox10_9;

    @FXML
    private CheckBox checkbox4_15;

    @FXML
    private CheckBox checkbox4_13;

    @FXML
    private CheckBox checkbox4_14;

    @FXML
    private CheckBox checkbox10_0;

    @FXML
    private CheckBox checkbox10_1;

    @FXML
    private CheckBox checkbox10_2;

    @FXML
    private Label tempoLabel;

    @FXML
    private CheckBox checkbox10_3;

    @FXML
    private CheckBox checkbox10_4;

    @FXML
    private CheckBox checkbox9_14;

    @FXML
    private CheckBox checkbox9_15;

    @FXML
    private CheckBox checkbox9_10;

    @FXML
    private CheckBox checkbox9_11;

    @FXML
    private CheckBox checkbox9_12;

    @FXML
    private CheckBox checkbox9_13;

    @FXML
    private CheckBox checkbox4_2;

    @FXML
    private CheckBox checkbox4_3;

    @FXML
    private CheckBox checkbox4_4;

    @FXML
    private CheckBox checkbox4_5;

    @FXML
    private CheckBox checkbox4_0;

    @FXML
    private CheckBox checkbox4_1;

    @FXML
    private CheckBox checkbox11_15;

    @FXML
    private CheckBox checkbox4_6;

    @FXML
    private CheckBox checkbox4_7;

    @FXML
    private CheckBox checkbox4_8;

    @FXML
    private CheckBox checkbox4_9;

    @FXML
    private CheckBox checkbox11_4;

    @FXML
    private CheckBox checkbox11_5;

    @FXML
    private CheckBox checkbox11_6;

    @FXML
    private CheckBox checkbox11_7;

    @FXML
    private CheckBox checkbox11_8;

    @FXML
    private CheckBox checkbox11_9;

    @FXML
    private Button stopButton;

    @FXML
    private CheckBox checkbox11_0;

    @FXML
    private CheckBox checkbox11_1;

    @FXML
    private CheckBox checkbox11_2;

    @FXML
    private CheckBox checkbox11_3;

    @FXML
    private CheckBox checkbox3_3;

    @FXML
    private CheckBox checkbox3_4;

    @FXML
    private CheckBox checkbox3_5;

    @FXML
    private CheckBox checkbox3_6;

    @FXML
    private CheckBox checkbox3_0;

    @FXML
    private CheckBox checkbox3_1;

    @FXML
    private CheckBox checkbox3_2;

    @FXML
    private CheckBox checkbox3_7;

    @FXML
    private CheckBox checkbox3_8;

    @FXML
    private CheckBox checkbox3_9;

    @FXML
    private CheckBox checkbox0_10;

    @FXML
    private CheckBox checkbox0_11;

    @FXML
    private CheckBox checkbox0_12;

    @FXML
    private CheckBox checkbox0_13;

    @FXML
    private CheckBox checkbox0_14;

    @FXML
    private CheckBox checkbox0_15;

    @FXML
    private CheckBox checkbox5_13;

    @FXML
    private CheckBox checkbox5_12;

    @FXML
    private CheckBox checkbox5_11;

    @FXML
    private CheckBox checkbox5_10;

    @FXML
    private CheckBox checkbox10_14;

    @FXML
    private CheckBox checkbox10_15;

    @FXML
    private CheckBox checkbox5_15;

    @FXML
    private CheckBox checkbox1_0;

    @FXML
    private CheckBox checkbox5_14;

    @FXML
    private CheckBox checkbox2_4;

    @FXML
    private CheckBox checkbox2_5;

    @FXML
    private CheckBox checkbox2_6;

    @FXML
    private CheckBox checkbox2_7;

    @FXML
    private CheckBox checkbox2_0;

    @FXML
    private CheckBox checkbox2_1;

    @FXML
    private CheckBox checkbox2_2;

    @FXML
    private CheckBox checkbox2_3;

    @FXML
    private CheckBox checkbox2_8;

    @FXML
    private CheckBox checkbox2_9;

    @FXML
    private CheckBox checkbox10_10;

    @FXML
    private CheckBox checkbox10_11;

    @FXML
    private CheckBox checkbox10_12;

    @FXML
    private CheckBox checkbox10_13;

}
