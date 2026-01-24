public class hello{
    int x = 5;
    public static void main(String[] x){
        System.out.print("The main function");

        tiptop ob = new tiptop();
        ob.test();
     }
}


class tiptop{
static int y = 10;
 void test(){


    System.out.println("This is the second class that has y = "+y);
}

}