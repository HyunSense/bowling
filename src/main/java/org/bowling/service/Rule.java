package org.bowling.service;

import org.bowling.dto.Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Rule {



    public void bowlingRule(int score, int pin) {


        //pin 이 10개인 상황에서 score 가 한번에 10점인 경우
        if (pin == 10 && (pin-score) == 0) {
            System.out.println("===STRIKE 입니다!!===");


        // 나머지 pin 을 모두 쓰러트렸을때
        } else if (pin != 10 && (pin-score) == 0) {
            System.out.println("===SPARE 입니다!!===");

        }
    }

    public void addScore(List<Integer> list, int score) {

        Score scoreObj = new Score();
        list.add(score);
    }
}
