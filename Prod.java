import java.io.*;
class Thread1{
    int n;
    boolean valueset=false;
    synchronized int get()
    {
        if(!valueset)
            try{
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Exception occur at:"+e);
            }
            System.out.println("get"+n);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Exception occur at:"+e);
            }
            valueset=false;
            notify();
            return n;
    }
    synchronized int put(int n)
    {
        if(valueset)
            try{
                wait();
            }
            catch(Exception e)
            {
                System.out.println("Exception occur at:"+e);
            }
            this.n=n;
            valueset=true;
            System.out.println("put"+n);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Exception occurs at:"+e);
            }
            notify();
            return n;
    }
}
class Producer implements Runnable{
    Thread1 t;
    Producer(Thread1 t)
    {
        this.t=t;
        new Thread(this,"Producer").start();
    }
    public void run(){
    int i=0;
    while (true)
    {
        t.put(i++);
    }
    }
}
class Consumer implements Runnable{
    Thread1 t;
    Consumer(Thread1 t){
    this.t=t;
    new Thread(this,"Consumer").start();
    }
    public void run(){
    int i=0;
    while (true){
        t.get();
    }
    }
}
class ProducerConsumer{
    public static void main(String [] args)throws IOException{
        Thread1 t=new Thread1();
        new Producer(t);
        new Consumer(t);
        System.out.println("Press control +c to exit");
    }
}