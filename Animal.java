class Animal{
public  void mynum(){
System.out.println("mahesh is an good boy");
}
}
class Dog extends Animal{
public void mynum2(){
System.out.println("chary is an good boy");
}
}
class Cat extends Dog{
public void  mynum3(){
System.out.println("akhil is an good boy");
}
}
public static void main(String[] args){
Cat myobj = new Cat();
myobj.mynum();
myobj.mynum2();
myobj.mynum3();
}
}


