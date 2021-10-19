package com.learning.assignments.JAVA;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {

    public void WriteToFile(File sampleFile,HashMap<String, Integer>allWords) throws  Exception{

            try {
                FileWriter myWriter = new FileWriter(sampleFile);
                for (Map.Entry<String, Integer> e : allWords.entrySet()){
//                System.out.println("Key: " + e.getKey()
//                        + " Value: " + e.getValue());
                    myWriter.write("Key: " + e.getKey()
                        + "  Value: " + e.getValue()+"\n");

                }
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

    }

    public static void main(String[] args) throws IOException,FileNotFoundException {

        File abs=new File("");
        String path=abs.getAbsolutePath();

        try{

            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter file name to be read: ");
            String fileName=input.readLine();

            File sample=new File(path+"/src/"+fileName);
            BufferedReader bf=new BufferedReader(new java.io.FileReader(sample));

            String st;
            HashMap <String, Integer>charFreq=new HashMap<>();

            Pattern p = Pattern.compile("[a-zA-Z]+");

            while((st=bf.readLine())!=null){

//                System.out.println(st);
                String[] words=st.split(" ");
                Matcher m1=p.matcher(st);
                while (m1.find()) {
//                    System.out.println(m1.group());
                    if(!charFreq.containsKey(m1.group())){
                        charFreq.put(m1.group(),0);
                    }
                    else {//if(charFreq.get(charFreq)!=null)

                        Integer power=charFreq.get(m1.group());
                        charFreq.put(m1.group(),++power);
                    }
                }
//                for(String str:words){
//                    if(!charFreq.containsKey(str)){
//                        charFreq.put(str,0);
//                    }
//                    else {//if(charFreq.get(charFreq)!=null)
//
//                        Integer power=charFreq.get(str);
//                        charFreq.put(str,++power);
//                    }
//                }
            }

            FileReader totalWords=new FileReader();
            File write=new File(path+"/src/write.txt");
            totalWords.WriteToFile(write,charFreq);

        }
        catch (Exception e){
            System.out.println(e+"File not found");
        }


    }
}
