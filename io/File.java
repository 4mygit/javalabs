import java.io.*;

class File{

    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:/My-One-Drive/OneDrive - Capgemini/local-dev/javalab/io/ioTest.txt");
                String str="Learn Java Programming.";
        
                byte b[]=str.getBytes();
                System.out.print(b[9]);
                fos.write(str.getBytes());
                fos.close();
    }
    
}