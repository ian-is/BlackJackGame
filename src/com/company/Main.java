package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        Random random = new Random();
        int RandomNumber = (random.nextInt(11) +1)+(random.nextInt(11) +1);

        int firstCard = random.nextInt(11)+1;
        int secondCard = random.nextInt(11)+1;
        System.out.println("your cards are " + firstCard + " and " + secondCard );
        int sum = firstCard + secondCard;
        while(sum < 22 ){
            System.out.println("Do you want another card?(yes or no)");
            String repeat = input.next();
            if(repeat.equals("yes")){
                int newCard = random.nextInt(11)+1;
                sum = sum + newCard;
                System.out.println("your new card is " + newCard);
            }else{
                System.out.println("your Total is " + sum);
            }
           if(sum > 21){
               System.out.println("you lose");
           }
           if(sum == 21 || sum == 20){
               System.out.println("you win!");
           }
        }
        if(RandomNumber< 16){
            String repeat = input.next();
            int newCard = random.nextInt(11) + 1;
         if(RandomNumber >= 21){
             System.out.println("the computer lost");
         }

        }


    }
}
