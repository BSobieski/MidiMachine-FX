package classes;

import controller.Controller;

import javax.sound.midi.*;

public class Midi
{
    private Sequencer sequencer;
    private Sequence sequence;
    private Track track;
    private int instrumentNumbers[] = {46, 42, 50, 48, 47, 45, 43, 41, 38, 35, 49, 51};
    public boolean playTab[][];
    private int tempo = 120;

    public int getTempo()
    {
        return tempo;
    }

    public void setTempo(int tempo)
    {
        this.tempo = tempo;
    }

    public Midi()
    {
        playTab = new boolean[12][16];
        configureMIDI();
    }

    private void configureMIDI()
    {
        try
        {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(tempo);
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void createAndPlay()
    {
        int[] trackList = null;

        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 12; i++)
        {
            trackList = new int[16];

            int key = instrumentNumbers[i];

            for (int j = 0; j < 16; j++)
            {
                if (playTab[i][j])
                    trackList[j] = key;
                else
                    trackList[j] = 0;
            }

            createTrack(trackList);
            track.add(createEvent(176,1,127,0,16));
        }

        try
        {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(tempo);
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private void createTrack(int[] list)
    {
        for (int i = 0; i < 16; i++)
        {
            int key = list[i];
            if (key != 0)
            {
                track.add(createEvent(144, 9, key, 100, i));
                track.add(createEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    private static MidiEvent createEvent(int code, int canal, int first, int second, int beat)
    {
        MidiEvent event = null;
        try
        {
            ShortMessage message = new ShortMessage();
            message.setMessage(code, canal, first, second);
            event = new MidiEvent(message, beat);
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return event;
    }
}
