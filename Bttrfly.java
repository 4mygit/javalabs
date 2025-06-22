public class Bttrfly{
    //int x = 5;
        public static void main(String[] x){
        int a = 8;

        for(int o = 1; o<=8; o++){

                for(int i = 1; i<=o; i++){
                    //if(o==1 && i==1 || o==1 && i==8){
                    System.out.print("*");
                    //}
                }
                for(int s= 0; s<8-o*2;s++){
                        System.out.print(" ");
                }

                for(int e = 1; e<=o; e++){
                    System.out.print("*");
                } 
                System.out.println("");

        }
    
}

}