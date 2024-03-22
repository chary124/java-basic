   import java.util.Scanner;
 
 public class Arrsort
{
	public static void main(String[] args)  {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number of elements");
	    int num = sc.nextInt();
	    int temp =0;
	    int arr[] = new int[5];
	    
	    for(int i=0;i<arr.length;i++){
	        System.out.println("enter the elements in array");
	    
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	           if (arr[i]<arr[j]){
	           temp = arr[i];
	           arr[i] = arr[j];
	           arr[j] = temp ;
	            
	        }}
	    
	        System.out.print(arr[i] + " ");
	    }
	    
	}
}
