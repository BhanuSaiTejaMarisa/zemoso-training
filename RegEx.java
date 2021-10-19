package com.learning.assignments.JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) throws IOException {
        while(true){
            Pattern pattern=Pattern.compile("^[A-Z].*[.]$");
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the string: ");
            String str=bf.readLine();
            if(str.equals("exit")){
                break;
            }
            Matcher matcher=pattern.matcher(str);
            if(matcher.matches()){
                System.out.println("String matches");
            }
            else{
                System.out.println("Incorrect string");
            }
        }
    }
}
