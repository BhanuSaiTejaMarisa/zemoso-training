package com.learning.assignments.JAVA;


import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

class MyFilenameFilter implements FilenameFilter{
    String initials;

    public MyFilenameFilter(String initials){
        this.initials=initials;
    }

    public boolean accept(File dir, String name){
        return name.equals(initials);
    }


}
public class FileDirectory {
    public static void main(String[] args) {

        File directory = new File("/home/bhanum/projects");

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter file name: ");
//        String searchedFile=scanner.next();

        MyFilenameFilter filter= new MyFilenameFilter("com");

        String [] flist = directory.list(filter);

        System.out.println(Arrays.toString(flist)+" "+ (flist.length==0));

        int flag=0;

        while(true){

            File[] paths= directory.listFiles();

            for (int i = 0; i < paths.length; i++) {
                File directory2= new File(String.valueOf(paths[0]));
                String flist2[]=directory2.list(filter);
                if(flist2.length!=0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }


        }


        if(flist==null){
            System.out.println("Empty dir or dir does not exist");
        }
        else{
//            for (int i = 0; i < flist.length; i++) {
//                System.out.println(flist[i]+" found");
//            }
        }
        System.out.println("hello");
    }
}
