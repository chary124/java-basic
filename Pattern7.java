class Pattern7{
public static void main(String[] args){
int n = 5;
for(int i = 0;i<=n;i++){
for(int j = i;j<=n;j++){
System.out.println("*");
}
for(int j = i;j<=n;j++){
System.out.println("*");
}
for(int i = 0;i<=n;i++){
System.out.println(" ");
}
System.out.println();
}
}
}