import java.util.*;
public class Main{

    public static void main(String[] arg){

        System.out.println("Generics");
        Gen<Integer> ob = new Gen<>();

        ob.setData(35);
      // System.out.println(ob.getData());
      ob.testArList(23);
      ob.testArList(213);
      ob.testArList(29);
      ob.testArList(55);
    }
}


class Gen<T>{

    T data;
     ArrayList <T> al1 = new ArrayList<>();

    void setData(T val){

        data = val;
    }
     T getData(){

        return data;
     }

     void testArList(T arrData){
     al1.add(arrData);

     System.out.print(al1);

     }
}