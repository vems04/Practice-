package com.vems;
import java.util.*;
public class pratice {
   static void vems(int k)
    {
        if(k>18){
            System.out.println("ok");}
        else if (k==18){
            System.out.print("border");
            }
        else{
            System.out.print("no");
            }
        }
        public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       int c = sc.nextInt();
       vems(c);

    }


}
