package org.networking;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.*;

public class InetDemo {

        public static void runSystemCommand(String command) {

            try {
                Process p = Runtime.getRuntime().exec(command);
                //System.out.println(p+"p");
                BufferedReader inputStream = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));

                String s = "";
                // reading output stream of the command
                ArrayList<Double> tim=new ArrayList<>();
                while ((s = inputStream.readLine()) != null) {
                    int index=s.indexOf("time=");
                    if(index!=-1) {
                        index+=5;
                        tim.add(Double.parseDouble(s.substring(index,index+4)));
                    }
                    System.out.println(s);

                }
                System.out.println(tim);
                Collections.sort(tim);
                System.out.println(tim.get(2));
                }

            catch (IOException e) {
                e.printStackTrace();
            }

        }



    public static void main(String[] args) throws Exception{
        InetAddress ip= Inet4Address.getByName("www.javatpoint.com");
//        InetAddress ip1[]=Inet4Address.getAllByName("www.javatpoint.com");
//
//        byte addr[]={72,3,2,12};
//        InetAddress ip2=InetAddress.getByAddress(addr);
//
//        System.out.println("ip: "+ip);
//        System.out.println("Host Address: "+ip.getHostAddress()+"\n"+Arrays.toString(ip.getAddress())+"\n");
//
//        System.out.println("ip1: "+ Arrays.toString(ip1));
//        System.out.println("ip2: "+ip2);

//        System.out.println(ip.isReachable(2000));


//        Date start = new Date();
//        Process p1 = java.lang.Runtime.getRuntime().exec("ping -c 1 www.google.com");
//        int returnVal = p1.waitFor();
//        Date stop=new Date();
//        boolean reachable = (returnVal==0);
//        System.out.println(stop.getTime()-start.getTime());
//        System.out.println(reachable);



        String ip4 = "www.google.com"; //Any IP Address on your network / Web
        runSystemCommand("ping -c 5 " + ip4);

    }

}
