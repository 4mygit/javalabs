
import java.util.ArrayList;

public class Main{

    public static void main(String[] arg){

        ArrayList<Integer> al1 = new ArrayList<>(10);
        al1.add(40);
        al1.add(50);
        al1.add(50);
        al1.add(70);
        for(int i: al1){
        System.out.println(i);
        }



ArrayList<String> names = new ArrayList<>();
        names.add("Anupam");
        names.add("Ravi");
        names.add("Sneha");
        names.add("Archit Dasgupta");

        // Using lambda with forEach
        names.forEach(name -> System.out.println(name));

        //names.remove(0);
        names.forEach(name -> System.out.println(name));

        System.out.println(names.get(1));
        System.out.println(al1.indexOf(50));
    }
}