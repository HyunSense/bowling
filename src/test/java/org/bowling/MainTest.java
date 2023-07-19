package org.bowling;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Scanner sc = new Scanner(System.in);


    @Test
    void action() {


        int count = 2;
        int totalScore = 0;
        int frame = 0;

        boolean run = true;

        while (run) {

            frame++;
            System.out.println("-----FRAME [" + frame + "] -----");

            int pin = 10;
            sc.nextInt();
            int score = (int) (Math.random() * 11);
            System.out.println("score = " + score);

            totalScore += score;
            System.out.println("totalScore = " + totalScore);

            pin -= score;
            System.out.println("PIN REMAIN " + pin);

            if (score == 10) {
                System.out.println("-----STRIKE-----");
                pin = 0;

                System.out.println();
                System.out.println("-----NEXT FRAME-----");
            }

            if (pin == 0) {
                System.out.println("-----NEXT FRAME-----");
                continue;
            }


            if (frame == 10) {
                run = false;
            }
        }




    }
}