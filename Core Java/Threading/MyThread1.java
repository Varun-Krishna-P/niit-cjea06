class MyThread1 extends Thread{
    public void run(){
        try{
            sleep(1000);
            
        }catch(InterruptedException iex){
            iex.printStackTrace();
        }
        System.out.println("In run method : thread name is: "+getName());
    }
    public static void main(String... x){
        MyThread1 myThread = new MyThread1();
        Thread thread = new Thread(myThread, "Extends Thread");
        thread.start();
    }
}