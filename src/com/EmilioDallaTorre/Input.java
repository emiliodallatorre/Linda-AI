package com.EmilioDallaTorre;

import java.util.Scanner;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.WordResult;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;

public class Input {
    public static void Input() throws Exception {
        Configuration configuration = new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
        SpeechResult result;
        LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
        recognizer.startRecognition(true);
        Scanner input = new Scanner(System.in);
        while ((result = recognizer.getResult()) != null) {
            if (recognizer.getResult().toString().length() == 0) {
                System.out.format("Say Again!");
            } else {
                System.out.format("You Said: %s\n",
                        recognizer.getResult());
            }
            recognizer.stopRecognition();
            for (; ; ) {
                Classify.classify(input.nextLine());
            }
        }
    }
}