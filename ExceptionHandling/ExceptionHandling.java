package com.learning.assignments.JAVA.ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to La Villa");
        System.out.println("please checkin here");
        System.out.println();
        System.out.print("Number of Adults: ");
        int numAdults=Integer.parseInt(bf.readLine());
        System.out.print("NUmber of Children: ");
        int numChild=Integer.parseInt(bf.readLine());

       try {
           HotelRoom room=new HotelRoom(numAdults,numChild);


           boolean flag=true;
           while(flag){
               System.out.println("Do you want a room service(yes/no): ");
               if(bf.readLine().equalsIgnoreCase("yes")){
                   System.out.print("Please enter your room no: ");
                   room.getRoomCleaning(Integer.parseInt(bf.readLine()));
               }
               else{
                   System.out.println("Thank you for your response!");
                   flag=false;
               }
           }
       }
       catch (Exception e){
           System.out.println(e);
       }
       finally {
           System.out.println("please try again!");
       }
    }
}
