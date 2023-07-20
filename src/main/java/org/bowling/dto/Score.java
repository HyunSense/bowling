package org.bowling.dto;

import java.util.List;

public class Score {

    List<Integer> scoreList;

    int totalScore;

    public int setTotalScore() {

        for (int i : scoreList) {
            totalScore += i;
        }

        return totalScore;
    }


}
