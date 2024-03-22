class Hi{
    public void hi(){
        for(int i=1;i<=5;i++){
        System.out.println("hello world");
        try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Hello{
    public void hello(){
        for(int j=1;j<=5;j++){
        System.out.println("hello ");
        try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
 class Thread{
    public static void main(String[] args){
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        
        obj1.hi();
        obj2.hello();
    }
}