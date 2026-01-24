import java.io.*;

class FileRead{

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/My-One-Drive/OneDrive - Capgemini/local-dev/javalab/io/ioTest.txt");
                //String str="Learn Java Programming.";
                int x;
                while((x=fis.read()) !=-1 ){
                    System.out.println((char)x);
                }

                fis.close();
    }
    
}