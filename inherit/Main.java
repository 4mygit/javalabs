class A{
  private int x;

  public A(int x){
    this.x= x;
    show();
  }
  
  public void show(){
    System.out.println(x);
  }
  
  public void display(){
    System.out.println("The value of the x is printed in show method");
  }

  public void hideMe(){
    System.out.println("The hide me functin of Parent class");
  }

}

class B extends A{
  public B(){
    
    super(5);
    //show();
  }
  
    public void hideMe(){
    System.out.println("The overridden hide me functin of Child class");
    super.hideMe();

  }

  public void methodB(){
    System.out.println("Only child has this method !");
  }

}

public class Main{
  
  public static void main(String[] args){
    A ob = new B();
    ob.display();
    ob.hideMe();
    ob.methodB();
  }
}