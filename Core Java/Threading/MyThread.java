class MyThread extends Thread{
    public static void main(String... x){
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}