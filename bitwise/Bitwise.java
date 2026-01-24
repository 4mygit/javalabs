class Bitwise{

    public static void main(String[] arg){

        int x= 20;
        int y = 5;
        System.out.println(x>>>2);
        System.out.println(x>>2);
        System.out.println(x&1);
        System.out.println(x);

        //Following is finding out total numbe 1 in binary bits of the given number
        short bits = 0;
        while(x != 0){
            bits +=(x&1);
            x >>>= 1;
        }
        
        System.out.println("The total number of 1 in the bindary bits is "+bits);


        }

    }
