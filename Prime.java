class {
     public static void primenumbers(){
         for(int i=2;i<=100;i++){
             boolean test = true;
             for(int j = 2;j<=i;j++){
                 if(i%j==0){
                    test = false;
                 }
             }
                 if(test==true){
                     System.out.print(i + " ");
                 
             }
         }
     }
     public static void main(String[] args){
         primenumbers();
     }
 }
 