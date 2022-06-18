package com.bridgelabz;

public class GamblingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulation Game..........!");
        int Gamebet = 1, Daystake = 100;
        int game = (int) (Math.random() * 2);
        if (game == 1) {
            Daystake += Gamebet;
            System.out.println("Win game = " + Daystake);
        } else {
            Daystake -= Gamebet;
            System.out.println("Loose game = " + Daystake);
        }
    }
    }
}

