  import java.util.*;

  class simple{

    public static void main(String[] abc){

        System.out.print("Hello World" );
        simple2 ob = new simple2();
        ob.test();
               Scanner sc=new Scanner(System.in);
        
        //int  x=sc.nextInt();
        //float x=sc.nextFloat();
        //String x=sc.nextLine();
        
        System.out.println("Eneter 2 numbers: ");
        sc.useRadix(10);
       int x=sc.nextInt();
        System.out.println(x);

    }
}


