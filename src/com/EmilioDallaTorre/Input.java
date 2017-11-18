package com.EmilioDallaTorre;

import java.util.Scanner;

public class Input {
    public static void Input() throws Exception {
        Scanner input = new Scanner(System.in);
            for (; ; ) {
                Classify.classify(input.nextLine());
            }
        }
    }
