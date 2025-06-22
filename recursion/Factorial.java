class MyFact{

    static  int fact(int n){
            if((n-1) == 1){
                return 1 * n;
            }
            else{
            int result = n * fact(n-1);
                        return result;
            }
        }

    public static void main(String[] a){

       System.out.println(fact(5));  
    }
}