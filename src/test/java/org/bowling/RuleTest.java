package org.bowling;

import org.bowling.service.Rule;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleTest {

    Rule rule = new Rule();
    Map<Integer, List<Integer>> map = new HashMap<>();

    @Test
    void rule() {
//        int frame = 10;
        int pin = 10;
        int score = 5;
        List<Integer> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        rule.bowlingRule(score, pin);
        rule.addScore(list, 5);

        map.put(1, list);
    }

    @Test
    void play() {

        boolean run = true;
        int frame = 0;


        while (run) {
            int score = 0;
            int pin = 10;

            List<Integer> list = new ArrayList<>();

            frame++;
            System.out.println("===FRAME " + frame + "===");
            for (int i=0; i<2; i++) {
                score = (int) (Math.random() * (11 - score));
                pin -= score;

                rule.bowlingRule(score, pin);
                rule.addScore(list, score);

            }
            map.put(frame, list);

            if (frame == 10) {
                run = false;
            }
        }
        for (int i=0; i<10; i++) {
            System.out.println("===FRAME "+ (i+1) + "===");
            for (int j = 0; j < 2; j++) {
                Integer score = map.get(i+1).get(j);
                System.out.println("score = " + score);

            }
        }
    }
}
