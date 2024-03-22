import java.util.Scanner;
  
  
  class Simpcom{
      public static void main(String[] args){
          double p,rate,t,sim,com;
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount ");
           p = sc.nextDouble();
           System.out.println("enter the interest ");
        rate = sc.nextDouble();
           System.out.println("enter the years");
                      t = sc.nextDouble();

           
           sim = (p*rate*t)/100;
           com= p * Math.pow(1+rate/100,t)+p;
           
           System.out.println("simple interest " + sim);
           System.out.println("compound intererest " + com);
          
      }
  