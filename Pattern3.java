public class Pattern3{
 public static void main(String[] args){
int n = 4;
 for (int row = 0; row <=2* n;row++){
int columnspan = row > 4? 2*n - row : row;
 for(int column = 1;columnspan <=row;column++){

 System.out.print("*");
}
System.out.println();
}
}
}