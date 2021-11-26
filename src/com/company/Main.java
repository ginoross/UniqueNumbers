package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        int playerNum = 0;
        String name = "";
        int computerNum = 0;
        int playerScore = 0;

        System.out.println("Please enter your name: ");
        name = input.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a random number between 1 and 5: ");
            playerNum = input.nextInt();
            playerNum = playerNum-1;
            if(names[playerNum]==null){
                names[playerNum] = name;
            }
            computerNum = random.nextInt(5);
            System.out.println(computerNum);
            if(names[computerNum]==null){
                names[computerNum] = "computer";
            }

        }

        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)){
                playerScore+=1;
            }
            else{
                computerScore
            }

        }

    }
}
