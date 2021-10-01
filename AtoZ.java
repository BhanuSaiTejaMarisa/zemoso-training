package com.learning.assignments;

import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {

        String small="abcdefghijklmnopqrstuvwxyz";
        String[] smallLetters=small.split("");

        String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] capitalLetters=capital.split("");

        System.out.print("Enter word: ");
        Scanner scanner = new Scanner(System.in);

        String Word=scanner.next().trim();
        boolean flag= true;

        //System.out.println(Arrays.toString(capitalLetters));

    for(int i=0;i<smallLetters.length;i++){
        if(!(Word.contains(smallLetters[i])||Word.contains(capitalLetters[i]))){
            flag=false;
            System.out.println("Given word doesn't contain all alphabets");
            break;
        }
    }

    if(flag){
        System.out.println("Given word contains all alphabets");
    }
    }

    //Space Complexity - O(1)-> no new space is required except for
    // smallLetters and capitalLetters which are order of O(k) - k is constant

    //Time complexity - O(n)-> loop runs for each alphabet a- z

}
