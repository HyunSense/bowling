package org.bowling.util;

public class ConsoleUiPrint {

    public static void printServiceStartUI() {

        System.out.println("============== 게임을 시작합니다. ==============");
        System.out.println("=== 1. 시작하기 ===");
        System.out.println("=== 2. 점수판 보기 ===");
        System.out.println("=== 3. 회원정보 보기 ===");
        System.out.println("=== 4. 종료하기 ===");

    }

    public static void printServiceExit() {

        System.out.println("============== 게임을 종료합니다. ==============");
    }

    public static void printFrame(int frame) {

        System.out.println("============== FRAME  [" + frame + "]  ==============");

    }

    // TODO: 2023-07-20 Strike, Spare 등 점수표시부분 메서드 네이밍 수정 필요
    public static void printScoreWord(int score, int pin) {

        //STRIKE
        if (pin == 10 && (pin - score) == 0) {
            System.out.println("=== Strike !!! ===");
        } else if (pin != 10 && (pin - score == 0)) {
            System.out.println("=== Spare !!! ===");
        }

    }

}
