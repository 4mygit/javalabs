class A{
  private int x;
  public A(int x){
    this.x= x;
    show();
  }
  
  public void show(){
    System.out.println(this.x);
  }
  
  public void display(){
    System.out.println("The value of the x is printed in show method");
    show();
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

}

public class Main{
  
  public static void main(String[] args){
    A ob = new B();
    ob.display();
    ob.hideMe();
  }
}