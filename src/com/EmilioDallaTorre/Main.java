package com.EmilioDallaTorre;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        for(;;){
            Classify.classify(input.nextLine());
        }
    }
}
