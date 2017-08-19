package com.EmilioDallaTorre;

import com.sun.speech.freetts.*;

import javax.swing.*;
import java.util.concurrent.Executors;

public class GUI extends JFrame {
    void giveResponse(String risposta) {
        System.out.println(risposta);
        Executors.newSingleThreadExecutor().execute(() -> {
            String VOICENAME = "kevin16";
            Voice voice;
            VoiceManager voiceManager = VoiceManager.getInstance();
            voice = voiceManager.getVoice(VOICENAME);
            voice.allocate();
            voice.speak(risposta);
        });
    }
}