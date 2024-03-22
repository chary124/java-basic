import java.util.Scanner;
 
class Findingtheprimeumbers{
static int i , m = 0, flag = 0;
public static void main(String[] args){
Scanner obj1 = new Scanner(System.in);
System.out.println("Enter the first number"); 
int num = obj1 .nextInt();
    
m = num/2;

if(num==0 || num==1 ){
    System.out.println("is not an prime number");
}
    else{
        for(int i = 2; i <= m; i++){
          if(i%m==0){
            System.out.println(num + "not an prime number");
            flag=1;
            break;
        }
        }
        
        if(flag == 0){
            System.out.println(num + "is an prime number");
        } 
    }
}
}