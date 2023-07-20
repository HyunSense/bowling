package org.bowling.service;

import org.bowling.util.ConsoleUiPrint;

import java.util.ArrayList;
import java.util.List;

import static org.bowling.util.ConsoleUiPrint.*;

public class BowlingService {



    //TODO: frame 네이밍 수정 필요
    public void frame(int count) {
        List<Integer> scores = new ArrayList<>();

        int frame = 0;

        frame++;
        printFrame(frame);
        scorePerFrame(count, scores);


    }

    public void scorePerFrame(int count, List<Integer> scoreList) {

        int score = 0;
        int pin = 10;

        for (int i = 0; i < count; i++) {
            score = (int) (Math.random() * (11 - score));
            pin -= score;
        }

        scoreList.add(score);
    }
}
