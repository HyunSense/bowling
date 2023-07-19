package org.bowling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int count = 2;
        int totalScore = 0;
        int frame = 0;

        boolean run = true;

        while (run) {
            int score = 0;
            int pin = 10;
            frame++;
            System.out.println("-----FRAME [" + frame + "] -----");

            for (int i=0; i < count; i++) {
                sc.nextInt();
                // 랜덤 확률이 더 낮아져야함 -> 낮은숫자가 나와야함
                score = (int) ((Math.random() * 11));
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

            }
            if (frame == 10) {
                run = false;
            }
        }


    }
}
