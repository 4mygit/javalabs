class Process extends Thread{

     public void run() {
        System.out.println("Hello from a thread!");
    }

    static void nonStatic(){
        System.out.println("Non static method");
    }
    public static void main(String args[]) {
        //(new Thread()).start();
        nonStatic();
        Process ob = new Process();
        ob.start();
    }
}