     import java.util.Scanner;
 
 class Array33{
     public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the numbers");
         int num = sc.nextInt();
         int temp = 0;
         
         int arr1[] = new int[5];
         int arr2[] = new int[arr1.length];
         
         for(int i=0;i<arr1.length;i++){
             System.out.println("enter the index" + i);
             arr1[i] = sc.nextInt();
         }
         
         int num1 = sc.nextInt();
         
         for(int i=0;i<arr2.length;i++){
             temp = num1 - arr1[i];
             if(temp<0){
                 arr2[i] = temp * -1;
                 System.out.print(arr2[i] + " ");
             }
             else{
                 arr2[i] = temp;
                 System.out.print(arr2[i] + " ");
             }
         }
             int main = 0;
           int n = arr2.length;
            for(int i=0;i<arr2.length;i++){
                if(arr2[i]<arr2[n-1]){
                    n--;
                                     System.out.println( arr2[i] + "it" );
                                      
                }
                else{
                    System.out.println("error");
                }
             }
             
        
     }
 }