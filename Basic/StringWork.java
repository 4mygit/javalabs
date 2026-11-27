import java.util.Arrays;

public class StringWork {

    String s = "This is the string. And we would like to experiment with it. We will see great results";
String s2 = "Thisisawholeword";
    void show() {

        System.out.println(s);
        System.out.println("Character at position 5 is " + s.charAt(5));
        System.out.println("String to uppercase " + s.toUpperCase());
        System.out.println("String replaced with - "+ s.replace(' ','-'));

    }

    void pick() {

    }

    void showStringArray(){

        String[] sarray;

        sarray = s2.split("");

        System.out.println("This is the string version of array "+ Arrays.toString(sarray));
        System.out.println(sarray[2]);

        for(String arrvalue: sarray){
                System.out.println(arrvalue);
        }
    }

}