package com.bridgelabz;

public class GamblingGame {
    public static final int Gamebet = 1;
    public static int Daystake = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Game.............!");
        while (true) {
            for (int i = 0; i < 100; i++) {

                int game = (int) (Math.random() * 2);
                if (game == 1) {
                    Daystake += Gamebet;
                } else {
                    Daystake -= Gamebet;
                }
            }

            if (Daystake >= 150) {
                System.out.println("Win 50%:Resign the day");
                break;
            }
            if (Daystake == 50) {
                System.out.println("Loose 50%:Resign the day");
                break;
            }
        }
    }
}

