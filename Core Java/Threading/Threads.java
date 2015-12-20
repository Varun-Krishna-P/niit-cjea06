class Threads implements Runnable{
    Thread thread1, thread2;
    Threads(){
        thread1 = new Thread(this, "clone");
        thread2 = new Thread(this, "pull");
        thread1.start();
         try{
            thread1.join();
        }
        catch(InterruptedException ie){
            System.out.println(ie);
            System.out.println("error...");
        }
        thread2.start();
    }
    public void run(){
        for(int i = 0; i< 10; i++){
            System.out.println("Name: "+ Thread.currentThread().getName());
        }       
        
    }
    
}
class ThreadsClass extends Thread{
    Thread thread1, thread2;
    ThreadsClass(){
        thread1 = new Thread(this, "first");
        thread2 = new Thread(this, "second");
        thread1.start();
        try{
            thread1.join();
        }catch(InterruptedException ie){
            System.out.println("error... ");
        }
        thread2.start();
    }
    public void run(){
        synchronized(this){
             for(int i = 0; i <= 10; i++){           
                try{
                     Thread.sleep(3000);
                     if(i == 5) thread1.wait(); 
                     if(i == 10) thread2.notify();
                }catch(InterruptedException ie){
                    System.out.println("error...");
                }
                System.out.println("Name: "+Thread.currentThread().getName());

            }   
        }        
    }
}
class ThreadsDemo{
    public static void main(String args[]){
        Threads t = new Threads();
        ThreadsClass t1 = new ThreadsClass();
    }
}