 import java.util.*;
   class Main{
       public static void main(String[] args){
           Scanner sc  = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("enter the how many number do u want print");
           int n1=0,n2=1,n3=1,n4=0,count=10;
           
           System.out.print(n1 +" " + n2 + " " + n3);
             while(n4<x){
                n4=n1+n2+n3;
                System.out.print( " " + n4);
                 
                
                n1=n2;
                n2=n3;
                n3=n4;
             }
       }
   }