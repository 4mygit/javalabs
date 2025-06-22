class MyArray<T>{
    T a[] = (T[])new Object[10];
    int length = 0;
    int b= 5;
    int c= 10;
    int d = b*c;
    Object ob = new Object();
    public void append(T v){
        a[length++] = v;
    }

    public void display(){
        for(int i= 0; i<length; i++){
            System.out.print(a[i]);
        }
    }
}



class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display");
    }
    void display2() {
        System.out.println("Child display2 method");
    }

}


public class Genric {

public static void main(String args[]){
    MyArray <Integer> ma = new MyArray();
    ma.append(40);
    ma.display();
    Parent obj = new Child();
obj.display2();
}
}
