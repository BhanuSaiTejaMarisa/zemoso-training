package com.learning.assignments.JAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class VampireNum {

    public void generatePerm(String s, int start,int end, ArrayList<String> perms){
        if(start==end){
            if((!s.startsWith("0")) && (s.charAt(s.length() / 2) != '0')){
                perms.add(s);
            }
            return;
        }
        for(int i=start;i<=end;i++){
            s=swap(s,i,start);
            generatePerm(s,start+1,end,perms);
        }
    }
    public String swap(String s,int start,int end){

        String[] tempStringArr=s.split("");
        ArrayList<String> tempArrList=new ArrayList<>();
        for(String str:tempStringArr){
            tempArrList.add(str);
        }
        String temp=tempArrList.get(start);
        tempArrList.set(start,tempArrList.get(end));
        tempArrList.set(end,temp);

        String[] finalString=new String[tempArrList.size()];
        int i=0;
        for(String str:tempArrList){
            finalString[i++]=str;
        }
        return String.join("",finalString);
    }

    public boolean generateFangs(String str,ArrayList<String> perfectFangs,int num){
        String left=str.substring(0,str.length()/2);
        String right= str.substring(str.length()/2,str.length());
        if(left.endsWith("0")&&right.endsWith("0")){
            return false;
        }
        if(left.startsWith("0")||right.startsWith("0")){
            return false;
        }
        int lhs=(Integer.parseInt(left)*Integer.parseInt(right));
//        System.out.println(left+" "+right+" "+lhs+" "+num+" "+((int) lhs == (int) num));
        if((lhs == num)){

            perfectFangs.add(num+" "+left+" "+right);
            return true;
        }
        return false;


    }

    public static void main(String[] args) {

        ArrayList<String> fangs=new ArrayList<String>();

        int length=0;
        VampireNum vp=new VampireNum();
        String num="1260";
        ArrayList<String> perfectFangs=new ArrayList<String>();
        boolean flag=false;
        while(true){

            vp.generatePerm(num,0,num.length()-1,fangs);

            if(num.length()%2==0){
//                if(perfectFangs.size()==2){
//                    break;
//                }
                for (int i=0;i< fangs.size();i++) {
                   flag= vp.generateFangs(fangs.get(i), perfectFangs,Integer.parseInt(num));
                    if (flag){
                        break;
                    }

                }
                flag=false;
                fangs.clear();
            }
            if(perfectFangs.size()>=100){
                break;
            }
            int intNum=Integer.parseInt(num)+1;
            num=Integer.toString(intNum);
        }


        for(String s:perfectFangs){
            System.out.println(s);
        }

    }
}
