package com.company;
import java.util.Scanner;
public class Main {
    public static int getRandomNumber() {
        return (int) (Math.random() * 3) + 1;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to my first game.");
        System.out.println("Rock hit Scissors, Scissors hit Paper, Paper hit Rock.");
         for (int y = 0; y < 10; y++) {
            System.out.println("Please take your choice, or any to exit");
            Scanner s = new Scanner(System.in);
            String i = s.nextLine();
            String i1 = i.toLowerCase();
            int x = getRandomNumber();
            if (i1.equals("rock")) {
                if (x == 1) {
                    System.out.println("Us choice is Rock, it's draw!");
                } else if (x == 2) {
                    System.out.println("Your choice is Rock, my choice is Scissors. You are win!");
                } else {
                    System.out.println("Your choice is Rock, my choice is Paper. i'm win! HAHAHA!");
                }
            } else if (i1.equals("scissors")) {
                if (x == 1) {
                    System.out.println("Your choice is Scissors, my choice is Rock. I'm win! HAHAHA!");
                } else if (x == 2) {
                    System.out.println("Us choice is Scissors, it's draw!");
                } else {
                    System.out.println("Your choice is Scissors, my choice is Paper. You are win!");
                }
            } else if (i1.equals("paper")) {
                if (x == 1) {
                    System.out.println("Your choice is Paper, my choice is Rock. You are win!");
                } else if (x == 2) {
                    System.out.println("Your choice is Paper, my choice is Scissors, I'm win! HAHAHA!");
                } else {
                    System.out.println("Us choice is Paper, it's draw!");
                }
            } else {
                System.out.println("exit");
                break;
            }
             System.out.println(x);
        }
    }
}



