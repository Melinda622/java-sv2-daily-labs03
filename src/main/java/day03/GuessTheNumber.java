package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public void guessTheNumber(){
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(1,100);
        System.out.println("You can guess a random number, you have 6 tries, use it wisely! :)");

        for (int i = 0; i < 6; i++) {
            System.out.println(i+1+". "+"attempt"+":");
            int number = scanner.nextInt();
            if (randomNumber < number) {
                System.out.println("The number you entered too high!");
            }
            if (number < randomNumber) {
                System.out.println("The number you entered is too low!");
            }
            if (number == randomNumber) {
                System.out.println("Congratulations,you guessed the number!");
                break;
            }
        }
    }
    public static void main(String[] args) {

        GuessTheNumber guess=new GuessTheNumber();
        guess.guessTheNumber();
    }
}
