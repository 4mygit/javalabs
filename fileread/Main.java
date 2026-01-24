import java.io.FileOutputStream;

class FileRead{


    public void testError(){
        try{
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write("There".getBytes());
        fos.close();
        }
        catch(Exception e){
            System.out.print(e);
        }

    }

    public static void main(String arg[]){

        FileRead ob = new FileRead();

        ob.testError();
    }
}